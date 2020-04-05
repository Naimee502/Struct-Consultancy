package com.struct.consultancy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.struct.consultancy.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    //header layout
    TextView header_txt;

    //main layout
    RelativeLayout free_struct_consultancy_rel;
    TextView free_struct_consultancy;
    TextView free_struct_consultancy_desc;

    RelativeLayout struct_consultancy_rel;
    TextView struct_consultancy;

    //footer layout
    TextView powered_by_consultancy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_home);


        init();
        set_custom_fonts();
    }

    private void init() {

        //header layout
        header_txt = (TextView) findViewById(R.id.header_txt);

        //main layout
        free_struct_consultancy_rel  = (RelativeLayout) findViewById(R.id.free_struct_consultancy_rel);
        free_struct_consultancy_rel.setOnClickListener(this);
        free_struct_consultancy = (TextView) findViewById(R.id.free_struct_consultancy);
        free_struct_consultancy_desc = (TextView) findViewById(R.id.free_struct_consultancy_desc);

        struct_consultancy_rel  = (RelativeLayout) findViewById(R.id.struct_consultancy_rel);
        struct_consultancy_rel.setOnClickListener(this);
        struct_consultancy = (TextView) findViewById(R.id.struct_consultancy);

        //footer layout
        powered_by_consultancy = (TextView) findViewById(R.id.powered_by_consultancy);

    }

    private void set_custom_fonts() {
        Typeface bold_font = Typeface.createFromAsset(getAssets(), "Roboto-Bold.ttf");
        Typeface medium_font = Typeface.createFromAsset(getAssets(), "Roboto-Medium.ttf");
        Typeface regular_font = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");

        //header layout
        header_txt.setTypeface(medium_font);


        free_struct_consultancy.setTypeface(medium_font);
        free_struct_consultancy_desc.setTypeface(regular_font);

        struct_consultancy.setTypeface(medium_font);

        powered_by_consultancy.setTypeface(regular_font);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.free_struct_consultancy_rel:
                Intent intent = new Intent(HomeActivity.this, FreeStructConsultancyActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
                break;
            case R.id.struct_consultancy_rel:
                intent = new Intent(HomeActivity.this, StructConsultancyActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
                break;
        }
    }
}
