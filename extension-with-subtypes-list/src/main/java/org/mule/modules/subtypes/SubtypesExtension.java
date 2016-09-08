package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.FactoryA;
import org.mule.modules.subtypes.model.FactoryB;
import org.mule.modules.subtypes.model.IFactory;
import org.mule.modules.subtypes.model.Magazine;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.SubTypeMapping;

/**
 * Extension javadoc description
 */
@Extension(name = "SubtypesList", description = "Subtypes List Connector Description")
@Configurations({ SubtypesExtensionConfig.class })
@SubTypeMapping(baseType = BasePojo.class,subTypes = {Book.class, Magazine.class})
@SubTypeMapping(baseType = IFactory.class,subTypes = {FactoryA.class, FactoryB.class})
public class SubtypesExtension
{

}