package com.newbee.check_net;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;

import com.lixiao.build.mybase.activity.welcome.BaseWelcomeActivity;
import com.lixiao.build.mybase.activity.welcome.bean.WelcomeInfoBean;

import java.util.ArrayList;
import java.util.List;

public class WelcomeActivity extends BaseWelcomeActivity {
    @Override
    public int getWelcomeLayoutId() {
        return 0;
    }

    @Override
    public void initWelcomeView() {

    }

    @Override
    public void initWelcomeData() {

    }

    @Override
    public void initWelcomeControl() {


    }

    @Override
    public WelcomeInfoBean getWelcomeInfoBean() {
        WelcomeInfoBean welcomeInfoBean=new WelcomeInfoBean();
        List<String> permissions=new ArrayList<>();
        permissions.add(Manifest.permission.READ_PHONE_STATE);
        permissions.add(Manifest.permission.ACCESS_WIFI_STATE);
        permissions.add(Manifest.permission.ACCESS_NETWORK_STATE);
        permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
        welcomeInfoBean.setPermissionList(permissions);

        return welcomeInfoBean;
    }

    @Override
    public void userNoPermission() {

    }

    @Override
    public void userGetAllPermission() {
        toActivity(MyActivity.class);
        finish();
    }
}
