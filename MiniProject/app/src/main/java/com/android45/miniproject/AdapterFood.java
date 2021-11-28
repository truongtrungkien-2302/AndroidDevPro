package com.android45.miniproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class AdapterFood extends BaseAdapter {
    List<FoodMenu> foodMenuList;

    public AdapterFood(List<FoodMenu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }

    @Override
    public int getCount() {
        return foodMenuList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodMenuList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View convertView = layoutInflater.inflate(R.layout.icon_menu, viewGroup, false);

        ImageView imgFood = convertView.findViewById(R.id.imgFood);
        TextView tvFood = convertView.findViewById(R.id.tvFood);
        RatingBar rbStart = convertView.findViewById(R.id.rbStar);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);

        FoodMenu foodMenu = foodMenuList.get(i);

        imgFood.setImageResource(foodMenu.getImgFood());
        tvFood.setText(foodMenu.getTvFood());
        rbStart.setRating(foodMenu.getRbStart());
        tvPrice.setText(String.valueOf(foodMenu.getTvPrice()));

        return convertView;
    }
}
