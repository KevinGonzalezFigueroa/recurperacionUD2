public class Fábrica {
    private String[] coches = null;
    private int contador = 0;
    boolean lleno = false;
    boolean vacio = true;

    public Fábrica(int cantidad) {
        this.coches = new String[cantidad];
    }

    public synchronized void mostrar(String coche) throws InterruptedException {
        while(lleno) {
            wait();
        }

        coches[contador] = coche;
        contador += 1;

        vacio = false;
        lleno = contador >= coches.length;
        notifyAll();
    }

    public synchronized String comprar() throws InterruptedException {
        while(vacio) {
            wait();
        }
        String comprar = coches[--contador];
        lleno = false;
        vacio = contador <=0;
        notifyAll();
        return comprar;
    }


}
