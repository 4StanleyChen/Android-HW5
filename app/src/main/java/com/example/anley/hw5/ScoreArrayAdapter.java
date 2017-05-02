package com.example.anley.hw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ScoreArrayAdapter extends ArrayAdapter<Teams>{
    Context context;

    public ScoreArrayAdapter(Context context, ArrayList<Teams> items){
        super(context, 0, items);
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;

        if(convertView==null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listitem, null);
        }
        else{
            itemlayout = (LinearLayout)convertView;
        }

        Teams item = (Teams)getItem(position);

        ImageView t1l = (ImageView)itemlayout.findViewById(R.id.img1);
        t1l.setImageResource(item.logo1);
        TextView t1n = (TextView)itemlayout.findViewById(R.id.n1);
        t1n.setText(item.name1);
        TextView t1s = (TextView)itemlayout.findViewById(R.id.s1);
        t1s.setText(item.score1);
        ImageView t2l = (ImageView)itemlayout.findViewById(R.id.img2);
        t2l.setImageResource(item.logo2);
        TextView t2n = (TextView)itemlayout.findViewById(R.id.n2);
        t2n.setText(item.name2);
        TextView t2s = (TextView)itemlayout.findViewById(R.id.s2);
        t2s.setText(item.score2);

        int i1  = Integer.parseInt(item.score1);
        int i2  = Integer.parseInt(item.score2);

        if(i1>i2) t1s.setTextColor(android.graphics.Color.RED);
        if(i1<i2) t2s.setTextColor(android.graphics.Color.RED);
        return itemlayout;

    }
}
