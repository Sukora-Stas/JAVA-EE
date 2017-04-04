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
import org.hibernate.Session;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;

/**
 * Created by Sukora Stas.
 */
public class AtmDao extends BaseDao<ATM> {

    private static Logger log = Logger.getLogger(AtmDao.class);



}
