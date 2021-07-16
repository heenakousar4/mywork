package com.example.astrolife;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HoroscopeAdapter extends RecyclerView.Adapter<HoroscopeAdapter.HoroscopeViewHolder> {
    List<HoroscopeData> horoscopeDataList;
    private Context context;
    public HoroscopeAdapter(Context context,List<HoroscopeData> horoscopeDataList){
        this.context = context;
        this.horoscopeDataList = horoscopeDataList;
    }

    @Override
    public HoroscopeAdapter.HoroscopeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.horoscope_list_row,parent,false);
        return new HoroscopeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull HoroscopeAdapter.HoroscopeViewHolder holder, int position) {
        HoroscopeData horoscopeData = horoscopeDataList.get(position);
        holder.zodiacName.setText(horoscopeData.zodiacName);
        int resId = context.getResources().getIdentifier(horoscopeData.zodiacImageName,"drawable","com.example.astrolife");
        holder.imageView.setBackgroundResource(resId);

    }

    @Override
    public int getItemCount() {
        return horoscopeDataList.size();
    }

    class HoroscopeViewHolder extends RecyclerView.ViewHolder {
        LinearLayout parent;
        TextView zodiacName;
        ImageView imageView;

        public HoroscopeViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            zodiacName = itemView.findViewById(R.id.zodiacName);
            imageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),HoroscopeDataActivity.class);
                    intent.putExtra("zodiacName",zodiacName.getText().toString());
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
