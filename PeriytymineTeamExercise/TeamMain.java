import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMain {

    static Scanner sc = new Scanner(System.in);
    static List<TeamMember> members = new ArrayList<>();
    public static void main(String[] args) {
        
        boolean proceed = true;

        do{
            switch(menu()){
                case 1:
                createPlayer();
                break;

                case 2:
                createCoach();
                break;

                case 3:
                createTrainer();
                break;

                case 4:
                printAllTeamMembers();
                break;
                
                default:
                proceed = false;
            
            }
        }while(proceed);
    }

    static int menu(){
        System.out.println("Select option");
        System.out.println("1 Create player");
        System.out.println("2 Create coach");
        System.out.println("3 Create trainer");
        System.out.println("4 Print team members");

        return Integer.parseInt(sc.nextLine());
    }

    static void createPlayer(){
        System.out.println("Give player name:");
        String name =  sc.nextLine();
        System.out.println("Give position:");
        String pos = sc.nextLine();

        members.add(new TeamPlayer(name, pos));
    }
    static void createCoach(){
        System.out.println("Give coach name:");
        String name =  sc.nextLine();
        System.out.println("Give experience in years:");
        int exp = Integer.parseInt(sc.nextLine());

        members.add(new Coach(name, exp));
    }

    static void createTrainer(){
        System.out.println("Give trainer name:");
        String name =  sc.nextLine();
        System.out.println("Give education:");
        String education = sc.nextLine();

        members.add(new Trainer(name, education));
    }

    static void printAllTeamMembers(){
        for (TeamMember m : members) {
            System.out.println("--------------");
            System.out.println(m.getClass());
            System.out.println("  " + m.getMemberinfo());
        }

        System.out.println("--------------");
    }

}
