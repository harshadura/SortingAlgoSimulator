package ui;

import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import logic.InsertionSort;
import logic.SelectionSort;
import threads.InsertionSortThread;
import threads.SelectionSortThread;
import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author: Harsha Siriwardena <harshadura@gmail.com>
 * @license: GNU Affero General Public License
 * http://www.gnu.org/licenses/
 *
 * Main Simulator Class
 */
public class Interface extends javax.swing.JFrame {

    public static ArrayList SortDataInsert;
    public static ArrayList SortDataSelect;
    public static long InsertTimeDiff;
    public static long SelectTimeDiff;
    public static int InsertInstructionCount;
    public static int SelectInstructionCount;
    private JOptionPane jOptionPane;

    public Interface() throws UnsupportedLookAndFeelException, ParseException {
        UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
        initComponents();
        setResizable(false);
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension windowSize = new Dimension(getPreferredSize());
        int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2;
        int wdwTop = screenSize.height / 2 - windowSize.height / 2;
        pack();
        setLocation(wdwLeft, wdwTop);
        setTitle("Sorting Algo Simulator v2.0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumbersInsert = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        butClearInsert = new javax.swing.JButton();
        butSortInsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSortingInsert = new javax.swing.JList();
        txtSortedInsert = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTimeInsert = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCountInsert = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtNumbersSelect = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        butClearSelect = new javax.swing.JButton();
        butSortSelect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSortingSelect = new javax.swing.JList();
        txtSortedSelect = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTimeSelect = new javax.swing.JTextField();
        txtCountSelect = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNumbersAll = new javax.swing.JTextField();
        butSortAll = new javax.swing.JButton();
        butChart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Insertion Sort"));

        jLabel1.setText("Unsorted Numbers");

        butClearInsert.setText("Clear");
        butClearInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearInsertActionPerformed(evt);
            }
        });

        butSortInsert.setText("Sort it!!");
        butSortInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSortInsertActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listSortingInsert);

        jLabel6.setText("Sorted Numbers");

        jLabel8.setText("Time Complexity : ");

        jLabel10.setText("Instruction Count : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(butSortInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtNumbersInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtSortedInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(butClearInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimeInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtCountInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumbersInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butSortInsert)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSortedInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTimeInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCountInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(butClearInsert)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selection Sort"));

        jLabel2.setText("Unsorted Numbers");

        butClearSelect.setText("Clear");
        butClearSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butClearSelectActionPerformed(evt);
            }
        });

        butSortSelect.setText("Sort it!!");
        butSortSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSortSelectActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listSortingSelect);

        jLabel7.setText("Sorted Numbers");

        jLabel9.setText("Time Complexity : ");

        jLabel11.setText("Instruction Count : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(butSortSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(txtNumbersSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(txtSortedSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addComponent(butClearSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTimeSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtCountSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumbersSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butSortSelect)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSortedSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtTimeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtCountSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(butClearSelect)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Insertion Sort Vs Selection Sort"));

        jLabel3.setText("Unsorted Numbers");

        butSortAll.setText("Sort Both!!");
        butSortAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSortAllActionPerformed(evt);
            }
        });

        butChart.setText("Performance");
        butChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtNumbersAll, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(butSortAll, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butChart, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumbersAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butChart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butSortAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butSortInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSortInsertActionPerformed
        if (txtNumbersInsert.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out the Empty fields!", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            ArrayList simulationSteps = new ArrayList();
            String numbers = txtNumbersInsert.getText();
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

            InsertTimeDiff = (endTime - startTime);
            listSortingInsert.setModel(new DefaultListModel());
            Iterator it = simulationSteps.iterator();
            while (it.hasNext()) {
                ((DefaultListModel) listSortingInsert.getModel()).addElement(it.next());
            }
            String lastElement = simulationSteps.get(simulationSteps.size() - 1).toString();
            txtSortedInsert.setText(lastElement);
            txtTimeInsert.setText(String.valueOf(InsertTimeDiff));
            txtCountInsert.setText(String.valueOf(InsertInstructionCount));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : Pls recheck the Number Sequence.. Sorry! non Numeric Characters are not allowed here", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_butSortInsertActionPerformed

    private void butClearInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearInsertActionPerformed
        clearInsertionSort();
    }//GEN-LAST:event_butClearInsertActionPerformed

    private void butClearSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butClearSelectActionPerformed
        clearSelectionSort();
    }//GEN-LAST:event_butClearSelectActionPerformed

    public void clearSelectionSort() {
        ((DefaultListModel) listSortingSelect.getModel()).removeAllElements();
        txtNumbersSelect.setText("");
        txtNumbersSelect.requestFocus();
        txtSortedSelect.setText("");
        txtTimeSelect.setText("");
        txtCountSelect.setText("");
    }

    public void clearInsertionSort() {
        ((DefaultListModel) listSortingInsert.getModel()).removeAllElements();
        txtNumbersInsert.setText("");
        txtNumbersInsert.requestFocus();
        txtSortedInsert.setText("");
        txtTimeInsert.setText("");
        txtCountInsert.setText("");
    }

    private void butSortSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSortSelectActionPerformed
        if (txtNumbersSelect.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out the Empty fields!", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            ArrayList simulationSteps = new ArrayList();
            String numbers = txtNumbersSelect.getText();
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
            SelectTimeDiff = (endTime - startTime);

            listSortingSelect.setModel(new DefaultListModel());
            Iterator it = simulationSteps.iterator();
            while (it.hasNext()) {
                ((DefaultListModel) listSortingSelect.getModel()).addElement(it.next());
            }

            String lastElement = simulationSteps.get(simulationSteps.size() - 1).toString();
            txtSortedSelect.setText(lastElement);
            txtTimeSelect.setText(String.valueOf(SelectTimeDiff));
            txtCountSelect.setText(String.valueOf(SelectInstructionCount));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : Pls recheck the Number Sequence.. Sorry! non Numeric Characters are not allowed here", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_butSortSelectActionPerformed

    private void butSortAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSortAllActionPerformed
        try {
            if (txtNumbersAll.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill out the Empty fields!", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            sortBoth();
            Thread.sleep(100);
            sortBoth();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : Pls recheck the Number Sequence.. Sorry! non Numeric Characters are not allowed here", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_butSortAllActionPerformed

    public void sortBoth() {
        try {
            txtNumbersInsert.setText(txtNumbersAll.getText());
            txtNumbersSelect.setText(txtNumbersAll.getText());

            InsertionSortThread insertionSortThread = new InsertionSortThread(txtNumbersAll.getText());
            SelectionSortThread selectionSortThread = new SelectionSortThread(txtNumbersAll.getText());

            Thread t1 = new Thread(insertionSortThread);
            Thread t2 = new Thread(selectionSortThread);

            t1.start();
            t2.start();

            listSortingSelect.setModel(new DefaultListModel());
            Iterator it = SortDataSelect.iterator();
            while (it.hasNext()) {
                ((DefaultListModel) listSortingSelect.getModel()).addElement(it.next());
            }
            String lastElement = SortDataSelect.get(SortDataSelect.size() - 1).toString();
            txtSortedSelect.setText(lastElement);
            txtTimeSelect.setText(String.valueOf(SelectTimeDiff));
            txtCountSelect.setText(String.valueOf(SelectInstructionCount));

            listSortingInsert.setModel(new DefaultListModel());
            it = SortDataInsert.iterator();
            while (it.hasNext()) {
                ((DefaultListModel) listSortingInsert.getModel()).addElement(it.next());
            }
            String lastElement2 = SortDataInsert.get(SortDataInsert.size() - 1).toString();
            txtSortedInsert.setText(lastElement2);
            txtTimeInsert.setText(String.valueOf(InsertTimeDiff));
            txtCountInsert.setText(String.valueOf(InsertInstructionCount));
        } catch (Exception e) {
        }
    }

    private void butChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butChartActionPerformed
        try {
            if (txtNumbersAll.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill out the Empty fields!", "Sorting Algo Simulator v2.0", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(InsertInstructionCount, "InsertionSort", "InsertionSort");
            dataset.setValue(SelectInstructionCount, "SelectionSort", "SelectionSort");
            JFreeChart chart = ChartFactory.createBarChart("Instruction Count", "Instruction Count", "Unique Counts", dataset,
                    PlotOrientation.VERTICAL, false, true, false);
            chart.setBackgroundPaint(Color.white);
            chart.getTitle().setPaint(Color.blue);
            CategoryPlot p = chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.red);
            ChartFrame frame1 = new ChartFrame("Insertion Sort Vs Selection Sort - Performance Analyze", chart);

            Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
            Dimension windowSize = new Dimension(getPreferredSize());
            int wdwLeft2 = screenSize.width / 2 - windowSize.width / 2 - 200;
            int wdwTop2 = screenSize.height / 2 - windowSize.height / 2;
            frame1.setLocation(wdwLeft2, wdwTop2);
            frame1.pack();
            frame1.setSize(400, 350);
            frame1.setVisible(true);

            DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
            dataset2.setValue(InsertTimeDiff, "InsertionSort", "InsertionSort");
            dataset2.setValue(SelectTimeDiff, "SelectionSort", "SelectionSort");
            JFreeChart chart2 = ChartFactory.createBarChart("Time Complexity* (can be vary)", "Time Complexity", "Nano Seconds", dataset2,
                    PlotOrientation.VERTICAL, false, true, false);
            chart2.setBackgroundPaint(Color.white);
            chart2.getTitle().setPaint(Color.blue);
            CategoryPlot p2 = chart2.getCategoryPlot();
            p2.setRangeGridlinePaint(Color.red);
            ChartFrame frame2 = new ChartFrame("Insertion Sort Vs Selection Sort - Performance Analyze", chart2);

            int wdwLeft = 50 + screenSize.width / 2 - windowSize.width / 2 + 200;
            int wdwTop = screenSize.height / 2 - windowSize.height / 2;
            frame2.setLocation(wdwLeft, wdwTop);
            frame2.pack();
            frame2.setVisible(true);
            frame2.setSize(400, 350);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_butChartActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Interface().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butChart;
    private javax.swing.JButton butClearInsert;
    private javax.swing.JButton butClearSelect;
    private javax.swing.JButton butSortAll;
    private javax.swing.JButton butSortInsert;
    private javax.swing.JButton butSortSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listSortingInsert;
    private javax.swing.JList listSortingSelect;
    private javax.swing.JTextField txtCountInsert;
    private javax.swing.JTextField txtCountSelect;
    private javax.swing.JTextField txtNumbersAll;
    private javax.swing.JTextField txtNumbersInsert;
    private javax.swing.JTextField txtNumbersSelect;
    private javax.swing.JTextField txtSortedInsert;
    private javax.swing.JTextField txtSortedSelect;
    private javax.swing.JTextField txtTimeInsert;
    private javax.swing.JTextField txtTimeSelect;
    // End of variables declaration//GEN-END:variables
}
