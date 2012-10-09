package com.yipin.web.bootstrap.servlet;

import com.google.inject.persist.PersistFilter;
import com.google.inject.servlet.ServletModule;

public class JpaServletModule extends ServletModule {

  @Override
  protected void configureServlets() {
    filter("/*").through(PersistFilter.class);
  }

}
