package Arrays.OperationsOnArray;

import java.util.Comparator;
import java.util.Arrays;

class Student{

    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String addrress){
        this.rollno = rollno;
        this.name = name;
        this.address = addrress;
    }

    public String toString(){
        return this.rollno + " " + this.address + " " + this.name;
    }
}

class SortByRoll implements Comparator<Student>{

    public int compare(Student a, Student b){
        return a.rollno - b.rollno;
    }
}

public class ComparatorInterface{

    public static void main(String[] args) {
        Student[] arr = { new Student(111, "bbbb", "london"),
                          new Student(131, "aaaa", "nyc"),
                          new Student(121, "cccc", "jaipur") };

        System.out.println("Unsorted");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, 1, 3, new SortByRoll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
