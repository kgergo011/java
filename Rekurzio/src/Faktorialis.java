public class Faktorialis {

}

public static int fakt(int f){
    if(f>0) {
        return f * fakt(f - 1);
    }else{
        return 0;
    }
}

void main() {
    int result = fakt(10);
    System.out.println(result);
}
