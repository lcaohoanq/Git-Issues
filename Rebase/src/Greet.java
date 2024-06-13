public class Greet {
  private String name;
  private String msg;

  public Greet(String name) {
    this.name = name;
    this.msg = "Hello, " + name + "!";
  }

  public String getMsg() {
    return msg.toUpperCase();
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Greet [name=" + name + ", msg=" + msg + "]";
  }

}
