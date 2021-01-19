package geekbrains.sixthVebinar;

public class Main {

    public static void main(String[] args) {
        Dog bobic = new Dog();
        Cat murzic = new Cat();

        bobic.run("Bobic", (short) 200);
        bobic.swim("Bobic", (short) 5);
        murzic.run("Murzic", (short) 100);
    }
}
