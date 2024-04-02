
package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.Jbuku;

import java.util.ArrayList;

public class AdapterBuku extends RecyclerView.Adapter<AdapterBuku.ViewHolder> {

    private ArrayList<Jbuku> buku;

    private static OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public static void setOnItemClickListener(OnItemClickListener listener) {
        mListener =listener;
    }

    public AdapterBuku(ArrayList<Jbuku> modelItem) {
        this.buku = modelItem;
    }

    @NonNull
    @Override
    public AdapterBuku.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder VH = new ViewHolder(view);
        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBuku.ViewHolder holder, int position) {
        holder.nameItem.setText(buku.get(position).getNameItem());
        holder.sinopsis.setText(buku.get(position).getSinopsis());
        holder.price.setText(buku.get(position).getPrice());
        holder.cover.setImageResource(buku.get(position).getCoverbuku());
    }

    @Override
    public int getItemCount() {
        return buku.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameItem, sinopsis, price;
        ImageView cover;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cover = itemView.findViewById(R.id.cover);
            nameItem = itemView.findViewById(R.id.nameItem);
            price = itemView.findViewById(R.id.Price);
            sinopsis = itemView.findViewById(R.id.sinopsis);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && mListener != null) {
                        mListener.onItemClick(position);
                    }
                }
            });

        }
    }
}
