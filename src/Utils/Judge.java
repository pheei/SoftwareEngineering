package Utils;

import java.awt.*;

public class Judge {

    //return 0 means normal. return 1 means yellow, 2  means red, 3 means
    public static Color temp(String value, int index){
        if (value.equals("null")){
            return Color.green;
        }
        value = value.substring(0, value.length() - 1);
        double temp = Double.valueOf(value);
        if (index <= 3){
            if (temp < 0.93 * 72 || temp > 1.07 * 72){
                return Color.black;
            }
            if (temp < 0.95 * 72 || temp > 1.05 * 72){
                return Color.red;
            }
            if (temp < 0.98 * 72 || temp > 1.02 * 72){
                return Color.yellow;
            }
            return Color.green;
        } else if (index == 4){
            if (temp < 0.93 * 35 || temp > 1.07 * 72){
                return Color.black;          }
            if (temp < 0.95 * 35 || temp > 1.05 * 72){
                return Color.red;
            }
            if (temp < 0.98 * 35 || temp > 1.02 * 72){
                return Color.yellow;
            }
            return Color.green;
        } else {
            if (temp < 0.93 * 72 || temp > 1.07 * 90){
                return Color.black;
            }
            if (temp < 0.95 * 72 || temp > 1.05 * 90){
                return Color.red;
            }
            if (temp < 0.98 * 72 || temp > 1.02 * 90){
                return Color.yellow;
            }
            return Color.green;
        }
    }

    /* normal is 45%, 0 means normal, 1 means yellow, 2 means red, 3 means
    * alarm
    */
    public static Color humid(String value, int index){
        if (value.equals("null")){
            return Color.green;
        }
        value = value.substring(0, value.length() - 1);
        double humid = Double.valueOf(value);
        if (index == 4){
            if (humid < 0.93 * 45 || humid > 1.07 * 75){
                return Color.black;
            }
            if (humid < 0.95 * 45 || humid > 1.05 * 75){
                return Color.red;
            }
            if (humid < 0.98 * 45 || humid > 1.02 * 75){
                return Color.yellow;
            }
            return Color.green;
        } else {
            if (humid < 0.93 * 45 || humid > 1.07 * 45){
                return Color.black;
            }
            if (humid < 0.95 * 45 || humid > 1.05 * 45){
                return Color.red;
            }
            if (humid < 0.98 * 45 || humid > 1.02 * 45){
                return Color.yellow;
            }
            return Color.green;
        }
    }

    //0 means normal, 1 means yellow, 2 means read, 3 means alarm
    public Color oxy(String value){
        if (value.equals("null")){
            return Color.green;
        }
        value = value.substring(0, value.length() - 1);
        double oxy = Double.valueOf(value);
        if (oxy < 0.93 * 21 || oxy > 1.07 * 21){
            return Color.black;
        }
        if (oxy < 0.95 * 21 || oxy > 1.05 * 21){
            return Color.red;
        }
        if (oxy < 0.98 * 21 || oxy > 1.02 * 21){
            return Color.yellow;
        }
        return Color.green;
    }
    //0 means normal, 1 means yellow, 2 means red, 3 means alarm
    public static Color pres(String value){
        if (value.equals("null")){
            return Color.green;
        }
        value = value.substring(0, value.length() - 1);
        double pres = Double.valueOf(value);
        if (pres < 0.93 * 14.5 || pres > 1.07 * 14.5){
            return Color.black;
        }
        if (pres < 0.95 * 14.5 || pres > 1.05 * 14.5){
            return Color.red;
        }
        if (pres < 0.98 * 14.5 || pres > 1.02 * 14.5){
            return Color.yellow;
        }
        return Color.green;
    }
    /* 0 means normal, 1 means alarm.
    *  default value of smoke is the String of "null". if no alarm, don't change the
    * default value. If change, alarm.
     */
    public static Color smoke(String value){
        if (value.equals("null")){
            return Color.green;
        }
        return Color.black;
    }
    public static Color gas(String value){
        if (value.equals("null")){
            return Color.green;
        }
        return Color.black;
    }
    //normal 28, 0-normal, 1-yellow, 2-red, 3-alarm
    public static Color external(String value){
        if (value.equals("null")){
            return Color.green;
        }
        value = value.substring(0, value.length() - 1);
        double external = Double.valueOf(value);
        if (external < 0.93 * 28 || external > 1.07 * 28){
            return Color.black;
        }
        if (external < 0.95 * 28 || external > 1.05 * 28){
            return Color.red;
        }
        if (external < 0.98 * 28 || external > 1.02 * 28){
            return Color.yellow;
        }
        return Color.green;
    }
}
