import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class POJO {

    private Map<String,String> map = new HashMap<>();

    public Map<String, String> getMap() {
        return createMap();
    }


    private Map<String,String> createMap() {

        map = new Gson().fromJson(new MyData().createJson(), Map.class);
        map.putAll(new Gson().fromJson(new MyTable().createJson(), Map.class));
        return map;
    }
}
