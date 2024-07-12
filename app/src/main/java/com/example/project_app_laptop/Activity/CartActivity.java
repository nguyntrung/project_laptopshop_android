package com.example.project_app_laptop.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_app_laptop.Adapters.ProductAdapter;
import com.example.project_app_laptop.Fragments.frmCart_main;
import com.example.project_app_laptop.Models.Product;
import com.example.project_app_laptop.R;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    ImageView imgBack;
    RecyclerView recyCart;
    ProductAdapter proAdapter;
    ArrayList<Product> lstPro = new ArrayList<>();
    Spinner spnThanhToan;
    TextView tvTongTienHang, tvTongTien;
    String[] thanhtoan = { "Thanh toán khi nhận hàng", "Chuyển khoản ngân hàng" };
    ArrayAdapter<String> thanhtoanadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        addcontrols();
        addevents();
    }
    void addcontrols()
    {
        imgBack = findViewById(R.id.imgBack);
        recyCart = findViewById(R.id.recyCart);
        lstPro = Product.initProduct();
        proAdapter = new ProductAdapter(lstPro, CartActivity.this);

        recyCart.setLayoutManager(new GridLayoutManager(CartActivity.this, 2));
        recyCart.setItemAnimator(new DefaultItemAnimator());
        recyCart.setAdapter(proAdapter);

        spnThanhToan = findViewById(R.id.spnThanhToan);
        tvTongTienHang = findViewById(R.id.tvTongTienHang);
        tvTongTien = findViewById(R.id.tvTongTien);
        thanhtoanadapter = new ArrayAdapter<>(CartActivity.this, android.R.layout.simple_spinner_dropdown_item, thanhtoan);
        spnThanhToan.setAdapter(thanhtoanadapter);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frmbottomcart, new frmCart_main()).commit();
    }
    void addevents()
    {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}