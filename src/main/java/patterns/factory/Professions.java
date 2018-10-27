package patterns.factory;

public enum Professions {

  TAILORING("Tailoring", 5),
  MINING("Mining", 1);

  private String name;
  private int initialLevel;

  Professions(String name, int initialLevel) {
    this.name = name;
    this.initialLevel = initialLevel;
  }

  public String getName() {
    return name;
  }

  public int getInitialLevel() {
    return initialLevel;
  }
}
