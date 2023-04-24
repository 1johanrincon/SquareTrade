import categories.HomeAppliances.KitchenAppliances;

public class Main {
    public static void main(String[] args) {

        System.out.println("Run Search Engine");
        KitchenAppliances ka = new KitchenAppliances();
        System.out.println("Level: " + ka.getLevel());
        System.out.println("Keywords: " + ka.getKeywords());
        System.out.println("Result -> " + ka.searchEngine("a"));
    }
}