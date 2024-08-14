public class EjercicioArreglos {

    /*
    given 2 int arrayas, a and b, each lenght 3, return a new array lenght 2 containing their middle elements.
        middleWay([1, 2, 3], [4, 5, 6]) -- [2,5]
        middleWay([7, 7, 7], [4, 5, 6]) -- [7,5]
     */

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static void main(String[] args) {
        int[] result1 = middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int[] result2 = middleWay(new int[]{7, 7, 7}, new int[]{4, 5, 6});

        // Imprimir los resultados
        System.out.println("Resultado 1: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Resultado 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
