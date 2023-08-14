package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();
        feed(rocky);

        // Polymorphism part
        Animal sasha = new Dog();
//        sasha.fetch() since we upcasted to type animal, we now have no access to .fetch
//        We will need to downcast the object to type Dog if we want to have access .fetch.
//        sasha.makeSound();

        sasha = new Cat();
//        Dog sashaTheDog = (Dog)sasha; this won't work because there are no such things like siblings in Java.
//        So we can't cast a Cat into a Dog. So can't change from Cat to a Dog or vice-versa.
//        boolean isAnimal = sasha instanceof Animal; // true
//        boolean isDog = sasha instance of Cat; // true

//        sasha.makeSound();
//        ((Cat) sasha).scratch(); // downcast, temporarily, sasha from Animal -> Dog
        feed(sasha);

        /*
        // Instance of pattern matching
          Animal sasha = new Dog();
          if (sasha instanceof Dog sashaTheDog) {
            sashaTheDog.fetch();
          }

          // same as
          if (sasha instanceof Dog) {
            Dog sashaTheDog = (Dog)sasha;
            sashaTheDog.fetch();
          }
         */
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("here is your dog food");
        }
        else if (animal instanceof Cat) {
            System.out.println("here is your cat food");
        }
    }
}
