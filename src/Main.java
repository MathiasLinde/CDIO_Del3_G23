import java.util.Scanner;

public class Main {
    public static final int STARTSALDO = 1000;
    public static void main(String[] args) {
        System.out.println("welcome to monopoly");
        System.out.println("how many players are playing this game");
        Scanner s = new Scanner();
        int p = s.nextInt();
        if (p==2){
            System.out.println("what is the name of the first player?");
            String p1 = s.nextLine();
            System.out.println("what is the name of the second player?");
            String p2 = s.nextLine();
            System.out.println("press enter to start the game");
            Input.enter();

        }
    }

}