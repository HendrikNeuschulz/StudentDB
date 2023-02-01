package org.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class StudentDBTest {

    @Test
    void findByIdAssertFoundOne() {
        Student harald = new Student("Harald", 2);
        StudentDB database = new StudentDB(new Student[] { harald });
        Student result = database.findById(2);
        try {
            Assertions.assertEquals(result, harald);
        } catch (Exception exception) {
            Assertions.assertFalse(result.equals(harald));
        }
    }

    @Test
    void findByIdAssertFoundNoone() {
        Student harald = new Student("Harald", 2);
        StudentDB database = new StudentDB(new Student[] {harald});
        Student result = database.findById(20);
        try {
            Assertions.assertEquals(result, new Student( "no such student", 20));
        } catch (Exception exception){
            Assertions.assertFalse(result.equals(harald));
        }
    }

}