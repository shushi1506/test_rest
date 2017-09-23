import demo.entity.ChuCategoriesEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List employees = session.createQuery("FROM ChuCategoriesEntity ").list();
            for (Iterator iterator = employees.iterator(); iterator.hasNext();){
                ChuCategoriesEntity employee = (ChuCategoriesEntity) iterator.next();
                System.out.print("First Name: " + employee.getId());
//                System.out.print("  Last Name: " + employee.getTitle());
//                System.out.println("  Salary: " + employee.getCreatedBy());
            }
            tx.commit();
        }catch (HibernateException e) {
//            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}