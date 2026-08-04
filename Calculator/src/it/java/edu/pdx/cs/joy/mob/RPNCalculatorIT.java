package edu.pdx.cs.joy.mob;

import edu.pdx.cs.joy.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class RPNCalculatorIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));




  }

  @Test
  void invokingMainWithIntegerReturnsInteger()
  {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "0");
    String output = result.getTextWrittenToStandardOut();
    assertThat(output, equalTo("0"));

  }

  @Test
  void invokingMainWithValidArgumentList() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "20 5 /");
    String output = result.getTextWrittenToStandardOut();
    assertThat(output, equalTo("4"));
  }

  @Test
  void inputIsLetter() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "a");
    assertThat(result.getTextWrittenToStandardError(), containsString("Invalid character: a"));
  }

  @Test
  void invokingMainWithValid() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(RPNCalculator.class, "3 5 8 * 7 + *");
    String output = result.getTextWrittenToStandardOut();
    assertThat(output, equalTo("141"));
  }

}
