package com.elclcd.dagger2;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * DeviceInfo
 * <p>
 *
 * @author elc_simayi
 * @since 2016/11/9
 */

@Singleton
public class DeviceInfo {
    private Context context;

    @Inject
    public DeviceInfo(Context context) {
        this.context = context;
    }

    public String getMacAddress()
    {
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfor = wifiManager.getConnectionInfo();
        return wifiInfor.getMacAddress();
    }
}
