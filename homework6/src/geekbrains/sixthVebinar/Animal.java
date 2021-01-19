package geekbrains.sixthVebinar;

import java.text.DecimalFormat;

public abstract class Animal {

    public abstract void run (float distance);

    public abstract void run(String name, float distance);

    public abstract void swim (float distance);

    public abstract void swim (String name, float distance);

}
/*Как привести ВСЕ значение в классе к одному стандарту? Напрмер к 0.000
Я нашел несколько способов в (Decimal Format, Math.round), но везде
описывается, как округлить только одно конкретное значение.
Можно как-то округлить все сразу? Или хотя бы просто обрезать нули.
И почему float значения меняются при исполнении программы?
Например я задал 100.7, а вывелось 100.6999997.*/


/*
Прорезюмирую все вопросы последовательно, чтобы было удобнее ответить:
1. Как в одном классе округлить все значения?
2. Почему значения float сбиваются при компиляции программы?
3. Какой из вариантов написания подкласса (Dog или Cat) более правильный (с прописыванием приватных полей или без)? Они оба справляются с поставленной задачей.
*/