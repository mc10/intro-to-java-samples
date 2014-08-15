package helloworld;

/**
 * Beep bop!
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class BeepBop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("BeepBop");
            } else if (i % 3 == 0) {
                System.out.println("Beep");
            } else if (i % 5 == 0) {
                System.out.println("Bop");
            }
        }
    }
}