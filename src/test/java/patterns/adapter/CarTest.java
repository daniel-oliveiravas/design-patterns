package patterns.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

  @Test
  public void playSongUsingAdapterSuccessfully() {
    Song song = new Song("Como Que Ocê Pôde Abandoná Eu?", "Pedra Letícia");
    Car car = new Car(new PenDrivePlayerAdapter());
    car.playSong(song);

    assertTrue(song.isPlaying());
  }
}