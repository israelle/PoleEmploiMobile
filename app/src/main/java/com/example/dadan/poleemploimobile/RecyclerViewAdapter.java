package com.example.dadan.poleemploimobile;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by israelle on 15/05/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {

    private Context mContext ;
    private List<Computer> computers ;


    public RecyclerViewAdapter(Context mContext, List<Computer> computers) {
        this.mContext = mContext;
        this.computers = computers;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_computer,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.computer_title.setText( "PC " + String.valueOf(computers.get(position).getNum()));
//        holder.computer_title.setText( computers.get(position).getDescription());
        holder.img_computer_thumbnail.setImageResource(computers.get(position).getThumbnails());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,Computer_Activity.class);

                // passing data to the book activity
                intent.putExtra("Number",computers.get(position).getNum());
                intent.putExtra("Description",computers.get(position).getDescription());
                intent.putExtra("Thumbnail",computers.get(position).getThumbnails());
                // start the activity
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return computers.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView computer_title;
        ImageView img_computer_thumbnail, img_available;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            computer_title = (TextView) itemView.findViewById(R.id.computer_title_id) ;
            img_computer_thumbnail = (ImageView) itemView.findViewById(R.id.computer_img_id);
            img_available = (ImageView) itemView.findViewById(R.id.img_available);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }
}
