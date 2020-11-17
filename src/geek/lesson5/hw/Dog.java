package geek.lesson5.hw;

public class Dog extends Animal {
    public Dog(String name, String color, int birthYear) {
        super(name, color, birthYear);
    }

    @Override
    public String run(float length) {
        if (length > 600) {
            return (getName() + " not running the distance - " + length);
        } if (length > 400) {return (getName() + " not running the distance - " + length);
        }  else return (getName() + " running the distance - " + length);
    }

    @Override
    public String swim(float length) {
        if(length > 10){
            return (getName() + " not about swimming distance - " + length);
        }else return (getName() + " swimming about this distance -  " + length);
    }

    @Override
    public String jump(float height){
        if(height > 0.5){
            return (getName() + " not jump to a height - " + height);
        } else return (getName() + " jump to a height - " + height);
    }
}