package com.suranjana.recycler;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleRecyclerViewAdapter extends RecyclerView.Adapter<SimpleRecyclerViewAdapter.ViewHolder>{
    ArrayList<AnimalModel> meroData = new ArrayList<>();
//    Context context;
      OnRecyclerItemClick listener;

    SimpleRecyclerViewAdapter(ArrayList<AnimalModel>passedData, OnRecyclerItemClick listener){
//        this.context = context;
        this.listener = listener;
        meroData = passedData;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_simple_recycler,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textView.setText(Integer.toString(position+1));
        holder.textView1.setText(meroData.get(position).species);
        holder.textView2.setText(meroData.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("name",meroData.get(position).name);
//                context.startActivity(intent);
                listener.onClick(meroData.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {

        return meroData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;
        TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.number);
            textView1 = itemView.findViewById(R.id.subtitle);
            textView2 = itemView.findViewById(R.id.name);
        }
    }
}

