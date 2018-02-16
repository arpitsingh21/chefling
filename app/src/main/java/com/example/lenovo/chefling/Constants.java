package com.example.lenovo.chefling;

/**
 * Created by lenovo on 16/2/18.
 */

public class Constants {


    public static String query= "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"bangalore\")";

   public static String env = "store://datatables.org/alltableswithkeys";
}
