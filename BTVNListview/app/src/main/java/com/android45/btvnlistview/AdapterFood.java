package com.android45.btvnlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterFood extends BaseAdapter {
    ArrayList<Menu> menuArrayList;

    public AdapterFood(ArrayList<Menu> menuList) {
        this.menuArrayList = menuArrayList;
    }

    @Override
    public int getCount() {
        return menuArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return menuArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.icon_menu, viewGroup, true);

        ImageView imgMonAn = view.findViewById(R.id.imgMonAn);
        TextView tvMonAn = view.findViewById(R.id.tvMonAn);
        RatingBar rbStar = view.findViewById(R.id.rbStar);
        TextView tvSoLuong = view.findViewById(R.id.tvSoLuong);
        TextView tvInfor = view.findViewById(R.id.tvInfor);
        TextView tvShip = view.findViewById(R.id.tvShip);
        TextView tvTime = view.findViewById(R.id.tvTime);
        TextView tvMoney = view.findViewById(R.id.tvMoney);

        Menu menu = menuArrayList.get(position);

        if (menu.isImg()) imgMonAn.setVisibility(View.VISIBLE);
        else imgMonAn.setVisibility(View.GONE);

        tvMoney.setText(menu.getFoodName());
        rbStar.setNumStars(menu.getRate());
        tvSoLuong.setText(String.valueOf(menu.getSoluong()));
        tvInfor.setText(menu.getFoodInfor());
        tvShip.setText(menu.getShip());
        tvTime.setText(String.valueOf(menu.getTime()));
        tvMoney.setText(menu.getMoney());

        return view;
    }
}
