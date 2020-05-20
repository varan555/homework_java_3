package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by JUVA on 19.05.2020.
 */
@JsonAutoDetect
@JsonDeserialize(as = CompanyInfo.class)
public class CompanyInfo {
    private  int id;
    private String code;
    private String name_full;
    private String name_short;
    private String inn;
    private CompanyType company_type;
    private String ogrn;
    private String egrul_date;
    private Country country;
    private String fio_head;
    private String address;
    private String phone;
    private String e_mail;
    private String www;
    private String is_resident;
    private ArrayList <Securities> securities;

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

    public String getName_short() {
        return name_short;
    }

    public void setName_short(String name_short) {
        this.name_short = name_short;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public CompanyType getCompany_type() {
        return company_type;
    }

    @JsonSetter("company_type")
    @JsonDeserialize(as = CompanyType.class)
    public void setCompany_type(CompanyType company_type) {
        this.company_type = company_type;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public LocalDate getEgrul_date() {
        return LocalDate.parse(egrul_date);
    }

    public void setEgrul_date(String egrul_date) {
        this.egrul_date = egrul_date;
    }


   //@JsonDeserialize(as = Country.class)
    public Country getCountry() {
        return country;
    }

    @JsonSetter("country")
    @JsonDeserialize(as = Country.class)
    public void setCountry(Country country) {
        this.country = country;
    }

    public String getFio_head() {
        return fio_head;
    }

    public void setFio_head(String fio_head) {
        this.fio_head = fio_head;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
    }

    public String getIs_resident() {
        return is_resident;
    }

    public void setIs_resident(String is_resident) {
        this.is_resident = is_resident;
    }

    //@JsonDeserialize(as = Securities.class)
    public ArrayList<Securities> getSecurities() {
        return securities;
    }

    @JsonSetter("securities")
    @JsonDeserialize(as  = ArrayList.class)
    public void setSecurities(ArrayList<Securities> securities) {
        this.securities = securities;
    }
}
