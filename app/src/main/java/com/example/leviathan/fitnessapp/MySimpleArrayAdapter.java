package com.example.leviathan.fitnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MySimpleArrayAdapter extends ArrayAdapter<WorkOutActivity> {
    List<WorkOutActivity> items;

//    @Override
//    public DailyActivity getItem(int positon) {
//        return items.get(positon);
//    }

    public MySimpleArrayAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public MySimpleArrayAdapter(Context context, int resource, List<WorkOutActivity> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.rowlayout, null);
        }

        WorkOutActivity p = getItem(position);

        if (p != null) {
            TextView tt1 = (TextView) v.findViewById(R.id.rowText);
            tt1.setText(p.comment);

//            TextView tt2 = (TextView) v.findViewById(R.id.categoryId);
//            TextView tt3 = (TextView) v.findViewById(R.id.description);
//
//            if (tt1 != null) {
//                tt1.setText(p.getId());
//            }
//
//            if (tt2 != null) {
//                tt2.setText(p.getCategory().getId());
//            }
//
//            if (tt3 != null) {
//                tt3.setText(p.getDescription());
//            }
        }

        return v;
    }
}