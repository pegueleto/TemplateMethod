package templatemethod;

import org.junit.Test;
import static org.junit.Assert.*;

// Verifica el comportamiento común del método plantilla a través de la clase base
public class BebidaTest {

    @Test
    public void testPasosComunesPrimeroYTercero() {
        Bebida cafe = new Cafe();
        Bebida te = new Te();

        String[] pasosCafe = cafe.prepararBebida().split( "\n" );
        String[] pasosTe = te.prepararBebida().split( "\n" );

        assertEquals( pasosCafe[0], pasosTe[0] ); // hervirAgua()
        assertEquals( pasosCafe[2], pasosTe[2] ); // servirEnTaza()
    }

    @Test
    public void testPasosVariablesSonDistintos() {
        Bebida cafe = new Cafe();
        Bebida te = new Te();

        String[] pasosCafe = cafe.prepararBebida().split( "\n" );
        String[] pasosTe = te.prepararBebida().split( "\n" );

        assertNotEquals( pasosCafe[1], pasosTe[1] ); // prepararIngredientes()
        assertNotEquals( pasosCafe[3], pasosTe[3] ); // agregarComplementos()
    }

    @Test
    public void testPrepararBebidaTieneCuatroPasos() {
        assertEquals( 4, new Cafe().prepararBebida().split( "\n" ).length );
    }
}
