package patterns.adapter;

class Song {

  private String title;
  private String artistName;
  private boolean isPlaying;

  Song(String title, String artistName) {
    this.title = title;
    this.artistName = artistName;
    this.isPlaying = false;
  }

  String getTitle() {
    return title;
  }

  String getArtistName() {
    return artistName;
  }

  boolean isPlaying() {
    return isPlaying;
  }

  void setPlaying(boolean playing) {
    isPlaying = playing;
  }
}
