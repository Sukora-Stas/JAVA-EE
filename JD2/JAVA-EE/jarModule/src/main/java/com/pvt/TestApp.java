package com.pvt;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Row;

/**
 * Created by Sukora Stas.
 */
public class TestApp {

    public static void main(String[] args) throws Exception {

        try {

            System.out.println("------- Проверка подключения к MySQL -------");

            Connection connection = null;
            try {
                Driver driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);
                connection = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:2016/test",
                        "root","");
            } catch (SQLException ex) {
                Logger.getLogger(TestApp.class.getName()).log(Level.SEVERE,
                        null, ex);
            }

            if(null != connection) {
                System.out.println("------- Подключение установлено -------");
            } else {
                System.out.println("------- Подключение НЕ установлено -------");
            }

            connection.setAutoCommit(false);
            PreparedStatement pstm = null;
            FileInputStream input = new FileInputStream("C:\\Users\\stasi\\Downloads\\www_ATM.xls");
            POIFSFileSystem fs = new POIFSFileSystem(input);
            Workbook workbook;
            workbook = WorkbookFactory.create(fs);
            Sheet sheet = workbook.getSheetAt(0);
            Row row;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = (Row) sheet.getRow(i);
                String name = row.getCell(0).getStringCellValue();
                String add = row.getCell(1).getStringCellValue();

                String contact = row.getCell(2).getStringCellValue();

                String email = row.getCell(3).getStringCellValue();

                String sql = "INSERT INTO employee (name, address, contactNo, email) VALUES('" + name + "','" + add + "'," + contact + ",'" + email + "')";
                pstm = connection.prepareStatement(sql);
                pstm.execute();
                System.out.println("Import rows " + i);
            }
            connection.commit();
            pstm.close();
            connection.close();
            input.close();
            System.out.println("Success import excel to mysql table");


//            <--------------------------------------------------->



//            InputStream in = new FileInputStream("C:\\Users\\stasi\\Downloads\\www_ATM.xls");
//            // Внимание InputStream будет закрыт
//            // Если нужно не закрывающий см. JavaDoc по POIFSFileSystem :  http://goo.gl/1Auu7
//            HSSFWorkbook wb = new HSSFWorkbook(in);
//
//            ExcelExtractor extractor = new ExcelExtractor(wb);
//            extractor.setFormulasNotResults(false); // Считать формулы
//            extractor.setIncludeSheetNames(true);
//            String text = extractor.getText();
//
//            System.out.println(text);
//
//
//
        } catch (IOException e) {
        }


//            <--------------------------------------------------->

    }


}
