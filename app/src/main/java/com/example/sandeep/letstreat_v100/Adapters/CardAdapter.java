package com.example.sandeep.letstreat_v100.Adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sandeep.letstreat_v100.R;

import java.awt.font.TextAttribute;

/**
 * Created by sandeep on 5/15/2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public CardView mCardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv_text);
            mCardView = (CardView) itemView.findViewById(R.id.card_view);
            //this.itemView.setBackgroundColor(Color.parseColor("#E0E0E0"));
        }
    }

    private String[] mDataset;
    public CardAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_elements,parent,false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return  myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

}
