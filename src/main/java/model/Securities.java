package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;

/**
 * Created by JUVA on 19.05.2020.
 */
@JsonAutoDetect
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

    public LocalDate getDate_to() {
        return LocalDate.parse(date_to);
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }

    public LocalDate getState_reg_date() {
        return LocalDate.parse(state_reg_date);
    }

    public void setState_reg_date(String state_reg_date) {
        this.state_reg_date = state_reg_date;
    }

    public State getState() {
        return state;
    }

    @JsonSetter("state")
    @JsonDeserialize(as = State.class)
    public void setState(State state) {
        this.state = state;
    }

    public Currency getCurrency() {
        return currency;
    }
    @JsonSetter("currency")
    @JsonDeserialize(as = Currency.class)
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


}
