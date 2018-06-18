import java.util.Scanner;

public class DesigMenuForApp {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("---Danh sach---");
            System.out.println("1.Hinh tam giac goc vuong o top-left.");
            System.out.println("2.Hinh tam giac goc vuong o bottom - left.");
            System.out.println("3.Hinh chu nhat.");
            System.out.println("4.Tam giac can");
            System.out.println("0.Exit.");

            System.out.print("Nhap vao hinh ban muon hien thi: ");
            choice = input.nextInt();
            switch (choice){
                case 3:
                for (int i = 0; i < 3; i++){
                    for (int k = 0; k < 7; k++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }break;
                case 2:
                    for(int i = 1; i<=5; i++){
                        for(int j =1; j<i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");

                    } break;
                case 1:
                    for (int i =5; i>=1; i--){
                        for (int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }break;
                case 4:
                    for(int i = 1; i<=5; i++){
                        for(int j =1; j<i; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    for (int i =5; i>=1; i--){
                    for (int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                case 0:
                    System.exit(0);
                    default:
                        System.out.println("Error!!!");
            }
        } while (choice != 0);
    }
}


