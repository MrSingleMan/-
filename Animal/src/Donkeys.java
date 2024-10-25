public class Donkeys extends PackAnimals{
    public Donkeys(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(getName() + " (Donkey) performs: " + command);
    }
}
