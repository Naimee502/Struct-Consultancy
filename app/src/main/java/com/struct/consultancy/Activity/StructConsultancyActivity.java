package com.struct.consultancy.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.struct.consultancy.R;

public class StructConsultancyActivity extends AppCompatActivity implements View.OnClickListener {

    //header layout
    RelativeLayout back_rel;
    TextView header_txt;

    //main layout
    TextView services_txt;
    TextView services_desc_txt;

    TextView available_codes_of_design_txt;
    TextView available_codes_of_design_desc_txt;

    TextView available_codes_of_loading_txt;
    TextView available_codes_of_loading_desc_txt;

    RelativeLayout quote_your_project_rel;
    TextView quote_your_project;

    //footer layout
    TextView powered_by_consultancy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_struct_consultancy);


        init();
        set_custom_fonts();
    }
    private void init() {
        back_rel = (RelativeLayout) findViewById(R.id.back_rel);
        back_rel.setOnClickListener(this);
        header_txt = (TextView) findViewById(R.id.header_txt);

        services_txt  = (TextView) findViewById(R.id.services_txt);
        services_desc_txt  = (TextView) findViewById(R.id.services_desc_txt);

        available_codes_of_design_txt  = (TextView) findViewById(R.id.available_codes_of_design_txt);
        available_codes_of_design_desc_txt  = (TextView) findViewById(R.id.available_codes_of_design_desc_txt);

        available_codes_of_loading_txt  = (TextView) findViewById(R.id.available_codes_of_loading_txt);
        available_codes_of_loading_desc_txt  = (TextView) findViewById(R.id.available_codes_of_loading_desc_txt);

        quote_your_project_rel  = (RelativeLayout) findViewById(R.id.quote_your_project_rel);
        quote_your_project_rel.setOnClickListener(this);
        quote_your_project  = (TextView) findViewById(R.id.quote_your_project);

        powered_by_consultancy = (TextView) findViewById(R.id.powered_by_consultancy);
    }

    private void set_custom_fonts() {
        Typeface bold_font = Typeface.createFromAsset(getAssets(), "Roboto-Bold.ttf");
        Typeface medium_font = Typeface.createFromAsset(getAssets(), "Roboto-Medium.ttf");
        Typeface regular_font = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");

        //header layout
        header_txt.setTypeface(medium_font);

        services_txt.setTypeface(medium_font);
        services_desc_txt.setTypeface(regular_font);

        available_codes_of_design_txt.setTypeface(medium_font);
        available_codes_of_design_desc_txt.setTypeface(regular_font);

        available_codes_of_loading_txt.setTypeface(medium_font);
        available_codes_of_loading_desc_txt.setTypeface(regular_font);

        quote_your_project.setTypeface(medium_font);

        powered_by_consultancy.setTypeface(regular_font);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_rel:
                onBackPressed();
                break;
            case R.id.quote_your_project_rel:
                Intent intent = new Intent(StructConsultancyActivity.this, QuoteProjectActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
        finish();
    }

}
