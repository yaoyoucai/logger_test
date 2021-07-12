package test;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * @author huanyao
 * @version 1.0
 * @ClassName CustomLoggerFactory.java
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2021/7/12 4:14 下午
 */
public class CustomLoggerFactory implements ILoggerFactory {
    @Override
    public Logger getLogger(String name) {
        return new CustomLogger();
    }
}
