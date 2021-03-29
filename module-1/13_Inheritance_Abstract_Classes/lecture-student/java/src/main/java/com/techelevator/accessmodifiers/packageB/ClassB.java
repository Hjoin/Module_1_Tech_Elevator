package com.techelevator.accessmodifiers.packageB;


import com.techelevator.accessmodifiers.packageA.ClassA;

public class ClassB extends ClassA {

   public boolean methodB() {
       ClassA a = new ClassA();
       methodA();
       //anotherMethodA(); //won't work because it has default/package access
       return true;
   }
}
