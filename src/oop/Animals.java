package oop;

public interface Animals {

    void height(int a1); //сантиметры
    void height(double a1); // метры
    void height(float a1); // футы

    void weight(int a2); // граммы
    void weight (double a2); // кг

    void motion(int a3); // шагов
    void motion (long a3); // если очень далеко

    void eat(int a4);

}
