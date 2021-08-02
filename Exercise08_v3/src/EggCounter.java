import java.util.Arrays;
import java.util.Scanner;

public class EggCounter {

    private final int SIZE=8;
    private int[] eggCounts=new int[SIZE];
    private final static int  TOO_SMALL=0;
    private final static int  PEEWEE=1;
    private final static int  SMALL=2;
    private final static int  MEDIUM=3;
    private final static int  LARGE=4;
    private final static int  EXTRA_LARGE=5;
    private final static int  JUMBO=6;
    private final static int  TOO_LARGE=7;

    private String[] eggSizeNames= {"too small", "peewee", "small", "medium",
            "large", "extra-large", "jumbo", "too large"};
    ;




    public void enterEggs(){
        String shouldContinue;
        double weight;
        int size;




        do {

            Scanner read= new Scanner(System.in);
            System.out.println("Enter egg weight");
            weight=read.nextDouble();
            size=sizeEgg(weight);


            eggCounts[size]=eggCounts[size]+1;
            System.out.println("enter another egg weight ? (y/n)");
            shouldContinue=read.next();

        }
        while(shouldContinue.equalsIgnoreCase("Y"));
    }


    private int sizeEgg(double weight){
        int size;


        if(weight<15){
            size=0;//too small

        }
        else
        {
            if(weight<18){
                size=1;// peewee
        }
            else
                if (weight<21) {
                    size=2;// small
                }
                else
                    if (weight<24){
                        size=3; //  medium;
                    }
                    else
                        if (weight<27){
                            size=4;// large
                        }
                        else
                            if (weight<30){
                                size=5; // extra large
                            }
                            else
                                if (weight<33){
                                    size=6 ;// jumbo
                                }
                                else {
                                    size=7; // too large
                                }

        }
        return size;
    }

    public void printReport(){
        int index;
        int count;


        for(index=0;index<=SIZE-1;index++)
        {

            for (count=1;count<=eggCounts[index];count++){
                System.out.print("*");
            }
            System.out.println(eggSizeNames[index]+":"+eggCounts[index]);
        }


    }
}
