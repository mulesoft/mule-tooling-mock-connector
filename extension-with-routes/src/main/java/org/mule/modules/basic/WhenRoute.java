package org.mule.modules.basic;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.runtime.route.Route;

public class WhenRoute extends Route {

  @Parameter
  @Optional
  private boolean execute;

  @Parameter
  private String message;

  public String getMessage() {
    return message;
  }

  public boolean shouldExecute() {
    return execute;
  }
}