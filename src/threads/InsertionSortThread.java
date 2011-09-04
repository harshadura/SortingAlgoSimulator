package threads;

import java.util.ArrayList;
import logic.InsertionSort;
import ui.Interface;

/**
 * @author: Harsha Siriwardena <harshadura@gmail.com>
 * @license: GNU Affero General Public License
 * http://www.gnu.org/licenses/
 *
 * Thread of Insertion Sorting Class
 */
public class InsertionSortThread extends Thread {
    private String txtNumbersInsert;

    public InsertionSortThread(String nums) {
        txtNumbersInsert = nums;
    }

    public void run() {
        try {
            ArrayList simulationSteps = new ArrayList();
            String numbers = txtNumbersInsert;
            numbers = numbers.replaceAll("\\s+", " ");
            String parts[] = numbers.split(" ");
            int size = parts.length;
            InsertionSort insertionSort = new InsertionSort(size);
            int Numbers[] = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                Numbers[i] = Integer.parseInt(parts[i]);
            }
            for (int i = 0; i < size; i++) {
                insertionSort.insert(Numbers[i]);
            }
            long startTime = System.nanoTime();
            simulationSteps = insertionSort.insertionSortingAlgo();
            long endTime = System.nanoTime();

            Interface.InsertTimeDiff = (endTime - startTime);
            Interface.SortDataInsert = simulationSteps;
            return;
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
