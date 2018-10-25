package patterns.builder;

class Attribute {

  private String name;
  private String type;

  Attribute(String name, String type) {
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString() {
    return "  " + type + " " + name + ";";
  }
}
