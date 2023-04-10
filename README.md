# check_net_lib

[![](https://jitpack.io/v/lixiao-nb666/check_net_lib.svg)](https://jitpack.io/#lixiao-nb666/check_net_lib)

第一步必须加上权限

    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

第二步代码申请权限，必须要代码手动申请，必须用户点击
        WelcomeInfoBean welcomeInfoBean=new WelcomeInfoBean();
        List<String> permissions=new ArrayList<>();
        permissions.add(Manifest.permission.READ_PHONE_STATE);
        permissions.add(Manifest.permission.ACCESS_WIFI_STATE);
        permissions.add(Manifest.permission.ACCESS_NETWORK_STATE);
        permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
        welcomeInfoBean.setPermissionList(permissions);

第三步：調用查詢方法
       netWorkChangeReceiverUtil=new NetWorkChangeReceiverUtil(dataListen,this);
       netWorkChangeReceiverUtil.start(this);

第四步：關閉    
      if(null!=netWorkChangeReceiverUtil){
            netWorkChangeReceiverUtil.close(this);
            netWorkChangeReceiverUtil=null;
       }


 

