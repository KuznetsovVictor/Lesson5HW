package geek.lesson5.hw;

public class Main {
    public static void main(String[] args) {
        Cat boris = new Cat("Boris", "White", 2018);
        System.out.println(boris.run(40));
        System.out.println(boris.swim(1));
        System.out.println(boris.jump(1.2f));

        Dog tuzik = new Dog("Tuzik", "Black", 2018);
        System.out.println(tuzik.run(200));
        System.out.println(tuzik.swim(1));
        System.out.println(tuzik.jump(0.4f));


    }
}
