package geekbrains.sixthVebinar;

public class Cat extends Animal {

        /*Тут в месте для полей(?) я не задавал приватные переменные.
        В каждом методе они подаются только на вход и не переприсваиваются.
        Как будет более правильно и в чем разница? И есть ли она вообще?*/

    @Override
    public void run(String name, float distance) {
        if (distance > 200) {
            System.out.printf("It's impossible for %s to run the distance over 200m.\n\n", name);
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("%s is standing still\n\n", name);
        } else {
            System.out.printf("Cat named as %s has ran %f meters.\n\n", name, distance);
        }
    }

    @Override
    public void run(float distance) {
        if (distance > 200) {
            System.out.printf("For our cat it's impossible to run the distance over 200m.\n\n");
        } else if (distance < 0) {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        } else if (distance == 0) {
            System.out.printf("The cat is standing still\n\n");
        } else {
        System.out.printf("The cat has ran %f meters.\n", distance); }
    }

    @Override
    public void swim(String name, float distance) {
        if (distance>=0)
        System.out.printf("Cat named %s don't know how to swim. Even if it's a question of %f meters.\n\n", name, distance);
        else {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        }
    }

    @Override
    public void swim(float distance) {
        if (distance>=0)
            System.out.printf("Our cat %s don't know how to swim. Even if it's a question of %f meters.\n\n", distance);
        else {
            System.out.println("It's impossible to pass a negative amount of distance.\nAt least that's what modern science says.\n");
        }
    }
}
