import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    public static void main(String[] args) throws Exception {
      
        /* Crie uma lista e adicione as sete notas: */

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        /* Exiba a posição da nota 5.0: */

        System.out.println(notas.indexOf(5.0));

        /* Adicione na lista a nota 8.0 na posição 4: */

        notas.add(4, 8.0);
        System.out.println(notas.toString());

        /* Substitua a nota 5.0 pela nota 6.0: */

        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());

        /* Confira se a nota 5.0 está na lista: */

        System.out.println(notas.contains(5.0));

        /* Exiba todas as notas na ordem que foram informadas */

        for (Double nota : notas) {
            System.out.println(nota);
        }

        /* Exiba a terceira nota adicionada: */
        
        System.out.println(notas.get(2));

        /* Exiba a menor nota: */

        System.out.println(Collections.min(notas));

        /* Exiba a maior nota: */

        System.out.println(Collections.max(notas));

        /* Exiba a soma dos valores: */

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        /* Exiba a média das notas: */

        System.out.println(soma / notas.size());

        /* Remova a nota 0: */

        notas.remove(0.0);
        System.out.println(notas.toString());

        /* Remova a nota da posição 0: */

        notas.remove(0);
        System.out.println(notas.toString());

        /* Remova as notas menores que 7 e exiba a lista: */

        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas.toString());

        /* Apague toda a lista: */

        notas.clear();
        System.out.println(notas.toString());

        /* Confira se a lista está vazia: */

        System.out.println(notas.isEmpty());
        
    }
}
