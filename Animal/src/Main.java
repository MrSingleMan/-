import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        Scanner scanner = new Scanner(System.in);

        // Пример добавления животных
        Dogs dog = new Dogs("Buddy", "2020-01-01");
        Cats cat = new Cats("Whiskers", "2019-05-12");
        registry.addAnimal(dog);
        registry.addAnimal(cat);

        // Добавляем команды
        registry.trainAnimal(dog, "Сидеть");
        registry.trainAnimal(cat, "Лежать");

        // Выводим команды
        registry.showCommands(dog);
        registry.showCommands(cat);

        // Сортируем и выводим животных по дате рождения
        registry.listAnimalsByBirthDate();
    }
}
