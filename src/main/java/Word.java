import java.util.*;

public class Word {
	private String mWord;
	private int mId;

	private static ArrayList<Word> dictionary = new ArrayList<Word>();
	private ArrayList<Definition> definitions = new ArrayList<Definition>();

	// METHOD OVERLOADING ON CONSTRUCTORS //
	public Word(String word){
		mWord = word;
		dictionary.add(this);
		mId = dictionary.size();
	} // TESTED

	public Word(String word, Definition str){
		mWord = word;
		definitions.add(str);
		dictionary.add(this);
		mId = dictionary.size();
	}//TESTED

	// END OF CONSTRUCTOR METHOD SIGNATURE //

	public String getWord(){
		return mWord;
	}// TESTED

	// public static Word getWord(String word){
	// 	String wordString = "";
	// 	for(int i = 0; i <= definitions.length; i ++){
	// 		wordString += definition[i];
	// 		if(word.equals(wordString) == true){
	// 			return definition[i];
	// 		}
	// 	}
	// }
		
	

	public void addDefinition(Definition str){
		definitions.add(str);
	} // TESTED

	public String getDefinition(){
		String definitionString = "";
		for(Definition definition : definitions){
			definitionString += definition;
		}
		return definitionString;
	}// TESTED

	public static ArrayList<Word> getAll(){
		System.out.println(dictionary);
		return dictionary;
	}//TESTED


	public static Word find(int id){
    try {
    	System.out.println(dictionary.get(id - 1));
	  return dictionary.get(id - 1);
	} catch (IndexOutOfBoundsException e){
	  return null;
    }
  }

	
}