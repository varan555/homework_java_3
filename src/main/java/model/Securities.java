package model;

/**
 * Created by JUVA on 19.05.2020.
 */
public class Securities {

    private int id;
    private String code;
    private String name_full;
    private String cfi;
    private String date_to;
    private String state_reg_date;
    private State state;
    private Currency currency;

    public Securities() {
    }

    public Securities(int id, String code, String name_full, String cfi, String date_to,
                      String state_reg_date, State state, Currency currency) {
        this.id = id;
        this.code = code;
        this.name_full = name_full;
        this.cfi = cfi;
        this.date_to = date_to;
        this.state_reg_date = state_reg_date;
        this.state = state;
        this.currency = currency;
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

    public String getName_full() {
        return name_full;
    }

    public void setName_full(String name_full) {
        this.name_full = name_full;
    }

    public String getCfi() {
        return cfi;
    }

    public void setCfi(String cfi) {
        this.cfi = cfi;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public String getState_reg_date() {
        return state_reg_date;
    }

    public void setState_reg_date(String state_reg_date) {
        this.state_reg_date = state_reg_date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
