import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();

    // Метод для добавления нового животного
    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен в реестр.");
    }

    // Метод для вывода команд животного
    public void showCommands(Animal animal) {
        System.out.println("Команды, которые может выполнять " + animal.getName() + ": " + animal.getCommands());
    }

    // Метод для обучения нового животного команде
    public void trainAnimal(Animal animal, String command) {
        animal.addCommand(command);
        System.out.println(animal.getName() + " обучен новой команде: " + command);
    }

    // Метод для вывода животных по дате рождения
    public void listAnimalsByBirthDate() {
        animals.sort(Comparator.comparing(Animal::getBirthDate));
        System.out.println("Животные, отсортированные по дате рождения:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " (дата рождения: " + animal.getBirthDate() + ")");
        }
    }
}
