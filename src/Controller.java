/**
 * Created by sky on 10.03.2017.
 */
public class Controller {
    //    public calculate
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void showView() {
        view.printResultArray(checkArrayForItems());
    }

    public void showIndexView() {
        view.printIndexTable(checkArrayForIndex());
    }

    private int[] checkArrayForItems() {
        model = this.model;
        int count = model.getCount();
        int countNew = count*2;
        int[] simpleResult = new int[countNew];
        int countInd = 0;
        for (int i = 0; i < this.model.getFirstArray().length; i++) {
            if (((this.model.getFirstArray()[i] % 2) == 1) && ((this.model.getSecondArray()[i] % 2)) == 1) {
                simpleResult[countInd++] = this.model.getFirstArray()[i];
                simpleResult[countInd++] = this.model.getSecondArray()[i];
            }
        }

        return simpleResult;

    }

    private int[] checkArrayForIndex() {
        model = this.model;
        int count = model.getCount();
        int countNew = count*2;
        int[] simpleResult = new int[countNew];
        int countInd = 0;
        for (int i = 0; i < this.model.getFirstArray().length; i++) {
            if (((this.model.getFirstArray()[i] % 2) == 1) && ((this.model.getSecondArray()[i] % 2)) == 1) {
                simpleResult[countInd++] = i;
                simpleResult[countInd++] = i;
            }
        }
        return simpleResult;
    }
}
