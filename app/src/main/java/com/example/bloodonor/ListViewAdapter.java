package com.example.bloodonor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {


    String[] name;
    int[] image;
    Context context;
    LayoutInflater inflater;
    @Override
    public int getCount() {
        return name.length;
    }
    public ListViewAdapter(String[] name, int[] image, Context context) {
        this.name = name;
        this.image = image;
        this.context = context;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater==null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null) {
            convertView = inflater.inflate(R.layout.grid_item, null);
        }
        ImageView imageView=convertView.findViewById(R.id.image_view_grid);
        TextView textView=convertView.findViewById(R.id.txt_view_grid);
        imageView.setImageResource(image[position]);
        textView.setText(name[position]);

        return convertView;
    }
}
