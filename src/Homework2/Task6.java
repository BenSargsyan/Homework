package Homework2;

public class Task6 {

    public static void main(String[] args) {
        int[] arr=new int[12];
        int counter=0;
        for(int i=0;i<arr.length;++i)
        {
            arr[i]=i;
            if(arr[i]%2==0)
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
