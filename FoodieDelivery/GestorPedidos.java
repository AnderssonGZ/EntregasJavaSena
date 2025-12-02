import java.util.ArrayList;

public class GestorPedidos {

    ArrayList<ItemMenu> articulos = new ArrayList<>();

    public void agregarItem(ItemMenu item) {
        articulos.add(item);
    }
}
