package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Boîte à outils pour manipuler les objets Date
 */
public class DateUtils {

    /**
     * Retourne une version string formaté d'une date par rapport au pattern
     * @param pattern pattern à appliquer sur la string
     * @param date Date à formater
     * @return une string de la date sous le format en paramètre
     */
    public static String format(String pattern, Date date) {
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Retourne une string formater par défaut d'une date
     * @param date Date à formater
     * @return une string de la date formater par défaut dd/MM/yyyy HH:mm:ss
     */
    public static String formatDefaut(Date date) {
        return format("dd/MM/yyyy HH:mm:ss", date);
    }
}
