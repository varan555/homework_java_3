package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.CompanyInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Converter {
    private File file;
    private ArrayList<CompanyInfo> listOfCompany;
    private Converter converter;

    public Converter() {
        setFile();
        convert();
        listOfCompany = new ArrayList<CompanyInfo>();
        Collections.addAll(listOfCompany, list);
    }

    public void setFile() {
        try {
            System.out.println("Укажите файл");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            file = new File(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    ObjectMapper mapper = new ObjectMapper();

    private CompanyInfo[] list;

    public ArrayList<CompanyInfo> getListOfCompany() {
        return listOfCompany;
    }

    public void convert() {
        try {

            list = mapper.readValue(file, CompanyInfo[].class); //addAll(companyInfo.getListOfCompany());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
