package ParadigmaFuncional;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStream {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();
        pessoas.add("Bruno");
        pessoas.add("Fulano");
        pessoas.add("Breno");
        pessoas.add("Pedro");
        pessoas.stream().filter(p -> p.startsWith("B"))
                .forEach(System.out::println);

    }
}
