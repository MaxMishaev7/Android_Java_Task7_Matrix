import ru.mishaev.max.Matrix;

public class Main {
    public static void main(String[] args) {

        Matrix m = new Matrix();

        /* Заполняем матрицу случайными числами и выводим на экран */
        m.FillMatrixRandomNumbers();
        m.printMatrix();

        m.turnMatrixRight(90).printMatrix();
        m.turnMatrixRight(180).printMatrix();
        m.turnMatrixRight(270).printMatrix();
        m.turnMatrixRight(150).printMatrix();

    }
}