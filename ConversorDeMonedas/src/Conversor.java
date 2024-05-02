import java.util.Map;

public record Conversor(String result,
                        String base_code,
                        String time_last_update_utc,
                        Map<String, Float> conversion_rates) {
}
