package org.mule.modules.soap;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.soap.HttpMessageDispatcherProvider;
import org.mule.runtime.extension.api.soap.annotation.Soap;
import org.mule.runtime.extension.api.soap.annotation.SoapMessageDispatcherProviders;

/**
 * Extension javadoc description
 */
@Extension(name = "Soap")
@Xml(prefix = "soap")
@Soap({BasicServiceProvider.class})
@SoapMessageDispatcherProviders(HttpMessageDispatcherProvider.class)
public class BasicExtension {

}