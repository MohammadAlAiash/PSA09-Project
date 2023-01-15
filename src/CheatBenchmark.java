import java.util.ArrayList;

public class CheatBenchmark extends Benchmark {

    public CheatBenchmark(final ArrayList<Software> softwares){
    super(softwares);
    }

    @Override
    public double executeBenchmark(Console console){
        double performanceValue = console.getProcessingUnit().getPerformanceValue();
        double totalComputingUsage = 0;
        for (Software software : console.getSoftware()){
            totalComputingUsage += software.getComputingUsage();
        }
         // increasing the output value by 30% for all consoles from Nindandolo
        if (console.getProducerName().equals("Nindandolo")) {
            return 1.3 * (performanceValue / totalComputingUsage);
            }
        return performanceValue / totalComputingUsage;
        }
    }



