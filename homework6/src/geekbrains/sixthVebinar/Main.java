package geekbrains.sixthVebinar;

public class Main {

    public static void main(String[] args) {
        Dog bobic = new Dog();
        Cat murzic = new Cat();

        bobic.run("Bobic1",  200.6f);
        bobic.swim("Bobic1",  11f);
        bobic.run("Bobic2",  500.6f);
        bobic.swim("Bobic2",  5f);
        bobic.swim("Bobic3",  -5f);
        bobic.run("Bobic3",  -500.6f);
        bobic.swim("Bobic4",  0);
        bobic.run("Bobic4",  0);
        murzic.run("Murzic1", 100.7f);
        murzic.swim("Murzic1", 100.7f);
        murzic.run("Murzic2", 230f);
        murzic.swim("Murzic2", -5);
        murzic.run("Murzic3", 0);
        murzic.run("Murzic3", 100.7f);
        murzic.run("Murzic4", -100.7f);
        //вроде все возможные варианты перебрал
    }
}
