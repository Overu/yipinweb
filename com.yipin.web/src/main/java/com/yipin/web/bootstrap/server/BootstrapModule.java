package com.yipin.web.bootstrap.server;

import com.google.gwt.inject.client.GinModule;
import com.google.gwt.inject.rebind.adapter.GinModuleAdapter;
import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.name.Names;

import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.ServiceLoader;

public class BootstrapModule extends AbstractModule {

  public static final String INT_PROPERTIES = "/ini.properties";
  public static Properties props = new Properties();

  @Override
  protected void configure() {
    try {
      URL url = BootstrapModule.class.getResource(INT_PROPERTIES);
      InputStream openStream = url.openStream();
      props.load(openStream);
      Names.bindProperties(binder(), props);
    } catch (Exception e) {
      e.printStackTrace();
    }
    loadFromClasspath();
  }

  private void loadFromClasspath() {
    ServiceLoader<Module> modules = ServiceLoader.load(Module.class);
    Iterator<Module> iterator = modules.iterator();
    while (iterator.hasNext()) {
      Module module = iterator.next();
      install(module);
    }

    ServiceLoader<GinModule> ginmodules = ServiceLoader.load(GinModule.class);
    Iterator<GinModule> iterator2 = ginmodules.iterator();
    while (iterator2.hasNext()) {
      GinModule ginmodule = iterator2.next();
      GinModuleAdapter module = new GinModuleAdapter(ginmodule);
      install(module);
    }
  }
}
