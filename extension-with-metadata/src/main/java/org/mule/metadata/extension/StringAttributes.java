package org.mule.metadata.extension;

import java.io.Serializable;

public class StringAttributes implements Serializable {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}