package folder_example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int level;
        String job;
        boolean isRaider;

        System.out.print("What is your Job? ");
        job = scanner.nextLine();

        System.out.print("What is your level? ");
        level = scanner.nextInt();

        System.out.println("Are you a Raider? (true/false)");
        isRaider = scanner.nextBoolean();


        //job
        if(job.isEmpty()){
            System.out.print("You didn't enter your Job");
        }
        else{
            System.out.print(job + " is a based choice!\n");
        }

        //level
        if(level >= 100){
            System.out.print("You can enter FRU ");
        }
        else if(level >= 80){
            System.out.print("You can enter UCOB ");
        }
        else{
            System.out.print("You must get at least level 80 before joining an Ultimate Raid");
        }

        //raider
        if(isRaider){
            System.out.print("You're a raider!");
        }
        else{
            System.out.println("You're not a raider");
        }


        scanner.close();
    }
}