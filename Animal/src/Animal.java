import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private String birthDate;
    private String commands;
    //private List<String> commands;

    public Animal(String name, String birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
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
}
