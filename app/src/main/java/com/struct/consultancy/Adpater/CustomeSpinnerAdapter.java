package com.struct.consultancy.Adpater;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.struct.consultancy.R;
import java.util.List;

public class CustomeSpinnerAdapter extends ArrayAdapter<String> {

    LayoutInflater flater;
    List<String> list;

    public CustomeSpinnerAdapter(Activity context, int resouceId, int textviewId, List<String> mlist){
        super(context,resouceId,textviewId, mlist);
        flater = context.getLayoutInflater();
        list = mlist;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View rowview = flater.inflate(R.layout.listitems_layout,null,true);

        Typeface regular_font = Typeface.createFromAsset(getContext().getAssets(), "Roboto-Regular.ttf");

        TextView txtTitle = (TextView) rowview.findViewById(R.id.sp_item);
        txtTitle.setText(list.get(position));
        txtTitle.setTypeface(regular_font);


        return rowview;
    }
}