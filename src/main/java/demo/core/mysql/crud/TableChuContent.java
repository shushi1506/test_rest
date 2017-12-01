package demo.core.mysql.crud;

import demo.ConfigHibernate;

import demo.core.impletemend.ResponeCreateChuContent;
import demo.entity.ChuContentEntity;
import demo.entity.ChuContentIntroNewFeed;
import demo.entity.ChuContentTitleEntity;
import org.hibernate.HibernateException;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Timestamp;
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

    public List<ChuContentTitleEntity>getTitleChuContent(){
        List<ChuContentTitleEntity> chuContentTitleEntities=new ArrayList<>();
        Session session = ConfigHibernate.getSession();
        try {
         List results=session.createSQLQuery("SELECT title,created,modified,hits,id FROM chu_content").list();
         for(Object o:results){
             Object[]element=(Object[])o;
             ChuContentTitleEntity chuContentTitleEntity=new ChuContentTitleEntity();
             chuContentTitleEntity.setTitle((String) element[0]);
             chuContentTitleEntity.setCreated((Timestamp) element[1]);
             chuContentTitleEntity.setModified((Timestamp) element[2]);
             chuContentTitleEntity.setHits((Integer) element[3]);
             chuContentTitleEntity.setId((Integer) element[4]);
             chuContentTitleEntities.add(chuContentTitleEntity);
         }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return chuContentTitleEntities;
    }
    public List<ChuContentIntroNewFeed>getNewFeedChuContent2(){
        List<ChuContentIntroNewFeed> chuContentIntroNewFeeds=new ArrayList<>();
        Session session = ConfigHibernate.getSession();
//        try {
//            return (List<ChuContentIntroNewFeed>) session.createQuery("select title,introtext,fulltext,created,urls from ChuContentEntity where id=69").list();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
        try {
            SQLQuery query=session.createSQLQuery("select title as title,introtext as introtext,fulltext1 , urls as urls ,created as created FROM chu_content");

            List <Object[]> results=query.list();
            for(Object[] element:results){
                ChuContentIntroNewFeed chuContentIntroNewFeed=new ChuContentIntroNewFeed();
                chuContentIntroNewFeed.setTitle((String) element[0]);
                chuContentIntroNewFeed.setCreated(String.valueOf((Timestamp) element[4]));
                chuContentIntroNewFeed.setIntrotext((String) element[1]);
                chuContentIntroNewFeed.setFulltext((String) element[2]);
                chuContentIntroNewFeed.setUrls((String) element[3]);
                chuContentIntroNewFeeds.add(chuContentIntroNewFeed);
            }
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return chuContentIntroNewFeeds;
    }
    public ResponeCreateChuContent createChuContent(ChuContentEntity chuContentEntity){
        Session session = ConfigHibernate.getSession();
        ResponeCreateChuContent res=new ResponeCreateChuContent();
        Transaction tx = null;
        Integer employeeID = null;
        try{
            tx = session.beginTransaction();
           session.save(chuContentEntity);
            tx.commit();
            res.setErrorCode(0);
            res.setErrorMessage("Success");
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
            res.setErrorCode(e.hashCode());
            res.setErrorMessage(e.getMessage());
        }finally {
            session.close();
        }
        return res;
    }
    public ResponeCreateChuContent upDateChuContent(ChuContentEntity chuContentEntity){
        Session session = ConfigHibernate.getSession();
        ResponeCreateChuContent res=new ResponeCreateChuContent();
        Transaction tx = null;
        Integer employeeID = null;
        try{
            tx = session.beginTransaction();
            session.update(chuContentEntity);
            tx.commit();
            res.setErrorCode(0);
            res.setErrorMessage("Success");
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
            res.setErrorCode(e.hashCode());
            res.setErrorMessage(e.getMessage());
        }finally {
            session.close();
        }
        return res;
    }
}
