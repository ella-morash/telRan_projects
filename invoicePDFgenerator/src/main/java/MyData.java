import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Map;
@Getter
public class MyData {
    private final String full_name = "Alex Turner";
    private final String tax_id = "984756";
    private final String bank_name = "N26";
    private final String card_holder = "Alex Turner";
    private final String iban = "DE19827987773";
    private final String bic = "BELADEXX";
    private final String email = "alex@gmail.com";
    private final String invoice_number = String.valueOf(Instant.now().getEpochSecond() + "/" +
            full_name.hashCode());
    private final String invoice_date = String.valueOf(LocalDate.now(
            ZoneId.of( "America/Montreal" )));




    public String createJson(){
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this);
        return json;
    }
}
