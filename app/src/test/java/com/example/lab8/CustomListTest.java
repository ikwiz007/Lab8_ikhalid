package com.example.lab8;


import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;




public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * When given a city,the hasCity function should return whether or not it belongs in the list
     * checking if the function returns true
     * if it does not return true, then the test fails
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City name = new City("Estevan", "SK");
        list.addCity(name);
        assertEquals(true, list.hasCity(name));
    }

    /**
     * Checks if the deleteCity function
     * removes a City object from the cities list
     */
    @Test
    public void deleteCityTest() throws Exception {
        list = MockCityList();
        City name = new City("Estevan", "SK");
        list.addCity(name);
        assertEquals(0, list.deleteCity(name));
    }




}
