public class Test {
    public static void main(String[] args) {
        Thread hilo = new Thread(new PrintMe());
        Thread hilo2 = new Thread(new PrintMe());
        Thread hilo3 = new Thread(new PrintMe());

            hilo.start();
            hilo2.start();
            hilo3.start();

    }
}
