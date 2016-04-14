package Utils;

import java.util.Hashtable;

/**
 * Created by Hepei on 4/10/16.
 */
public class Utils {

    public static int mapper(String str){
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("LIV", 0);
        table.put("COM", 1);
        table.put("LAB", 2);
        table.put("STG", 3);
        table.put("WEL", 4);
        table.put("H&C", 5);
        return table.get(str);
    }


}
