package ParadigmaFuncional;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class Funcoes {
    public static void main(String[] args) {
//        int[] valores = {1, 2, 3, 4};
//        Arrays.stream(valores)
//                .filter(v -> v % 2 == 0)
//                .map(v -> v * 2)
//                .forEach(System.out::println);
//        //
//
//        Funcao1 formatarString = nome -> "Sr. "+nome;
//        //System.out.println(formatarString.gerar("Bruno"));
//        Funcao2 f = System.out::println;
//        f.gerar("Bruno henrique");
//

//        Function<String, String> revertString = value -> new StringBuilder(value).reverse().toString();
//        System.out.println("Revertendo String: Bruno. \nEm = "+ revertString.apply("Bruno"));
//        Function<String, Integer> convertInInteger = str -> Integer.valueOf(str);
//        System.out.println("Convertendo a String 123 em numero:\nResultadp -> "+ convertInInteger.apply("123"));

        Supplier<People> factory = People::new;
        System.out.println(factory.get());
    }


}

class People {
    private String nome;
    People() {
        this.nome = "Bruno";
    }

    @Override
    public String toString() {
        return "People{ nome: "+this.nome+" }";
    }
}
/*
* REQUISITO PARA CRIAR UMA LAMBDA:
* 1 - Criar uma interface com annotation FunctionalInterface
* 2 - Essa interface deve ter apenas uma assinatura da funcao
* 3 - Criar uma variavel com o tipo da interface lambda e passar a funcao lambda e utilizar.
* */
@FunctionalInterface
interface Funcao1 {
    String gerar(String nome);
}

@FunctionalInterface
interface Funcao2 {
    void gerar(String nome);
}
