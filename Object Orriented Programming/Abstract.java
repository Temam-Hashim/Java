abstract class Animal {
    protected String color = "white";

    Animal() {
        System.out.println("Animals...");
    }

    abstract void eat();

    void usage() {
        System.out.println("Animal Has malt-functionality");
    }
}

// Creating a Child class which inherits Abstract class
class Cow extends Animal {

    void cawColor() {
        super.usage();
        System.out.println("Caw Color:" + color);
    }

    @Override
    void eat() {
        System.out.println("Caw eat grasses");
    }
}

// Creating a Test class which calls abstract and non-abstract methods
class Abstract {
    public static void main(String args[]) {
        Cow obj = new Cow();
        obj.cawColor();
        obj.eat();
    }
}