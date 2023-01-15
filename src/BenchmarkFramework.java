import java.util.ArrayList;

/**
 *
 * This Framework's method sets up the softwares that will do the Benchmarking
 * later on and display print the finished benchmark values into the console.
 *
 * @author mohammad
 * @version 13.01.23
 */
public class BenchmarkFramework {
    public static void main(String[] args) {

        Producer pansomy = new Producer("Pansomy");
        Producer nindandolo = new Producer("Nindandolo");

        ProcessingUnit studyStationPU = new ProcessingUnit("StudyStationPU",25.0);
        ProcessingUnit learnditchPU = new ProcessingUnit("LearnditchPU",30.0);

        StudyStation studyStation = new StudyStation("1.1.1",pansomy,studyStationPU,"Pansomy");
        Learnditch learnditch = new Learnditch("1.1.1",nindandolo,learnditchPU,"Nindandolo");

        Software t1 = new Software("T1",13.0);
        Software t2 = new Software("T2",24.0);
        Software t3 = new Software("T3",30.0);

        studyStation.setSoftware(t1);
        studyStation.setSoftware(t2);
        studyStation.setSoftware(t3);

        learnditch.setSoftware(t1);
        learnditch.setSoftware(t2);
        learnditch.setSoftware(t3);



        ArrayList<Software>softwareList = new ArrayList<>();
        softwareList.add(t1);
        softwareList.add(t2);
        softwareList.add(t3);

        Benchmark benchmark = new Benchmark(softwareList);
        System.out.println("the benchmark of StudyStation: "+ benchmark.executeBenchmark( studyStation));
        System.out.println("the benchmark of Learnditch: "+ benchmark.executeBenchmark(learnditch));

    }
}
