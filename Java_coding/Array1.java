import java.util.Arrays;
public class Array1 
{
    public static void main(String[] args)
    {
        //array
        int[] marks = new int[3];
        marks[0]=100;
        marks[1]=90;
        marks[2]=95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
