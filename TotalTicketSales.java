import java.util.Scanner;
public class TotalTicketSales{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //  input for number of tickets sold (BOX) . BOX variable .
        System.out.print("Total tickets sold (Box)= ");
        int BOX = sc.nextInt();
        //  input for number of tickets sold (Sideline) . SLN variable .
        System.out.print("Total number of tickets sold (Sideline)  = ");
        int SLN = sc.nextInt();
        //  input for number of tickets sold (Premium) . PRM variable .
        System.out.print("Total number of tickets sold (Premium)  = ");
        int PRM = sc.nextInt();
        //  input for number of tickets sold (General Admission) . GA variable .
        System.out.print("Total number of tickets sold (General Admission)  = ");
        int GA = sc.nextInt();
        int Sold ;
        double TotalSales;
        //  calculate total amount box  .
        double  A  = BOX * 250 ;
        //  calculate total amount sideline  .
        double B  = SLN * 100 ;
        //  calculate total amount premium  .
        double C  = PRM * 50 ;
        //  calculate total amount general admission  .
        double D  = GA * 25 ;
        //  calculate total ticket that has been sold.
        Sold = BOX + SLN + PRM + GA ; 
        //  calculate total sale amount.
        TotalSales = A + B + C + D ;
        
        System.out.println("Total tickets sold: " + Sold );
        System.out.println("Total amount (Box): RM" + A);
        System.out.println("Total amount (Sideline): RM"+ B);
        System.out.println("Total amount (Premium): RM "+ C );
        System.out.println("Total amount (General Admission) : RM  " + D  );
        System.out.println("Total Sales : RM " + TotalSales);
    }
    
}