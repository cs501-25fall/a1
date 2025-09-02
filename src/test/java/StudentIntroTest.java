import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import org.junit.jupiter.api.*;

public class StudentIntroTest {
  private final PrintStream ORIG_OUT = System.out;
  private final InputStream ORIG_IN = System.in;
  private ByteArrayOutputStream out;

  @BeforeEach void setUp(){ out=new ByteArrayOutputStream(); System.setOut(new PrintStream(out)); }
  @AfterEach  void tearDown(){ System.setOut(ORIG_OUT); System.setIn(ORIG_IN); }

  @Test void requiresPromptsAndOutput() {
    String name="Alice", age="20", lang="Java";
    String input = String.join(System.lineSeparator(), name, age, lang) + System.lineSeparator();
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    StudentIntro.main(new String[0]);
    String s = out.toString();

    // Prompts (must appear)
    assertTrue(s.contains("Enter your name:"), "Missing name prompt");
    assertTrue(s.contains("Enter your age:"), "Missing age prompt");
    assertTrue(s.contains("Enter your favorite programming language:"), "Missing language prompt");

    // Final output must reflect inputs
    assertTrue(s.contains("Hello, my name is " + name + "."));
    assertTrue(s.contains("I am " + age + " years old."));
    assertTrue(s.contains("My favorite programming language is " + lang + "."));
  }
}
