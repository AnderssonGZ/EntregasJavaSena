import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        GestorPedidos menu = new GestorPedidos();

        ItemMenu comida = new PlatoComida("001", "Pizza", 15000, true);
        ItemMenu comida2 = new PlatoComida("002", "hamburguesa", 20000, false);
        ItemMenu bebida = new Bebida("003", "Limonada", 7000, 500);
        ItemMenu bebida2 = new Bebida("004", "Gaseosa", 8000, 450);

        menu.agregarItem(comida);
        menu.agregarItem(comida2);
        menu.agregarItem(bebida);
        menu.agregarItem(bebida2);
        mostrarItems(menu.articulos);
        calcularPrecioTotal(menu.articulos);

    }

    public static void mostrarItems(ArrayList<ItemMenu> articulos) {
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println(articulos.get(i).obtenerDetalles());
        }
    }

    public static void calcularPrecioTotal(ArrayList<ItemMenu> articulos) {

        double totalPrecios = 0;
        for (int i = 0; i < articulos.size(); i++) {
            totalPrecios += articulos.get(i).getPrecio();
        }
        System.out.println("El precio total es de:" + totalPrecios);
    }
}
