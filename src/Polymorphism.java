

class Animal
{
    public void animalsound()
    {
    System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal
{
    public void animalsound(){
    System.out.println("Meow meow");
    }
}
class Dog extends Animal{
    public void animalsound()
    {
    System.out.println("Bhow Bhow");
    }
}

public class Polymorphism {
public static void main(String [] args)
{
    Animal a=new Animal();
    Cat c=new Cat();
    Dog d=new Dog();
    a.animalsound();
    c.animalsound();
    d.animalsound();
}
}