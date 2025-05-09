//Exchange API Key: 0d748f16fdead16346c46207
//https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD
//https://v6.exchangerate-api.com/v6/0d748f16fdead16346c46207/latest/ARS

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ConsultaDeAPI {
    public Map<String, Double> consultarExchange() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/0d748f16fdead16346c46207/latest/USD"))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ExchangeRates exchangeWholeData = gson.fromJson(response.body(),ExchangeRates.class);
        return exchangeWholeData.conversion_rates();



    }
}
