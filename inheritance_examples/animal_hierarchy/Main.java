public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Dog("Bruno", 3),
            new Cat("Mittens", 2),
            new Bird("Tweety", 1)
        };

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
