package com.derachmatt.utsprakmobileprog;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Viewholder>{

    private ArrayList<String> mGambar = new ArrayList<>();
    private ArrayList<String> mNama = new ArrayList<>();
    private ArrayList<String> mKe = new ArrayList<>();
    private ArrayList<String> desc = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter( Context mContext, ArrayList<String> mGambar, ArrayList<String> mNama, ArrayList<String> mKe, ArrayList<String> desc) {
        this.mGambar = mGambar;
        this.mNama = mNama;
        this.mKe = mKe;
        this.desc = desc;
        this.mContext = mContext;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listhokage, parent, false);
        Viewholder holder = new Viewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Viewholder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mGambar.get(position))
                .into(holder.gambar);

        holder.hokage.setText(mNama.get(position));
        holder.khokage.setText(mKe.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mNama.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailHokage.class);
                intent.putExtra("gambar", mGambar.get(position));
                intent.putExtra("desc", desc.get(position));
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mNama.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        CircleImageView gambar;
        TextView hokage;
        TextView khokage;
        RelativeLayout parentLayout;

        public Viewholder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.Ghokage);
            hokage = itemView.findViewById(R.id.Nhokage);
            khokage = itemView.findViewById(R.id.Khokage);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }



}
