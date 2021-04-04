package Homework2;
public class Task4 {
    public static void main(String[] args) {
        int[] array=new int[10];
        array[0]=10;
        array[1]=3;
        array[2]=46501;
        array[3]=4545;
        array[4]=6354;
        array[5]=1;
        array[6]=26;
        array[7]=89;
        array[8]=5;
        array[9]=40;
        for(int i=0;i<array.length;++i)
        {
            if(array[i]%5==0)
            {
                System.out.println(i + " element is " + array[i] + " and can be divided by 5");
            }
        }
    }
}
