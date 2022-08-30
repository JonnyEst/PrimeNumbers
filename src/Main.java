import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numbers numbers = new Numbers();

        System.out.println("Digite un número");
        numbers.setNumber(input.nextInt());

        prime(numbers.getNumber());


    }

    public static boolean prime(int number){
        int contador =2;
        boolean prime=true;
        while((prime) && (contador!=number)){
            if(number % contador==0)
                prime = false;
                System.out.println("Is not prime");
                contador++;
        }
        System.out.println("Is prime");
        return prime;
    }
}
