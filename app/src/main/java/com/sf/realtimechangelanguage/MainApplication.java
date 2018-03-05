package com.sf.realtimechangelanguage;

import android.app.Application;
import android.content.Context;

import com.sf.realtimechangelanguage.helper.LocaleHelper;

/**
 * Created by mesutgenc on 5.03.2018.
 */

public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }
}
