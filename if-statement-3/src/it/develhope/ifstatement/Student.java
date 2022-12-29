package it.develhope.ifstatement;

import java.util.Random;

/**
 * Class to define a student
 *
 * @author TonyF
 */
public class Student{
    public String name;
    public int age;

    public Student(String studentName,int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }

    /**
     * prints a random number and compares it to the student age
     */
    public void guessingAnge(){
        Random randomNumber = new Random();
        int    number       = randomNumber.nextInt(35);
        System.out.println("I generated the random number: "+number+" for student "+name);
        if(this.age < number){
            System.out.println("The number is greater than your age");
        } else if(this.age == number){
            System.out.println("The number is equal to your age");
        } else {
            System.out.println("The number is lower than your age");
        }
    }

}


