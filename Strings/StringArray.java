public class StringArray{

    public static void main(String arg[]){

        // Searching in String Array using Linear Search
        String[] strArr = new String[] {"Ravi", "Rahul", "Ajay", "Sanjay"};

        String s = "Ajay";
        boolean f = false;

        // Using for loop, search for Ajay
        for(int i = 0; i < strArr.length; i++){

            if(strArr[i] == s){

                System.out.println("Required String is at index: " + i);
                f = true;
            }
        }

        if(f == false){
            System.out.println("Required String is not found");
        }

    }
}