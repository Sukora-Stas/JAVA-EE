package by.academy.it.db;

import by.academy.it.db.exceptions.DaoException;
import by.academy.it.pojos.ATM;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import org.apache.log4j.Logger;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.hibernate.HibernateException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;

/**
 * Created by Sukora Stas.
 */
public class AtmDao extends BaseDao<ATM> {

    private static Logger log = Logger.getLogger(AtmDao.class);

//    public void flush(
////            Integer BIK,
////                      String names_of_divisions,
////                      String region,
////                      String locality,
////                      String addres,
////                      String position,
////                      String workingTime,
////                      Boolean issuance_of_currency,
////                      String terminal_ID,
////                      String coordinats
//    )
//            throws DaoException {
//
//        try {
//            System.out.println("------- Проверка подключения к MySQL -------");
//
//            Connection connection = null;
//            try {
//                Driver driver = new FabricMySQLDriver();
//                DriverManager.registerDriver(driver);
//                connection = DriverManager.getConnection(
//                        "jdbc:mysql://127.0.0.1:2016/personDB",
//                        "root", "");
//            } catch (SQLException ex) {
//                java.util.logging.Logger.getLogger(ATM.class.getName()).log(Level.SEVERE,
//                        null, ex);
//            }
//
//            if (null != connection) {
//                System.out.println("------- Подключение установлено -------");
//            } else {
//                System.out.println("------- Подключение НЕ установлено -------");
//            }
//
//            connection.setAutoCommit(false);
//            PreparedStatement pstm = null;
//            FileInputStream input = new FileInputStream("C:\\Users\\stasi\\Downloads\\www_ATM.xls");
//            POIFSFileSystem fs = new POIFSFileSystem(input);
//            Workbook workbook;
//            workbook = WorkbookFactory.create(fs);
//            Sheet sheet = workbook.getSheetAt(0);
//            Row row;
//            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//                row = (Row) sheet.getRow(i);
//
//                double bik = row.getCell(0).getNumericCellValue();
//
//                String namesofdivisions = row.getCell(1).getStringCellValue();
//
//                String reg = row.getCell(2).getStringCellValue();
//
//                String loc = row.getCell(3).getStringCellValue();
//
//                String addr = row.getCell(4).getStringCellValue();
//
//                String pos = row.getCell(5).getStringCellValue();
//
//                String workanme = row.getCell(6).getStringCellValue();
//
//                Boolean valuta = row.getCell(7).getBooleanCellValue();
//
//                String terminal = row.getCell(8).getStringCellValue();
//
//                double coord = row.getCell(9).getNumericCellValue();
//
//                String sql = "INSERT INTO ATM  VALUES(" + bik + ",'"
//                        + namesofdivisions + "','"
//                        + reg + "','"
//                        + loc + "','"
//                        + addr + "','"
//                        + pos + "','"
//                        + workanme + "','"
//                        + valuta + "','"
//                        + terminal + "','"
//                        + coord + "')";
//                pstm = connection.prepareStatement(sql);
//                pstm.execute();
//                System.out.println("Import rows " + i);
//            }
//            connection.commit();
//            pstm.close();
//            connection.close();
//            input.close();
//            System.out.println("Success import excel to mysql table");
//
//
//        } catch (HibernateException e) {
//            log.error("Error Flush person" + e);
//            throw new DaoException(e);
//        } catch (IOException e) {
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }

}
