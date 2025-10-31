public class Main {
    public static void main(String[] args) {
        ProgramFactory factoryA = new ConcreteFactoryP1();
        Program Program1 = Program1.factoryMethod();
        Program1.display();
