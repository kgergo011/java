void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Kérek egy magasságot!");
    int magas=sc.nextInt();
    if(magas>149 && magas<166){
        System.out.println("S méret.");
    } else if(magas>164 && magas<176){
        System.out.println("M méret.");
    } else if(magas>174 && magas<186){
        System.out.println("L méret.");
    }
    else if(magas>184 && magas<196) {
        System.out.println("XL méret.");
    }else{
        System.out.println("NO SIZE");
    }
}