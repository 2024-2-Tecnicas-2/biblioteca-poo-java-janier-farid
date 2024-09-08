import com.mycompany.biblioteca.java.Publicacion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PublicacionTest {

    @Test
    public void testMostrarInfo() {
        Publicacion publicacion = new Publicacion("Prueba", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        publicacion.mostrarInfo();
        String expected = "El titulo es: Prueba Año publicacion: 2022\n";
        assertEquals(expected, outContent.toString());
    }
}