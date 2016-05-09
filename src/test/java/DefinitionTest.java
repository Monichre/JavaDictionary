import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

@Test
public void instanceOfDefinition_True() {
	Definition testDefinition = new Definition("example");
	assertEquals(true, testDefinition instanceof Definition);
	}

@Test
public void returnsDefinition_True() {
	Definition testDefinition = new Definition("example");
	String example = "example";
	assertEquals(example, testDefinition.getDefinition());
	}	


}   