package Arrays;

public class ObjectArray {

    // Arrays are objects of a class, and a direct superclass of arrays is a class Object.
    public static void main(String[] args) {
        
        int[] arrInt = new int[3];
        byte[] arrByte = new byte[3];
        short[] arrShort = new short[3];

        String[] arrString = new String[3];

        System.out.println(arrInt.getClass());
        System.out.println(arrByte.getClass().getSuperclass());
        System.out.println(arrShort.getClass());
        System.out.println(arrString.getClass());
    }
    
}
