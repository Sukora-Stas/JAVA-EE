package by.academy.it.loader;
import by.academy.it.pojos.ATM;
import by.academy.it.pojos.Person;
import by.academy.it.pojos.User;
import by.academy.it.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.text.SimpleDateFormat;
import java.util.Locale;


import static by.academy.it.loader.MenuLoader.menu;
public class PersonLoader {
    public static HibernateUtil util = null;
    private static final String path = "C:\\Users\\stasi\\Downloads\\www_ATM.xls";
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        util = HibernateUtil.getHibernateUtil();
        Person person = new Person(null, 35, "Yuli", "Slabko");
        User user = new User(19,"Stas","Sukora","Igorevich");

        ATM atm = new ATM();

        Session session = util.getSession();
        session.saveOrUpdate(person);
        session.saveOrUpdate(user);

        System.out.println("Start Menu");
        menu();
    }
}


