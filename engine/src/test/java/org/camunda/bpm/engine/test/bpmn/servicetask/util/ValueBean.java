package org.camunda.bpm.engine.test.bpmn.servicetask.util;

import java.io.Serializable;

/**
 * @author Christian Stettler
 */
public class ValueBean implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private final String value;

  public ValueBean(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}