package by.academy.it.db.Services;

import by.academy.it.pojos.ATM;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;

/**
 * Created by Sukora Stas.
 */
public class testInsertToSQL {
    private static final String path = "C:\\Users\\stasi\\Downloads\\www_ATM.xls";

    public String Insert(String sql) throws Exception {

        try {

            System.out.println("------- Проверка подключения к MySQL -------");

            Connection connection = null;
            try {
                Driver driver = new FabricMySQLDriver();
                DriverManager.registerDriver(driver);
                connection = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:2016/test",
                        "root", "");
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(ATM.class.getName()).log(Level.SEVERE,
                        null, ex);
            }

            if (null != connection) {
                System.out.println("------- Подключение установлено -------");
            } else {
                System.out.println("------- Подключение НЕ установлено -------");
            }

            connection.setAutoCommit(false);

            PreparedStatement pstm = null;
            FileInputStream input = new FileInputStream(path);
            POIFSFileSystem fs = new POIFSFileSystem(input);
            Workbook workbook;
            workbook = WorkbookFactory.create(fs);
            Sheet sheet = workbook.getSheetAt(0);
            Row row;
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                row = (Row) sheet.getRow(i);

                String bik = row.getCell(0).getStringCellValue();

                String namesofdivisions = row.getCell(1).getStringCellValue();

                String reg = row.getCell(2).getStringCellValue();

                String loc = row.getCell(3).getStringCellValue();

                String addr = row.getCell(4).getStringCellValue();

                String pos = row.getCell(5).getStringCellValue();

                String workanme = row.getCell(6).getStringCellValue();

                String valuta = row.getCell(7).getStringCellValue();

                String terminal = row.getCell(8).getStringCellValue();

                String coord = row.getCell(9).getStringCellValue();

                sql = "INSERT INTO ATM  VALUES(" + bik + ",'"
                        + namesofdivisions + "','"
                        + reg + "','"
                        + loc + "','"
                        + addr + "','"
                        + pos + "','"
                        + workanme + "','"
                        + valuta + "','"
                        + terminal + "','"
                        + coord + "')";

                pstm = connection.prepareStatement(sql);
                pstm.execute();
                System.out.println("Import rows " + i);
                System.out.println(sql);
            }
            connection.commit();
            pstm.close();
            connection.close();
            input.close();
            System.out.println("Success import excel to mysql table");


//            <--------------------------------------------------->

// ease output in console

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

        } catch (IOException e) {
        }


//            <--------------------------------------------------->
        return sql;
        // return path;
    }


}
