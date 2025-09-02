import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.*;

public class HelloVariationsTest {
  private final PrintStream ORIG = System.out;
  private ByteArrayOutputStream out;

  @BeforeEach void setUp(){ out=new ByteArrayOutputStream(); System.setOut(new PrintStream(out)); }
  @AfterEach  void tearDown(){ System.setOut(ORIG); }

  @Test void printsTwoNonEmptyLines() {
    HelloVariations.main(new String[0]);
    String[] lines = out.toString().split("\\R");
    assertEquals(2, lines.length, "Must print exactly 2 lines");
    for (String line : lines) assertFalse(line.trim().isEmpty(), "Each line must have text");
  }
}
