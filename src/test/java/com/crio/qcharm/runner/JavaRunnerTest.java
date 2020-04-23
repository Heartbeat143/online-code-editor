package com.crio.qcharm.runner;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class JavaRunnerTest {

  @Test
  public void extractClassName() {
    List<String> lines = Arrays.asList("public class Hello {", "}");
    JavaRunner runner = new JavaRunner();
    assertEquals("Hello.java", runner.extractFileName(lines));
  }

  @Test
  public void extractClassNameWithSpaces() {
    List<String> lines = Arrays.asList("  public class Hello \n{ ", "}");
    JavaRunner runner = new JavaRunner();
    assertEquals("Hello.java", runner.extractFileName(lines));
  }

  @Test
  public void extractClassNameWithSpacesAndPackageAndDifferentClassName() {
    List<String> lines = Arrays.asList("package com.crio.packagename", "  public class Anand \n{ ", "}");
    JavaRunner runner = new JavaRunner();
    assertEquals("Anand.java", runner.extractFileName(lines));
  }

}
