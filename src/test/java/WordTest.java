import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

 
@Test
public void Word_InstanceOfWord_True() {
	Word testWord = new Word("word");
	assertEquals(true, testWord instanceof Word);
}

@Test
public void Word_addedDefitionIsAnArrayList_True() {
	Word testWord = new Word("word");
	Definition wordToAdd = new Definition("This is a definition");
	Definition testDef = new Definition("blah");
	testWord.addDefinition(wordToAdd);
	assertEquals(wordToAdd, testWord.addDefinition(wordToAdd));
}

	
}   