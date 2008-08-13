import junit.framework.TestCase;

public class XStringTest extends TestCase {
	public void testRev() throws Exception {
		assertEquals("cba", new XString("abc").transform("rev"));
		assertEquals("abc", new XString("abc").transform("rev/rev"));
	}
	
	public void testRepl() throws Exception {
		assertEquals("", new XString("a").transform("repl:0"));
		assertEquals("bbbb", new XString("b").transform("repl:4"));
		assertEquals("abab", new XString("ab").transform("repl:2"));
	}
	
	public void testMixed() throws Exception {
		assertEquals("cbacbacba", new XString("abc").transform("rev/repl:3"));
		
	}
}
