package org.mule.modules.basic;

import org.mule.modules.basic.model.BasePojo;
import org.mule.modules.basic.model.Book;
import org.mule.modules.basic.model.Magazine;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.SubTypeMapping;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

/**
 * Basic Connector Description
 */
@Extension(name = "MultipleProviders")
@Configurations({ BasicExtensionConfig.class })
@ConnectionProviders({ BasicConnectionProvider.class, AnotherConnectionProvider.class })
@SubTypeMapping(baseType = BasePojo.class,subTypes = {Book.class, Magazine.class})
public class BasicExtension {

}