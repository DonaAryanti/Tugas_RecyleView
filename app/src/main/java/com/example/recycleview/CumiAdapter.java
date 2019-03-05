package com.example.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CumiAdapter extends RecyclerView.Adapter<CumiAdapter.ViewHolder> {
    private Context context;
    private  ArrayList<CumiModel>cumiList;


    public CumiAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<CumiModel> getCumiList() {
        return cumiList;
    }

    public void setCumiList(ArrayList<CumiModel> cumiList) {
        this.cumiList = cumiList;
    }
    @NonNull
    @Override
    public CumiAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cumi,viewGroup,false);

        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CumiAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getCumiList().get(i).getJumlahStok()).into(viewHolder.ivgambar);
        viewHolder.tvnamacumi.setText(getCumiList().get(i).getNamaCumi());

    }

    @Override
    public int getItemCount() {
        return getCumiList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivgambar;
        public TextView tvnamacumi;

        public ViewHolder(@NonNull View ItemView){
            super(ItemView);

            ivgambar = ItemView.findViewById(R.id.gambar_cumi);
            tvnamacumi = ItemView.findViewById(R.id.nama_cumi);
        }
    }


}
