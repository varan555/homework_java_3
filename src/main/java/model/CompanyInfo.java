package model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * Created by JUVA on 19.05.2020.
 */
@JsonAutoDetect
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
    private List securities;

    public CompanyInfo() {
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

    public void setCompany_type(CompanyType company_type) {
        this.company_type = company_type;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getEgrul_date() {
        return egrul_date;
    }

    public void setEgrul_date(String egrul_date) {
        this.egrul_date = egrul_date;
    }

    public Country getCountry() {
        return country;
    }

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

    public List getSecurities() {
        return securities;
    }

    public void setSecurities(List securities) {
        this.securities = securities;
    }
}
