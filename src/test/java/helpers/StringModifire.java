package helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringModifire {
    public static String getUniqueString(String str){
        return str + new SimpleDateFormat("dd-MM-yyyy-HHmmss").format(new Date());
    }
}
