import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumberDivisibleByFour_true(){
    //LeapYear testLeapYear = new LeapYear();
    assertEquals(true, LeapYear.isLeapYear(2012));
  }

  @Test
  public void isLeapYear_forNumberDivisibleByFour_false(){
    //LeapYear leapyear = new LeapYear();
    assertEquals(false, LeapYear.isLeapYear(1999));
  }
  @Test
  public void isLeapYear_forMultiplesOfOneHundred_false(){
    //LeapYear leapyear = new LeapYear();
    assertEquals(false, LeapYear.isLeapYear(1900));
  }

  @Test
 public void isLeapYear_forMultiplesOfFourHundred_true(){
    //LeapYear leapYear = new LeapYear();
    assertEquals(true, LeapYear.isLeapYear(2000) );
 }
}
