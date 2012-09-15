package com.yipin.web.bootstrap.server;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

import java.util.Iterator;
import java.util.ServiceLoader;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BootstrapServletContextListener extends GuiceServletContextListener {

  private ServiceLoader<ServletContextListener> servletContextListener;

  @Override
  public void contextDestroyed(final ServletContextEvent servletContextEvent) {
    super.contextDestroyed(servletContextEvent);
    if (servletContextEvent != null) {
      Iterator<ServletContextListener> iterator = servletContextListener.iterator();
      while (iterator.hasNext()) {
        ServletContextListener next = iterator.next();
        next.contextDestroyed(servletContextEvent);
      }
    }
  }

  @Override
  protected Injector getInjector() {
    return Guice.createInjector(new BootstrapModule(), new BootstrapServletModule());
  }
}
