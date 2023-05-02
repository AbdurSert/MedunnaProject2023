package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatesPojoFiles {
    private int id;
    private String name;
    private CountryPojoFiles tpCountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryPojoFiles getTpCountry() {
        return tpCountry;
    }

    public void setTpCountry(CountryPojoFiles tpCountry) {
        this.tpCountry = tpCountry;
    }
}
