package geekbrains.sixthVebinar;

import java.text.DecimalFormat;

public class Dog extends Animal {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    private String name;      // Нужно ли присваивать подклассам свои приватные переменные, как это сделал тут (подкласс 'Dog')
    private float distance;   // или правильным вариантом будет то, как я сделал в подклассе 'Cat'?

    @Override
    public void run(String name, float distance) {
        this.name = name;
        this.distance = distance;
        if (distance > 500) {
            System.out.printf("It's impossible for %s to run the distance over 500m.\n\n", name);
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("%s is standing still\n\n", name);
        } else {
            System.out.printf("Dog named as %s has ran %f meters.\n\n", name, distance);
        }
    }

    @Override
    public void run(float distance) {
        this.distance = distance;
        if (distance > 500) {
            System.out.printf("For our dog it's impossible to run the distance over 500m.\n\n");
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("The dog is standing still\n\n");
        } else {
            System.out.printf("The dog has ran %f meters.\n\n", distance);
        }
    }

    @Override
    public void swim(String name, float distance) {
        this.name = name;
        this.distance = distance;
        if (distance > 10) {
            System.out.printf("It's impossible for %s to swim the distance over 10m.\n\n", name);
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("%s doesn't move in the water.\n\n", name);
        } else {
            System.out.printf("Dog named %s has swam %f meters.\n\n", name, distance);
        }
    }

    @Override
    public void swim(float distance) {
        this.distance = distance;
        if (distance > 10) {
            System.out.printf("For our dog it's impossible to swim the distance over 10m.\n\n");
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.println("The dog doesn't move in the water.\n");
        } else {
            System.out.printf("The dog has swam %f meters.\n\n", distance);
        }
    }
}
