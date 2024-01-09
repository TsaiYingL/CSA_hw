class Notebook {
  private int totalPage;
  private static boolean inBag;

  public Notebook(int p, boolean b) {
    totalPage = p;
    inBag = b;
  }

  public int getTotalPage() {
    return totalPage;
  }

  public static boolean getInBag() {
    return inBag;
  }

  public int rip(int num) {
    totalPage -= num;
    return totalPage;
  }

  public void drawOnPage(int page) {
    if (page <= totalPage) {
      System.out.println("U drew a cat on page " + page);
    } else {
      System.out.println("No such page. Max page is " + page);
    }
  }

  public static boolean switchClass() {
    System.out.println("Bell rang. U put ur books in the bag.");
    inBag = true;
    return inBag;
  }

  public static boolean takeNotbookOut() {
    System.out.println("Class time. U ttake ur Notebooks out");
    inBag = false;
    return inBag;
  }

}
