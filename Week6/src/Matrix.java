// Min-Gyu Jung 2017/11/06

import com.sun.rowset.internal.Row;

public class Matrix {

    public static final int ROW = 3;
    public static final int COL = 4;

    // declare the instance variable that will hold the 2-dim array

    double[][] myArray;

    /**Instantiate a ROW x COL matrix, empty
     */
    public Matrix() {
        myArray = new double[ROW][COL];
    }


    /** set the value of a particular element in the matrix
     * @param row the row of the element. 0 <= row < Matrix.ROW
     * @param col the column of the element.   0 <= col < Matrix.COL
     * @param value the value to be stored
     * @throws ArrayIndexOutOfBoundsException for invalid row or column
     */
    public void setValue(int row, int col, double value)throws ArrayIndexOutOfBoundsException {
        myArray[row][col] = value;
    }

    /** returns the value of a particular element in the matrix
     * @param row the row of the element. 0 <= row < Matrix.ROW
     * @param col the column of the element.   0 <= col < Matrix.COL
     * @throws ArrayIndexOutOfBoundsException for invalid row or column
     */
    public double getValue(int row, int col)throws ArrayIndexOutOfBoundsException {
        return myArray[row][col];
    }


    /** swap 2 rows of this matrix
     * @param r1 one of the rows to swap.  0 <= r1 < Matrix.ROW
     * @param r2 the other row to swap.   0 <= r2 < Matrix.ROW
     * @throws ArrayIndexOutOfBoundsException for invalid row or column
     */
    public void swapRows(int r1, int r2)throws ArrayIndexOutOfBoundsException {
        double temp;
        for(int i = 0; i<COL; i++){
            temp = myArray[r1][i];
            myArray[r1][i] = myArray[r2][i];
            myArray[r2][i] = temp;
        }
    }

    /** multiply one row by a non-zero constant
     * @param multiple the non-zero constant
     * @param row the row to change
     * @throws IllegalArgumentException if multiple is 0
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public void multiplyRow(double multiple, int row)throws ArrayIndexOutOfBoundsException,IllegalArgumentException {
        if(multiple == 0.0){
            throw new IllegalArgumentException("The multiple number must be non-zero constant.");
        }
        for(int i = 0; i<COL; i++){
            myArray[row][i] *= multiple;
        }
    }

    /** add row r1 into row r2. Equivalent to r2 += r1
     * @param r1 the row to add  0 <= r1 < Matrix.ROW
     * @param r2 the row to add into.  0 <= r2 < Matrix.ROW.  This row will change.
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public void addRows (int r2, int r1)throws ArrayIndexOutOfBoundsException {
        for(int i = 0; i<myArray[r1].length;i++){
            myArray[r2][i] += myArray[r1][i];
        }
    }

    /**
     * set new row in the matrix
     * @param row the new row to insert
     * @param rIdx the index of this new row  0 <= rIdx < Matrix.ROW
     * @return the old row
     * @throws IllegalArgument exception if row is not the correct length of Matrix.COL
     * @throws ArrayIndexOutOfBoundsException for invalid row
     */
    public double[] replace(double[] row, int rIdx)throws ArrayIndexOutOfBoundsException{
        if(row.length != myArray[rIdx].length){
            throw new IllegalArgumentException("Length of your array has error.");
        }
        for (int i = 0; i<ROW; i++){
            myArray[rIdx][i] = row[i];
        }
        return myArray[rIdx];
    }

    /**
     * Add 2 Matrices together and return a new Matrix
     * @param m the 2nd Matrix
     * @return the matrix sum of this + m
     */

    public Matrix sum(Matrix m){
        Matrix newMatrix = new Matrix();
        for(int i = 0; i < ROW; i++){
            for(int a = 0; a<COL; a++){
                newMatrix.setValue(i, a, this.getValue(i, a) + m.getValue(i, a));
            }
        }
        return newMatrix;
    }


    /** Return this matrix as a String of 3 rows of numbers in 4 columns
     */
    public String toString() {
        String report = "";
        for(int i = 0; i < ROW; i++){
            System.out.println();
            for(int a = 0; a < COL; a++){
                report += myArray[i][a]+" ";
            }
        }
        return report;
    }
}