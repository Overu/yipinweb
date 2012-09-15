package com.yipin.web.war.client.ui;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.inject.Inject;

public class TextPanel extends Composite {

  @Inject
  FlowPanel f2;

  FlowPanel f1 = new FlowPanel();

  public TextPanel() {
    initWidget(f1);
    new Timer() {
      @Override
      public void run() {
        start();
      }
    }.schedule(1);
  }

  private void start() {
    f2.getElement().setInnerHTML("asfd");
    f1.add(f2);
  }

}
