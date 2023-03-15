package com.driver;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth()); // will output "Method is overridden in Extended class B"
        System.out.println(((A)obj).meth()); // will output "Invoking method from class A"
    }
}