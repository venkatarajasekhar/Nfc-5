package com.android.nfc;

import android.app.Application;
import android.os.UserHandle;
import android.util.Log;

public class NfcApplication extends Application {

    public static final String TAG = "NfcApplication";
    NfcService mNfcService;

    public NfcApplication() {

    }

    @Override
    public void onCreate() {
        try{
        super.onCreate();
        }catch (Exception e) {
             System.out.println(e);
            } 
       finally {
       System.out.println("finally block will execute always.");
    }

        if (UserHandle.myUserId() == 0) {
            try{
            mNfcService = new NfcService(this);
            }catch (Exception e) {
             System.out.println(e);
            } 
       finally {
       System.out.println("finally block will execute always.");
    }
        }
    }
}
