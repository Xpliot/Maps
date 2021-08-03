import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Random;


public class MapGame {

    public static void main(String[] args) {
        CountryNames d = new CountryNames();
        ArrayList one = d.getCountryNames();
        for (int i = 0; i < 1; i++){
            // generating the index using Math.random()
            int index = (int)(Math.random() * one.size());

            System.out.println(one.get(index));
        }
    }





}
