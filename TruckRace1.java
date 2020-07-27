import java.util.Random;
import java.util.Scanner;

public class TruckRace1 {

    private static String names[] ={"Chevy","Ford"};

    public static int spin(){
          Random random = new Random();
          return random.nextInt(6)-2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int run=1; run<=5; run++){
            for(String name:names){
                System.out.print(name+"\'s turn. Press Enter to spin...");
                scanner.nextLine();
                int spin = spin();
                System.out.println(name+" spun "+ spin);
                System.out.println();
            }
        }

    }

}
