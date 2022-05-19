import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;

import java.util.Map;
@Getter
public class MyData {
    private final String fullName = "Alex Turner";
    private final String taxID = "984756";
    private final String bank = "N26";
    private final String cardHolder = "Alex Turner";
    private final String IBAN = "DE19827987773";
    private final String BIC = "BELADEXX";
    private final String email = "alex@gmail.com";




    public String createJson(){
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this);
        return json;
    }
}
