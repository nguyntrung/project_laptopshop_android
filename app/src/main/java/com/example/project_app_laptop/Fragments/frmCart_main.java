package com.example.project_app_laptop.Fragments;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_app_laptop.R;

public class frmCart_main extends Fragment {
    CheckBox chkSelect;
    TextView tvDelete, tvTongSP;
    Button btnDatHang;
    public frmCart_main() {

    }

    public static frmCart_main newInstance() {
        frmCart_main fragment = new frmCart_main();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_frm_cart_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chkSelect = view.findViewById(R.id.chkSelect);
        tvDelete = view.findViewById(R.id.tvDelete);
        tvTongSP = view.findViewById(R.id.tvTongSP);
        btnDatHang = view.findViewById(R.id.btnDatHang);

        btnDatHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenPop();
            }
        });
    }
    void OpenPop ()
    {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.popup_dathang);

        Window window = dialog.getWindow();
        if (window == null)
        {
            return;
        }

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        WindowManager.LayoutParams windowattri = window.getAttributes();
        windowattri.gravity = Gravity.CENTER;
        window.setAttributes(windowattri);

        TextView btnHuyPop, btnDatHangPop;
        EditText edtTenKH, edtSDT, edtDiaChi;

        btnHuyPop = dialog.findViewById(R.id.btnHuyPop);
        btnDatHangPop = dialog.findViewById(R.id.btnDatHangPop);
        edtTenKH = dialog.findViewById(R.id.edtTenKH);
        edtSDT = dialog.findViewById(R.id.edtSDT);
        edtDiaChi = dialog.findViewById(R.id.edtDiaChi);

        btnHuyPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        btnDatHangPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Đặt hàng thành công", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }
}