package com.example.show.custmizinglistview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by show on 8/17/17.
 */

public class listAdapter extends ArrayAdapter<Items> {


    public listAdapter(Context context, ArrayList<Items> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Items item = getItem(position);

        if (null == convertView) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listview_items, parent, false);
        }

        TextView txtTask = (TextView) convertView.findViewById(R.id.txtTask);
        txtTask.setText(item.getTask());
        txtTask.setTextColor(Color.RED);
        TextView txtDate = (TextView) convertView.findViewById(R.id.txtDueDate);
        txtDate.setText(item.getDuteDate());
        txtTask.setTextColor(Color.GREEN);

        return convertView;
    }
}
