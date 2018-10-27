package patterns.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

public class TabTest {

  @Test
  public void cloneTabSuccessfullyWithDeepCopy() {
    String tabTitle = "Prototype pattern - Google";
    String urlProtocol = "http";
    String urlHost = "google.com";
    String urlQuery = "/search?q=Prototype+pattern";


    URL url = new URL(urlProtocol, urlHost, urlQuery);
    Tab tab = new Tab(tabTitle, 0 , url);
    Tab otherTab = tab.clone();

    //Assert that the objects where indeed copied and are not the same
    assertNotEquals(tab, otherTab);
    assertNotEquals(tab.getUrl(), otherTab.getUrl());

    assertEquals(tab.getTitle(), otherTab.getTitle());
    assertEquals(tab.getTabPosition(), otherTab.getTabPosition());
    assertEquals(tab.getUrl().getProtocol(), otherTab.getUrl().getProtocol());
    assertEquals(tab.getUrl().getHost(), otherTab.getUrl().getHost());
    assertEquals(tab.getUrl().getQuery(), otherTab.getUrl().getQuery());
  }
}