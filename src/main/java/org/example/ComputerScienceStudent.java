package org.example;

public class ComputerScienceStudent extends Student{

    boolean goodInMath;

    public ComputerScienceStudent(String name, int id, boolean goodInMath) {
        super(name, id);
        this.goodInMath = goodInMath;
    }

    public ComputerScienceStudent(boolean goodInMath) {
        this.goodInMath = goodInMath;
    }


    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "Name= " + super.getName() + ", Id="+ super.getId() +
                ", goodInMath= " + goodInMath +'}';
    }
}
