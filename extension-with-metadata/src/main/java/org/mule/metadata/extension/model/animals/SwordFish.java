/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.metadata.extension.model.animals;

import static org.mule.metadata.extension.model.animals.AnimalClade.FISH;

public class SwordFish implements Animal {

  @Override
  public AnimalClade clade() {
    return FISH;
  }
}
