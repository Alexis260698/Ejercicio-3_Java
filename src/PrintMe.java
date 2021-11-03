public class PrintMe implements Runnable{

    @Override
    public void run(){

        for (int i=1; i<10; i++) {
            System.out.println("Numero " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Algo Salio Mal dude");
            }
        }


    }
}
