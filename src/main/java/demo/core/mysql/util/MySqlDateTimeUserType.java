package demo.core.mysql.util;

import com.mysql.jdbc.PreparedStatement;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;

public  class MySqlDateTimeUserType implements UserType {
    private static final int[] SQL_TYPES = {Types.DATE};

    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    public Class returnedClass() {
        return Date.class;
    }

    public boolean equals(Object x, Object y) throws HibernateException {
        if (x == y) {
            return true;
        } else if (x == null || y == null) {
            return false;
        } else {
            return x.equals(y);
        }
    }

    public int hashCode(Object arg0) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] strings, SessionImplementor sessionImplementor, Object o) throws HibernateException, SQLException {
        Date result = null;
        String strResult = resultSet.getString(strings[0]);

        if (strResult != null && !strResult.equals("0000-00-00 00:00:00"))
            result = resultSet.getDate(strings[0]);

        return result;
    }

    @Override
    public void nullSafeSet(java.sql.PreparedStatement preparedStatement, Object o, int i, SessionImplementor sessionImplementor) throws HibernateException, SQLException {
        if (o == null)
            preparedStatement.setString(i, "0000-00-00 00:00:00");
        else
            preparedStatement.setDate(i, (java.sql.Date) o);
    }




    public void nullSafeSet(PreparedStatement statement, Object value, int index) throws HibernateException, SQLException {
        // if the date is null set the value to "0000-00-00" else save the date

    }

    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    public boolean isMutable() {
        return false;
    }

    public Serializable disassemble(Object value) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return original;
    }
}