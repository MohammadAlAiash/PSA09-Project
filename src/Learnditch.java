public class Learnditch extends Console {

    private final Producer producer;

    /**
     *
     * @param versionsNummer
     * @param producer
     * @param processingUnit
     * @param produceerName
     */

    public Learnditch(final String versionsNummer, final Producer producer, final ProcessingUnit processingUnit,final String produceerName  ) {
        super(versionsNummer, produceerName, processingUnit);
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }
}
