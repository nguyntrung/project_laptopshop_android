package com.example.project_app_laptop.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.project_app_laptop.Models.Product;
import com.example.project_app_laptop.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    ImageView imgBack, imgSP;
    TextView tvTenSP, tvDaBan, tvGiaBan, tvMoTa, tvCPU, tvRam, tvOcung, tvVGA, tvManhinh, tvHDH, tvPin, tvTrongLuong, tvTittleMoTa;
    Button btnAddToCart;
    ArrayList<Product> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        addcontrols();
        getIt();
        addevents();
    }
    void addcontrols()
    {
        imgBack = findViewById(R.id.imgBack);
        imgSP = findViewById(R.id.imgSP);
        tvTenSP = findViewById(R.id.tvTenSP);
        tvDaBan = findViewById(R.id.tvDaBan);
        tvGiaBan = findViewById(R.id.tvGiaBan);
        tvMoTa = findViewById(R.id.tvMoTa);
        tvCPU = findViewById(R.id.tvCPU);
        tvRam = findViewById(R.id.tvRam);
        tvOcung = findViewById(R.id.tvOcung);
        tvVGA = findViewById(R.id.tvVGA);
        tvManhinh = findViewById(R.id.tvManhinh);
        tvHDH = findViewById(R.id.tvHDH);
        tvPin = findViewById(R.id.tvPin);
        tvTittleMoTa = findViewById(R.id.tvTittleMoTa);
        tvTrongLuong = findViewById(R.id.tvTrongLuong);
        btnAddToCart = findViewById(R.id.btnAddToCart);
    }
    void addevents()
    {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    void getIt()
    {
        Bundle bundle = getIntent().getExtras();
        Product pro = (Product) bundle.get("Product");

        int resourceid = getResources().getIdentifier(pro.getHinhanh(), "drawable", getPackageName());
        imgSP.setImageResource(resourceid);

        tvTenSP.setText(pro.getTensp());
        tvDaBan.setText(String.valueOf(pro.getSoluong()));

        DecimalFormat formatter = new DecimalFormat("#,###");
        String giaBanFormatted = formatter.format(pro.getGiaban());
        giaBanFormatted = giaBanFormatted.replace(",", ".");

        tvGiaBan.setText(giaBanFormatted + "đ");

        tvMoTa.setText(pro.getMota());
        tvCPU.setText(pro.getCpu());
        tvRam.setText(pro.getRam());
        tvOcung.setText(pro.getOcung());
        tvVGA.setText(pro.getVga());
        tvManhinh.setText(pro.getManhinh());
        tvHDH.setText(pro.getHedieuhanh());
        tvPin.setText(pro.getPin());
        tvTrongLuong.setText(pro.getTrongluong());
        tvTittleMoTa.setText(tvTittleMoTa.getText() + pro.getTensp());
    }
}