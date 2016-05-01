
import java.util.HashMap;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

	 
	 
	@Test
	public void Word_InstanceOfWordWithDefinition_True() {
		Definition testDef = new Definition("example definition");
		Word test = new Word("word", testDef );
		assertEquals(true, test instanceof Word);
	}

	@Test
	public void getWordReturnsWord_True() {
		String word = "word";
		Word test = new Word("word");
		assertEquals(word, test.getWord());
	}

	@Test
	public void getAllReturnsDictionary() {
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
	public void returnsWordId() {
		Word testWord = new Word("esoteric");
		Word testWord2 = new Word("another");
		Word test = new Word("fsfsdf");
		assertEquals(testWord2, Word.find(2));
	}


	
}   