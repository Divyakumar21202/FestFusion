package com.example.bloodonor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {
    Context context;
    ArrayList<CollegeClassModel> arrayList;
    RecyclerViewAdapter(Context context,ArrayList<CollegeClassModel> arrayList){
        this.arrayList=arrayList;
        this.context=context;
    }

    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.collegelistview,parent,false);
        viewHolder viewHolder=new viewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        CollegeClassModel collegeClassModel=arrayList.get(position);
        holder.name.setText(collegeClassModel.getNAME());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView imageView;
        public viewHolder(@NonNull View itemView) {

            super(itemView);
            name=itemView.findViewById(R.id.college_name);
            imageView=itemView.findViewById(R.id.imageView);


        }
    }
}
