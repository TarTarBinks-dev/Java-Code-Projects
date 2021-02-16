import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class primeNumberGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> primeNumbers = new ArrayList<String>();
        int times = 2;
        int sequenceStarter = 1;
        System.out.println("Please type a whole number to generate the primes");
        int number = input.nextInt();
        ArrayList<Integer> finalNumbers = new ArrayList<Integer>();
        System.out.println("calculating...");
        for (int x = 0; x < number; x++){
            primeNumbers.add(x,"p");
        }
        //System.out.println(primeNumbers);
        primeNumbers.set(0, "c");
        while (sequenceStarter < number - 1){
            //primeNumbers.get(sequenceStarter);
            for (int i = sequenceStarter + times; i < number; i+= times){
                primeNumbers.set(i,"c");
            }
            sequenceStarter ++;
            times = sequenceStarter + 1;
        }
        for (int y = 0; y < number; y ++){
            if (primeNumbers.get(y) == "p"){
                finalNumbers.add(y+1);
            }
        }
        System.out.println(finalNumbers);

    }
}