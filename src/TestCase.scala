import com.thoughtworks.selenium._
import java.util.regex.Pattern

import junit.framework._
import junit.framework.TestSuite

class SeleniumTest extends SeleneseTestCase {
  override def setUp() = {
    setUp("http://www.google.co.uk", "*chrome")
  }

  def testJ() = {

    selenium.open("/")
    selenium.click("search")
  }

  def suite() = {
    var clazz = this.getClass
    new TestSuite(clazz);
  }

  def runSTest() = junit.textui.TestRunner.run(suite())
}

object Main extends Application {
  val s = new SeleniumTest
  s.runSTest()
}