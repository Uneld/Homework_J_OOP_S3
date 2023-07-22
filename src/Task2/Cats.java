package Task2;

import OldHomework.Cat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cats implements Iterable<Cat> {
    public List<Cat> catList;

    public Cats() {
        catList = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        catList.add(cat);
    }


    @Override
    public Iterator<Cat> iterator() {
        return new CatIterator();
    }

    class CatIterator implements Iterator<Cat>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < catList.size();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Потому что нельзя удалять котиков");
        }

        @Override
        public Cat next() {
            return catList.get(index++);
        }
    }
}