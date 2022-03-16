package com.example.sample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Section8_5 {
    public static void main(String[] args) {
        Log logger = LogFactory.getLog(Main.class);
        if(args.length !=2 ){
            logger.error("引数の数が異常"+ args.length);
        }
    }
}
