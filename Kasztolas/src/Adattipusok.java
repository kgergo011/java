public class Adattipusok {
    static void main(){
        byte bit = 3;
        char betu = 'a';
        short rovid = 5000;
        int a = 100;
        long hosszu = 1500000L;
        float f = 5.32f;
        double d = 432.44;
        boolean i = true;
        String sztr = "Hello world";
        IO.println(bit);
        IO.println(betu);
        IO.println(rovid);
        IO.println(a);
        IO.println(hosszu);
        IO.println(f);
        IO.println(d);
        IO.println(i);
        IO.println(sztr);

        float myFloat = (float) d;
        long myLong = (long) myFloat;
        int myInt = (int) myLong;
        char myChar = (char) myInt;
        short myShort = (short) myChar;
        byte myByte = (byte) myShort;
        IO.println(myFloat);
        IO.println(myLong);
        IO.println(myInt);
        IO.println(myChar);
        IO.println(myShort);
        IO.println(myByte);




    }
}
