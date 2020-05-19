package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.CompanyInfo;

import java.io.StringReader;
import java.util.List;

public class Converter {

  //  private List<CompanyInfo> listOfCompany;

    StringReader source = new StringReader(new Reader().getContents());

    ObjectMapper mapper = new ObjectMapper();

    private List<CompanyInfo> listOfCompany = mapper.readValue(source, CompanyInfo.class);





}
