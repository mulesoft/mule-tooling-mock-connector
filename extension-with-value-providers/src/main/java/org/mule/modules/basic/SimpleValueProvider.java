package org.mule.modules.basic;

import org.mule.runtime.extension.api.values.ValueBuilder;
import org.mule.runtime.api.value.Value;
import org.mule.runtime.extension.api.values.ValueProvider;

import java.util.Set;

public class SimpleValueProvider implements ValueProvider {

  @Override
  public Set<Value> resolve() {
    return ValueBuilder.getValuesFor("channel1", "channel2", "channel3");
  }

}
