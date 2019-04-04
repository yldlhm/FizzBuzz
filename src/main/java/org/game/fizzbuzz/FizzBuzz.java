package org.game.fizzbuzz;


public class FizzBuzz {
    public static void printFizzBuzz(){
        for (int i = 1 ; i <=100;i++)
            System.out.println(i%3==0&&i%5==0?"FizzBuzz":i%3==0?"Fizz":i%5==0?"Buzz":i);
    }
    public static void main(String[] args) {
        printFizzBuzz();
    }
}
