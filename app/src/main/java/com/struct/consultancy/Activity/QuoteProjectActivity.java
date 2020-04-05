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

public class QuoteProjectActivity extends AppCompatActivity implements View.OnClickListener {

    //header layout
    RelativeLayout back_rel;
    TextView header_txt;

    //main layout
    TextInputLayout project_name_tl;
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


    Spinner rcc_design_code_sp;
    TextInputLayout rcc_design_code_tl;

    Spinner steel_rolled_design_code_sp;
    TextInputLayout steel_rolled_design_code_tl;

    Spinner steel_formed_design_code_sp;
    TextInputLayout steel_formed_design_code_tl;

    Spinner aluminum_design_code_sp;
    TextInputLayout aluminum_design_code_tl;


    Spinner snow_sp;
    TextInputLayout snow_tl;

    Spinner wind_sp;
    TextInputLayout wind_tl;

    Spinner seizmic_sp;
    TextInputLayout seizmic_tl;

    TextInputLayout other_details_tl;
    TextInputEditText other_details_et;

    TextInputLayout quote_attachement_tl;
    TextInputEditText quote_attachement_et;


    CardView send_rv;
    TextView send_txt;

    //varibles list
    List<String> coutry_stringList = new ArrayList<>();
    List<String> stories_stringList = new ArrayList<>();
    List<String> basements_stringList = new ArrayList<>();
    List<String> material_stringList = new ArrayList<>();
    List<String> rcc_design_code_stringList = new ArrayList<>();
    List<String> steel_rolled_design_code_stringList = new ArrayList<>();
    List<String> steel_formed_design_code_stringList = new ArrayList<>();
    List<String> aluminum_design_code_stringList = new ArrayList<>();
    List<String> snow_stringList = new ArrayList<>();
    List<String> wind_stringList = new ArrayList<>();
    List<String> seizmic_stringList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setContentView(R.layout.activity_quote_project);


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


        rcc_design_code_sp = (Spinner) findViewById(R.id.rcc_design_code_sp);
        rcc_design_code_tl = (TextInputLayout) findViewById(R.id.rcc_design_code_tl);

        steel_rolled_design_code_sp = (Spinner) findViewById(R.id.steel_rolled_design_code_sp);
        steel_rolled_design_code_tl = (TextInputLayout) findViewById(R.id.steel_rolled_design_code_tl);

        steel_formed_design_code_sp = (Spinner) findViewById(R.id.steel_formed_design_code_sp);
        steel_formed_design_code_tl = (TextInputLayout) findViewById(R.id.steel_formed_design_code_tl);

        aluminum_design_code_sp = (Spinner) findViewById(R.id.aluminum_design_code_sp);
        aluminum_design_code_tl = (TextInputLayout) findViewById(R.id.aluminum_design_code_tl);


        snow_sp = (Spinner) findViewById(R.id.snow_sp);
        snow_tl = (TextInputLayout) findViewById(R.id.snow_tl);

        wind_sp = (Spinner) findViewById(R.id.wind_sp);
        wind_tl = (TextInputLayout) findViewById(R.id.wind_tl);

        seizmic_sp = (Spinner) findViewById(R.id.seizmic_sp);
        seizmic_tl = (TextInputLayout) findViewById(R.id.seizmic_tl);

        other_details_tl  = (TextInputLayout) findViewById(R.id.other_details_tl);
        other_details_et   = (TextInputEditText) findViewById(R.id.other_details_et);

        quote_attachement_tl  = (TextInputLayout) findViewById(R.id.quote_attachement_tl);
        quote_attachement_et    = (TextInputEditText) findViewById(R.id.quote_attachement_et);


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

        rcc_design_code_tl.setTypeface(regular_font);
        steel_rolled_design_code_tl.setTypeface(regular_font);
        steel_formed_design_code_tl.setTypeface(regular_font);
        aluminum_design_code_tl.setTypeface(regular_font);

        snow_tl.setTypeface(regular_font);
        wind_tl.setTypeface(regular_font);
        seizmic_tl.setTypeface(regular_font);
        other_details_tl.setTypeface(regular_font);
        other_details_et.setTypeface(regular_font);
        quote_attachement_tl.setTypeface(regular_font);
        quote_attachement_et.setTypeface(regular_font);

        send_txt.setTypeface(medium_font);
    }


    private void set_default_data() {
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
        CustomeSpinnerAdapter country_array_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, coutry_stringList);
        country_sp.setAdapter(country_array_adpater);
        country_sp.setSelection(0);


        stories_stringList.add("STORIES");
        stories_stringList.add("1");
        stories_stringList.add("2");
        stories_stringList.add("3");
        stories_stringList.add("4");
        stories_stringList.add("5");
        stories_stringList.add("6");
        CustomeSpinnerAdapter stories_array_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, stories_stringList);
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
        CustomeSpinnerAdapter basements_array_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, basements_stringList);
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
        CustomeSpinnerAdapter material_array_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, material_stringList);
        material_sp.setAdapter(material_array_adpater);
        material_sp.setSelection(0);

        CustomeSpinnerAdapter material_country_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, coutry_stringList);
        material_country_sp.setAdapter(material_country_adpater);
        material_country_sp.setSelection(0);


        rcc_design_code_stringList.add("CIRSOC 201-2005");
        rcc_design_code_stringList.add("CIRSOC 201-1982");
        rcc_design_code_stringList.add("Eurocode 2 (Belgium)");
        rcc_design_code_stringList.add("CBH 87");
        rcc_design_code_stringList.add("NBR 6118:2007");
        rcc_design_code_stringList.add("NBR 6118:2003");
        rcc_design_code_stringList.add("NB-1");
        rcc_design_code_stringList.add("ABNT NBR 6118:2014");
        rcc_design_code_stringList.add("ABNT NBR 6118:2007");
        rcc_design_code_stringList.add("ABNT NBR 6118:2003");
        rcc_design_code_stringList.add("ABNT NB-1");
        rcc_design_code_stringList.add("Eurocode 2 (Bulgaria)");
        rcc_design_code_stringList.add("NCh430.Of 2008");
        rcc_design_code_stringList.add("ACI 318-99 (Chile)");
        rcc_design_code_stringList.add("NSR-10");
        rcc_design_code_stringList.add("Eurocode 2");
        rcc_design_code_stringList.add("BAEL-91 (R-99)");
        rcc_design_code_stringList.add("Eurocode 2 (France)");
        rcc_design_code_stringList.add("IS 456:2000");
        rcc_design_code_stringList.add("NTC 14/01/2008");
        rcc_design_code_stringList.add("NTCRC, NTCRC: 2004, NTCRC: 2017");
        rcc_design_code_stringList.add("NTE E.060:2009");
        rcc_design_code_stringList.add("REBAP");
        rcc_design_code_stringList.add("Eurocode 2 (Portugal)");
        rcc_design_code_stringList.add("Eurocode 2 (Romania)");
        rcc_design_code_stringList.add("SP 63.13330.2012");
        rcc_design_code_stringList.add("SABS 0100");
        rcc_design_code_stringList.add("EHE-08");
        rcc_design_code_stringList.add("EHE-98-CTE");
        rcc_design_code_stringList.add("EHE-98");
        rcc_design_code_stringList.add("EH-91");
        rcc_design_code_stringList.add("TS 500");
        rcc_design_code_stringList.add("EC2");
        rcc_design_code_stringList.add("ACI 318M-08");
        rcc_design_code_stringList.add("ACI 318M-99");
        rcc_design_code_stringList.add("ACI 318M-11");
        CustomeSpinnerAdapter rcc_design_code_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, rcc_design_code_stringList);
        rcc_design_code_sp.setAdapter(rcc_design_code_adpater);
        rcc_design_code_sp.setSelection(0);


        steel_rolled_design_code_stringList.add("NBR 8800");
        steel_rolled_design_code_stringList.add("ABNT NBR 8800:2008");
        steel_rolled_design_code_stringList.add("ABNT NBR 8800:1986");
        steel_rolled_design_code_stringList.add("Eurocodes 3 (Bulgaria)& Eurocodes 4");
        steel_rolled_design_code_stringList.add("CAN/CSA S16-01");
        steel_rolled_design_code_stringList.add("NCh427");
        steel_rolled_design_code_stringList.add("Eurocodes 3&4");
        steel_rolled_design_code_stringList.add("Eurocodes 3 (France)& Eurocodes 4");
        steel_rolled_design_code_stringList.add("DIN 18800:2008-11");
        steel_rolled_design_code_stringList.add("IS 800:2007");
        steel_rolled_design_code_stringList.add("NTC: 14-01-2008<");
        steel_rolled_design_code_stringList.add("Eurocodes 3 (Italy)& Eurocodes 4");
        steel_rolled_design_code_stringList.add("NTCRC Estruct.Metal.");
        steel_rolled_design_code_stringList.add("REAE");
        steel_rolled_design_code_stringList.add("Eurocode 3 (Portugal)& Eurocode 4");
        steel_rolled_design_code_stringList.add("SANS 10162-1:2011");
        steel_rolled_design_code_stringList.add("CTE DB SE-A");
        steel_rolled_design_code_stringList.add("EA-95 (MV103)");
        steel_rolled_design_code_stringList.add("EAE 2011");
        steel_rolled_design_code_stringList.add("EAE");
        steel_rolled_design_code_stringList.add("Eurocode 3, 4 (United Kingdom)");
        steel_rolled_design_code_stringList.add("EC3, 4");
        steel_rolled_design_code_stringList.add("AISC ASD 89");
        steel_rolled_design_code_stringList.add("AISC LRFD 86");
        steel_rolled_design_code_stringList.add("ANSI/AISC 360-10 (LRFD)");
        steel_rolled_design_code_stringList.add("ANSI/AISC 360-05 (LRFD)");
        CustomeSpinnerAdapter steel_rolled_design_code_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, steel_rolled_design_code_stringList);
        steel_rolled_design_code_sp.setAdapter(steel_rolled_design_code_adpater);
        steel_rolled_design_code_sp.setSelection(0);


        steel_formed_design_code_stringList.add("AS 4600:2005");
        steel_formed_design_code_stringList.add("AISI (Brazil)");
        steel_formed_design_code_stringList.add("NBR 14762:2001");
        steel_formed_design_code_stringList.add("ABNT NBR 14762:2010");
        steel_formed_design_code_stringList.add("Eurocodes 3 (Bulgaria)& Eurocodes 4");
        steel_formed_design_code_stringList.add("CAN/CSA S136-07");
        steel_formed_design_code_stringList.add("NCh427");
        steel_formed_design_code_stringList.add("Eurocodes 3&4");
        steel_formed_design_code_stringList.add("Eurocodes 3 (France)& Eurocodes 4");
        steel_formed_design_code_stringList.add("DIN 18800:2008-11");
        steel_formed_design_code_stringList.add("Eurocodes 3 (Italy)& Eurocodes 4 NTC: 14-01-2008");
        steel_formed_design_code_stringList.add("AISI S100-2007 (LRFD) (México)");
        steel_formed_design_code_stringList.add("NZS 4600:2005");
        steel_formed_design_code_stringList.add("MV110 (Portugal)");
        steel_formed_design_code_stringList.add("Eurocodes 3 (Portugal)& Eurocodes 4");
        steel_formed_design_code_stringList.add("SANS 10162-2:2011");
        steel_formed_design_code_stringList.add("CTE DB SE-A");
        steel_formed_design_code_stringList.add("EA-95 (MV110)");
        steel_formed_design_code_stringList.add("EAE");
        steel_formed_design_code_stringList.add("EAE 2011");
        steel_formed_design_code_stringList.add("Eurocode 3, 4  (United Kingdom)");
        steel_formed_design_code_stringList.add("EC3, 4");
        steel_formed_design_code_stringList.add("AISI S100-2007 (LRFD) (USA)");
        steel_formed_design_code_stringList.add("AISI/NASPEC-1977");
        CustomeSpinnerAdapter steel_formed_design_code_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, steel_formed_design_code_stringList);
        steel_formed_design_code_sp.setAdapter(steel_formed_design_code_adpater);
        steel_formed_design_code_sp.setSelection(0);


        aluminum_design_code_stringList.add("Eurocode 9");
        CustomeSpinnerAdapter aluminum_design_code_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, aluminum_design_code_stringList);
        aluminum_design_code_sp.setAdapter(aluminum_design_code_adpater);
        aluminum_design_code_sp.setSelection(0);


        snow_stringList.add("Eurocode 1 (Belgium)");
        snow_stringList.add("Ordenanza Nº3, 21 de julio de 2004. Sección V: Cargas de nieve");
        snow_stringList.add("NBC 05");
        snow_stringList.add("Eurocode 1");
        snow_stringList.add("Eurocode 1 (France)");
        snow_stringList.add("NV 65:2009");
        snow_stringList.add("DIN 1055-4");
        snow_stringList.add("IS:875: (Part4) – 1987 (Reaffirmed 1997)");
        snow_stringList.add("Generic code");
        snow_stringList.add("NTC 14/01/2008");
        snow_stringList.add("Eurocode 1 (Portugal)");
        snow_stringList.add("RSA");
        snow_stringList.add("CTE DB SE AE");
        snow_stringList.add("NTE");
        snow_stringList.add("ASCE 7-05");
        snow_stringList.add("COVENIN 1756-1:2001");
        CustomeSpinnerAdapter snow_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, snow_stringList);
        snow_sp.setAdapter(snow_adpater);
        snow_sp.setSelection(0);


        wind_stringList.add("R.N.V.99 D.T.R. C 2-4.7");
        wind_stringList.add("CIRSOC 102-2005 CIRSOC 102-1984");
        wind_stringList.add("Eurocode 1 (Belgium)");
        wind_stringList.add("ABNT NBR 6123");
        wind_stringList.add("Ordenanza nº 3, 21 de julio de 2004");
        wind_stringList.add("Sección VI: Cargas de viento");
        wind_stringList.add("NBC 05");
        wind_stringList.add("NCh432-2010");
        wind_stringList.add("NCh432.Of71");
        wind_stringList.add("RSAEEP (Macau)");
        wind_stringList.add("NSR-10");
        wind_stringList.add("RC80");
        wind_stringList.add("NC 285:2003");
        wind_stringList.add("Boletín nº 9/80");
        wind_stringList.add("NEC - 11");
        wind_stringList.add("Eurocode 1");
        wind_stringList.add("Eurocode 1 (France)");
        wind_stringList.add("NV 65:2009");
        wind_stringList.add("DIN 1055-4:2005-03");
        wind_stringList.add("NSE2");
        wind_stringList.add("CHOC-04");
        wind_stringList.add("IS:875: (Part3) – 1987 (Reaffirmed 1997)");
        wind_stringList.add("Generic code (pressure/ height curves)");
        wind_stringList.add("NTC 14/01/2008");
        wind_stringList.add("CFE - 2008");
        wind_stringList.add("NTC, NTC: 2017");
        wind_stringList.add("Cahier des Prescriptions Communes Aplicables au Calcul des Surcharges dues au Vent");
        wind_stringList.add("RNC-07");
        wind_stringList.add("REP-04");
        wind_stringList.add("NBR");
        wind_stringList.add("Norma Técnica E.020");
        wind_stringList.add("RSA& Eurocode 1 (Portugal)");
        wind_stringList.add("СНиП 2.01.07-85*");
        wind_stringList.add("Eurocode 1 (Singapore)");
        wind_stringList.add("SANS 10160-3:2011");
        wind_stringList.add("CTE DB SE-AE");
        wind_stringList.add("NTE");
        wind_stringList.add("BS 6399-2:1997");
        wind_stringList.add("Eurocode 1 (United Kingdom)");
        wind_stringList.add("BS-EN 1991-1-1-4:2005");
        wind_stringList.add("UNIT 50-84");
        wind_stringList.add("ASCE/SEI 7-10");
        CustomeSpinnerAdapter wind_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, wind_stringList);
        wind_sp.setAdapter(wind_adpater);
        wind_sp.setSelection(0);

        seizmic_stringList.add("RPA 99 / v 2003");
        seizmic_stringList.add("CIRSOC 103-2008, CIRSOC 103-2005");
        seizmic_stringList.add("CIRSOC 103-1991");
        seizmic_stringList.add("Eurocode 8 (Belgium)");
        seizmic_stringList.add("NBDS-2006");
        seizmic_stringList.add("ABNT NBR 6118:2014");
        seizmic_stringList.add("ABNT NBR 15421:2006");
        seizmic_stringList.add("Decree Nº2, 23.07.2007");
        seizmic_stringList.add("NCh433.Of1996 Mod.2009 (Dºnº61. de 2011)");
        seizmic_stringList.add("NCh-433.Of96");
        seizmic_stringList.add("NSR-10");
        seizmic_stringList.add("NSR-98");
        seizmic_stringList.add("CSCR 2010");
        seizmic_stringList.add("CSCR-2002");
        seizmic_stringList.add("NC 46:1999");
        seizmic_stringList.add("R-001 2011");
        seizmic_stringList.add("M-001 1979");
        seizmic_stringList.add("NEC-11");
        seizmic_stringList.add("CPE INEN 5:2001");
        seizmic_stringList.add("NTDS. Norma Técnica para Diseño por Sismo");
        seizmic_stringList.add("Eurocode 8");
        seizmic_stringList.add("PS 92 (version révisée 2010)");
        seizmic_stringList.add("PS 92");
        seizmic_stringList.add("Eurocode 8 (France)");
        seizmic_stringList.add("DIN 4149:2005-04");
        seizmic_stringList.add("NSE-10");
        seizmic_stringList.add("CHOC-08");
        seizmic_stringList.add("CHOC-04");
        seizmic_stringList.add("IS 1893 (Part 1): 2002(Section 7.5)");
        seizmic_stringList.add("IS 13920:1993");
        seizmic_stringList.add("Coefficients per floor (static)");
        seizmic_stringList.add("Modal spectral analysis (dynamic)");
        seizmic_stringList.add("NTC 14/01/2008");
        seizmic_stringList.add("CRP: :2003");
        seizmic_stringList.add("CFE: 93, CFE: 2008, CFE: 2015");
        seizmic_stringList.add("NTC: 97 (Guadalajara - Mexico), NTC: 95, NTC: 2004,  NTC: 2017");
        seizmic_stringList.add("RPS 2011");
        seizmic_stringList.add("RPS 2000");
        seizmic_stringList.add("RNC-07");
        seizmic_stringList.add("REP-04");
        seizmic_stringList.add("Norma Técnica E.030");
        seizmic_stringList.add("Eurocode 8 (Portugal)");
        seizmic_stringList.add("RSA - Modal spectral");
        seizmic_stringList.add("2011 PRBC");
        seizmic_stringList.add("P100-1/2013");
        seizmic_stringList.add("P100-1/2006");
        seizmic_stringList.add("СНиП II-7-81*");
        seizmic_stringList.add("SANS 10160-4:2011");
        seizmic_stringList.add("NCSE-02");
        seizmic_stringList.add("NCSE-94");
        seizmic_stringList.add("Turkish Earthquake Code 2007");
        seizmic_stringList.add("BS 6399-2:1997");
        seizmic_stringList.add("Eurocode 1 (United Kingdom)");
        CustomeSpinnerAdapter seizmic_adpater = new CustomeSpinnerAdapter(QuoteProjectActivity.this, R.layout.listitems_layout, R.id.sp_item, seizmic_stringList);
        seizmic_sp.setAdapter(seizmic_adpater);
        seizmic_sp.setSelection(0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
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
