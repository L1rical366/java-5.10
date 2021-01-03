package ua.step.homework;

/**
 * Написать и методы работы с квадратными матрицами (матрицы
 * представить в виде двухмерных массивов).
 * Должны присутствовать методы:
 * • создания единичной (диагональной) матрицы (метод createOne)
 * • создания нулевой матрицы (метод createNull)
 * • сложение матриц (метод sumMatrix)
 * • умножения матриц (метод productMatrix)
 * • умножение матрицы на скаляр (метод productMatrix)
 * • определение детерминанта матрицы (метод determinant)
 * • вывод матрицы на консоль (метод printMatrix)
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO: Проверяйте методы здесь
		int[][] oneMatrix = createOne(10, 10);
		printMatrix(oneMatrix);
		System.out.println();
		int[][] nullMatrix = createNull(10,10);
		printMatrix(nullMatrix);
		System.out.println();
		int[][] sumMatrix = sumMatrix(oneMatrix, nullMatrix);
		printMatrix(sumMatrix);
		System.out.println();
		int[][] one = {{2, 5, 6}, {3, 2, 1}, {4, 3, 6}};
		int[][] two = {{1, 6, 5}, {2, 4, 2}, {3, 1, 5}};
		int[][] sum = productMatrix(one, two);
		printMatrix(sum);
	}

	/**
	 * Создает единичную матрицу
	 *
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return единичную (диагональную) матрицу
	 */
	public static int[][] createOne(int n, int m) {
		// TODO: удалите исключение и пишите здесь код
		int[][] oneMatrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					oneMatrix[i][j] = 1;
				} else {
					oneMatrix[i][j] = 0;
				}
			}
		}
		return oneMatrix;
	}

	/**
	 * Создает нулевую матрицу
	 *
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return нулевую матрицу
	 */
	public static int[][] createNull(int n, int m) {
		// TODO: удалите исключение и пишите здесь код
		int[][] nullMatrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				nullMatrix[i][j] = 0;
			}
		}
		return nullMatrix;
	}

	/**
	 * Вычисляет сумму двух матриц
	 *
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return сумму двух матриц
	 */
	public static int[][] sumMatrix(int[][] one, int[][] two) {
		// TODO: удалите исключение и пишите здесь код
		if(one.length != two.length || one[0].length != two[0].length){
			int[][] arr = new int[0][0];
			return(arr);
		}
		int[][] sumMatrix = new int[one.length][one[0].length];
		for(int i = 0; i < sumMatrix.length; i++){
			for(int j = 0; j < sumMatrix[0].length; j++){
				sumMatrix[i][j] = one[i][j] + two[i][j];
			}
		}
		return (sumMatrix);
	}

	/**
	 * Вычисляет произведение двух матриц
	 *
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return произведение матриц
	 */
	public static int[][] productMatrix(int[][] one, int[][] two) {
		// TODO: удалите исключение и пишите здесь код
		if(one[0].length != two.length){
			int[][] arr = new int[0][0];
			return(arr);
		}
		int[][] productMatrix = new int[one.length][two[0].length];
		for(int i = 0; i < one.length; i++){
			for(int j = 0, sum = 0; j < two[0].length; j++, sum = 0){
				for(int k = 0; k < two[0].length; k++){
					sum += one[i][k] * two[k][j];
				}
				productMatrix[i][j] = sum;
			}
		}
		return productMatrix;
	}

	/**
	 * Вычисляет произведение матрицы на скаляр
	 *
	 * @param matrix - матрица
	 * @param num    - скаляр
	 * @return произведение матрицы на скаляр
	 */
	public static int[][] productMatrix(int[][] matrix, int num) {
		// TODO: удалите исключение и пишите здесь код
		int[][] productMatrix = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				productMatrix[i][j] = matrix[i][j] * num;
			}
		}
		return productMatrix;
	}

	/**
	 * Вычисляет детерминант матрицы
	 *
	 * @param matrix - матрица
	 * @return детерминант матрицы
	 */
	public static int determinant(int[][] matrix) {
		// TODO: удалите исключение и пишите здесь код
		int kol = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				kol++;
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print("\n");
		}
		System.out.println("\n");
		int det = 0;
		if (kol == 4) {
			det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
			System.out.print(det + "\n");
		}
		if (kol == 9) {
			det = (matrix[0][0] * matrix[1][1] * matrix[2][2]) + (matrix[0][2] * matrix[1][0] * matrix[2][1]) + (matrix[0][1] * matrix[1][2] * matrix[2][0]) - (matrix[0][2] * matrix[1][1] * matrix[2][0]) - (matrix[0][0] * matrix[1][2] * matrix[2][1]) - (matrix[0][1] * matrix[1][0] * matrix[2][2]);
			System.out.print(det + "\n");
		}
		return det;
	}

	/**
	 * Печатает матрицу в стандартный поток вывода
	 *
	 * @param matrix - матрица
	 */
	public static void printMatrix(int[][] matrix) {
		// TODO: удалите исключение и пишите здесь код
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}