package patterns.factory;

import static patterns.factory.Professions.TAILORING;

public class TailoringTrainer implements ProfessionTrainer {

  @Override
  public Profession teachProfession() {
    return new Profession(TAILORING.getName(), TAILORING.getInitialLevel());
  }
}
