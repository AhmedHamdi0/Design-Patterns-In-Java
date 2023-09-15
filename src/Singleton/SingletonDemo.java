package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        System.out.println(Singleton.getInstance("FOO").getValue());
        System.out.println(Singleton.getInstance("BAR").getValue());
    }
}
