import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

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
 

 
}
