package com.example.listycity;

import java.util.Objects;

public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Checks logical equality of cities based on city name and province/state (case-insensitive).
     *
     * @param o the object to compare
     * @return true if {@code o} is a City with the same city+province; false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return this.city.equalsIgnoreCase(other.city)
                && this.province.equalsIgnoreCase(other.province);
    }

    /**
     * Computes a hash code consistent with {@link #equals(Object)}.
     *
     * @return hash code for this city
     */
    @Override
    public int hashCode() {
        return Objects.hash(city.toLowerCase(), province.toLowerCase());
    }

    /**
     * Returns a readable string representation.
     *
     * @return string form like "Edmonton, AB"
     */
    @Override
    public String toString() {
        return city + ", " + province;
    }
}
