public class AnimalMain {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.talk();
        Horse h = new Horse();
        h.talk();

        Animal a = new Cat();
        a.breathe();
        //Cannot call talk-method as because of Animal abstraction
    }
}
