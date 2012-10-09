package com.yipin.web.bootstrap.jpa;

import com.google.inject.AbstractModule;
import com.google.inject.persist.jpa.JpaPersistModule;

public class JpaModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new JpaPersistModule("myFirstJpaUnit"));
  }

}
