import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

 
@Test
public void Word_InstanceOfWord_True() {
	Word testWord = new Word("word");
	assertEquals(true, testWord instanceof Word);
}

@Test
public void Word_addedDefition() {
	Word testWord = new Word("word");
	assertEquals(true, testWord instanceof Word);
}

	
}   