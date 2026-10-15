//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println(fakt(5));
    System.out.println(hatvany(2,3));
    System.out.println(fibonacci(4));
}

public static int fakt(int num){
    if(num>1) {
        return fakt(num-1)*num;
    }else{
        return 1;
    }
}

public static int hatvany(int alap, int kitevo){
    if(kitevo==0) {
        return 1;
    }
        return alap*hatvany(alap,kitevo-1);

}

public static int fibonacci(int num) {
    if (num > 2) {
        return fibonacci(num - 1) + fibonacci(num - 2);
    } else if (num > 1) {
        return 1;
    } else {
        return 0;
    }
}
