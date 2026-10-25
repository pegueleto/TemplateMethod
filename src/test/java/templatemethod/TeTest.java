package templatemethod;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TeTest {

    private Te te;

    @Before
    public void setUp() {
        te = new Te();
    }

    @Test
    public void testPrepararIngredientes() {
        assertEquals( "Agregando bolsita de té", te.prepararIngredientes() );
    }

    @Test
    public void testAgregarComplementos() {
        assertEquals( "Agregando limón", te.agregarComplementos() );
    }

    @Test
    public void testPrepararBebidaRespetaElOrden() {
        String esperado = "Hirviendo agua\n"
                + "Agregando bolsita de té\n"
                + "Sirviendo en la taza\n"
                + "Agregando limón";

        assertEquals( esperado, te.prepararBebida() );
    }
}
