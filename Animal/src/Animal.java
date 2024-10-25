public class Animal {
    private String name;
    private String birthDate;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void performCommand(String command) {
        System.out.println(name + " Commands: " + command);
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
