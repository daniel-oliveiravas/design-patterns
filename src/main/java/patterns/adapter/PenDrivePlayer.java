package patterns.adapter;

class PenDrivePlayer {

  void playSong(Song song) {
    song.setPlaying(true);
    System.out.println(String.format("Playing song '%s' by '%s'.", song.getTitle(),
        song.getArtistName()));
  }
}
