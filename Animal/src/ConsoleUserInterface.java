import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {
    private AnimalRegistry registry;
    private Scanner scanner;

    public ConsoleUserInterface(AnimalRegistry registry) {
        this.registry = registry;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("\n=== Реестр домашних животных ===");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Показать команды животного");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Показать животных по дате рождения");
            System.out.println("5. Выйти");
            System.out.print("Выберите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addNewAnimal();
                case 2 -> showAnimalCommands();
                case 3 -> trainAnimal();
                case 4 -> listAnimalsByBirthDate();
                case 5 -> {
                    running = false;
                    System.out.println("Выход из программы...");
                }
                default -> System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }

    @Override
    public void addNewAnimal() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения (гггг-мм-дд): ");
        String birthDate = scanner.nextLine();
        System.out.print("Введите команды, которые выполняет животное: ");
        String commands = scanner.nextLine();
        System.out.print("Выберите тип животного (1 - Собака, 2 - Кошка, 3 - Хомяк, 4 - Лошадь, 5 - Верблюд, 6 - Осел): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        Animal animal = switch (type) {
            case 1 -> new Dogs(name, birthDate, commands);
            case 2 -> new Cats(name, birthDate, commands);
            case 3 -> new Hamsters(name, birthDate, commands);
            case 4 -> new Horses(name, birthDate, commands);
            case 5 -> new Camels(name, birthDate, commands);
            case 6 -> new Donkeys(name, birthDate, commands);
            default -> {
                System.out.println("Неверный тип, животное не добавлено.");
                yield null;
            }
        };

        if (animal != null) {
            registry.addAnimal(animal);
        }
    }

    @Override
    public void showAnimalCommands() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        Animal animal = registry.findAnimalByName(name);

        if (animal != null) {
            registry.showCommands(animal);
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    @Override
    public void trainAnimal() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        Animal animal = registry.findAnimalByName(name);

        if (animal != null) {
            System.out.print("Введите новую команду для " + animal.getName() + ": ");
            String command = scanner.nextLine();
            registry.trainAnimal(animal, command);
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    @Override
    public void listAnimalsByBirthDate() {
        registry.listAnimalsByBirthDate();
    }
}
