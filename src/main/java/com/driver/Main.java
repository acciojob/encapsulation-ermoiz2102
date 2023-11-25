package com.driver;

public class Main {
    public static void main(String[]args){
        RWOnly obj= new RWOnly();
//  obj.name="Moiz";
//  System.out.println(obj.name);
//    the name has private access modifier
        obj.setName("moiz");
        System.out.println(obj.getName());
    }

}