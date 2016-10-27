package com.iacn.bilineat.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.iacn.bilineat.R;

public class SettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtils.setColor(this, getResources().getColor(R.color.pink));

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        onBackPressed();
        return true;
    }
}