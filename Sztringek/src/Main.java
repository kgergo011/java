import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérem a vezetéknevét!");
    String vez=sc.nextLine();
    System.out.println("Kérem a keresztnevét!");
    String ker=sc.nextLine();
    System.out.println("Kérem a születési helyét!");
    String szul=sc.nextLine();
    System.out.println("Kérem az életkorát!");
    int kor=sc.nextInt();

    String fullName = vez+" "+ker;
    System.out.println(fullName.toUpperCase());

    System.out.println(fullName.indexOf(ker));

    System.out.println(fullName.toLowerCase()+" "+szul.toLowerCase());

    System.out.println("A felhasználó "+kor+" éves,"+fullName+"-nek hívják és"+szul+"-en született.");

    System.out.println(ker.startsWith("A"));

    System.out.println(ker.endsWith("t"));

    System.out.println(fullName.length());

    System.out.println(fullName.replace("i","y"));
}
