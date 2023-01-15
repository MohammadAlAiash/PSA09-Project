import java.util.ArrayList;
/**
 * This class defines a "Benchmark" that is used to evaluate the performance of a console.
 * The class accepts an ArrayList of Software objects in its constructor
 * and uses it to evaluate the performance of the console.
 * The class contains a single method called "executeBenchmark" which takes a Console object
 * as an input and returns a double value that represents the performance of the console.
 * The method calculates the performance of the console by first getting
 * the "performanceValue" from the console's processing unit,
 * then it sums up the "computingUsage" of all the software installed on the console.
 * Finally, it returns the result of dividing the "performanceValue" by the "totalComputingUsage"
 * which gives the performance of the console. @param console: Sets the console on which to do the benchmark with.
 *
 * @author mohammad
 * @version 13.01.23
 * @param
 */
public class Benchmark {
    private final ArrayList<Software>softwareList;

    /**
     *
     * @param softwareList
     */
    public Benchmark(final ArrayList<Software>softwareList){
        this.softwareList = softwareList;
    }

    /*
    * @requires console !== null
    * The console object has a list of software installed on it, which is not null and contains at least one software object.
    * Each software object in the list has a valid computing usage value.
    * @ensures The method returns a double value representing the benchmark performance of the console.
    * The returned value is the result of dividing the performance value of the console's processing unit
    * by the total computing usage of all the software installed on the console.
    */
    /**
     * This method calculates the benchmark performance of a console by dividing
     * the performance value of the console's processing unit by the total computing usage of all
     * the software installed on the console.
     * @param console
     * @return
     */
    public double executeBenchmark(Console console){
        double performanceValue = console.getProcessingUnit().getPerformanceValue();
        double totalComputingUsage = 0;
        for (Software software : console.getSoftware()){
            totalComputingUsage += software.getComputingUsage();
        }
    return performanceValue / totalComputingUsage;
    }
}
