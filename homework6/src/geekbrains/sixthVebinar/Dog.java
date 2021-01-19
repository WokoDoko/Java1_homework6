package geekbrains.sixthVebinar;

public class Dog extends Animal {

    @Override
    public void run(String name, short distance) {
        if (distance > 500) {
            System.out.printf("It's impossible for %s to run the distance over the 500m.\n\n", name);
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("%s is standing still\n\n", name);
        } else {
            System.out.printf("Dog named as %s has ran %d meters.\n\n", name, distance);
        }
    }

    @Override
    public void run(short distance) {
        if (distance > 500) {
            System.out.printf("For our dog it's impossible to run the distance over the 500m.\n\n");
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("The dog is standing still\n\n");
        } else {
            System.out.printf("The dog has ran %d meters.\n\n", distance);
        }
    }

    @Override
    public void swim(String name, short distance) {
        if (distance > 10) {
            System.out.printf("It's impossible for %s to swim the distance over the 10m.\n\n", name);
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("%s doesn't move in the water.\n\n", name);
        } else {
            System.out.printf("Dog named %s has swam %d meters.\n\n", name, distance);
        }
    }

    @Override
    public void swim(short distance) {
        if (distance > 10) {
            System.out.printf("For our dog it's impossible to swim the distance over the 10m.\n\n");
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.println("The dog doesn't move in the water.\n");
        } else {
            System.out.printf("The dog has swam %d meters.\n\n", distance);
        }
    }
}
