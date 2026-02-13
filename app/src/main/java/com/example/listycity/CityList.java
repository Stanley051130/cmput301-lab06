package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether the given city is in the list.
     *
     * @param city the city to check (must not be null)
     * @return {@code true} if the city exists in the list; {@code false} otherwise
     * @throws NullPointerException if {@code city} is null
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes the given city from the list.
     *
     * @param city the city to delete (must not be null)
     * @throws IllegalArgumentException if the city is not present in the list
     * @throws NullPointerException     if {@code city} is null
     */
    public void delete(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException("City not found in the list.");
        }
    }

    /**
     * Returns the number of cities currently stored.
     *
     * @return the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}
