import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

 
@Test
public void Word_InstanceOfWord_True() {
	Word testWord = new Word("word");
	assertEquals(true, testWord instanceof Word);
}

@Test
public void Word_ReturnsDefinition_True() {
	Word testWord = new Word("esoteric");
	Definition defToAdd = new Definition("This is a definition");
	Definition defToAdd2 = new Definition("This is another definition");
	testWord.addDefinition(defToAdd);
	assertEquals(defToAdd, testWord.getDefinition());
}

	
}   