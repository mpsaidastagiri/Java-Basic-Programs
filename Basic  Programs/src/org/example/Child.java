package org.example;

class Child extends Parent {
     @Override
     public double m1(int m1, double d1) {
        System.out.println("Child class called");
        return m1+d1;
    }
}
