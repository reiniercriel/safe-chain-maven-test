package org.aikido.safechain.testplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Minimal no-op goal used only for Safe Chain testing.
 */
@Mojo(name = "ping", defaultPhase = LifecyclePhase.VALIDATE, threadSafe = true)
public class PingMojo extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException {
        getLog().info("safe-chain-test-plugin:ping executed (test fixture)");
    }
}
