package by.academy.it.loader;

import by.academy.it.db.PersonDao;
import by.academy.it.db.UserDao;
import by.academy.it.db.exceptions.DaoException;
import by.academy.it.pojos.Person;
import by.academy.it.pojos.User;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class MenuLoader {
    private static Logger log = Logger.getLogger(MenuLoader.class);
    public static Boolean needMenu = true;
    private static PersonDao personDao = null;
    private static UserDao userDao = null;

    public static void menu() throws DaoException {
        Person person = null;
        User user = null;
        while (needMenu) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    break;
                case 2:
                    person = findPerson();
                    break;
                case 3:
                    person = null;
                    person = createPerson(person);
                    getPersonDao().saveOrUpdate(person);
                    break;
                case 4:
                    person = createPerson(person);
                    getPersonDao().saveOrUpdate(person);
                    break;
                case 5:
                    person = loadPerson();
                    break;
                case 6:
                    flushSession();
                    break;
                case 7:
                    user = findUser();
                    break;
                case 8:
                    user = null;
                    user = createUser(user);
                    getUserDao().saveOrUpdate(user);
                    break;
                case 9:
                    user = createUser(user);
                    getUserDao().saveOrUpdate(user);
                    break;
                case 10:
                    user = loadUser();
                    break;
                case 11:
                    flushSessionUser();
                    break;
            }
            needMenu = true;
        }
    }

    private static void printMenu() {
        System.out.println(" Options:");
        System.out.println("        0. Exit");
        System.out.println("        1. Delete Person");
        System.out.println("        2. Get Person");
        System.out.println("        3. Save Person");
        System.out.println("        4. Update Person");
        System.out.println("        5. Load Person");
        System.out.println("        6. Flush example");
        System.out.println("                         ");
        System.out.println("        7. Get User");
        System.out.println("        8. Save User");
        System.out.println("        9. Update User");
        System.out.println("        10. Load User");
        System.out.println("        11. Flush example User");
    }

    public static Person createPerson(Person person) {
        System.out.println("Please enter person description:");
        System.out.print("Name - ");

        if (person == null) {
            person = new Person();
        }
        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();
        person.setName(parameter);
        System.out.print("Surname - ");
        parameter = scanner.nextLine();
        person.setSurname(parameter);
        System.out.print("Age - ");
        person.setAge(scanner.nextInt());
        return person;
    }

    public static User createUser(User user) {
        System.out.println("Please enter person description:");
        System.out.print("Name - ");

        if (user == null) {
            user = new User();
        }
        Scanner scanner = new Scanner(System.in);
        String parameter = scanner.nextLine();
        user.setName(parameter);
        System.out.print("Surname - ");
        parameter = scanner.nextLine();
        user.setSurname(parameter);
        System.out.print("lastname - ");
        parameter = scanner.nextLine();
        user.setLastName(parameter);
        System.out.print("age - ");
        user.setAge(scanner.nextInt());
        return user;
    }

    public static Person findPerson() {
        System.out.println("Get by Id. Please enter person id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        Person person = null;
        Integer id = scanner.nextInt();
        try {
            person = getPersonDao().get(id);
        } catch (DaoException e) {
            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(person);
        return person;
    }

    public static User findUser() {
        System.out.println("Get by Id. Please enter person id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        User user = null;

        Integer id = scanner.nextInt();
        try {
            user = getUserDao().get(id);
        } catch (DaoException e) {

            log.error(e, e);
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(user);

        return user;

    }

    public static Person loadPerson() {
        System.out.println("Load by Id. Please enter person id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        Person person = null;
        Integer id = scanner.nextInt();
        try {
            person = getPersonDao().get(id);
        } catch (DaoException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.print(person);
        return person;
    }

    public static User loadUser() {
        System.out.println("Load by Id. Please enter person id:");
        System.out.print("Id - ");

        Scanner scanner = new Scanner(System.in);
        User user = null;
        Integer id = scanner.nextInt();
        try {
            user = getUserDao().get(id);
        } catch (DaoException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            log.error("Unable find person:", e);
        }
        System.out.println(user);

        return user;
    }

    public static void flushSession() {
        System.out.println("Please enter person id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        Person person = null;
        Integer id = scanner.nextInt();
        System.out.println("Please enter new Name:");
        System.out.print("New Name - ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            getPersonDao().flush(id, name);
        } catch (DaoException e) {
            log.error("Unable run flush example");
        }
    }

    public static void flushSessionUser() {
        System.out.println("Please enter person id:");
        System.out.print("Id - ");
        Scanner scanner = new Scanner(System.in);
        User user = null;
        Integer id = scanner.nextInt();
        System.out.println("Please enter new Name:");
        System.out.print("New Name - ");
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        try {
            getUserDao().flush(id, name);
        } catch (DaoException e) {
            log.error("Unable run flush example");
        }
    }

    public static PersonDao getPersonDao() {
        if (personDao == null) {
            personDao = new PersonDao();
        }
        return personDao;
    }

    public static UserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserDao();
        }
        return userDao;
    }
}