public class Main {
    public static void main(String[] args)
    {
        System.out.println("checkWord test:");
        System.out.println("Hello World, World: " + Algorithm2.checkWord("Hello World", "World"));
        System.out.println("cat food, cat: " + Algorithm2.checkWord("cat food", "cat"));
        System.out.println("test, fail: " + Algorithm2.checkWord("test", "fail"));
     
        System.out.println("reverseWord test:");
        System.out.println("gohangasalami: " + Algorithm2.reverseWord("gohangasalami"));
        System.out.println("racecar: " + Algorithm2.reverseWord("racecar"));
        System.out.println("food: " + Algorithm2.reverseWord("food"));

        System.out.println("palindromeCheck test:");
        System.out.println("amanaplanacanalpanama: " + Algorithm2.palindromeCheck("amanaplanacanalpanama"));
        System.out.println("noon: " + Algorithm2.palindromeCheck("noon"));
        System.out.println("bomb: " + Algorithm2.palindromeCheck("bomb"));

        System.out.println("substringNum test:");
        System.out.println("Mississippi, si: " + Algorithm2.substringNum("Mississippi", "si"));
        System.out.println("amanaplanacanalpanama, amanaplanacanalpanama: " + Algorithm2.substringNum("amanaplanacanalpanama", "amanaplanacanalpanama"));
        System.out.println("null, full: "  + Algorithm2.substringNum("null", "full"));
    }
}