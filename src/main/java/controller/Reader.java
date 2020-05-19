package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JUVA on 19.05.2020.
 */
public class Reader {
    private String fileName;

    public Reader() {
        Reader reader = new Reader();
        reader.setFileName();

    }

    public String getFileName() {
        return fileName;
    }

    public String getContents() {
        return contents;
    }

    public void setFileName() {
        try
        {
            System.out.println("Введите путь к файлу:");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            fileName = reader.readLine();
        }
        catch (IOException e) {
            System.out.println("Некорректный путь к файлу");
        }
    }



    private String contents = readUsingBufferedReader(fileName);

    private  String readUsingBufferedReader(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }
        catch (IOException e) {
            System.out.println("Файл не найден");

        }
        return stringBuilder.toString();
    }

}
