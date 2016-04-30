import java.util.*;

public class Word {
	private String mWord;
	private int mId;
	private static ArrayList<Word> dictionary = new ArrayList<Word>();
	private  static ArrayList<Definition> definitions = new ArrayList<Definition>();

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

	public Integer getId(){
    return mId;
  }//TESTED

  public static ArrayList<Definition> getAllDefinitions(){
  	return definitions;
  }
		
	

	public void addDefinition(Definition str){
		definitions.add(str);
	} // TESTED

	public Definition getNewDefinition(){
		return definitions.get(0);
	}

	public String getDefinition(){
		String stringDefReturn = "";
		for(Definition definition : definitions){
			stringDefReturn += definition.getDefinition() + "\n";
		}
		System.out.println(stringDefReturn);
		return stringDefReturn;
	}// TESTED



	public static ArrayList<Word> getAll(){
		System.out.println(dictionary);
		return dictionary;
	}//TESTED


	public static Word find(int id){
    try {
	  return dictionary.get(id - 1);
	} catch (IndexOutOfBoundsException e){
	  return null;
    }
  }

	
}