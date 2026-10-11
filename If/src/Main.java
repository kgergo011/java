

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérek egy számot!");
    int elso=sc.nextInt();
    System.out.println("Kérek még egy számot!");
    int masodik = sc.nextInt();

    if(elso > masodik){
        System.out.println("A két szám közül az első szám a nagyobb.");
    }else if(elso < masodik){
        System.out.println("A két szám közül a második szám a nagyobb.");
    }else{
        System.out.println("A két szám egyenlő.");
    }




}
