package com.example.listview_with_customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int [] img;
    String[] cricketerName;
    Context context;
    LayoutInflater inflater;

    CustomAdapter(Context context,String[] cricketerName,int[] img){
        this.context=context;
        this.cricketerName = cricketerName;
        this.img=img;
    }

    @Override
    public int getCount() {
        return cricketerName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.simple_view,viewGroup,false);

        }
        ImageView imageView=view.findViewById(R.id.crickterImg);
        TextView textView=view.findViewById(R.id.crickterName);
        imageView.setImageResource(img[i]);
        textView.setText(cricketerName[i]);
        return view;
    }
}
