package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return  "Invoking method from class A";
        }
    }
    public  static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B" ;
        }

    }
    public static void main(String[] args) {
        B obj = new B();
        obj.meth(); // will output "Method is overridden in Extended class B"
        B obj1 =new B(); // will output "Invoking method from class A"
        obj1.meth();
    }
}