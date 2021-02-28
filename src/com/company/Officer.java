package com.company;

import java.util.Scanner;

public class Officer {

    private String name;
    private String surname;
    private int officerID;
    private String workingDistrict;
    private int crimesSolved;

    public Officer(String name, String surname, int officerID, String workingDistrict, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workingDistrict = workingDistrict;
        this.crimesSolved = crimesSolved;
    }

    public Officer() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public String getWorkingDistrict() {
        return workingDistrict;
    }

    public void setWorkingDistrict(String workingDistrict) {
        this.workingDistrict = workingDistrict;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }


    public int calculatedLevel() {
        if (crimesSolved <= 20) {
            return 1;
        }
        if (crimesSolved > 20 && crimesSolved < 40) {
            return 2;
        }
        if (crimesSolved >= 40) {
            return 3;
        }
        return calculatedLevel();
    }

    public String toString() {
        return name + ", " + surname + ", " + officerID + ", " + workingDistrict + ", " + crimesSolved + ".";
    }

}
