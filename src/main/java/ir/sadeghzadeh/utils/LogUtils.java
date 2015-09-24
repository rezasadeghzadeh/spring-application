package ir.sadeghzadeh.utils;


import org.apache.log4j.Logger;

/**
 * Created by reza on 9/18/15.
 */
public class LogUtils {
    private static final Logger logger = Logger.getLogger(LogUtils.class);

    public static void i(String tag,String message){
        logger.info( tag + " : " +message);
    }


}
