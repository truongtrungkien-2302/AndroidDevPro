package com.android45.foodminiproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android45.foodminiproject.model.FoodMenu;
import com.android45.foodminiproject.Interface.IconClickFoodRecyclerView;
import com.android45.foodminiproject.R;

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

        holder.btAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iconClickFoodRecyclerView.onClickAddToCart(foodMenu);
            }
        });
        holder.btAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iconClickFoodRecyclerView.onClickItem(foodMenu);
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
        TextView tvPrice, tvMoney;
        ImageView imgCart;
        Button btAddToCart;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvFood = itemView.findViewById(R.id.tvFood);
            tvMoney = itemView.findViewById(R.id.tvMoney);
            rbStar = itemView.findViewById(R.id.rbStar);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imgCart = itemView.findViewById(R.id.imgCart);
            btAddToCart = itemView.findViewById(R.id.btAddToCart);
        }
    }
}
