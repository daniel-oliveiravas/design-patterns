package patterns.prototype;

import com.google.gson.Gson;

public class Tab {

  private static Gson gson = new Gson();

  private String title;
  private int tabPosition;
  private URL url;

  public Tab(String title, int tabPosition, URL url) {
    this.title = title;
    this.tabPosition = tabPosition;
    this.url = url;
  }

  @Override
  public Tab clone() {
    return gson.fromJson(gson.toJson(this), Tab.class);
  }

  public static Gson getGson() {
    return gson;
  }

  public String getTitle() {
    return title;
  }

  public int getTabPosition() {
    return tabPosition;
  }

  public URL getUrl() {
    return url;
  }

  public void setUrl(URL url) {
    this.url = url;
  }
}
