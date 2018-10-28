package patterns.adapter;

public class PenDrivePlayerAdapter implements CdPlayer {

  private PenDrivePlayer penDrivePlayer;

  PenDrivePlayerAdapter() {
    this.penDrivePlayer = new PenDrivePlayer();
  }

  @Override
  public void playSong(Song song) {
    penDrivePlayer.playSong(song);
  }
}
