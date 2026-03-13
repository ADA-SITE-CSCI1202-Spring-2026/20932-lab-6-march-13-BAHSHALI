package Animal;
public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog("Freddy", "Ali", 1986, "Bear");
        Dog d2 = new Dog("Freddy", "Ali", 1986, "Bear");


        System.out.println(d1);
        System.out.println(d1.equals(d2));
    }
}