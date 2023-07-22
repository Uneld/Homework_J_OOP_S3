package Task3;

import java.util.Comparator;
import java.util.List;

public class UserSort{
    //реализуем статический метод сортировки по компаратору с обобщением
    public static<T> List<T> sortByComparator(List<T> list, Comparator<T> comparator){
        list.sort(comparator);
        return list;
    }
}
