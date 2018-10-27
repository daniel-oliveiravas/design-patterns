package patterns.prototype;

class URL {

  private String protocol;
  private String host;
  private String query;

  URL(String protocol, String host, String query) {
    this.protocol = protocol;
    this.host = host;
    this.query = query;
  }

  public String getProtocol() {
    return protocol;
  }

  public String getHost() {
    return host;
  }

  public String getQuery() {
    return query;
  }
}
