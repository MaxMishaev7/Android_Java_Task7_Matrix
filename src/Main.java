import ru.mishaev.max.Matrix;

public class Main {
    public static void main(String[] args) {

        Matrix m = new Matrix();
        //m.printMatrix(m.getMatrix());

        m.FillMatrixRandomNumbers();
        m.printMatrix(m.getMatrix());

        m.turnMatrixRight(90);
        m.printMatrix(m.getTurnedMatrix());

        m.turnMatrixRight(180);
        m.printMatrix(m.getTurnedMatrix());

        m.turnMatrixRight(270);
        m.printMatrix(m.getTurnedMatrix());
    }
}