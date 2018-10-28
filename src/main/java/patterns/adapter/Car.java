package patterns.adapter;

public class Car implements CdPlayer {

  private CdPlayer cdPlayer;

  Car(CdPlayer cdPlayer) {
    this.cdPlayer = cdPlayer;
  }

  @Override
  public void playSong(Song song) {
    cdPlayer.playSong(song);
  }
}
