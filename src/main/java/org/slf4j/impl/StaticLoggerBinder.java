package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {
  public static String REQUESTED_API_VERSION = "1.7"; // !final
  private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
  private static final String loggerFactoryClassStr = WeblogicLoggerFactory.class.getName();
  private final ILoggerFactory loggerFactory;

  public static final StaticLoggerBinder getSingleton() {
    return SINGLETON;
  }

  private StaticLoggerBinder() {
    loggerFactory = new WeblogicLoggerFactory();
  }

  public ILoggerFactory getLoggerFactory() {
    return loggerFactory;
  }

  public String getLoggerFactoryClassStr() {
    return loggerFactoryClassStr;
  }
}
