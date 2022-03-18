package ru.gb.lesson8cities;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CityHolder extends RecyclerView.ViewHolder {

    private ImageView picture;
    private TextView name;
    private City city;

    public CityHolder(@NonNull View itemView) {
        super(itemView);
        picture = itemView.findViewById(R.id.city_picture);
        name = itemView.findViewById(R.id.city_name);
    }

    public void bind(City city)
    {
        this.city = city;
        name.setText(city.name);

        Picasso.get()
                .load(city.urlString)
                .fit()
                .centerCrop()
                .into(picture);
    }
}
