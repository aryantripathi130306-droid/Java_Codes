class LivingBeing {
    void eat() {
        System.out.println("Eating");
    }
}

class Human extends LivingBeing {
    void speak() {
        System.out.println("Speaking");
    }
}

class Child extends Human {
    void play() {
        System.out.println("Playing");
    }
}

class Adult extends Human {
    void work() {
        System.out.println("Working");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Child child = new Child();
        child.eat();
        child.speak();
        child.play();

        Adult adult = new Adult();
        adult.eat();
        adult.speak();
        adult.work();
    }
}
