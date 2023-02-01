package org.example;

import ContactsAndFriends.Friend;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

         Student harald = new Student("Harald", 2);
         Student Eberhard = new Student("Eberhard", 1);
         Student Hans = new Student("Hans", 4);
         Student Heribert = new Student("Heribert", 3);

         StudentDB database = new StudentDB(new Student[] {harald, Eberhard, Hans, Heribert});

         database.removeStudent(Heribert);
         database.addStudent(Heribert);


         ComputerScienceStudent Guenther = new ComputerScienceStudent("Guenther", 5, true);


         Friend Pedro= new Friend("Pedro",1);


         System.out.println(
         database.findById(30)

         );





    }
}
