public class Second {
  private String drinkName;
  public void setName(String name) {
    drinkName=name;
  }
  public String getName() {
    return drinkName;
  }
  public void saying() {
    System.out.printf("%s is delicious!", getName());
  }
}