public class Cats extends Pets{
    public Cats(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(getName() + " (Cat) performs: " + command);
    }
}
