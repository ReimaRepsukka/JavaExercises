public class HahmoMain {
    public static void main(String[] args) {
        Hahmo h = new Hahmo("Pete", 1.1, 21);
        System.out.println(h.getForm());

        Hahmo h2 = new Hahmo();
        h2.setName("Sirkku");
        h2.setLength(1.5);
        h2.setWeight(30);

        System.out.println(h2.getForm());
    }
}
