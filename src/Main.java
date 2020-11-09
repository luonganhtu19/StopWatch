import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main  {
    public static void main(String[] args) {
        int[] array=new int[0];
        long time=0;
        do {
            System.out.println();
            menu();
            StopWatch stopWatch=new StopWatch();
            System.out.print(" Choice Menu: ");
            int choice=checkNumber(" value of choice is number");
            switch (choice){
                case 0:
                    System.out.println("bye bye ^^");
                    return ;
                case 1:
                    array=createElement();
                    System.out.println(" Arrays: ");
                    display(array);
                    break;
                case 2:
                    stopWatch.getStartTime();
                    array=sortArrays(array,stopWatch);
                    stopWatch.getEndTime();
                    time=stopWatch.getElapsedTime();
                    System.out.println("Arrays sort");
                    display(array);
                    //System.out.println(stopWatch.getElapsedTime());
                    break;
                case 3:
                    System.out.println("program run is: "+time+" ms");
                    break;
                default:
                    System.out.println(" please choice menu again");
                    System.out.println("");
            }
        }while (true);


    }
    private static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Create arrays ");
        System.out.println("2. Sort arrays ");
        System.out.println("3. Display Runtime ");
        System.out.println("0. Exit");
    }
    private static int[] createElement(){
        int number=0;
        System.out.print("Enter amount number of arrays: ");
        do {
           number =checkNumber(" with value of amount is number(greater than 0) ");
        }while (number<=0);
        int[] arrays= new int[number];
        for (int i = 0; i < number; i++) {
            arrays[i]=(int) (Math.random()*number+1);
        }
        return arrays;
    }
    private static int checkNumber(String mess){
        boolean check=true;
        Scanner input= new Scanner(System.in);
        int number=0;
        do {
            try{
                number= Integer.parseInt(input.nextLine());
                check=false;
            }catch (Exception e){
                System.out.println("Please try again "+mess);
            }
        }while (check);
        return number;
    }
    private static int[] sortArrays(int[] array,StopWatch stopWatch){
        //stopWatch.getStartTime();
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        //stopWatch.getEndTime();
        //System.out.println(stopWatch.getElapsedTime());
        return array;
    }
    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
