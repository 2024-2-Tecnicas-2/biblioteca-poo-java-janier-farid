import com.mycompany.biblioteca.java.Revista;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RevistaTest {

    @Test
    public void testMostrarInfo() {
        Revista revista = new Revista("Alquimista", 2021, 65, "Forbes");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        revista.mostrarInfo();
        String expected = "El titulo es: Alquimista Año publicacion: 2021 Numero revista: 65 Nombre revista: Forbes\n";
        assertEquals(expected, outContent.toString());
    }
}
