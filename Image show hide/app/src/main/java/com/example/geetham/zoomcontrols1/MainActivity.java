package com.example.geetham.zoomcontrols1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    Button Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ZoomControls simpleZoomControls = (ZoomControls) findViewById(R.id.simpleZoomControl); // initiate a ZoomControls
        Button show = (Button) findViewById(R.id.show); // initiate show Button
        Button hide = (Button) findViewById(R.id.hide); // initiate hide Button
// perform setOnClickListener on show button
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// show a ZoomControls
                simpleZoomControls.show();
            }
        });
// perform setOnClickListener on hide button
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// hide a ZoomControls
                simpleZoomControls.hide();

            }
        });
    }
}
