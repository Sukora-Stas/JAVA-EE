package by.academy.it.db;

import by.academy.it.db.exceptions.DaoException;
import by.academy.it.pojos.ATM;
import org.apache.log4j.Logger;

/**
 * Created by Sukora Stas.
 */
public class AtmDao extends BaseDao<ATM> {

    private static Logger log = Logger.getLogger(AtmDao.class);

    public void flush(Integer BIK,
                      String names_of_divisions,
                      String region,
                      String locality,
                      String addres,
                      String position,
                      String workingTime,
                      Boolean issuance_of_currency,
                      String terminal_ID,
                      String coordinats)
            throws DaoException {

    }

}
