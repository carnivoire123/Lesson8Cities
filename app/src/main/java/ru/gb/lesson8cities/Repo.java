package ru.gb.lesson8cities;

import java.util.List;

public interface Repo {
    public void add(String name, String url);
    public List<City> getAll();
}
