package tech.fastj.logging;

import org.slf4j.Logger
import org.slf4j.LoggerFactory;

public class FastJLogger {
    public static final Logger LOGGER = LoggerFactory.getLogger(FastJLogger.class);

    public static info(String infoMessage, Object... args){
        LOGGER.info(infoMessage, args);
    }

    public static error(Stirng errorMessage, Object... args){
        LOGGER.error(errorMessage, args);
    }

    public static warning(Stirng warningMessage, Object... args){
        LOGGER.warn(warningMessage, args);
    }

    public static info(String infoMessage, Exception e){
        LOGGER.info(infoMessage, e);
    }

    public static error(Stirng errorMessage, Exception e){
        LOGGER.error(errorMessage, e);
    }

    public static warning(Stirng warningMessage, Exception e){
        LOGGER.warn(warningMessage, e);
    }
}
                                    