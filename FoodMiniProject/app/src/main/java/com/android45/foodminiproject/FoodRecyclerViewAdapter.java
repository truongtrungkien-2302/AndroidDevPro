package com.android45.foodminiproject;

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
    IconClickFoodRecyclerView iconClickFoodRecyclerView;

    public void setIconClickFoodRecyclerView(IconClickFoodRecyclerView iconClickFoodRecyclerView) {
        this.iconClickFoodRecyclerView = iconClickFoodRecyclerView;
    }

    public FoodRecyclerViewAdapter(List<FoodMenu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }

    @NonNull
    @Override
    public FoodRecyclerViewAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_icon_recycler_view, parent, false);
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

        holder.imgRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iconClickFoodRecyclerView.onClickRemove(foodMenu);
            }
        });

        holder.imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iconClickFoodRecyclerView.onClickAdd(foodMenu);
            }
        });
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
        ImageView imgRemove, imgAdd;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvFood = itemView.findViewById(R.id.tvFood);
            rbStar = itemView.findViewById(R.id.rbStar);
            tvPrice = itemView.findViewById(R.id.tvPrice);

            imgRemove = itemView.findViewById(R.id.imgRemove);
            imgAdd = itemView.findViewById(R.id.imgAdd);
        }
    }
}
