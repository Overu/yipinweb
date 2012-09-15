package com.yipin.web.bootstrap.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

public class BootstrapEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    BootstrapInjector bootstrapInjector = GWT.create(BootstrapInjector.class);
    bootstrapInjector.get();
  }

}
