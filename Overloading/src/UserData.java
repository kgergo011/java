public class UserData {

    static String UserData(int age, String firstName, String lastName){
        return firstName+" "+lastName+" "+age;
    }
    static String UserData(String firstName, int age, String lastName){
        return firstName+" "+lastName+" "+age;
    }
    static String UserData(String firstName, String lastName, int age){
        return firstName+" "+lastName+" "+age;
    }

    void main(){
        System.out.println(UserData(33,"John","Doe"));
        System.out.println(UserData("John",33, "Doe"));
        System.out.println(UserData("John","Doe",33));
    }

}
