package com.example.project_app_laptop.Adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_app_laptop.Activity.DetailActivity;
import com.example.project_app_laptop.Activity.DetailCatActivity;
import com.example.project_app_laptop.Models.Categories;
import com.example.project_app_laptop.Models.Product;
import com.example.project_app_laptop.R;

import java.util.ArrayList;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.MyViewHolder>{
    ArrayList<Categories> lst;
    Context context;

    public CatAdapter(ArrayList<Categories> lst, Context context) {
        this.lst = lst;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewholder = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recycat, parent, false);
        return new MyViewHolder(viewholder);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Categories cat = lst.get(position);

        int resourceid = holder.itemView.getContext().getResources().getIdentifier(cat.getLogo(), "drawable", holder.itemView.getContext().getPackageName());
        holder.imgCat.setImageResource(resourceid);

        holder.tvTenHang.setText(cat.getTenhang());

        holder.layout_itemcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailProCat(cat.getIdhang(), cat.getTenhang());
            }
        });
    }
    private void DetailProCat(int mahang, String tenhang)
    {
        ArrayList<Product> lstProCat = new ArrayList<>();
        if (mahang == 0)
        {
            lstProCat = Product.initProduct();
        }
        else
        {
            for (Product pro : Product.initProduct())
            {
                if (pro.getMahang() == mahang)
                {
                    lstProCat.add(pro);
                }
            }
        }
        Intent intent = new Intent(context, DetailCatActivity.class);
        intent.putExtra("lstProCat", lstProCat);
        intent.putExtra("tenhang", tenhang);
        context.startActivity(intent);
    }
    @Override
    public int getItemCount() {
        return lst.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        private LinearLayout layout_itemcat;
        private ImageView imgCat;
        private TextView tvTenHang;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.layout_itemcat = itemView.findViewById(R.id.layout_itemcat);
            this.imgCat = itemView.findViewById(R.id.imgCat);
            this.tvTenHang = itemView.findViewById(R.id.tvTenHang);
        }
    }
}
