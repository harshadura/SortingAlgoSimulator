package logic;

import java.util.ArrayList;
import ui.Interface;

/**
 * @author: Harsha Siriwardena <harshadura@gmail.com>
 * @license: GNU Affero General Public License
 * http://www.gnu.org/licenses/
 *
 * Selection Sorting Algorithm
 */
public class SelectionSort extends Thread {

    private long[] sortingArray;
    private int nElems;
    private int instructionCount = 0;

    public SelectionSort(int max) {
        sortingArray = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        sortingArray[nElems] = value;
        nElems++;
    }

    public String getPattern() {
        String pattern = "";
        for (int j = 0; j < nElems; j++) {
            pattern = pattern + "   " + sortingArray[j];
        }
        return pattern;
    }

    public ArrayList selectionSort() {
        int i, j;
        int pos = 0;
        int min = 0;
        ArrayList simulationSteps = new ArrayList();
        for (i = 0; i < sortingArray.length - 1; i++) {
            instructionCount++;
            min = (int) sortingArray[i + 1];
            pos = i + 1;
            for (j = i + 1; j < sortingArray.length; j++) {
                instructionCount++;
                if (min > sortingArray[j]) {
                    instructionCount++;
                    min = (int) sortingArray[j];
                    pos = j;
                }
            }
            if (sortingArray[pos] < sortingArray[i]) {
                instructionCount++;
                sortingArray[pos] = sortingArray[pos] + sortingArray[i];
                sortingArray[i] = sortingArray[pos] - sortingArray[i];
                sortingArray[pos] = sortingArray[pos] - sortingArray[i];
            }
            simulationSteps.add(getPattern());
        }

        Interface.SelectInstructionCount = instructionCount;
        return simulationSteps;
    }
}
