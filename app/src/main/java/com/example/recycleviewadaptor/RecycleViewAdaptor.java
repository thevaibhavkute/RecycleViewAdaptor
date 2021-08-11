package com.example.recycleviewadaptor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleviewadaptor.R;

import java.util.ArrayList;

public class RecycleViewAdaptor extends RecyclerView.Adapter <RecycleViewAdaptor.MyHolder> {

    //constructor
    public RecycleViewAdaptor(ArrayList<String> arrayList ) {
        this.arrayList = arrayList;
    }
    ArrayList <String>arrayList;

    //holds the views
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_code,parent,false);
        return new MyHolder(view);
    }

    //binds the items
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.textView.setText(arrayList.get(position));
        holder.imageView.setImageResource(R.drawable.myimage);
    }

    //returns the count
    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    //holder class
    public class MyHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            //finding ids of items which in single item
            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
        }
    }
}
