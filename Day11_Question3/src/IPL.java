import java.util.Scanner;

public class IPL {
    public void homeTeamStadium (Stadium stadium){
            if (stadium == Stadium.EDEN_GARDENS_STADIUM){
                System.out.println("This is Home Ground of KKR");
            }
            if (stadium == Stadium.WANKHEDE_STADIUM){
                System.out.println("This is Home Ground of Mumbai Indians");
            }
            if(stadium == Stadium.CHIDAMBARAM_STADIUM){
                System.out.println("This is Home Ground of CSK");
            }
            if(stadium == Stadium.M_CHINNASWAMY_STADIUM){
                System.out.println("This is Home Ground of RCB");
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Stadium Name: ");
        String std = sc.next();

        try{
            Stadium stadium = Stadium.valueOf(std);
            IPL ipl = new IPL();
            ipl.homeTeamStadium(stadium);

        }
        catch (Exception e){
            System.out.println("Enter Proper Stadium Name.");
        }

        //Stadium stadium = Stadium.valueOf("EDEN_GARDENS_STADIUM");

    }
}
