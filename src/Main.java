public class Main {
    public static void main(String[] args) {

        //klasa dog
        System.out.println("Klasa Dog:");

        Dog dog = new Dog("Tofik", "Jamnik");
        System.out.println(dog.toString());

        System.out.println();

        dog.setImie("Puszek");
        System.out.println(dog.toString());

    }
}