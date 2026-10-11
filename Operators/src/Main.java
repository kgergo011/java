//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérek egy sztringet!");
    String sztring=sc.nextLine();
    System.out.println("Kérek egy másik sztringet!");
    String sztr=sc.nextLine();

    System.out.println(("Kérek egy számot!"));
    int szam=sc.nextInt();
    System.out.println(("Kérek egy számot!"));
    int szamm=sc.nextInt();

    System.out.println(("Kérek egy double értéket!"));
    double dupla=sc.nextDouble();
    System.out.println(("Kérek egy double értéket!"));
    double duplak=sc.nextDouble();

    String szoveg=sztring+sztr;
    int osztas=szam/szamm;
    double osszead=dupla+duplak;
    int kivonas=szam-(int)dupla;
    int szorzas=szamm*(int)duplak;

    System.out.println(szoveg);
    System.out.println(osztas);
    System.out.println(osszead);
    System.out.println(kivonas);
    System.out.println(szorzas);

}
