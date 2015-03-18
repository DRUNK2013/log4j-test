package org.drunk;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
  public void test(){
    Logger logger = Logger.getLogger(App.class);
    PropertyConfigurator.configure("log4j.properties");
    logger.info("Hello drunk.");
    try{
        int i = 1/0;
    }catch(Exception e){
        logger.error("error_msg:",e);
    }
  }
}

