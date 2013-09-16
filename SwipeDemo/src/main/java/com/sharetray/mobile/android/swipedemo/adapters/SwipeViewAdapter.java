package com.sharetray.mobile.android.swipedemo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.sharetray.mobile.android.swipedemo.R;


/**
 * Created by Admin on 15/09/13.
 */
public class SwipeViewAdapter extends ArrayAdapter {

    String[] countries;
    Context context;
    public SwipeViewAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
        this.context=context;
        this.countries=objects;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate the swipeview layout

       LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row= inflater.inflate(R.layout.swipelistview,parent,false);
        row.setBackgroundColor(context.getResources().getColor(R.color.White));

        ///find the textview and the button defined in the layout
        TextView textView= (TextView) row.findViewById(R.id.textView);
        Button button= (Button) row.findViewById(R.id.button);

        ///get the item from the array
        String country=countries[position];

        //set the country as the textview label
        textView.setText(country);

        return row;
    }
}
