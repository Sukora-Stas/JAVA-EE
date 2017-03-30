package by.academy.it.db;

import by.academy.it.db.exceptions.DaoException;
import by.academy.it.pojos.Person;
import by.academy.it.pojos.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import static by.academy.it.loader.PersonLoader.util;

/**
 * Created by Sukora Stas.
 */
public class UserDao extends BaseDao<User> {

    private static Logger log = Logger.getLogger(UserDao.class);

    public void flush(Integer id, String newName) throws DaoException {
        try {
            Session session = util.getSession();
            User p = (User)session.get(User.class, id);
            System.out.println(p);
            p.setName(newName);
            System.out.println(p);
            session.flush();
            System.out.println(p);
        } catch (HibernateException e) {
            log.error("Error Flush person" + e);
            throw new DaoException(e);
        }

    }
}
