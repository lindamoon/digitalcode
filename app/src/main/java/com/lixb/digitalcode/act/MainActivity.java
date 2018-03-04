package com.lixb.digitalcode.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.lixb.digitalcode.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.btn_show_digitalcode)
    Button mBtnShowDigitalcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_show_digitalcode)
    public void onViewClicked() {
        Log.e(TAG, "onViewClicked: --------");
        startActivity(new Intent(this, DigitalCodeActivity.class));
    }
}
