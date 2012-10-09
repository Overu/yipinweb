package com.yipin.web.bootstrap.server;

import com.google.inject.persist.PersistFilter;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;

import java.util.Iterator;
import java.util.ServiceLoader;

public class BootstrapServletModule extends ServletModule {

  @Override
  protected void configureServlets() {
    loadFromClasspath();
  }

  private void loadFromClasspath() {
    ServiceLoader<ServletModule> servletModules = ServiceLoader.load(ServletModule.class);
    Iterator<ServletModule> iterator = servletModules.iterator();

    while (iterator.hasNext()) {
      ServletModule servletModule = iterator.next();
      install(servletModule);
    }

  }
}
