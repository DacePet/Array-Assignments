package com.company;

import java.util.*;

public class Officer {
    List<Officer> allOfficer;


    public String name;
    public String surname;
    public int officerID;
    public String workDistrict;
    public int crimesSolved;

    public Officer(String name, String surname, int officerID, String workDistrict, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workDistrict = workDistrict;
        this.crimesSolved = crimesSolved;
    }




    @Override
    public String toString() {
        return "Officer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", officerID=" + officerID +
                ", workDistrict='" + workDistrict + '\'' +
                ", crimesSolved=" + crimesSolved +
                '}';
    }

public static void levelOfOfficer(String[]crimesSolved)
{
    // BAD OPERAND TYPES FOR BINARY OPERATION '>=" etc. NOT WORKABLE METHOD
 //if (crimesSolved >= 0 && crimesSolved <= 20)
    System.out.println("Level 1");
   //  if (crimesSolved > 20 && crimesSolved <= 40)
     //   System.out.println("Level 2");
//     if (crimesSolved > 40)
  //       System.out.println("Level 3");
  }


    public static void main(String[] args) {
     Officer officerFirst = new Officer("Peter", "Bloom", 48675, "Berlin", 46);
    Officer officerSecond = new Officer ("Samir", "Coucou", 65499, "Dortmund", 5);
    Officer officerThird = new Officer("Karl", "Schmidt", 54845, "Hamburg", 15);
    //levelOfOfficer();
        //System.out.println(first);
        //System.out.println(first.toString());
        //System.out.println(second.toString());
        //System.out.println(third.toString());
        // levelOfOfficer(int crimesSolved);
    }
//public String getName(){
}



//}
