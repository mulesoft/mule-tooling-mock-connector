package org.mule.modules.basic;

import static org.hamcrest.MatcherAssert.assertThat;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.functional.junit4.runners.ArtifactClassLoaderRunnerConfig;

import org.hamcrest.core.IsNull;
import org.junit.Test;

@ArtifactClassLoaderRunnerConfig(
        extensionBasePackage = "org.mule.modules.basic")
public class BasicExtensionTest extends MuleArtifactFunctionalTestCase
{
    @Test
    public void shouldNotExplodeLOL(){
        assertThat(flowRunner("dummy-flow").getFlowConstructName(), IsNull.notNullValue());
    }

    @Override
    protected String getConfigFile()
    {
        return "mule-config.xml";
    }
}
