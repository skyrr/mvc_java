import java.util.Arrays;


/**
 * Created by sky on 10.03.2017.
 */
public class Dispatcher {
    public static void main(String[] args) {
        View view = new View();

        Model model = createModel();

        Controller controller = new Controller(model, view);

        controller.showView();
        controller.showIndexView();
    }

    private static Model createModel() {
        int[] x = {5, 9, 14, 18, 156, 654, 34, 8, 32, 123, 6874, 4, 32, 4, 654, 321, 456};
        int[] y = {45, 65, 123, 584, 63, 456, 123, 1, 46, 897, 46, 65, 2, 3, 8, 15, 65};
        return new Model(x, y);
    }
}