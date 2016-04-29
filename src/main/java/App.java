import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

	get("/", (request, response) -> {
	ArrayList<Word> words = Word.getAll();
	HashMap model = new HashMap();
	model.put("words", words);
	model.put("template", "templates/home.vtl");
	return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());

	// post("/words", (request, response) -> {

	// HashMap model = new HashMap();
	// ArrayList<Word> words = Word.getAll();
	
}

}
