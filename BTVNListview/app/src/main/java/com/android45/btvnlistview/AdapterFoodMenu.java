package com.android45.btvnlistview;

import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.core.graphics.drawable.DrawableCompat;

import java.util.List;

public class AdapterFoodMenu extends BaseAdapter {
    List<FoodMenu> foodMenuList;

    public AdapterFoodMenu(List<FoodMenu> foodMenuList) {
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

        ImageView imgMonAn = convertView.findViewById(R.id.imgMonAn);
        TextView tvMonAn = convertView.findViewById(R.id.tvMonAn);
        RatingBar rbStar = convertView.findViewById(R.id.rbStar);
        TextView tvSoLuong = convertView.findViewById(R.id.tvSoLuong);
        TextView tvInfor = convertView.findViewById(R.id.tvInfor);
        TextView tvShip = convertView.findViewById(R.id.tvShip);
        TextView tvTime = convertView.findViewById(R.id.tvTime);
        TextView tvMoney = convertView.findViewById(R.id.tvMoney);

        FoodMenu foodMenu = foodMenuList.get(i);

        imgMonAn.setImageResource(foodMenu.getImgMonAn());
        tvMonAn.setText(foodMenu.getTvMonAn());
        rbStar.setRating(foodMenu.getRbStar());
        tvSoLuong.setText(foodMenu.getTvSoLuong());
        tvInfor.setText(foodMenu.getTvInfor());
        tvShip.setText(foodMenu.getTvShip());
        tvTime.setText(foodMenu.getTvTime());
        tvMoney.setText(foodMenu.getTvMoney());

        return convertView;
    }
}
