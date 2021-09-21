public class Horse extends Animal{
    public void talk(){
        System.out.println("IIIIIHAHAHAHAA!");
        for (int i = 0; i < 5; i++) {
            super.breathe();
        }
    }
}
