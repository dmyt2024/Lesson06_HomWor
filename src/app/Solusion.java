package app;

public class Solusion {

    public static void main(String[]args){

        int[] array = new int[6];
        int num = 0;
        int sumIs = 0;

        for (int i = 0; i <array.length; i++) {
            array[i]++;
            num += array[i];
            sumIs+=num;

            System.out.println(num+") Num is "+num+", sum is "+sumIs);
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is "+sumIs);

    }
}
