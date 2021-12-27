package com.android45.foodminiproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android45.foodminiproject.R;
import com.android45.foodminiproject.model.FoodMenu;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.Viewhoder> {
    List<FoodMenu> foodMenuList;

    public CartAdapter(List<FoodMenu> foodMenuList) {
        this.foodMenuList = foodMenuList;
    }

    @NonNull
    @Override
    public CartAdapter.Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.cart_row, parent, false);
        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartAdapter.Viewhoder holder, int position) {
        FoodMenu foodMenu = foodMenuList.get(position);
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);

        holder.imgFood.setImageResource(foodMenu.getImgFood());
        holder.tvFood.setText(foodMenu.getTvFood());
        holder.tvPrice.setText(foodMenu.getTvPrice());
        holder.imgRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
//        holder.tvCart.set
        holder.imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return foodMenuList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        ImageView imgFood;
        TextView tvFood, tvPrice;
        ImageView imgRemove;
        TextView tvCart;
        ImageView imgAdd;

        public Viewhoder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvFood = itemView.findViewById(R.id.tvFood);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            imgRemove = itemView.findViewById(R.id.imgRemove);
            tvCart = itemView.findViewById(R.id.tvCart);
            imgAdd = itemView.findViewById(R.id.imgAdd);
        }
    }
}