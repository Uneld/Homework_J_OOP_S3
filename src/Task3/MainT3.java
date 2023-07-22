package Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainT3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", 5));
        animals.add(new Animal("Dog", 3));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Lion", 7));

        // Выводим список животных
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("-------------");
        
        List<Animal> sortAnimals = UserSort.sortByComparator(animals, (animal1, animal2) -> animal1.getAge() - animal2.getAge());

        // Выводим отсортированный список животных
        for (Animal animal : sortAnimals) {
            System.out.println(animal);
        }
    }
}
