public class Villano extends Personaje {

    public Villano(String nombre, int poder, int vida) {
        super(nombre, poder, vida);

    }

    public void absorverEnergia(Personaje enemigo) {
        System.out.println(getNombre() + " absorbe energía de " + enemigo.getNombre());
        setVida(getVida() + 10);
        setPoder(getPoder() + 5);
    }
}
