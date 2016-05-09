import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @After
  public void tearDown() {
    Word.clear();
  }

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("The Epicodus Dictionary");
  }

  @Test
  public void postsInputToHomeVtl() {
    goTo("http://localhost:4567/");
    fill("#word").with("word");
    fill("#definition").with("example definition");
    submit(".btn");
    assertThat(pageSource()).contains("word");
  }

  @Test
  public void wordPathRendersDefinitionVtl() {
    goTo("http://localhost:4567/");
    fill("#word").with("word");
    fill("#definition").with("example definition");
    submit(".btn");
    assertThat(pageSource()).contains("word");
    click("a", withText("word"));
    assertThat(pageSource()).contains("example definition");
    click("a", withText("Go Back"));
    assertThat(pageSource()).contains("The Epicodus Dictionary");
  }

  @Test
  public void addDefinitionPathRendersonDefinitionVtl() {
    goTo("http://localhost:4567/");
    fill("#word").with("word");
    fill("#definition").with("example definition");
    submit(".btn");
    assertThat(pageSource()).contains("word");
    click("a", withText("word"));
    assertThat(pageSource()).contains("example definition");
    fill("#anotherDefinition").with("another example definition");
    submit(".btn");
    assertThat(pageSource()).contains("another example definition");
  }
}
