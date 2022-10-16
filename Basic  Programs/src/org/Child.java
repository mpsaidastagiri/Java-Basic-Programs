package org;

 class Child extends Parent {
     @Override
     double m1(int m1, double d1) {
        System.out.println("Child class called");
        return m1+d1;
    }
}
