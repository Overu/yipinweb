package com.yipin.web.bootstrap.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

// @GinModules(value = {YipinWebGinModule.class})
@GinModules(value = {BootstrapGinModule.class}, properties = {"gin.module"})
public interface BootstrapInjector extends Ginjector {

  GWT get();

}
