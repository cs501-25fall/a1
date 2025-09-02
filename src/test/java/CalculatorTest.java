import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {
  private final PrintStream ORIG_OUT = System.out;
  private final InputStream ORIG_IN = System.in;
  private ByteArrayOutputStream out;

  @BeforeEach void setUp(){ out=new ByteArrayOutputStream(); System.setOut(new PrintStream(out)); }
  @AfterEach  void tearDown(){ System.setOut(ORIG_OUT); System.setIn(ORIG_IN); }

  @Test void worksForRandomInputs() {
    Random r = new Random(42);
    int a = r.nextInt(41) - 20;
    int b; do { b = r.nextInt(41) - 20; } while (b == 0);

    String input = a + System.lineSeparator() + b + System.lineSeparator();
    System.setIn(new ByteArrayInputStream(input.getBytes()));
    Calculator.main(new String[0]);

      String s = out.toString();
      assertTrue(s.matches("(?s).*\\+.*=\\s*"+(a+b)+".*"), "Addition missing/incorrect");
      assertTrue(s.matches("(?s).*\\-.*=\\s*"+(a-b)+".*"), "Subtraction missing/incorrect");
      assertTrue(s.matches("(?s).*\\*.*=\\s*"+(a*b)+".*"), "Multiplication missing/incorrect");
      assertTrue(s.matches("(?s).*/.*=\\s*"+(a/b)+".*"),   "Division missing/incorrect");
  }
}
