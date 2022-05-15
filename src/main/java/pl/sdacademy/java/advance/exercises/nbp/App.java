package pl.sdacademy.java.advance.exercises.nbp;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws IOException {
        /*
        https://api.nbp.pl
        https://freecodegenerators.com/code-converters/json-to-pojo
        logika dla usera:
        1. podaj currency
        2. podaj ilosc na wymianę
        3.
         */
        URL nbp = new URL("http://api.nbp.pl/api/exchangerates/tables/A/?format=json");
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(nbp.openConnection().getInputStream()))) {
            //System.out.println(br.readLine());
            String inputLine;
            while((inputLine = br.readLine()) != null) { // dla przypadku gdy mamy wiele linii
                result += inputLine;
            }
        } catch(IOException e) {
            System.out.println("Exception: " + e);
        }
        ObjectMapper om = new ObjectMapper();
        //Root root = om.readValue(result, Root[].class)[0];
        Root root = om.readValue(result, Root[].class)[0];
        double rateValue = root.getRates().stream()
                .filter(rate -> rate.getCode().equalsIgnoreCase("USD"))
                //.mapToDouble(i -> i.getMid())
                .mapToDouble(Rate::getMid)
                .findFirst()
                .orElse(0);
        System.out.println(rateValue);
    }
}
