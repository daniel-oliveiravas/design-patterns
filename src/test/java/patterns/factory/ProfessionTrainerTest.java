package patterns.factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfessionTrainerTest {

  @Test
  public void teachMiningProfession() {
    String professionName = "Mining";
    int professionInitialLevel = 1;
    ProfessionTrainer miningTrainer = new MiningTrainer();

    Profession profession = miningTrainer.teachProfession();
    assertEquals(profession.getName(), professionName);
    assertEquals(profession.getLevel(), professionInitialLevel);
  }

  @Test
  public void teachTailoringProfession() {
    String professionName = "Tailoring";
    int professionInitialLevel = 5;
    ProfessionTrainer miningTrainer = new TailoringTrainer();

    Profession profession = miningTrainer.teachProfession();
    assertEquals(profession.getName(), professionName);
    assertEquals(profession.getLevel(), professionInitialLevel);
  }
}