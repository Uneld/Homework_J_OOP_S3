package Task1;

import OldHomework.Cat;

public class MainT1 {
    public static void main(String[] args) {
        //Создаем несколько экземпляров класса Cat
        Cat cat1 = new Cat("Маркиз", 4);
        Cat cat2 = new Cat("Персик", 8, "Дмитрий");

        //Пишем реализацию метода функционального интерфейса
        PeriodCatLife<Integer> periodCatLife = (ageCat) -> {
            if (ageCat <= 2) {
                return "Юность";
            } else if (ageCat <= 6) {
                return "Молодость";
            } else if (ageCat <= 10) {
                return "Зрелость";
            } else if (ageCat <= 14) {
                return "Пожилой возраст";
            }
            return "Преклонный возраст";
        };

        //Применяем реализацию интерфейса ко всем экземплярам
        System.out.printf("Период жизни %s: %s \n", cat1.getName(), periodCatLife.getPeriodCatLife(cat1.getAge()));
        System.out.printf("Период жизни %s: %s \n", cat2.getName(), periodCatLife.getPeriodCatLife(cat2.getAge()));
    }
}
