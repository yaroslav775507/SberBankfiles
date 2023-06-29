package org.example;

public class City {
    private int id;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public City(int id, String name, String region, String district, int population) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
    }

    public City(int id, String name, String region, String district, int population, String foundation) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setFoundation(String foundation) {
        if(foundation.isEmpty()){
            foundation = "res";
        }

    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation=" + foundation +
                '}';
    }

}
