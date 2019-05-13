package oop;

public class Dog implements Animals {

    @Override
    public void height (int a1) {
        System.out.println("растем на "+ a1 +" см" );

    }

    @Override
    public void height(double a1) {
        System.out.println("растем на "+ a1 +" м" );
        return;

    }

    @Override
    public void height(float a1) {
        System.out.println("растем на "+ a1 +" футах" );

    }


    @Override
    public void weight(int a2) {
        System.out.println("набираем вес " + a2+ " грамм");

    }

    @Override
    public void weight(double a2) {
        System.out.println("набираем вес " + a2+ " килограмм(a)");

    }

    @Override
    public void motion(int a3) {
        System.out.println("куда то идем на "+a3+ " шага(ов)");

    }

    @Override
    public void motion(long a3) {
        System.out.println("куда то идем на "+a3+ " метров");

    }

    @Override
    public void eat(int a4) {
        System.out.println("хаваем "+ a4 + " кг");

    }
}
