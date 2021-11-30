package com.android45.miniproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodRecyclerViewAdapter extends RecyclerView.Adapter<FoodRecyclerViewAdapter.Viewholder> {
    List<FoodMenu> foodMenuList;

    public FoodRecyclerViewAdapter(List<FoodMenu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }

    @NonNull
    @Override
    public FoodRecyclerViewAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_menu, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodRecyclerViewAdapter.Viewholder holder, int position) {
        FoodMenu foodMenu = foodMenuList.get(position);
        holder.imgFood.setImageResource(foodMenu.getImgFood());
        holder.tvFood.setText(foodMenu.getTvFood());
        holder.rbStar.setRating(foodMenu.getRbStart());
        holder.tvPrice.setText(foodMenu.getTvPrice());
    }

    @Override
    public int getItemCount() {
        return foodMenuList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView imgFood;
        TextView tvFood;
        RatingBar rbStar;
        TextView tvPrice;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvFood = itemView.findViewById(R.id.tvFood);
            rbStar = itemView.findViewById(R.id.rbStar);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }
}
