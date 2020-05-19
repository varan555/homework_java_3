package model;

/**
 * Created by JUVA on 19.05.2020.
 */
public class Currency {

    private int id;
    private String code;
    private String name_sort;
    private String name_full;

    public Currency() {
    }

    public Currency(int id, String code, String name_sort, String name_full) {
        this.id = id;
        this.code = code;
        this.name_sort = name_sort;
        this.name_full = name_full;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName_sort() {
        return name_sort;
    }

    public void setName_sort(String name_sort) {
        this.name_sort = name_sort;
    }

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }
}
