public class StudyStation extends Console {

    private final Producer producer;

    /**
     *
     * @param versionsNummer
     * @param producer
     * @param processingUnit
     * @param produceerName
     */
    public StudyStation(String versionsNummer, Producer producer,ProcessingUnit processingUnit, final String produceerName ) {
        super(versionsNummer, produceerName, processingUnit);
        this.producer = producer;
    }
    public Producer getProducer() {
        return producer;
    }
}
