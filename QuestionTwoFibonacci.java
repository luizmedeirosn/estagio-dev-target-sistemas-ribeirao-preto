import java.util.*;

public class QuestionTwoFibonacci {
    public static void main(String [] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        Boolean belongs = belongsSequentialFibonacci(num);
        if (belongs.booleanValue()) {
            System.out.println("Belongs...");
        } else {
            System.out.println("Not Belong...");
        }

        sc.close();
    }

    // O design do método foi feita tendo em vista a implementação de um cenário de testes.
    private static Integer a = 0, b = 1;
    private static Boolean belongsSequentialFibonacci(Integer num) {
        if (num.intValue() == a) {
            return true;
        } else if (num < a) {
            return false;
        } else {
            int aux = a;
            a = b;
            b += aux;
            return belongsSequentialFibonacci(num);
        }
    }
}
