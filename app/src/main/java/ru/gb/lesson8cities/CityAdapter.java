package ru.gb.lesson8cities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CityAdapter extends RecyclerView.Adapter<CityHolder> {

    private List<City> cities = new ArrayList<>();

    public void setData(List<City> cities)
    {
        this.cities = cities;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CityHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, parent, false);
        return new CityHolder(view);

         */
        return new CityHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false)
        );
    }

    // переопределение холдера новыми данными
    @Override
    public void onBindViewHolder(@NonNull CityHolder holder, int position) {
        holder.bind(cities.get(position));
    }

    // сколько холдеров надо будет нарисовать
    @Override
    public int getItemCount() {
        return cities.size();
    }
}
