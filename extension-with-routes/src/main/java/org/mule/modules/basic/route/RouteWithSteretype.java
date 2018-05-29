package org.mule.modules.basic.route;

import org.mule.runtime.extension.api.annotation.param.stereotype.AllowedStereotypes;

@AllowedStereotypes(MyStereotypeForOnlyProcessors.class)
public class RouteWithSteretype extends WhenRoute {

}