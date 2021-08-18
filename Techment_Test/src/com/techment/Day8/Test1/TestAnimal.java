package com.techment.Day8.Test1;
 class Animal
{
	 void animalSound()
	 {
		 System.out.println("Sorry no sound");
	 }
}
 class Dog extends Animal
 {
	 void animalSound()
	 {
		 System.out.println("Dog Barks");
	 } 
 }
 class Horse extends Animal
 {
	 void animalSound()
	 {
		 System.out.println("Horse Neigh ");
	 }
 }
 class Cat extends Animal
 {
	 void animalSound()
	 {
		 System.out.println("Cat Mew");
	 }
 }
public class TestAnimal {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		Animal horse=new Horse();
		dog.animalSound();
		cat.animalSound();
		horse.animalSound();
		
		
		

	}

}
