public class Batalla {
    public static void main(String[] args) {
        Heroe odin = new Heroe("Odin", 30, 100);
        Villano fenrir = new Villano("Fenrir", 25, 120);

        System.out.println("Comianza la batalla entre " + odin.getNombre() + " y " + fenrir.getNombre());

        odin.atacar(fenrir);
        fenrir.mostarEstado();

        fenrir.absorverEnergia(odin);
        fenrir.atacar(odin);
        odin.mostarEstado();

        odin.transformar();
        odin.atacar(fenrir);
        fenrir.mostarEstado();

        System.out.println("Resultado final");
        odin.mostarEstado();
        fenrir.mostarEstado();

        if ((odin.estaVivo()) && !fenrir.estaVivo()) {
            System.out.println(odin.getNombre() + " ha ganado la batalla");
        } else if (fenrir.estaVivo() && !odin.estaVivo()) {
            System.out.println(fenrir.getNombre() + " ha ganado la batalla");
        } else {
            System.out.println("Ambos siguen luchando");
        }

    }
}
