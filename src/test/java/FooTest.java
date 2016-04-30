import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;

public class FooTest {

  @Before
  public void setUp() {
    DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/____TEST_DATABASE_NAME_HERE_____", null, null);
  }

  @After
  public void tearDown() {
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM _____DATABASE_COLUMN_NAME______ *;";
      con.createQuery(sql).executeUpdate();
    }
  }

  @Test
  public void Foo_instantiatesCorrectly() {
    Foo testFoo = new Foo();
    assertEquals(true, testFoo instanceof Foo);
  }

}
