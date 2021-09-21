public class Cat extends Animal {
    public void talk(){
        System.out.println("MEOW!");
        for (int i = 0; i < 5; i++) {
            super.breathe();
        }
    }
}
