package com.struct.consultancy.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.struct.consultancy.Adpater.CustomeSpinnerAdapter;
import com.struct.consultancy.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

public class FreeStructConsultancyActivity extends AppCompatActivity implements View.OnClickListener {

    //header layout
    RelativeLayout back_rel;
    TextView header_txt;

    //main layout
    TextInputLayout  project_name_tl;
    TextInputEditText project_name_et;

    Spinner country_sp;
    TextInputLayout country_tl;


    Spinner stories_sp;
    TextInputLayout stories_tl;

    Spinner basements_sp;
    TextInputLayout basements_tl;


    Spinner material_sp;
    TextInputLayout material_tl;

    Spinner material_country_sp;
    TextInputLayout material_country_tl;

    TextInputLayout  explain_yr_project_tl;
    TextInputEditText explain_yr_project_tl_et;

    TextInputLayout  explain_yr_question_tl;
    TextInputEditText explain_yr_question_tl_et;

    TextInputLayout  attachement_tl;
    TextInputEditText attachement_et;

    TextInputLayout  name_tl;
    TextInputEditText name_et;

    TextInputLayout  email_tl;
    TextInputEditText email_et;

    CardView send_rv;
    TextView send_txt;

    //varibles list
    List<String> coutry_stringList = new ArrayList<>();
    List<String> stories_stringList = new ArrayList<>();
    List<String> basements_stringList = new ArrayList<>();
    List<String> material_stringList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_main);

        init();
        set_custom_fonts();
        set_default_data();

    }



    private void init() {

        //header layout
        back_rel = (RelativeLayout) findViewById(R.id.back_rel);
        back_rel.setOnClickListener(this);
        header_txt = (TextView) findViewById(R.id.header_txt);

        //main layout
        project_name_tl  = (TextInputLayout) findViewById(R.id.project_name_tl);
        project_name_et  = (TextInputEditText) findViewById(R.id.project_name_et);

        country_sp  = (Spinner) findViewById(R.id.country_sp);
        country_tl    = (TextInputLayout) findViewById(R.id.country_tl);


        stories_sp  = (Spinner) findViewById(R.id.stories_sp);
        stories_tl   = (TextInputLayout) findViewById(R.id.stories_tl);

        basements_sp  = (Spinner) findViewById(R.id.basements_sp);
        basements_tl  = (TextInputLayout) findViewById(R.id.basements_tl);



        material_sp = (Spinner) findViewById(R.id.material_sp);
        material_tl  = (TextInputLayout) findViewById(R.id.material_tl);

        material_country_sp  = (Spinner) findViewById(R.id.material_country_sp);
        material_country_tl   = (TextInputLayout) findViewById(R.id.material_country_tl);



        explain_yr_project_tl  = (TextInputLayout) findViewById(R.id.explain_yr_project_tl);
        explain_yr_project_tl_et = (TextInputEditText) findViewById(R.id.explain_yr_project_tl_et);

        explain_yr_question_tl  = (TextInputLayout) findViewById(R.id.explain_yr_question_tl);
        explain_yr_question_tl_et = (TextInputEditText) findViewById(R.id.explain_yr_project_tl_et);

        attachement_tl  = (TextInputLayout) findViewById(R.id.attachement_tl);
        attachement_et = (TextInputEditText) findViewById(R.id.attachement_et);

        name_tl  = (TextInputLayout) findViewById(R.id.name_tl);
        name_et = (TextInputEditText) findViewById(R.id.name_et);

        email_tl  = (TextInputLayout) findViewById(R.id.email_tl);
        email_et = (TextInputEditText) findViewById(R.id.email_et);

         send_rv = (CardView) findViewById(R.id.send_rv);
        send_txt = (TextView) findViewById(R.id.send_txt);
    }

    private void set_custom_fonts() {
        Typeface bold_font = Typeface.createFromAsset(getAssets(), "Roboto-Bold.ttf");
        Typeface medium_font = Typeface.createFromAsset(getAssets(), "Roboto-Medium.ttf");
        Typeface regular_font = Typeface.createFromAsset(getAssets(), "Roboto-Regular.ttf");

        //header layout
        header_txt.setTypeface(medium_font);

        //main layout
        project_name_tl.setTypeface(regular_font);
        project_name_et.setTypeface(regular_font);

        country_tl.setTypeface(regular_font);

        stories_tl.setTypeface(regular_font);
        basements_tl.setTypeface(regular_font);

        material_tl.setTypeface(regular_font);
        material_country_tl.setTypeface(regular_font);

        explain_yr_project_tl.setTypeface(regular_font);
        explain_yr_project_tl_et.setTypeface(regular_font);

        explain_yr_question_tl.setTypeface(regular_font);
        explain_yr_question_tl_et.setTypeface(regular_font);

        attachement_tl.setTypeface(regular_font);
        attachement_et.setTypeface(regular_font);

        name_tl.setTypeface(regular_font);
        name_et.setTypeface(regular_font);

        email_tl.setTypeface(regular_font);
        email_et.setTypeface(regular_font);

        send_txt.setTypeface(medium_font);
    }


    private void set_default_data() {
     /*   ArrayAdapter country_array_adpater = new ArrayAdapter(this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.country_name));
        country_array_adpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        country_sp.setAdapter(country_array_adpater);
        country_sp.setSelection(0);

            ArrayAdapter stories_array_adpater = new ArrayAdapter(this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.stories_name));
        stories_array_adpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        stories_sp.setAdapter(stories_array_adpater);
        stories_sp.setSelection(0);

          ArrayAdapter basement_array_adpater = new ArrayAdapter(this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.basements_name));
        basement_array_adpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        basements_sp.setAdapter(basement_array_adpater);
        basements_sp.setSelection(0);


        ArrayAdapter material_array_adpater = new ArrayAdapter(this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.material_name));
        material_array_adpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        material_sp.setAdapter(material_array_adpater);
        material_sp.setSelection(0);

        ArrayAdapter material_country_array_adpater = new ArrayAdapter(this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.country_name));
        material_country_array_adpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        material_country_sp.setAdapter(material_country_array_adpater);
        material_country_sp.setSelection(0);
        */

        coutry_stringList.add("COUNTRY");
        coutry_stringList.add("ARGENTINA");
        coutry_stringList.add("AUSTRALIA");
        coutry_stringList.add("BELGIUM");
        coutry_stringList.add("BOLIVIA");
        coutry_stringList.add("BRAZIL");
        coutry_stringList.add("BULGARIA");
        coutry_stringList.add("CANADA");
        coutry_stringList.add("CHILE");
        coutry_stringList.add("COLOMBIA");
        coutry_stringList.add("EU- INTERNATIONAL");
        coutry_stringList.add("FRANCE");
        coutry_stringList.add("GERMANY");
        coutry_stringList.add("INDIA");
        coutry_stringList.add("ITALY");
        coutry_stringList.add("MEXICO");
        coutry_stringList.add("NEW ZEALAND");
        coutry_stringList.add("PERU");
        coutry_stringList.add("PORTUGAL");
        coutry_stringList.add("ROMANIA");
        coutry_stringList.add("RUSSIAN FEDERATION");
        coutry_stringList.add("SOUTH AFRICA");
        coutry_stringList.add("SPAIN");
        coutry_stringList.add("TURKEY");
        coutry_stringList.add("UNITED KINGDOM");
        CustomeSpinnerAdapter country_array_adpater = new CustomeSpinnerAdapter(FreeStructConsultancyActivity.this, R.layout.listitems_layout, R.id.sp_item, coutry_stringList);
        country_sp.setAdapter(country_array_adpater);
        country_sp.setSelection(0);


        stories_stringList.add("STORIES");
        stories_stringList.add("1");
        stories_stringList.add("2");
        stories_stringList.add("3");
        stories_stringList.add("4");
        stories_stringList.add("5");
        stories_stringList.add("6");
        CustomeSpinnerAdapter stories_array_adpater = new CustomeSpinnerAdapter(FreeStructConsultancyActivity.this, R.layout.listitems_layout, R.id.sp_item, stories_stringList);
        stories_sp.setAdapter(stories_array_adpater);
        stories_sp.setSelection(0);



        basements_stringList.add("BASEMENTS");
        basements_stringList.add("0");
        basements_stringList.add("1");
        basements_stringList.add("2");
        basements_stringList.add("3");
        basements_stringList.add("4");
        basements_stringList.add("5");
        basements_stringList.add("6");
        CustomeSpinnerAdapter basements_array_adpater = new CustomeSpinnerAdapter(FreeStructConsultancyActivity.this, R.layout.listitems_layout, R.id.sp_item, basements_stringList);
        basements_sp.setAdapter(basements_array_adpater);
        basements_sp.setSelection(0);


        material_stringList.add("MATERIAL");
        material_stringList.add("R.C.C.");
        material_stringList.add("STEELS");
        material_stringList.add("PRECAST");
        material_stringList.add("POST-TENSION");
        material_stringList.add("PRE-TENSION");
        material_stringList.add("PRE-STRESSED");
        material_stringList.add("STEEL HOT ROLLED");
        material_stringList.add("STEEL COLD FORMED");
        material_stringList.add("P.E.B.");
        material_stringList.add("ALUMINUM");
        CustomeSpinnerAdapter material_array_adpater = new CustomeSpinnerAdapter(FreeStructConsultancyActivity.this, R.layout.listitems_layout, R.id.sp_item, material_stringList);
        material_sp.setAdapter(material_array_adpater);
        material_sp.setSelection(0);


        CustomeSpinnerAdapter material_country_adpater = new CustomeSpinnerAdapter(FreeStructConsultancyActivity.this, R.layout.listitems_layout, R.id.sp_item, coutry_stringList);
        material_country_sp.setAdapter(material_country_adpater);
        material_country_sp.setSelection(0);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_rel:
                onBackPressed();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
        finish();
    }
}
