package templatemethod;

public class Cafe extends Bebida {

    @Override
    protected String prepararIngredientes() {
        return "Agregando café molido";
    }

    @Override
    protected String agregarComplementos() {
        return "Agregando azúcar y leche";
    }
}
