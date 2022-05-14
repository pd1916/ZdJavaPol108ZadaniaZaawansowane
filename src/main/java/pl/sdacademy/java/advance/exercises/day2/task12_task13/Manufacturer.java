package pl.sdacademy.java.advance.exercises.day2.task12_task13;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int foundedInYear;
    private String country;

    public Manufacturer(String name, int foundedInYear, String country) {
        this.name = name;
        this.foundedInYear = foundedInYear;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getFoundedInYear() {
        return foundedInYear;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return foundedInYear == that.foundedInYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundedInYear, country);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", foundedInYear=" + foundedInYear +
                ", country='" + country + '\'' +
                '}';
    }
}
