import java.util.Scanner;

public class Soutln {
    static void main(){
        String msg = "I'm happy today.";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;
        System.out.println(msg);
        System.out.println(a);
        System.out.println(o);
        System.out.println(h);
        System.out.println(d);

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a kedvenc zeneszámodat: ");
        String music = sc.nextLine();
        System.out.println("Add meg a kedvenc ételedet: ");
        String food = sc.nextLine();
        System.out.println("What is your hobby? ");
        String hobby = sc.nextLine();
        System.out.println("What is your favourite movie? ");
        String film = sc.nextLine();
        System.out.println("What is your favourite destination? ");
        String destination = sc.nextLine();
        System.out.printf("Your favourite music is %s\n", music);
        System.out.printf("Your favourite food is %s\n", food);
        System.out.printf("Your favourite hobby is %s\n", hobby);
        System.out.printf("Your favourite movie is %s\n", film);
        System.out.printf("Your favourite destination is %s\n", destination);

    }
}
