public class Personaje {

    private String nombre;
    private int poder;
    private int vida;

    public Personaje(String nombre, int poder, int vida) {
        this.nombre = nombre;
        this.poder = poder;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " causando " + poder + " puntos de daño");
        enemigo.vida -= poder;
        if (enemigo.vida < 0)
            enemigo.vida = 0;
    }

    public void mostarEstado() {
        System.out.println(nombre + " tiene " + vida + " puntos de vida");
    }

    public boolean estaVivo() {
        boolean estado = true;
        if (vida <= 0) {
            return false;
        }
        return estado;
    }
}
