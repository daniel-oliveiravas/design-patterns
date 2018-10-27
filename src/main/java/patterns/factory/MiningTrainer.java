package patterns.factory;

import static patterns.factory.Professions.MINING;

public class MiningTrainer implements ProfessionTrainer {

  @Override
  public Profession teachProfession() {
    return new Profession(MINING.getName(), MINING.getInitialLevel());
  }
}
