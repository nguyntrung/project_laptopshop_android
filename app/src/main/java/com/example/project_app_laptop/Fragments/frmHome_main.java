package com.example.project_app_laptop.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project_app_laptop.Adapters.CatAdapter;
import com.example.project_app_laptop.Adapters.ProductAdapter;
import com.example.project_app_laptop.Models.Categories;
import com.example.project_app_laptop.Models.Product;
import com.example.project_app_laptop.R;

import java.util.ArrayList;

public class frmHome_main extends Fragment {
    RecyclerView recyCat, recyTopSale;
    ArrayList<Categories> lstCat;
    CatAdapter myCatadapter;
    ArrayList<Product> lstPro;
    ProductAdapter myTopSaleadapter;
    public frmHome_main() {

    }
    public static frmHome_main newInstance() {
        frmHome_main fragment = new frmHome_main();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frm_home_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyCat = view.findViewById(R.id.recyCat);

        lstCat = Categories.initData();
        myCatadapter = new CatAdapter(lstCat, getActivity());

        recyCat.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyCat.setItemAnimator(new DefaultItemAnimator());

        recyCat.setAdapter(myCatadapter);

        recyTopSale = view.findViewById(R.id.recyTopSale);

        lstPro = Product.initProduct();
        myTopSaleadapter = new ProductAdapter(lstPro, getActivity());

        recyTopSale.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        recyTopSale.setItemAnimator(new DefaultItemAnimator());

        recyTopSale.setAdapter(myTopSaleadapter);
    }
}