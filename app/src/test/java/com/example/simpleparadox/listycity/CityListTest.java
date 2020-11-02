package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }
    @Test
    void testDeleteCities(){
        CityList cityList = mockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        City city2 = new City("Calgary", "Alberta");
        cityList.add(city);
        cityList.add(city2);
        assertEquals(1, cityList.hasCity(city));
        assertEquals(1, cityList.hasCity(city2));
        cityList.delete(city);
        assertEquals(6, cityList.hasCity(city));

    }
}
