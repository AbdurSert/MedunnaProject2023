package pojos;

import java.util.LinkedHashMap;
import java.util.Map;


public class SetCountries {


    private Integer id;

    private String name;

    private Object states;


    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();



    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Object getStates() {
        return states;
    }


    public void setStates(Object states) {
        this.states = states;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
