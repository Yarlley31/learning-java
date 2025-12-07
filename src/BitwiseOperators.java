public class BitwiseOperators {

    public static void main(String[] args) {
        int value1 = 6;
        String binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);

        int value2 = 5;
        String binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);

        int result = value1 | value2;
        String binaryResult = Integer.toBinaryString(result);
        System.out.printf(" %s | %s = %s (representação binária: %s)\n", value1, value2, result, binaryResult);
    }
}
