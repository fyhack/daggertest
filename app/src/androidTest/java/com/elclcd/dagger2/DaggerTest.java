package com.elclcd.dagger2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * DaggerTest
 * <p>
 *
 * @author elc_simayi
 * @since 2016/11/1
 */

@RunWith(AndroidJUnit4.class)
public class DaggerTest {
    Context appContext;

    @Before
    public void setup(){
        appContext = InstrumentationRegistry.getTargetContext();
    }

    @Test
    public void test(){
        String mac = ((MyApplication)appContext.getApplicationContext()).getDeviceInfo().getMacAddress();
        Log.d("Test",mac);
        DeviceInfo d0 = ((MyApplication)appContext.getApplicationContext()).getDeviceInfo();
        DeviceInfo d1 = ((MyApplication)appContext.getApplicationContext()).getDeviceInfo1();
        DeviceInfo d2 = ((MyApplication)appContext.getApplicationContext()).getDeviceInfo2();
        DeviceInfo d3 = ((MyApplication)appContext.getApplicationContext()).getDeviceInfo3();
    }

}
