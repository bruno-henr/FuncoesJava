import java.time.LocalDate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<Integer> calcula = v -> v*3;
        System.out.println(calcula.apply(25));
    }
}