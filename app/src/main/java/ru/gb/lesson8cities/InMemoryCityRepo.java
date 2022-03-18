package ru.gb.lesson8cities;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCityRepo implements Repo{

    private InMemoryCityRepo()
    {
        add("Лисаковск", "https://a.d-cd.net/cbe7bfes-1920.jpg");
        add("Лондон", "https://stogorodov.ru/images/cities/europe/london/vid-na-london.jpg");
        add("Москва", "https://traveller-eu.ru/sites/default/files/moscow-3550477_1280_0.jpg");
    }

    private static InMemoryCityRepo instance;

    public static InMemoryCityRepo getInstance()
    {
        if(instance == null)
            instance = new InMemoryCityRepo();

        return instance;
    }


    private List<City> cities = new ArrayList<>();

    @Override
    public void add(String name, String url) {
        cities.add(new City(name, url));
    }

    @Override
    public List<City> getAll() {
        return cities;
    }
}
