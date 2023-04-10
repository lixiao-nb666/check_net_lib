package com.newbee.check_net_lib.broadcastreceirer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.newbee.check_net_lib.util.AppNetUtil;

/**
 * Created by xiefuning on 2017/5/10.
 * about:
 */

public class NetworkChangeReceiver extends BroadcastReceiver {
    private DataListen dataListen;

    public NetworkChangeReceiver(DataListen dataListen,Context context) {
        AppNetUtil.NetStatu netType = AppNetUtil.getInstance().getNetWorkStatus(context);
        this.dataListen=dataListen;
        if (dataListen != null)
            dataListen.getNetType(netType);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        AppNetUtil.NetStatu netType = AppNetUtil.getInstance().getNetWorkStatus(context);
        if (dataListen != null)
            dataListen.getNetType(netType);
    }

    public interface DataListen {
        public void getNetType(AppNetUtil.NetStatu netType);
    }
}
