package io.github.soc.directories;

import        org.junit.Test;
import static org.junit.Assert.assertEquals;

final class UtilTest {
  @Test
  void testStripQualification() {
    String actual1   = Util.stripQualification("org.foo.BarApp");
    String expected1 = "BarApp";
    assertEquals(actual1, expected1);

    String actual2   = Util.stripQualification("BarApp");
    String expected2 = "BarApp";
    assertEquals(actual2, expected2);
  }

  @Test
  void testTrimLowercaseAndReplaceWhitespaces() {
    String input1    = "Bar App";
    String actual1   = Util.trimLowercaseReplaceWhitespace(input1, "-");
    String expected1 = "bar-app";
    assertEquals(expected1, actual1, input1);

    String input2    = "BarApp Foo";
    String actual2   = Util.trimLowercaseReplaceWhitespace(input2, "");
    String expected2 = "barappfoo";
    assertEquals(expected2, actual2, input2);

    String input3    = " Bar App ";
    String actual3   = Util.trimLowercaseReplaceWhitespace(input3, "-");
    String expected3 = "bar-app";
    assertEquals(expected3, actual3, input3);

    String input4    = "  Bar  App  ";
    String actual4   = Util.trimLowercaseReplaceWhitespace(input3, "-");
    String expected4 = "bar-app";
    assertEquals(expected4, actual4, input4);
  }
}
