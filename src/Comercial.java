import static java.lang.Thread.sleep;

public class Comercial extends Thread{
    private Fábrica fabrica;
    private int productosAComprar;
    private int tiempoMaximoDeEspera;

    public Comercial(Fábrica fabrica, int productosAComprar, int tiempoMaximoDeEspera) {
        this.fabrica = fabrica;
        this.productosAComprar = productosAComprar;
        this.tiempoMaximoDeEspera = tiempoMaximoDeEspera;
    }

    public void run() {

        String cocheAComprar;
        try {
            for (int i = 0; i < productosAComprar; i++) {
                cocheAComprar = fabrica.comprar();
                System.out.println("Han comprado " + cocheAComprar);
                sleep((int) (Math.random() * tiempoMaximoDeEspera));


            }} catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
