public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("ishika1.jpeg");
        Image image2 = new ProxyImage("ishika2.jpeg");

        image1.display();
        System.out.println("");

        image1.display();
        System.out.println("");

        image2.display();
    }
}
