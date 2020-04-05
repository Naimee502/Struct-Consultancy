package com.struct.consultancy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.struct.consultancy.Activity.HomeActivity;


public class SplshScreenActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_splsh_screen);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent1 = new Intent(SplshScreenActivity.this, HomeActivity.class);
                startActivity(intent1);
                finish();
                overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

}
