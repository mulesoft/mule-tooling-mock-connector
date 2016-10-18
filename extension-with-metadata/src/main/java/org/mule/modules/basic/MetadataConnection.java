package org.mule.modules.basic;

import java.util.Arrays;
import java.util.List;

public class MetadataConnection {

  public static final String PERSON = "PERSON";
  public static final String CAR = "CAR";
  public static final String HOUSE = "HOUSE";
  public static final String ATTRIBUTES = "ATTRIBUTES";

  public List<String> getEntities() {
    return Arrays.asList(PERSON, CAR, HOUSE);
  }

}