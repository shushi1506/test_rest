package demo.core.mysql.crud;

import demo.ConfigHibernate;

import demo.entity.ChuContentEntity;
import org.hibernate.HibernateException;


import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TableChuContent {

    public List<ChuContentEntity> getTableChuContentById(int id) {
        List chuContentList = new ArrayList<>();
        Session session = ConfigHibernate.getSession();
        try {
            return (List<ChuContentEntity>) session.createQuery("from ChuContentEntity " + "where id=" + id).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return chuContentList;
    }
    public List<ChuContentEntity> getTableChuContentById(int start,int end) {
        List chuContentList = new ArrayList<>();
        Session session = ConfigHibernate.getSession();
        try {
            return (List<ChuContentEntity>) session.createQuery("from ChuContentEntity " + "where id between " + start+" and "+end).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return chuContentList;
    }
    public List<ChuContentEntity> getTableChuContent() {
        List chuContentList = new ArrayList<>();
        Session session = ConfigHibernate.getSession();
        try {
            return (List<ChuContentEntity>) session.createQuery("from ChuContentEntity ").list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return chuContentList;
    }

}
