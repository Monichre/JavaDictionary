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

	post("/words", (request, response) -> {
	ArrayList<Word> words = Word.getAll();
	HashMap model = new HashMap();
	String inputWord = request.queryParams("word");
	String inputDef = request.queryParams("definition");
	Definition definition = new Definition(inputDef);
	Word word = new Word(inputWord, definition); 
	model.put("words", words);
	model.put("template", "templates/home.vtl");
	return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());

	get("/definitions/:id", (request, response) -> {
	HashMap model = new HashMap();
	Word word = Word.find(Integer.parseInt(request.params(":id")));
	
	model.put("word", word);
	model.put("template", "templates/definitions.vtl");
	return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());

	post("/anotherDefinition", (request, response) -> {
	Word word = Word.find(Integer.parseInt(request.params(":id")));
	ArrayList<Definition> definitions = Word.getAllDefinitions();
	HashMap model = new HashMap();
	String newDefinition = request.queryParams("anotherDefinition");
	Definition anotherDefinition = new Definition(newDefinition);
	word.addDefinition(anotherDefinition);

	model.put("word", word);
	model.put("definitions", definitions);
	model.put("template", "templates/definitions.vtl");
	return new ModelAndView(model, layout);
	}, new VelocityTemplateEngine());
	
}



}
