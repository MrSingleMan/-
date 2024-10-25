public class Hamsters extends Pets{
    public Hamsters(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(getName() + " (Hamster) performs: " + command);
    }
}
