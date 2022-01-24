public class Main {
    public static void main(String[] args) {
        Fábrica fabrica = new Fábrica(10);
        Productor prod1 = new Productor(fabrica, 15, (int)(Math.random()*(3000-1)+1));
        Productor prod2 = new Productor(fabrica, 15, (int)(Math.random()*(2500-1)+1));
        Comercial comer1 = new Comercial(fabrica, 10, (int)(Math.random()*(3000-1)+1));
        Comercial comer2 = new Comercial(fabrica, 10, (int)(Math.random()*(2500-1)+1));
        Comercial comer3 = new Comercial(fabrica, 10, (int)(Math.random()*(3500-1)+1));

        prod1.start();
        prod2.start();
        comer1.start();
        comer2.start();
        comer3.start();
    }
}
