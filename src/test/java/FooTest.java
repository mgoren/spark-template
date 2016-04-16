import org.junit.*;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void newFoo_instantiatesCorrectly() {
    Foo testFoo = new Foo();
    assertEquals(true, testFoo instanceof Foo);
  }

  

}   