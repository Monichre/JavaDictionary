
import java.util.HashMap;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

 
// @Test
// public void Word_InstanceOfWord_True() {
// 	Word testWord = new Word("word");
// 	assertEquals(true, testWord instanceof Word);
// }

// @Test
// public void Word_InstanceOfWordWithDefinition_True() {
// 	Definition testDef = new Definition("example definition");
// 	Word test = new Word("word", testDef );
// 	assertEquals(true, test instanceof Word);
// }

// @Test
// public void Word_ReturnsDefinition_True() {
// 	Word testWord = new Word("esoteric");
// 	Definition defToAdd = new Definition("This is a definition");
// 	Definition defToAdd2 = new Definition("This is another definition");
// 	testWord.addDefinition(defToAdd);
// 	assertEquals(defToAdd, testWord.getDefinition());
// }

// @Test
// public void getWordReturnsWord_True() {
// 	String word = "word";
// 	Word test = new Word("word");
// 	assertEquals(word, test.getWord());
// }

@Test
public void getAllReturnsDictionary() {
	ArrayList<Word> testArray = new ArrayList<Word>();
	Word test1 = new Word("word1");
	Word test2 = new Word("word2");
	Word test3 = new Word("word3");
	testArray.add(test1);
	testArray.add(test2);
	testArray.add(test3);
	assertEquals(testArray, Word.getAll());
}

	
}   