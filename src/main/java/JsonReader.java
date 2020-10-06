import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonReader {
    public static JSONObject readFromFile(String filePath) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(filePath));
            return (JSONObject)obj;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
