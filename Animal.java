public class Animal {

    public  void makeSound() {
        System.out.println("Animal makes sound! ");
    }
}
     class Cat extends Animal{
        public void makeSound(){
            System.out.println("Animal is barking");

        }
    }
     class AnimalInheritance{
        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.makeSound();

        }
    }


