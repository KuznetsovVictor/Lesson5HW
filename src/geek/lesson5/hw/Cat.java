package geek.lesson5.hw;

public class Cat extends Animal {

    public Cat(String name, String color, int birthYear) {
        super(name, color, birthYear);
    }

    @Override
    public String run(float length) {
        if (length > 200) {
            return (getName() + " not running the distance - " + length);
        } else return (getName() + " running the distance - " + length);
    }


    @Override
    public String jump(float height){
        if(height > 2){
            return (getName() + " not jump to a height - " + height);
         } else return (getName() + " jump to a height - " + height);
    }
}

