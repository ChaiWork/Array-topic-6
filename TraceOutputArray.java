public class TraceOutputArray {

    public static void main(String[] args) {
        // Create an object of the class to call the non-static method
        TraceOutputArray traceOutput = new TraceOutputArray();

        // Call the method
        traceOutput.traceOutputArray1();
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

    
}
