package sample.plugin;

/**
 * To use the plugin:
 * <p>{@code mvn groupId:artifactId:version:goal}
 * <p>{@code mvn sample.plugin:hello-maven-plugin:1.0-SNAPSHOT:sayhi}
 * <p>or
 * <p>{@code mvn sample.plugin:hello-maven-plugin:sayhi} (latest version - local repository)
 * <p>or
 * <p>{@code mvn hello:sayhi}
 *
 * @author cleberson
 * @see <a
 * href="https://maven.apache.org/guides/plugin/guide-java-plugin-development.html#shortening-the-command-line">Use of
 * plugin</a>
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Using a custom maven plugin!");
  }
}