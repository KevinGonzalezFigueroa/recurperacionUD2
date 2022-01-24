class Productor extends Thread {
    private Fábrica fabrica;
    private int contadorCoches;
    private int tiempoMaximoDeEspera;
    private final String[] coches = {"Seat León",
                                     "Audi accidentado",
                                     "Nissan Qashqai",
                                     "Citröen Berlingo",
                                     "Volkswagen Polo",
                                     "Opel Meriva",
                                     "Fiat Punto",
                                     "Tesla Roadster",
                                     "Hyundai Ioniq"
    };

    public Productor(Fábrica fabrica, int contadorCoches, int tiempoMaximoDeEspera) {
        this.fabrica = fabrica;
        this.contadorCoches = contadorCoches;
        this.tiempoMaximoDeEspera = tiempoMaximoDeEspera;
    }

    public void run() {
        String cocheAMostrar;

        try {
            for (int i = 0; i < contadorCoches; i++) {
                cocheAMostrar = CocheAleatorio();
                fabrica.mostrar(cocheAMostrar);
                System.out.println("Construido " + cocheAMostrar);
                sleep((int) (Math.random() * tiempoMaximoDeEspera));
            }} catch (InterruptedException e) {
                e.printStackTrace();
        }
    }

    public String CocheAleatorio() {
        return (String) coches[(int) (Math.random() * coches.length)];
    }
}