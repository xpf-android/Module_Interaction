package com.xpf.module_interaction;

import com.xpf.common.RecordPathManager;
import com.xpf.common.base.BaseApplication;
import com.xpf.order.Order_MainActivity;
import com.xpf.personal.Personal_MainActivity;

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        RecordPathManager.joinGroup("app", "MainActivity", MainActivity.class);
        RecordPathManager.joinGroup("order", "Order_MainActivity", Order_MainActivity.class);
        RecordPathManager.joinGroup("personal", "Personal_MainActivity", Personal_MainActivity.class);
    }
}

