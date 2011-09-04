package threads;

import java.util.ArrayList;
import logic.SelectionSort;
import ui.Interface;

/**
 * @author: Harsha Siriwardena <harshadura@gmail.com>
 * @license: GNU Affero General Public License
 * http://www.gnu.org/licenses/
 *
 * Thread of Selection Sorting Algorithm
 */
public class SelectionSortThread extends Thread {
    private String txtNumbersSelect;

    public SelectionSortThread(String nums) {
        txtNumbersSelect = nums;
    }

    public void run() {
        try {
            ArrayList simulationSteps = new ArrayList();
            String numbers = txtNumbersSelect;
            numbers = numbers.replaceAll("\\s+", " ");
            String parts[] = numbers.split(" ");
            int size = parts.length;
            SelectionSort selectionSort = new SelectionSort(size);

            int Numbers[] = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                Numbers[i] = Integer.parseInt(parts[i]);
            }
            for (int i = 0; i < size; i++) {
                selectionSort.insert(Numbers[i]);
            }
            long startTime = System.nanoTime();
            simulationSteps = selectionSort.selectionSort();
            long endTime = System.nanoTime();

            Interface.SelectTimeDiff = (endTime - startTime);
            Interface.SortDataSelect = simulationSteps;
            return;
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
