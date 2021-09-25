package net.cert_achievements.achievement1;

public class ArrayCompileError {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 73;
        intArray[1] = 78;
        intArray[2] = 91;
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
