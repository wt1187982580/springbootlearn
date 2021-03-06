package com.lesson.demo11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingUtil {
    private final static Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void creatLogging() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
    }
}
