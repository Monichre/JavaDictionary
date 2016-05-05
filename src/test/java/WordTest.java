
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
		assertEquals(testArray, test4.getAll());
	}

	@Test
	public void find_returnsWordById_True() {
		Word testWord = new Word("esoteric");
		Word testWord2 = new Word("another");
		Word test = new Word("fsfsdf");
		assertEquals(testWord2, Word.find(2));
	}
	
}   