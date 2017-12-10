package utilidades;

/**
 *
 * @author Alisoft
 */
public class Conversores {

    public static java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
}
