package com.elclcd.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Tools
 * <p>
 *
 * @author elc_simayi
 * @since 2016/11/1
 */

public class Tools {
    public final String TAG = "Test";

    @Inject
    public Tools() {
    }

    public void print(String s){
        Log.d(TAG,s);
    }
}
