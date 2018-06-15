import java.util.Scanner;

public class Interset {
    public static void main(String[] args) {
       double money = Double.parseDouble(args[0]);
       int month = Integer.parseInt(args[1]);
       double interset_rate = Double.parseDouble(args[2]);
       double total_interset = 0;
       for (int i = 0; i< month; i++){
           total_interset = money*(interset_rate/100)/12*month;
       }
        System.out.println("Total of interset: "+total_interset);

    }
}