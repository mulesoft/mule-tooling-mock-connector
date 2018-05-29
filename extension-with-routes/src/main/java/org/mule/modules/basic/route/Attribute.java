package org.mule.modules.basic.route;

import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class Attribute {

  @Parameter
  @Alias("attributeName")
  private String name;

  @Parameter
  private String whereValue;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWhereValue() {
    return whereValue;
  }

  public void setWhereValue(String whereValue) {
    this.whereValue = whereValue;
  }
}