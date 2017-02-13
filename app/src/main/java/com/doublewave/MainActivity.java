package com.doublewave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private DoubleWaveView waveView;
    private Button btn_stop;
    private Button btn_start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        waveView = (DoubleWaveView) findViewById(R.id.waveView);
        btn_stop = (Button) findViewById(R.id.btn_stop);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_stop.setOnClickListener(this);
        btn_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start:
                waveView.setAnim(true);
                break;
            case R.id.btn_stop:
                waveView.setAnim(false);
                break;
        }
    }
}
