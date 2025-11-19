public class Heroe extends Personaje {

    public Heroe(String nombre, int poder, int vida) {
        super(nombre, poder, vida);
    }

    public void transformar() {
        System.out.println(getNombre() + " se ha transformado");
        setPoder(getPoder() + 100);
    }

    public void controlarMente(Personaje enemigo) {
        System.out.println(getNombre() + " controla la mente de " + enemigo.getNombre() + " y reduce su nivel de vida");
        enemigo.setPoder(enemigo.getPoder() - 5);
    }
}
