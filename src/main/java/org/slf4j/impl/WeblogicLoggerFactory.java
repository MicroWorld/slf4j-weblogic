package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import weblogic.logging.NonCatalogLogger;

public class WeblogicLoggerFactory implements ILoggerFactory {
  private static final String SUBSYSTEM = "SLF4J";
  private final WeblogicLogger logger;

  public WeblogicLoggerFactory() {
    logger = new WeblogicLogger(new NonCatalogLogger(SUBSYSTEM));
  }

  public Logger getLogger(final String name) {
    return logger;
  }
}
