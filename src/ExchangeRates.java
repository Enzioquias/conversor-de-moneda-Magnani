import java.util.Map;

public record ExchangeRates(String time_last_update_utc, Map<String, Double> conversion_rates) {
}
