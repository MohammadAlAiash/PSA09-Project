import java.util.ArrayList;

/**
 * Diese Klasse "Console" definiert die Vorlage für ein Konsolen-Gerät.
 * Es enthält mehrere Attribute wie "versionsNummer", "producerName", "processingUnit"
 * und "software". Diese Attribute repräsentieren die Versionsnummer,
 * den Produktnamen, die Verarbeitungseinheit und die installierte Software.#
 *
 * @author mohammad
 * @version 13.01.23
 *
 *
 */
class Console {

    private final String versionsNummer;
    private final String producerName;
    private final ProcessingUnit processingUnit;
    private final ArrayList<Software> software;

    /**
     *
     * @param versionsnummer
     * @param produceerName
     * @param processingUnit
     */

    public Console(final String versionsnummer,final String produceerName, final ProcessingUnit processingUnit) {
        this.versionsNummer = versionsnummer;
        this.producerName = produceerName;
        this.processingUnit = processingUnit;
        this.software = new ArrayList<>();
    }

    public String getVersionsNummer() {
        return versionsNummer;
    }

    public ProcessingUnit getProcessingUnit() {
        return processingUnit;
    }

    public ArrayList<Software> getSoftware() {
        return software;
    }
    public void setSoftware(Software software){
        getSoftware().add(software);
        //this.software.add(software);
    }


    public String getProducerName() {
        return producerName;
    }
}
