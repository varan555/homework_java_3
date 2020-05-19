package model;

/**
 * Created by JUVA on 19.05.2020.
 */
public class CompanyType {
    private int id;
    private String name_short;
    private String name_full;

    public CompanyType() {
    }

    public CompanyType(int id, String name_short, String name_full) {
        this.id = id;
        this.name_short = name_short;
        this.name_full = name_full;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_short() {
        return name_short;
    }

    public void setName_short(String name_short) {
        this.name_short = name_short;
    }

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }
}
