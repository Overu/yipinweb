package com.yipin.web.war.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import com.yipin.web.war.client.ui.TextPanel;

public class YipinWebClientModule extends AbstractGinModule {

  @Singleton
  public static class Binder {

    @Inject
    public Binder(final TextPanel t) {
      RootPanel.get().add(t);
    }

  }

  @Override
  protected void configure() {
    bind(Binder.class).asEagerSingleton();
  }

}
