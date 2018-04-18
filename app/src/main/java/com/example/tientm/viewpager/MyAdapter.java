package com.example.tientm.viewpager;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by TienTM on 3/13/2018.
 */

public class MyAdapter extends PagerAdapter {
    private ArrayList<Face> listFaces;
    private LayoutInflater inflater;

    public MyAdapter(Context context,ArrayList<Face> listFaces) {
        this.listFaces = listFaces;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listFaces.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // Chuyen xml thanh view
        View view = inflater.inflate(R.layout.item_smile,container,false);

        // Anh xa
        LinearLayout lnContainer = (LinearLayout) view.findViewById(R.id.ln_container);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        ImageView ivIcon = (ImageView) view.findViewById(R.id.iv_icon);

        //do du lieu
        Face face = listFaces.get(position);
        lnContainer.setBackgroundColor(Color.parseColor(face.getColor()));
        tvName.setText(face.getName());
        ivIcon.setImageResource(face.getFaceId());

        //them vao container
        container.addView(view);

        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
