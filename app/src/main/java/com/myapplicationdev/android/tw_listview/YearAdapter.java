package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class YearAdapter extends ArrayAdapter<Year> {
    private ArrayList<Year> year;
    private Context context;
    private TextView tvYear;

    public YearAdapter(Context context, int resource, ArrayList<Year> objects){
        super(context, resource, objects);

        year = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.firstrow, parent, false);

        // Get the TextView object
        tvYear = (TextView) rowView.findViewById(R.id.tvYear);



        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Year currentYear = year.get(position);
        if (currentYear.getYear().equals("Year 1")){
            tvYear.setText("Year 1");
        }else if (currentYear.getYear().equals("Year 2")){
            tvYear.setText("Year 2");
        }else if (currentYear.getYear().equals("Year 3")){
            tvYear.setText("Year 3");
        }



        return rowView;
    }
}
