/* WAP to demonstrate Polymorphism in Java.
 * input: none
 * variables: none
 */
class Animal {
    public void makeSound() {
       System.out.println("The animal makes a sound");
    }
 }
  
 class Dog extends Animal {
   public void makeSound() {
      System.out.println("The dog barks");
   }
}
 
class Cat extends Animal {
   public void makeSound() {
      System.out.println("The cat meows");
   }
}

/**
 * InnerPolymorphismAnimal
 */
 class PolymorphismAnimal {

   public static void main(String[] args) {
      Animal dog= new Dog();
      Animal cat= new Cat();
      dog.makeSound();
      cat.makeSound();
   }
}
 
/*
 * OutPut: The dog barks
 * The cat meows
 * Explanation: 
 * 1.I created a parent class(Animal)
 * 2.I created child classes which extend parent class(Animal).
 * 3.I printed the sounds of the animals.
 * 4.I created a main class and created an objects.
 */