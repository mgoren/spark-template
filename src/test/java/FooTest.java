import org.junit.*;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void Foo_instantiatesCorrectly() {
    Foo testFoo = new Foo();
    assertEquals(true, testFoo instanceof Foo);
  }

  

}   