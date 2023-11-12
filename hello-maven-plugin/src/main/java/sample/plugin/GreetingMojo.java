package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author cleberson
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {

  /**
   * The greeting to display
   */
  @Parameter(property = "sayhi.greeting", defaultValue = "Hello World to ${project.artifactId}!")
  private String greeting;
  private String option0;
  private String option1;

  @Parameter(property = "sayhi.options", defaultValue = "ZERO,ONE")
  public void setOptions(String[] options) {
    // we can do something more with provided parameter
    this.option0 = options[0];
    this.option1 = options[1];
  }

  @Override
  public void execute() throws MojoExecutionException {
    getLog().info("Gretting: %s, Option_1: %s, Option_2: %s".formatted(this.greeting, this.option0, this.option1));
  }

}
