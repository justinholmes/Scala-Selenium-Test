package com.example.tests

import com.thoughtworks.selenium._
import java.util.regex.Pattern

import junit.framework._
import junit.framework.TestSuite

 class SeleniumTest extends SeleneseTestCase {
	override def setUp() = {
		setUp("http://www.google.co.uk", "*firefox")
	}
	def testJ()= {
		selenium.open("/")
		selenium.click("search")
		//selenium.click("link=Jstin Holmes");
	}

  def suite()={
     var clazz = this.getClass
		 new TestSuite(clazz);
 }
	object main extends Application {
		junit.textui.TestRunner.run(suite())
	}
}
