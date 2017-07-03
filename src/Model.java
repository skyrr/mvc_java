/**
 * Created by sky on 10.03.2017.
 */
public class Model {
    private int[] firstArray;
    private int[] secondArray;
    private int count;
    private int[] resArray;
    private int[] indexArray;

    Model(int[] firstArray, int[] secondArray) {
        setFirstArray(firstArray);
        setSecondArray(secondArray);
    }

    public void setFirstArray(int[] firstArray) {
        this.firstArray = firstArray;
    }

    public void setSecondArray(int[] secondArray) {
        this.secondArray = secondArray;
    }

    public int[] getFirstArray() {
        return firstArray;
    }

    public int[] getSecondArray() {
        return secondArray;
    }

    public int getCount() {
        count = 0;
        for (int i = 0; i < this.firstArray.length; i++) {
            if (((this.firstArray[i] % 2) == 1) && ((this.secondArray[i] % 2)) == 1) {
                    count++;
            }
        }
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLengthArray(int length) {
        resArray = new int[length * 2];
    }

    public void setIndexArray(int[] indexArray) {

        this.indexArray = indexArray;
    }

}
