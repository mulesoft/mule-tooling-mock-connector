package org.mule.modules.basic.route;

import org.mule.runtime.extension.api.stereotype.StereotypeDefinition;

import java.util.Optional;

public class AnotherStereotype implements StereotypeDefinition {

  @Override
  public String getName() {
    return "AnotherStereotype";
  }

  @Override
  public Optional<StereotypeDefinition> getParent() {
    return Optional.empty();
  }

}