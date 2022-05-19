import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;

@Getter
public class MyTable {

    private final String description = "HTML/CSS Basics";
    private final String quantity = "5";
    private final String price = "50";
    private final String amount = String.valueOf(Integer.parseInt(quantity)*  Integer.parseInt(price));
    private final String total = String.valueOf(Integer.parseInt(quantity)*  Integer.parseInt(amount));


    public String createJson(){
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(this);
        return json;
    }

}
