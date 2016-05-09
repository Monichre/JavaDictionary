
import java.util.HashMap;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

	@After
	public void clear_emptiesAllWordsFromDictionary_0() {
		Word myWord = new Word("Precarious");
		Word.clear();
		assertEquals(Word.getAll().size(), 0);
	}	
	@Test
	public void Word_InstanceOfWordWithDefinition_True() {
		Definition testDef = new Definition("example definition");
		Word test = new Word("word", testDef );
		assertEquals(true, test instanceof Word);
	}
	@Test
	public void getWord_returnsWord_String() {
		String word = "word";
		Word test = new Word("word");
		assertEquals(word, test.getWord());
	}
	@Test
	public void getId_returnsId_True() {
		String word = "word";
		Integer testInt = 1;
		Word test = new Word("word");
		assertEquals(testInt, test.getId());
	}
	@Test
	public void addDefinition_AddsDefinition_True() {
		Definition word = new Definition("word");
		Word test = new Word("word");
		test.addDefinition(word);
		assertEquals(word, test.getAllDefinitions().get(0));
	}
	@Test
	public void getAllDefinitions_returnsAllDef_True() {
		Definition word = new Definition("word");
		Definition anotherDef = new Definition("another def");
		Word test = new Word("word");
		test.addDefinition(word);
		test.addDefinition(anotherDef);
		assertEquals(word, test.getAllDefinitions().get(0));
		assertEquals(anotherDef, test.getAllDefinitions().get(1));
	}
	@Test
	public void getDefinitions_returnsDef_True() {
		Definition word = new Definition("word def");
		Word test = new Word("word");
		test.addDefinition(word);
		assertEquals(word.getDefinition(), test.getDefinition());
	}
	@Test
	public void getAll_returnsDictionary_Array() {
		ArrayList<Word> testArray = new ArrayList<Word>();
		Word test1 = new Word("word1");
		Word test2 = new Word("word2");
		Word test3 = new Word("word3");
		Word test4 = new Word("word4");
		testArray.add(test1);
		testArray.add(test2);
		testArray.add(test3);
		testArray.add(test4);
		assertEquals(testArray, Word.getAll());
	}
	@Test
	public void find_returnsWordById_True() {
		Word testWord = new Word("esoteric");
		Word testWord2 = new Word("another");
		Word test = new Word("fsfsdf");
		assertEquals(testWord2, Word.find(2));
	}
	
}   