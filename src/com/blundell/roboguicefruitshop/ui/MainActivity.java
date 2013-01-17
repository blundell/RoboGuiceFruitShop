package com.blundell.roboguicefruitshop.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.blundell.roboguicefruitshop.R;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActivity {

    @InjectView(R.id.main_tv_hello_world)
    TextView helloWorldTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTextView.setText("RoboGuice HelloWorld");
    }

}
