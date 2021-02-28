package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PoliceStation {

    public static void main(String[] args) {


        Officer officer1 = new Officer("Jessica", "Jones", 22876, "District1", 27);
        Officer officer2 = new Officer("Sam", "Spade", 22890, "District1", 75);
        Officer officer3 = new Officer("Will", "Graham", 21711, "District9", 35);
        Officer officer4 = new Officer("Clarice", "Starling", 28122, "District5", 88);
        Officer officer5 = new Officer("Jim", "Hopper", 22130, "Center", 5);
        Officer officer6 = new Officer();

        officer6.setName("Harry");
        officer6.setSurname("Callahan");
        officer6.setOfficerID(21917);
        officer6.setWorkingDistrict("Center");
        officer6.setCrimesSolved(16);


        System.out.println(officer1.toString());
        System.out.println(officer2.toString());
        System.out.println(officer3.toString());
        System.out.println(officer4.toString());
        System.out.println(officer5.toString());
        System.out.println(officer6.toString());

        ArrayList<Officer> district99 = new ArrayList<>();
        district99.add(officer1);
        district99.add(officer2);
        district99.add(officer3);
        district99.add(officer4);
        district99.add(officer5);
        district99.add(officer6);


//c. Find out how many Officers are with level 1 in the District99.
        int count = 0;
        for(Officer officer : district99) {
            if(officer.calculatedLevel() == 1) {
                count++;
            }
            System.out.println(count);
        }



//d. Find out how many Officers are with the level which is larger than 1 in the District99.
//e. Find out if there is any Officer with the name “John”.



//        System.out.println(officer5.getName());
//        System.out.println(officer5.calculatedLevel());
//        System.out.println(officer2.calculatedLevel());
//        System.out.println(officer2.toString());


    }
}
