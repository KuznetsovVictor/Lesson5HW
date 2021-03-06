package geek.lesson5.hw;

/*1 Создать классы Собака и Кот с наследованием от класса Животное.
2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
3 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
4 При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
5 * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.*/
import java.util.Calendar;

public abstract class Animal {
        private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
        private String name;
        private  String color;
        private  int birthYear;

        public Animal(String name, String color, int birthYear) {
            this.name = name;
            this.color = color;
            this.birthYear = this.birthYear;
        }

        public abstract String run(float length);

        public String swim(float length) {
            return (name + " can`t swim.");

        }

        public abstract String jump(float height);

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

