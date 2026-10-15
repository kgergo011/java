public class AddNumberToArraySum {
    static int AddNumberToArraySum(int num, int[] list){
        int sum = num;
        for(int i=0; i<list.length; i++){
            sum+=list[i];
        }
        return sum;
    }

    static double AddNumberToArraySum(double num, int[] list){
        double sum = num;
        for(int i=0; i<list.length; i++){
            sum+=list[i];
        }
        return sum;
    }

    static double AddNumberToArraySum(double num, double[] list){
        double sum = num;
        for(int i=0; i<list.length; i++){
            sum+=list[i];
        }
        return sum;
    }


    static void main(){
        int[] tomb = {1,2,3};
        double[] tizedes = {1.2, 3.4, 5.6};
        System.out.println(AddNumberToArraySum(3,tomb));
        System.out.println(AddNumberToArraySum(3, tizedes));
        System.out.println(AddNumberToArraySum(3., tomb));
        System.out.println(AddNumberToArraySum(3., tizedes));
    }
}
