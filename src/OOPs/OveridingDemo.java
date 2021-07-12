package OOPs;
class Animal{
    public  void eat(){
        System.out.println("Animal Eat");
    }
    public void sleep(){
        System.out.println("Animal Sleep");
    }

}
class Cat extends Animal{
    public void eat(){
        System.out.println("Cat eat");//
    }
    public void jump(){
        System.out.println("Cat Jumps");
    }


}
//class Kitten extends Cat{
//    public void eat(){
//        System.out.println("MIlk eat");
//    }
//
//}
class Dog extends Animal{
    public void eat(){
       System.out.println("Dog Eat");
   }

}
public class OveridingDemo {
    public static void main(String[] args) {
//        Animal a=new Animal();
//        a.eat();
//        Cat c=new Cat();
//        c.eat();
//        Animal a1=new Cat();
//        a1.eat();
//        a1.sleep();
       // a1.jumps();
        Animal a2=new Dog();
        a2.eat();

    }

}
