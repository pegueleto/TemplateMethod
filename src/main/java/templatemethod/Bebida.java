package templatemethod;

public abstract class Bebida {

    // Método plantilla: define el orden fijo del algoritmo y no puede redefinirse
    public final String prepararBebida() {
        return String.join( "\n",
                hervirAgua(),
                prepararIngredientes(),
                servirEnTaza(),
                agregarComplementos() );
    }

    // Pasos comunes: los implementa la clase base
    private String hervirAgua() {
        return "Hirviendo agua";
    }

    private String servirEnTaza() {
        return "Sirviendo en la taza";
    }

    // Pasos variables: los implementan las subclases
    protected abstract String prepararIngredientes();

    protected abstract String agregarComplementos();
}
