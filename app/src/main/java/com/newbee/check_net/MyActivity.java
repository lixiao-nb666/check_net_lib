package com.newbee.check_net;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.newbee.check_net_lib.broadcastreceirer.NetWorkChangeReceiverUtil;
import com.newbee.check_net_lib.broadcastreceirer.NetworkChangeReceiver;
import com.newbee.check_net_lib.util.AppNetUtil;

public class MyActivity extends AppCompatActivity {

    private NetworkChangeReceiver.DataListen dataListen=new NetworkChangeReceiver.DataListen() {
        @Override
        public void getNetType(AppNetUtil.NetStatu netType) {
            Log.i("lixiao","lixiaokankan:"+netType);
            Log.i("lixiao","lixiaokankan:"+AppNetUtil.getInstance().getWifiSSid(MyApp.getContext()));
        }
    };
    NetWorkChangeReceiverUtil netWorkChangeReceiverUtil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        netWorkChangeReceiverUtil=new NetWorkChangeReceiverUtil(dataListen,this);
        netWorkChangeReceiverUtil.start(this);
        Log.i("lixiao","lixiaokankan1:"+AppNetUtil.getInstance().getWifiSSid(this));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        netWorkChangeReceiverUtil.close(this);
    }
}
