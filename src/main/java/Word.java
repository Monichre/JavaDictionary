import java.util.*;

public class Word {
	private String mWord;
	private ArrayList<Definition> definitions = new ArrayList<Definition>();

	public Word(String word){
		mWord = word;
	}

	public void addDefinition(Definition str){
		definitions.add(str);
	
	}

	public String getDefinition(){
		String definitionString = "";
		for(Definition definition : definitions){
			definitionString += definition;
		}
		System.out.println(definitionString);
		return definitionString;
	}

	
}