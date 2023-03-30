import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/* Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
    *  modelo = gol - consumo = 14,4 km/l
    *  modelo = uno - consumo = 15,6 km/l
    *  modelo = mobi - consumo = 16,1 km/l
    *  modelo = hb20 - consumo = 14,5 km/l
    *  modelo = kwid - consumo = 15,6 km/l
 */

public class ExemploMap {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Crie um dicionario que relacione o modelo e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2 km/l:");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo: " + modeloMaisEficiente + " - Consumo: " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo: " + modeloMenosEficiente + " - Consumo: " + consumoMenosEficiente);
            }
        }

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionario de carros: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().equals(15.6)) {
                iterator2.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionario está vazio: " + carrosPopulares.isEmpty());
    }
}
