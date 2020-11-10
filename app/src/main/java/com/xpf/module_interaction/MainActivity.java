package com.xpf.module_interaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xpf.order.Order_MainActivity;
import com.xpf.personal.Personal_MainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 跳转至order模块的Order_MainActivity
     */
    public void jumpOrder(View view) {
        Intent intent = new Intent(this, Order_MainActivity.class);
        intent.putExtra("name", "xpf");
        startActivity(intent);
    }

    /**
     * 跳转至personal的Personal_MainActivity
     */
    public void jumpPersonal(View view) {
        Intent intent = new Intent(this, Personal_MainActivity.class);
        intent.putExtra("name", "xpf");
        startActivity(intent);
    }
}
