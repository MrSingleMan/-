public class Dogs extends Pets{
    public Dogs(String name, String birthDate) {
        super(name, birthDate);
    }

    @Override
    public void performCommand(String command) {
        System.out.println(getName() + " (Dog) performs: " + command);
    }
}
