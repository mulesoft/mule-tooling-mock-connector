package org.mule.modules.basic.route;

import org.mule.runtime.extension.api.annotation.param.stereotype.AllowedStereotypes;

@AllowedStereotypes(AnotherStereotype.class)
public class RouteWithAnotherStereotype extends OtherwiseRoute
{
}