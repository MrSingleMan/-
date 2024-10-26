import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class AnimalRegistry {
    private List<Animal> animals = new ArrayList<>();

    public AnimalRegistry() {
        initializeSampleData();
    }

    // Метод для добавления предустановленных животных
    private void initializeSampleData() {
        animals.add(new Dogs("Приятель", "2020-05-14", "Сидеть, Стоять, Голос"));
        animals.add(new Dogs("Рекс", "2019-07-22", "Сидеть, Стоять, Кувырок"));
        animals.add(new Dogs("Белла", "2021-02-10", "Ко мне, Стоять"));
        animals.add(new Cats("Мурка", "2018-03-25", "Ко мне, Лежать"));
        animals.add(new Cats("Вискас", "2020-11-01", "Прыжок, Усни"));
        animals.add(new Hamsters("Хамми", "2021-06-15", "Бегать в шаре"));
        animals.add(new Hamsters("Нибл", "2022-01-04", "Лазить"));
        animals.add(new Horses("Дух", "2017-09-12", "Галлоп, Трусцой"));
        animals.add(new Horses("Гром", "2016-05-09", "Галлоп, Прыжок"));
        animals.add(new Camels("Горб", "2024-10-15", "Иди, Сидеть"));
        animals.add(new Donkeys("Эйвор", "2018-08-13", "Возить груз, Стоять"));
    }
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
    // Поиск животного по имени
    public Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }
}
