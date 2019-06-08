package com.example.myapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {
    private ArrayList<Person> list;
    private Context ctx ;

    public PersonAdapter(ArrayList<Person> list, Context ctx) {
        this.list = list;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View inflateView = li.inflate(R.layout.item_row,viewGroup,false);

        return new ViewHolder(inflateView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Person current = list.get(i);
        viewHolder.tvtitle.setText(current.getTitle());
        viewHolder.tvtime.setText(current.getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView tvtitle,tvtime;
        public ViewHolder(View itemView)
        {
            super((itemView));
            tvtitle = itemView.findViewById(R.id.tvNote);
            tvtime = itemView.findViewById(R.id.tvNoteTime);

        }
    }
}
