package Homework1;

public class Task3 {

    public static void main(String[] args) {
        int[] array_of_odd=new int[20];
        int x=0;
        int y=-19;
        do {
            array_of_odd[x]=y;
            y+=2;
            System.out.println(array_of_odd[x]);
            x++;
        }
        while(x!=20);
    }
}
