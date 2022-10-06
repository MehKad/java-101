import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter ur birth month :");        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0 && a<13) {
            switch (a) {
                case 1: System.out.println("Jan");
                        break;
                case 2: System.out.println("Feb");
                        break;
                case 3: System.out.println("Mar");
                        break;
                case 4: System.out.println("Apr");
                        break;
                case 5: System.out.println("May");
                        break;
                case 6: System.out.println("Jun");
                        break;
                case 7: System.out.println("Jul");
                        break;
                case 8: System.out.println("Aug");
                        break;
                case 9: System.out.println("Sep");
                        break;
                case 10: System.out.println("Oct");
                        break;
                case 11: System.out.println("Nov");
                        break;
                case 12: System.out.println("Dec");
                        break;
            }
        }
        else System.out.println("Invalid month");
        
    }
}
