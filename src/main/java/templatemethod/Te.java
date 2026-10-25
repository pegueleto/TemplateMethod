package templatemethod;

public class Te extends Bebida {

    @Override
    protected String prepararIngredientes() {
        return "Agregando bolsita de té";
    }

    @Override
    protected String agregarComplementos() {
        return "Agregando limón";
    }
}
