package patterns.builder;

class ClassArchetypeBuilder {

  private ClassArchetype classArchetype;

  ClassArchetypeBuilder(String className) {
    classArchetype = new ClassArchetype(className);
  }

  ClassArchetypeBuilder addAttribute(String name, String type) {
    classArchetype.addAttribute(new Attribute(name, type));
    return this;
  }

  ClassArchetype build() {
    return classArchetype;
  }
}
