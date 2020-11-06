package com.example.anagabrielat3videojuegos.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anagabrielat3videojuegos.Entidades.AnimeClass;
import com.example.anagabrielat3videojuegos.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.AdapterCotacViewHolder> {


    List<AnimeClass> list;

    public AdapterList(List<AnimeClass> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterCotacViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterCotacViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.irem_animes, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCotacViewHolder holder, int position) {

        holder.SetInfo(list.get(position));

        AnimeClass aClass = list.get(position);

        holder.startId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!aClass.getaBoolean()) {
                    holder.startId.setImageResource(R.drawable.ic_baseline_star_rate_1);
                    aClass.setaBoolean(true);

                } else {

                    holder.startId.setImageResource(R.drawable.ic_baseline_star_outline_2);
                    aClass.setaBoolean(false);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class AdapterCotacViewHolder extends RecyclerView.ViewHolder {

        ImageView imageURL, startId;
        TextView name, description;

        public AdapterCotacViewHolder(@NonNull View itemView) {
            super(itemView);

            imageURL = itemView.findViewById(R.id.imageURL);
            startId = itemView.findViewById(R.id.startId);
            description = itemView.findViewById(R.id.description);
            name = itemView.findViewById(R.id.name);
        }

        void SetInfo(AnimeClass aClass) {

            //  implementation 'com.squareup.picasso:picasso:2.71828' uso la dependencia
            Picasso.get()
                    .load(aClass.getImageUr())
                    .into(imageURL);

            description.setText(aClass.getDescription());
            name.setText(aClass.getName());
        }
    }
}
