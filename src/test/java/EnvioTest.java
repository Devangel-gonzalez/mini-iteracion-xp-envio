import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvioTest {

    @Test
    void pedidoMenorA500() {
        assertEquals(100, Envio.calcularCostoEnvio(400));
    }

    @Test
    void pedidoEntre500Y999() {
        assertEquals(50, Envio.calcularCostoEnvio(700));
    }

    @Test
    void pedido1000OMas() {
        assertEquals(0, Envio.calcularCostoEnvio(1200));
    }

    // Casos frontera
    @Test
    void frontera499_99() {
        assertEquals(100, Envio.calcularCostoEnvio(499.99));
    }

    @Test
    void frontera500() {
        assertEquals(50, Envio.calcularCostoEnvio(500.00));
    }

    @Test
    void frontera999_99() {
        assertEquals(50, Envio.calcularCostoEnvio(999.99));
    }

    @Test
    void frontera1000() {
        assertEquals(0, Envio.calcularCostoEnvio(1000.00));
    }
}