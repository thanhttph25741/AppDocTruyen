package com.example.appdoctruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ManThongTinApp extends AppCompatActivity {

    TextView txtThongTin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_thong_tin_app);

        txtThongTin = findViewById(R.id.textviewthongtin);

        String thongtin = " Ứng dụng được phát hành bởi Khánh Jos và Su \n" +
                " Uy tín \n" +
                " Đẹp trai\n" +
                " OK ";
        txtThongTin.setText(thongtin);
    }
}