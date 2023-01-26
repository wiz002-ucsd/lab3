import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] test = {1,2,3,4};
    ArrayExamples.reverseInPlace(test);
    assertArrayEquals(new int[]{4,3,2,1}, test);
  }

  @Test
  public void testReverse2() {
    int[] test = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(test));
  }

  @Test
  public void testAverageWithoutLowest1() {
    double[] test = {1,2,3,4};
    assertEquals(3,ArrayExamples.averageWithoutLowest(test), 0);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] test = {1,1,2,3,4};
    assertEquals(3,ArrayExamples.averageWithoutLowest(test), 0);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] test = {1,1,1};
    assertEquals(0,ArrayExamples.averageWithoutLowest(test), 0);
  }

}