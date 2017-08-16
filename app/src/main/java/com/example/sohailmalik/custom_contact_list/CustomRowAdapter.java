package com.example.sohailmalik.custom_contact_list;

/**
 * Created by sohail malik on 8/1/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomRowAdapter extends BaseAdapter {

    private static ArrayList<contact>searchArrayList;

    private LayoutInflatermInflater;


    public customrowAdapter(Context context, ArrayList<contact> results) {

        searchArrayList= results;
        mInflater= LayoutInflater.from(context);


    }

    @Override
    public intgetCount() {
        return searchArrayList.size();
    }

    @Override
    public Object getItem(intposition) {
        return searchArrayList.get(position);

    }

    @Override
    public long getItemId(intposition) {
        return position;

    }

    @Override
    public View getView(intposition, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.customrow, null);
            holder = new ViewHolder();
            holder.Name= (TextView) convertView.findViewById(R.id.name);
            holder.gender= (TextView) convertView.findViewById(R.id.cityState);
            holder.txtPhone= (TextView) convertView.findViewById(R.id.phone);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.Name.setText(searchArrayList.get(position).getName());
        holder.gender.setText(searchArrayList.get(position).getGender());
        holder.txtPhone.setText(searchArrayList.get(position).getPhone());

        return convertView;
    }

    static class ViewHolder {
        TextViewName;
        TextViewgender;
        TextViewtxtPhone;

    }
}

