package org.example;

import ContactsAndFriends.Friend;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

         Student harald = new Student("Harald", 1);
         Student Eberhard = new Student("Eberhard", 2);
         Student Hans = new Student("Hans", 3);
         Student Heribert = new Student("Heribert", 4);


         System.out.println(true);

         StudentDB database = new StudentDB(new Student[] {harald, Eberhard, Hans, Heribert});
         System.out.println(database.toString());
         System.out.println(Arrays.toString(database.getAllStudents()));
         System.out.println(database.randomStudent());
         database.removeStudent(Heribert);
         database.addStudent(Heribert);
         System.out.println(database.toString());

         ComputerScienceStudent Guenther = new ComputerScienceStudent("Guenther", 5, true);
         System.out.println(Guenther);

         Friend Pedro= new Friend("Pedro",1);
         System.out.println(Pedro);

         database.findById(3);





    }
}
