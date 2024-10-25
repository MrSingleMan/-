public class Horses extends PackAnimals{
    public Horses(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(getName() + " (Horse) performs: " + command);
    }
}
