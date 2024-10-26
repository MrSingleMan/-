public class Main {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        UserInterface UserInterface = new ConsoleUserInterface(registry);
        UserInterface.start();
    }

}