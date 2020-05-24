package viewer;

import model.CompanyInfo;
import model.Securities;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ConsoleView {
    public ConsoleView() {}

     public void listOfCompany(ArrayList<CompanyInfo> list) {
        System.out.println("Перечень компаний:");
        list.stream().forEach(x-> System.out.println(x.getName_short() + " - " + x.getEgrul_date()));

//         System.out.println("Перечень компаний:");
//         for (CompanyInfo ci : list) {
//             System.out.println(ci.getName_short() + " - " + ci.getEgrul_date());
//         }
//         System.out.println();
//         System.out.println();
//     }
    }

    public void overdueSecurities(ArrayList<CompanyInfo> list) {

        System.out.println("----------------------------------");
        System.out.println("Аннулированные бумагы:");

        list.stream().map(CompanyInfo::getSecurities)
                .flatMap(Collection::stream)
                .filter(s -> s.getState().getName().equals("Аннулирован"))
                .forEach(z -> System.out.println("Код:  " + z.getCode() +
                        "    Дата истечения:  " + z.getDate_to().toString()));
    }


//        for (CompanyInfo ci : list) {
//            ci.getSecurities().stream().filter(y -> y.getState().getName().equals("Аннулирован"))
//                    .forEach(z -> System.out.println("Код:  " + z.getCode() +
//                            "    Дата истечения:  " + z.getDate_to().toString()));
//        }
//        }
//        int summ = 0;
//        System.out.println("Просроченные бумаги");
//        for (CompanyInfo ci : list) {
//            for (Securities sec: ci.getSecurities()) {
//                if (sec.getState().getName().equals("Аннулирован")) {
//                    System.out.println("Код:  " + sec.getCode() + "    Дата истечения:  " + sec.getDate_to().toString()
//                            + "   Название организации:  " + sec.getName_full());
//                    summ++;
//                }
//            }
//
//            }
//            System.out.println("Общее число просроченных бумаг :    " + summ);
//            System.out.println();
//            System.out.println();
//        }

            public void registAfter (ArrayList<CompanyInfo> list) {
            System.out.println("Введите дату:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String dateString = null;
            try {
                dateString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            LocalDate date = null;
            if(dateString.matches("[\\d]{2}[.][\\d]{2}[.][\\d]{4}")) {
                date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            }
            else if(dateString.matches("[\\d]{2}[.][\\d]{2}[,][\\d]{2}")) {
                date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM,yy"));
            }
            else if(dateString.matches("[\\d]{2}[.][\\d]{2}[.][\\d]{2}")) {
                date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd.MM.yy"));
            }
            else if(dateString.matches("[\\d]{2}[/][\\d]{2}[/][\\d]{4}")) {
                date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            else if(dateString.matches("[\\d]{2}[/][\\d]{2}[/][\\d]{2}")) {
                date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yy"));
            }
            else System.out.println("Не верный формат даты");

            final LocalDate dataF = date;


            list.stream().filter(x->x.getEgrul_date().isAfter(dataF))
            .forEach(x->System.out.println("Название компании:   " + x.getName_full() +
                            "     Дата регистрации:  " + x.getEgrul_date().toString()));

//                for (CompanyInfo ci : list) {
//                if (ci.getEgrul_date().isAfter(date)) {
//                    System.out.println("Название компании:   " + ci.getName_full() +
//                            "     Дата регистрации:  " + ci.getEgrul_date().toString());
//                }
//            }
      }

      public void getSecuritiesByCurrency (ArrayList<CompanyInfo> list) {
          System.out.println("Введите валюту:");
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

          String currency = null;
          try {
              currency = reader.readLine();
          } catch (IOException e) {
              e.printStackTrace();
          }
          final String currencyF = currency;

          list.stream()
                  .map(CompanyInfo::getSecurities)
                  .flatMap(Collection::stream)
                  .filter(x -> x.getCurrency().getCode().equals(currencyF))
                  .forEach(x -> System.out.println("ID:   " + x.getId() + "   Код:     " + x.getCode()));
      }

//          for (CompanyInfo ci : list) {
//               ci.getSecurities().stream().filter(x->x.getCurrency().getCode().equals(currencyF))
//                       .forEach(x->System.out.println("ID:   " + x.getId() + "   Код:     "  +  x.getCode()));
//               for (Securities sec: ci.getSecurities()) {
//                   if (sec.getCurrency().getCode().equals(currency)){
//                       System.out.println("ID:   " + sec.getId() + "   Код:     "  +  sec.getCode());
//               }
//              }
          }




