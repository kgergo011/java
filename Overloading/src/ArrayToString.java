public class ArrayToString {
    static String convertToString(int[] nums){
        String result = "";
        for(int i = 0; i<nums.length;i++){
            result+=Integer.toString(nums[i])+", ";
        }
        return result;
    }
    static String convertToString(double[] nums){
        String result = "";
        for(int i = 0; i<nums.length;i++){
            result+=Double.toString(nums[i])+", ";
        }
        return result;
    }
    static String convertToString(boolean[] booleans){
        String result = "";
        for(int i = 0; i<booleans.length;i++){
            result+=Boolean.toString(booleans[i])+", ";
        }
        return result;
    }
    static String convertToString(String[] Strings){
        String result = "";
        for(int i = 0; i<Strings.length;i++){
            result+=Strings[i]+", ";
        }
        return result;
    }


    void main(){
        int[] nums = {1,2,3};
        double[] doubles = {1.2,3.4,5.6};
        boolean[] booleans = {true, false, true};
        String[] strings = {"banán","alma","körte"};
        System.out.println(convertToString(nums));
        System.out.println(convertToString(doubles));
        System.out.println(convertToString(booleans));
        System.out.println(convertToString(strings));
    }
}
