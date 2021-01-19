package geekbrains.sixthVebinar;

public class Cat extends Animal {

    @Override
    public void run(String name, short distance) {
        if (distance > 200) {
            System.out.printf("It's impossible for %s to run the distance over the 200m.\n\n", name);
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("%s is standing still\n\n", name);
        } else {
            System.out.printf("Cat named as %s has ran %d meters.\n\n", name, distance);
        }
    }

    @Override
    public void run(short distance) {
        System.out.printf("Cat has ran %d meters.\n", distance);
    }

    @Override
    public void swim(String name, short distance) {
        System.out.printf("Cat named %s has swam %d meters.\n", name, distance);
    }

    @Override
    public void swim(short distance) {
        System.out.printf("Cat has swam %d meters.\n", distance);
    }
}
