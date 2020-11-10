package com.xpf.order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xpf.common.RecordPathManager;
import com.xpf.common.utils.Config;

public class Order_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);
    }

    public void jumpApp(View view) {
        // 类加载方式交互，需要准确的全类名路径，维护成本较高且容易出现人为失误
        /*try{
            Class targetClass = Class.forName("com.xpf.module_interaction.MainActivity");
            Intent intent = new Intent(this, targetClass);
            intent.putExtra("params","xpf");
            startActivity(intent);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //全局Map记录路径信息方式实现交互(跳转)
        Class<?> targetClass = RecordPathManager.getTargetClass("app", "MainActivity");
        if (targetClass == null) {
            Log.d(Config.TAG, "获取targetClass为空...");
        }
        Intent intent = new Intent(this, targetClass);
        intent.putExtra("name", "xpf");
        startActivity(intent);
    }

    public void jumpPersonal(View view) {
        // 类加载方式交互，需要准确的全类名路径，维护成本较高且容易出现人为失误
        /*try{
            Class targetClass = Class.forName("com.xpf.personal.Personal_MainActivity");
            Intent intent = new Intent(this, targetClass);
            intent.putExtra("params","xpf");
            startActivity(intent);
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        //全局Map记录路径信息方式实现交互(跳转)
        Class<?> targetClass = RecordPathManager.getTargetClass("personal", "Personal_MainActivity");
        if (targetClass == null) {
            Log.d(Config.TAG, "获取targetClass为空...");
        }
        Intent intent = new Intent(this, targetClass);
        intent.putExtra("name", "xpf");
        startActivity(intent);
    }
}
