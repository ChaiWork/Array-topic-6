
public class TraceOutputArray {

    public static void main(String[] args) {
        // Create an object of the class to call the non-static method
        TraceOutputArray traceOutput = new TraceOutputArray();

        // Call the method
        traceOutput.traceOutputArray1();
        traceOutput.traceOutputArray2();
    }

    // Method to demonstrate array operations
    public void traceOutputArray1() {
        // Initialize an array
        int[] arrayOfNum = new int[5];

        // Fill the array
        for (int i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = 2 * i; // Populate with multiples of 2
        }

        // Print the array
        for (int i = 0; i < arrayOfNum.length; i++) {
            System.out.print(arrayOfNum[i] + " "); // Print elements in a single line
        }
    }

    public void traceOutputArray2() {

        double tide[] = {12.2, -7.3, 14.2, 11.3};
        System.out.println("Elemeent in tide[1] is " + tide[1]);
        System.out.println("Elemeent in tide[2] is " + tide[2]);
        System.out.println("The lenght of tide[] array is " + tide.length);
        System.out.println("The reverse element in tide array are ");

        for (int j = tide.length - 1; j >= 0; j--) {

            System.out.print(tide[j] + " | ");
        }

    }
}
