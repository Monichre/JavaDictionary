import java.util.*;

public class Word {
	private String mWord;
	private ArrayList<Definition> definitions = new ArrayList<Definition>();

	public Word(String word){
		mWord = word;

	}

	public Definition addDefinition(Definition str){
		definitions.add(str);
		System.out.println(definitions);
		Definition wordNeeded = definitions.get(0);
		
		return wordNeeded;
	}

	
}