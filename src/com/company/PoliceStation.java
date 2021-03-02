package com.company;

import java.util.*;


public class PoliceStation {

    public static void main(String[] args) {

        Officer officer1 = new Officer("Mike", "Lowrey", 22876, "District1", 27);
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

        int countOfFirstLevel = 0;
        int countOfMoreThanFirstLevel = 0;
        int countOfJohn = 0;

        for (Officer officer : district99) {
            if (officer.calculatedLevel() == 1) {
                countOfFirstLevel++;
            }

            if (officer.calculatedLevel() > 1) {
                countOfMoreThanFirstLevel++;
            }

            if (officer.getName().contains("John")) {
                countOfJohn++;
            }
        }
        System.out.println("John: " + countOfJohn);
        System.out.println("Count of First Level: " + countOfFirstLevel);
        System.out.println("Count of More Than First level: " + countOfMoreThanFirstLevel);

        Scanner input = new Scanner(System.in);
        char choice;
        Officer officer;

        do
        {

            officer = new Officer();

            System.out.println("Enter name");
            officer.setName(input.nextLine());
            System.out.println("Enter surname");
            officer.setSurname(input.nextLine());
            System.out.println("Enter OfficerID");
            officer.setOfficerID(input.nextInt());
            input.nextLine();
            System.out.println("Enter working district");
            officer.setWorkingDistrict(input.nextLine());
            System.out.println("How many crimes solved?");
            officer.setCrimesSolved(input.nextInt());
            input.nextLine();

            district99.add(officer);

            System.out.print("Add another? Enter Y for yes N for no: ");
            choice = input.next().charAt(0);
            input.nextLine();

        }
        while ((choice == 'y') || (choice == 'Y'));


        for (Officer off : district99)
        {
            System.out.println(off.toString());
        }

//        Iterator itr = district99.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        System.out.println(officer5.getName());
//        System.out.println(officer5.calculatedLevel());
//        System.out.println(officer2.calculatedLevel());
//        System.out.println(officer2.toString());
    }
}
