package com.example.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class CvsUtils {
  public static String[] readNext(String filePath) {
    String[] strs = null;
    File file = new File(filePath);
    FileReader reader;
    try {
      reader = new FileReader(file);
      CSVReader csvReader = new CSVReader(reader);
      strs = csvReader.readNext();
      csvReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return strs;
  }

  public static List<String[]> readAll(String filePath) {
    List<String[]> list = null;
    File file = new File(filePath);
    FileReader reader;
    try {
      reader = new FileReader(file);
      CSVReader csvReader = new CSVReader(reader);
      list = csvReader.readAll();
      csvReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return list;
  }

  public static Boolean writeNext(String filePath, String[] params) {
    Boolean isTrue = false;
    File file = new File(filePath);
    Writer writer;
    try {
      writer = new FileWriter(file);
      CSVWriter csvWriter = new CSVWriter(writer, ',');
      csvWriter.writeNext(params);
      csvWriter.close();
      isTrue = true;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return isTrue;
  }

  public static Boolean writeAll(String filePath, List<String[]> params) {
    Boolean isTrue = false;
    File file = new File(filePath);
    Writer writer;
    try {
      writer = new FileWriter(file);
      CSVWriter csvWriter = new CSVWriter(writer, ',');
      csvWriter.writeAll(params);
      csvWriter.close();
      isTrue = true;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return isTrue;
  }

  public static Boolean writeAll(String filePath, ResultSet params, boolean includeColumnNames) {
    Boolean isTrue = false;
    File file = new File(filePath);
    Writer writer;
    try {
      writer = new FileWriter(file);
      CSVWriter csvWriter = new CSVWriter(writer, ',');
      csvWriter.writeAll(params, includeColumnNames);

      csvWriter.close();
      isTrue = true;
    } catch (IOException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return isTrue;
  }
}