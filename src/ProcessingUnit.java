public class ProcessingUnit {


    private final String name;
    private final double performanceValue;

    /**
     *
     * @param name
     * @param performanceValue
     */
    public ProcessingUnit(final String name, final double performanceValue) {
        this.name = name;
        this.performanceValue = performanceValue;
    }

    public String getName() {
        return name;
    }
    public double getPerformanceValue() {
        return performanceValue;
    }
}
