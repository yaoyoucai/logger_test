package test;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName CustomSLF4JProviders.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/7/12 4:10 下午
 */
public class CustomSLF4JProviders implements SLF4JServiceProvider {
    private ILoggerFactory loggerFactory;
    public static String REQUESTED_API_VERSION = "2.0.99"; // !final
    @Override
    public ILoggerFactory getLoggerFactory() {
        return loggerFactory;
    }

    @Override
    public IMarkerFactory getMarkerFactory() {
        return null;
    }

    @Override
    public MDCAdapter getMDCAdapter() {
        return null;
    }

    @Override
    public String getRequesteApiVersion() {
        return REQUESTED_API_VERSION;
    }

    @Override
    public void initialize() {
        loggerFactory = new CustomLoggerFactory();
    }
}
