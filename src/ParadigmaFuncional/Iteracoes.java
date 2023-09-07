package ParadigmaFuncional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {

        String[] nome = { "Bruno", "Henrique", "Joao", "Aristoteles" };

        String filtrandoNomes = Stream.of(nome)
                .filter(n -> n.equals("Aristoteles"))
                .collect(Collectors.joining());
        System.out.println("Resultado: "+filtrandoNomes);
    }
}
