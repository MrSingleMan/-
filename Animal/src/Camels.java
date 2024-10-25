public class Camels extends PackAnimals{
    public Camels(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(getName() + " (Camel) performs: " + command);
    }
}
