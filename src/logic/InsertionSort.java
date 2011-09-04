package logic;

import java.util.ArrayList;
import ui.Interface;

/**
 * @author: Harsha Siriwardena <harshadura@gmail.com>
 * @license: GNU Affero General Public License
 * http://www.gnu.org/licenses/
 *
 * Insertion Sorting Algorithm
 */
public class InsertionSort {
    private long[] sortingArray;
    private int nElems;
    private int instructionCount=0;

    public InsertionSort(int max) {
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

    public ArrayList insertionSortingAlgo() {
        int in, out;
        ArrayList simulationSteps = new ArrayList();
        for (out = 1; out < nElems; out++) {
            long temp = sortingArray[out];
            in = out;
            instructionCount++;
            while (in > 0 && sortingArray[in - 1] >= temp) {
                instructionCount++;
                sortingArray[in] = sortingArray[in - 1];
                --in;
            }
            sortingArray[in] = temp;
            simulationSteps.add(getPattern());
        }
        Interface.InsertInstructionCount = instructionCount;
        return simulationSteps;
    }
}


