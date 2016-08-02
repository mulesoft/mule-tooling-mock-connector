package org.mule.modules.subtypes;

import org.mule.modules.subtypes.model.BasePojo;
import org.mule.modules.subtypes.model.Book;
import org.mule.modules.subtypes.model.Magazine;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.SubTypeMapping;

/**
 * Extension javadoc description
 */
@Extension(name = "Subtypes", description = "Subtypes Connector Description")
@Operations({ SubtypesOperations.class })
@Configurations({ SubtypesExtensionConfig.class })
@SubTypeMapping(baseType = BasePojo.class,subTypes = {Book.class, Magazine.class})
public class SubtypesExtension
{

}
