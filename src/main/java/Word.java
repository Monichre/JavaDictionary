import java.util.*;

public class Word {
	private String mWord;
	private int mId;
	private static ArrayList<Word> dictionary = new ArrayList<Word>();
	private ArrayList<Definition> mDefinitions = new ArrayList<Definition>();

	
	public Word(String word){
		mWord = word;
		dictionary.add(this);
		mId = dictionary.size();
	} 

	public Word(String word, Definition str){
		mWord = word;
		mDefinitions.add(str);
		dictionary.add(this);
		mId = dictionary.size();
	}

	public String getWord(){
		return mWord;
	}

	public Integer getId(){
    	return mId;
    }
  	
	public ArrayList<Definition> getAllDefinitions(){
		return mDefinitions;
	}
		
	public void addDefinition(Definition str){
		mDefinitions.add(str);
	} 

	public String getDefinition(){
		String stringDefReturn = "";
		for(Definition definition : mDefinitions){
			stringDefReturn += definition.getDefinition();
	}
		return stringDefReturn;
	}

	public static ArrayList<Word> getAll(){
		return dictionary;
	}
	
	public static void clear(){
	  dictionary.clear();
	}

	public static Word find(int id){
	    try {
		  return dictionary.get(id - 1);
		} catch (IndexOutOfBoundsException e){
	  return null;
    }
  }

}