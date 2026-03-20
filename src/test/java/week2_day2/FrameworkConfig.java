package week2_day2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//HashMap
public class FrameworkConfig {
    public static void main(String[] args) {

        LinkedHashMap<String, String> config = new LinkedHashMap<String, String>();
        config.put("browser", "chrome");
        config.put("website", "www.automationexercise.com");
        config.put("username", "vijay");
        config.put("password", "pass@1234");
        //Way 1 — entrySet() (key + value together)
        for (Entry<String, String> obj : config.entrySet() ) {
			System.out.println(obj.getKey()+" : "+obj.getValue());
		}
        //Way 2 — keySet() (Key and value can be obtained)
        for (String key : config.keySet()) {
			System.out.println(key + " = " + config.get(key));
		}
        //Way 3 — values() (only values, no keys)
        for (String value : config.values()) {
			System.out.println(value);
		}
        config.put("username", "vijay1305");
        System.out.println("Username updated to "+config.get("username"));
        if(config.containsKey("website")) {
        	System.out.println("Navigate to: "+config.get("website"));
        	
        	config.remove("password");
        	System.out.println(config);
        }
    }
}