package eu.lovinger.ws.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
public class Text {

    private String header;

    private Map<String,String> specs;

    public Text() {
        this.specs = new HashMap<>();
    }

    public void setSpecs(Map<String, String> specs) {
        this.specs = specs;
    }

    public Map<String, String> getSpecs() {
        return specs;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void addItem(String title, String text) {
        this.specs.put(title,text);
    }
}
