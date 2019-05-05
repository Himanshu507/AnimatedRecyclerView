package com.hoax.animatedrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.SimpleViewHolder> {

    Context mContext;
    List<SetData> mData;

    public SimpleRecyclerAdapter(Context context, List<SetData> mData) {
        this.mContext = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_news, viewGroup, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder simpleViewHolder, int i) {
        simpleViewHolder.imageView.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.fade_transition));
        simpleViewHolder.relative.setAnimation(AnimationUtils.loadAnimation(mContext, R.anim.item_animation));
        simpleViewHolder.title.setText(mData.get(i).getTitle());
        simpleViewHolder.description.setText(mData.get(i).getDescription());
        simpleViewHolder.price.setText(mData.get(i).getPrice());
        simpleViewHolder.imageView.setImageResource(mData.get(i).getProduct_Img());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class SimpleViewHolder extends RecyclerView.ViewHolder {

        public TextView title, description, price;
        public ImageView imageView;
        public RelativeLayout relative;

        public SimpleViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.product_title);
            imageView = itemView.findViewById(R.id.product_img);
            description = itemView.findViewById(R.id.product_description);
            price = itemView.findViewById(R.id.price);
            relative = itemView.findViewById(R.id.relative);
        }
    }
}
