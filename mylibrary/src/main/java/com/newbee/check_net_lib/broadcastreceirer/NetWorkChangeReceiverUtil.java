package com.newbee.check_net_lib.broadcastreceirer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

public class NetWorkChangeReceiverUtil {

    private NetworkChangeReceiver receiver;

    public NetWorkChangeReceiverUtil(NetworkChangeReceiver.DataListen dataListen,Context context) {
        receiver=new NetworkChangeReceiver(dataListen,context);
    }

    public void start(Context context) {

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        context.registerReceiver(receiver, intentFilter);

    }


    public void close(Context context) {
        context.unregisterReceiver(receiver);
    }


}
