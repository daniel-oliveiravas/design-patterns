package patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class ClassArchetypeBuilderTest {

  @Test
  public void buildClassWithSingleAttributeSuccessfully() {
    ClassArchetype classArchetype = new ClassArchetypeBuilder("Hero")
        .addAttribute("name", "String")
        .build();
    Assert.assertEquals(classArchetype.toString(), "class Hero {\n  String name;\n}");
  }

  @Test
  public void buildClassWithTwoAttributesSuccessfully() {
    ClassArchetype classArchetype =
        new ClassArchetypeBuilder("Hero")
            .addAttribute("name", "String")
            .addAttribute("magicPower", "Magic")
            .build();
    Assert.assertEquals(classArchetype.toString(),
        "class Hero {\n  String name;\n  Magic magicPower;\n}");
  }
}