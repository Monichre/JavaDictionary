import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {


@Test
public void Word_InstanceOfWord_True() {
	Definition testDefinition = new Definition("example");
	assertEquals(true, testDefinition instanceof Definition);
}

	
}   