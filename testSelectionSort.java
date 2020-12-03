
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
          int[] arr = new int[5];
          arr[0] = 8;
          arr[1] = 9;
          arr[2] = 7;
          arr[3] = 10;
          arr[4] = 2;

          int[] Sortedarr = new int[5];
          Sortedarr[0] = 2;
          Sortedarr[1] = 7;
          Sortedarr[2] = 8;
          Sortedarr[3] = 9;
          Sortedarr[4] = 10;
          SelectionSort temp = new SelectionSort();
          temp.basicSelectionSort(arr);

          /** add tests to check for this unit test **/
          Assert.assertArrayEquals(arr, Sortedarr);
          System.out.print("Test Positive: Passed!");

      }

      public void testNegative(){
          int[] arr = new int[5];
          arr[0] = -8;
          arr[1] = -9;
          arr[2] = -7;
          arr[3] = -10;
          arr[4] = -2;

          int[] Sortedarr = new int[5];
          Sortedarr[0] = -10;
          Sortedarr[1] = -9;
          Sortedarr[2] = -8;
          Sortedarr[3] = -7;
          Sortedarr[4] = -2;
          SelectionSort temp = new SelectionSort();
          temp.basicSelectionSort(arr);
          Assert.assertArrayEquals(arr, Sortedarr);
          /** Test data contains negative values only **/
          System.out.print("Test Negative: Passed!");

      }

    public void testMixed(){

      /** Test data contains with both positive, negative and zeros **/
      int[] arr = new int[5];
      arr[0] = 8;
      arr[1] = -9;
      arr[2] = 0;
      arr[3] = -10;
      arr[4] = -4;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -10;
      Sortedarr[1] = -9;
      Sortedarr[2] = -4;
      Sortedarr[3] = 0;
      Sortedarr[4] = 8;
      SelectionSort temp = new SelectionSort();
      temp.basicSelectionSort(arr);
      Assert.assertArrayEquals(arr, Sortedarr);
      /** Test data contains negative values only **/
      System.out.print("Test Mixed: Passed!");
  }

  public void testDuplicates(){

      /** Test data contains duplicates **/
      int[] arr = new int[5];
      arr[0] = -5;
      arr[1] = -5;
      arr[2] = -7;
      arr[3] = 3;
      arr[4] = -4;

      int[] Sortedarr = new int[5];
      Sortedarr[0] = -7;
      Sortedarr[1] = -5;
      Sortedarr[2] = -5;
      Sortedarr[3] = -4;
      Sortedarr[4] = 3;
      SelectionSort temp = new SelectionSort();
      temp.basicSelectionSort(arr);
      Assert.assertArrayEquals(arr, Sortedarr);
      /** Test data contains negative values only **/
      System.out.print("Test Duplicates: Passed!");
  }




}
