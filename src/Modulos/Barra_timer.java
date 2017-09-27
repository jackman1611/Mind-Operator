package Modulos;

public class Barra_timer {
            

    public static void main(String[] args) throws InterruptedException {
        int sec;
        for (sec = 0; sec < 16; sec++) {
            System.out.println(sec);
            Thread.sleep(1000);
             if (sec==15) {
            System.out.println("Termino en 15");
           
         }
         }
         
    }
}
