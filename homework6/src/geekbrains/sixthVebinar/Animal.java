package geekbrains.sixthVebinar;

public abstract class Animal {

    public abstract void run (short distance);             // Верно ли я понимаю, что через @Override мы не можем изменить
                                                           // количество передаваемых в метод параметров?
    public abstract void run(String name, short distance); // И получается, что для создания метода, в который я хочу дополнительно
                                                           // передавать имя животного, мне придется создать ещё 1 абстрактный метод (т.е. создавать перегрузку)?
    public abstract void swim (short distance);            // Или можно каким-то образом через @Override переписать входные переменные для каждого отдельного случая?

    public abstract void swim (String name, short distance);


}
