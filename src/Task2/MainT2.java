package Task2;

import OldHomework.Cat;

import java.util.Iterator;

public class MainT2 {
    public static void main(String[] args) {
        //Создаем несколько экземпляров класса Cat
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Маркиз", 4);
        Cat cat3 = new Cat("Персик", 8, "Дмитрий");

        //Создаем список котов и добавляем котиков выше
        Cats cats = new Cats();
        cats.addCat(cat1);
        cats.addCat(cat2);
        cats.addCat(cat3);

        //Вывод списка с помощью for-each
        for(Cat curentCat : cats){
            System.out.println("Имя: " + curentCat.getName());
        }

        System.out.println("------------");
        //Получаем итератор котиков
        Iterator<Cat> catIterator = cats.iterator();
        //Пробегаем по итератору
        while (catIterator.hasNext()){
            Cat curentCat = catIterator.next();
            String catName = curentCat.getName();
            System.out.println("Имя: " + catName);

            //Проверка проброса исключения
            if (catName.equals("Персик")) {
                catIterator.remove();
            }
        }
    }
}
