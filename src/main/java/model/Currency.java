package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * Created by JUVA on 19.05.2020.
 */
@JsonAutoDetect
public class Currency {

    private int id;
    private String code;
    private String name_short;
    private String name_full;

    public Currency() {
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

    public String getName_short() {
        return name_short;
    }

    public void setName_short(String name_sort) {
        this.name_short = name_sort;
    }

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }
}
