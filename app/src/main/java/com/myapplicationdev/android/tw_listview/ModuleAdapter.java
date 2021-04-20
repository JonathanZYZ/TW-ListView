package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {
    private Context context;
    private ArrayList<Module> modules;
    private TextView tvModules;
    private ImageView ivPhoto;
    public ModuleAdapter(Context context,int resource,ArrayList<Module> objects){
        super(context,resource,objects);
        modules = objects;
        this.context=context;
    }
    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.secondrow, parent, false);
        // Get the TextView object
        tvModules = (TextView) rowView.findViewById(R.id.tvModules);
        // Get the ImageView object
        ivPhoto = (ImageView) rowView.findViewById(R.id.ivProg);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentFood = modules.get(position);
        // Set the TextView to show the food
        tvModules.setText(currentFood.getModule());
        // Set the image to star or nostar accordingly
        if(currentFood.isPhoto()) {
            ivPhoto.setImageResource(R.drawable.prog);
        }
        else {
            ivPhoto.setImageResource(R.drawable.nonprog);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }
}
