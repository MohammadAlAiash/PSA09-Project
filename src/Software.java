public class Software {

    private final String titel;
    private double computingUsage;

    /**
     *
     * @param titel
     * @param computingUsage
     */
    public Software(String titel, double computingUsage) {
        this.titel = titel;
        this.computingUsage = computingUsage;
    }
    public String getTitel() {
        return titel;
    }

    public double getComputingUsage() {
        return computingUsage;
    }
}
