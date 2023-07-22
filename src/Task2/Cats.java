package Task2;

import OldHomework.Cat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cats implements Iterable<Cat> { // имплементируем интерфейс Iterable
    public List<Cat> catList; //Список котов

    public Cats() {
        catList = new ArrayList<>();
    } // В конструкторе инициализируем список

    public void addCat(Cat cat) { //метод добавления котов в список
        catList.add(cat);
    }

    @Override
    public Iterator<Cat> iterator() { // перегрузка метода получения итератора
        return new CatIterator(); // создаем и возвращаем итератор котиков
    }

    class CatIterator implements Iterator<Cat> { // класс итератора котиков
        private int index = 0; // индекс котика

        @Override
        public boolean hasNext() {
            return index < catList.size(); //проверка на то что не вышли за границы списка
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Потому что нельзя удалять котиков"); // пробрасываем исключения т.к. нет такого метода
        }

        @Override
        public Cat next() {
            return catList.get(index++); // возвращаем котика из списка и поднимаем индекс на +1
        }
    }
}