package templatemethod;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CafeTest {

    private Cafe cafe;

    @Before
    public void setUp() {
        cafe = new Cafe();
    }

    @Test
    public void testPrepararIngredientes() {
        assertEquals( "Agregando café molido", cafe.prepararIngredientes() );
    }

    @Test
    public void testAgregarComplementos() {
        assertEquals( "Agregando azúcar y leche", cafe.agregarComplementos() );
    }

    // Cubre también los pasos privados hervirAgua() y servirEnTaza()
    @Test
    public void testPrepararBebidaRespetaElOrden() {
        String esperado = "Hirviendo agua\n"
                + "Agregando café molido\n"
                + "Sirviendo en la taza\n"
                + "Agregando azúcar y leche";

        assertEquals( esperado, cafe.prepararBebida() );
    }
}
