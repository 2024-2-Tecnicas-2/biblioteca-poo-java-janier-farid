import com.mycompany.biblioteca.java.Libro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LibroTest {

    @Test
    public void testMostrarInfo() {
        Libro libro = new Libro("El señor de los anillos", 2020, "KL Leonor", 500);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        libro.mostrarInfo();
        String expected = "El titulo es: El señor de los anillos Año publicacion: 2020 Autor: KL Leonor Número de páginas: 500\n";
        assertEquals(expected, outContent.toString());
    }
}
