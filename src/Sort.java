import java.util.ArrayList;
import java.util.*;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                count++;
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(count);
    }

    public static void insertionSort(int[] elements)
    {
        int count = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                count++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(count);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        int count = 0;
        for (int i = 0; i < words.size() - 1; i++) {
            int min = i;
            for (int a = i + 1; a < words.size(); a++) {
                if (words.get(i).compareTo(words.get(a)) < 0) {
                    min = i;
                }
                if (min != i) {
                    Collections.swap(words, i, min);
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        int count = 0;
        for (int a = 1; a < words.size() - 1; a++) {
            String temp = words.get(a);
            int idx = a;
            while (idx > 0 && temp.compareTo(words.get(idx - 1)) < 0) {
    words.set(idx, words.get(idx - 1));
    idx--;
            }
            count++;
            idx = a;
        }
        System.out.println(count);
    }
}