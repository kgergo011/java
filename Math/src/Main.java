void main() {
    double rnd1 = Math.random()*201;
    double rnd2 = Math.random()*201;

    System.out.println("A két szám közül a nagyobbik: "+Math.max(rnd1,rnd2));
    System.out.println("A két szám kisebbike: "+Math.min(rnd1,rnd2));

    System.out.println("Az első szám négyzetgyöke: "+Math.sqrt(rnd1));
    System.out.println("A két szám négyzetgyöke: "+Math.sqrt(rnd2));

    System.out.println("A két szám közötti eltérés: "+Math.abs(rnd1-rnd2));

    System.out.println("Az első szám köbe: "+Math.pow(rnd1,3));
    System.out.println("Az második szám köbe: "+Math.pow(rnd2,3));

    System.out.println("A két szám hányadosának legközelebbri egészre kerekítése: "+Math.round(rnd1/rnd2));
    System.out.println("Lefele kerekítés: "+Math.floor(rnd1/rnd2));
    System.out.println("Lefele kerekítés: "+Math.ceil(rnd1/rnd2));


}
