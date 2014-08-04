package org.slf4j.impl;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

import weblogic.logging.NonCatalogLogger;

public class WeblogicLogger extends MarkerIgnoringBase {
  private static final long serialVersionUID = -3421174480648128875L;
  private final NonCatalogLogger logger;

  WeblogicLogger(final NonCatalogLogger logger) {
    this.logger = logger;
  }

  public boolean isTraceEnabled() {
    return true;
  }

  public void trace(final String msg) {
    logger.trace(msg);
  }

  public void trace(final String format, final Object arg) {
    final FormattingTuple ft = MessageFormatter.format(format, arg);
    logger.trace(ft.getMessage(), ft.getThrowable());
  }

  public void trace(final String format, final Object arg1, final Object arg2) {
    final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
    logger.trace(ft.getMessage(), ft.getThrowable());
  }

  public void trace(final String format, final Object... argArray) {
    final FormattingTuple ft = MessageFormatter.format(format, argArray);
    logger.trace(ft.getMessage(), ft.getThrowable());
  }

  public void trace(final String msg, final Throwable t) {
    logger.trace(msg, t);
  }

  public boolean isDebugEnabled() {
    return true;
  }

  public void debug(final String msg) {
    logger.debug(msg);
  }

  public void debug(final String format, final Object arg) {
    final FormattingTuple ft = MessageFormatter.format(format, arg);
    logger.debug(ft.getMessage(), ft.getThrowable());
  }

  public void debug(final String format, final Object arg1, final Object arg2) {
    final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
    logger.debug(ft.getMessage(), ft.getThrowable());
  }

  public void debug(final String format, final Object... argArray) {
    final FormattingTuple ft = MessageFormatter.format(format, argArray);
    logger.debug(ft.getMessage(), ft.getThrowable());
  }

  public void debug(final String msg, final Throwable t) {
    logger.debug(msg, t);
  }

  public boolean isInfoEnabled() {
    return true;
  }

  public void info(final String msg) {
    logger.info(msg);
  }

  public void info(final String format, final Object arg) {
    final FormattingTuple ft = MessageFormatter.format(format, arg);
    logger.info(ft.getMessage(), ft.getThrowable());
  }

  public void info(final String format, final Object arg1, final Object arg2) {
    final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
    logger.info(ft.getMessage(), ft.getThrowable());
  }

  public void info(final String format, final Object... argArray) {
    final FormattingTuple ft = MessageFormatter.format(format, argArray);
    logger.info(ft.getMessage(), ft.getThrowable());
  }

  public void info(final String msg, final Throwable t) {
    logger.info(msg, t);
  }

  public boolean isWarnEnabled() {
    return true;
  }

  public void warn(final String msg) {
    logger.warning(msg);
  }

  public void warn(final String format, final Object arg) {
    final FormattingTuple ft = MessageFormatter.format(format, arg);
    logger.warning(ft.getMessage(), ft.getThrowable());
  }

  public void warn(final String format, final Object arg1, final Object arg2) {
    final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
    logger.warning(ft.getMessage(), ft.getThrowable());
  }

  public void warn(final String format, final Object... argArray) {
    final FormattingTuple ft = MessageFormatter.format(format, argArray);
    logger.warning(ft.getMessage(), ft.getThrowable());
  }

  public void warn(final String msg, final Throwable t) {
    logger.warning(msg, t);
  }

  public boolean isErrorEnabled() {
    return true;
  }

  public void error(final String msg) {
    logger.error(msg);
  }

  public void error(final String format, final Object arg) {
    final FormattingTuple ft = MessageFormatter.format(format, arg);
    logger.error(ft.getMessage(), ft.getThrowable());
  }

  public void error(final String format, final Object arg1, final Object arg2) {
    final FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
    logger.error(ft.getMessage(), ft.getThrowable());
  }

  public void error(final String format, final Object... argArray) {
    final FormattingTuple ft = MessageFormatter.format(format, argArray);
    logger.error(ft.getMessage(), ft.getThrowable());
  }

  public void error(final String msg, final Throwable t) {
    logger.error(msg, t);
  }
}
