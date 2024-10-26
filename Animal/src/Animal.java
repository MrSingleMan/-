public class Animal {
    private String name;
    private String birthDate;
    private String commands;
    private static int animalCount = 0;

    public Animal(String name, String birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        animalCount++;
    }

    public String getCommands() {
        return commands;
    }

    public void addCommand(String newCommand) {
        if (commands == null || commands.isEmpty()) {
            commands = newCommand;
        } else {
            commands += ", " + newCommand;
        }
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
