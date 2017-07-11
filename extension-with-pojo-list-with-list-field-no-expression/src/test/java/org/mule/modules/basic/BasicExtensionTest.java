package org.mule.modules.basic;

import static org.hamcrest.MatcherAssert.assertThat;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;

import org.hamcrest.core.IsNull;
import org.junit.Ignore;
import org.junit.Test;

public class BasicExtensionTest extends MuleArtifactFunctionalTestCase
{
    @Test
    @Ignore("Check why the XML is not being loaded")
    public void shouldNotExplodeLOL(){
        assertThat(flowRunner("dummy-flow").getFlowConstructName(), IsNull.notNullValue());
    }

    @Override
    protected String getConfigFile()
    {
        return "mule-config.xml";
    }
}