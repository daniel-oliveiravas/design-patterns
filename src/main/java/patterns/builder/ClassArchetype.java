package patterns.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassArchetype {

  private String name;
  private List<Attribute> attributes;

  ClassArchetype(String name) {
    this.name = name;
    this.attributes = new ArrayList<>();
  }

  void addAttribute(Attribute attribute) {
    attributes.add(attribute);
  }

  @Override
  public String toString() {
    return "class " + name + " {\n" +
        buildAttributes() +
        "\n}";
  }

  private String buildAttributes() {
    return this.attributes.stream()
        .map(Attribute::toString)
        .collect(Collectors.joining("\n"));
  }
}
