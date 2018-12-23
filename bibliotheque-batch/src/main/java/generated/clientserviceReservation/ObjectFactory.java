
package generated.clientserviceReservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.clientserviceReservation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListerParUsager_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParUsager");
    private final static QName _AjouterResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "ajouterResponse");
    private final static QName _ListerToutResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerToutResponse");
    private final static QName _EnumererParOuvrage_QNAME = new QName("http://services.webservice.ocp4.com/", "enumererParOuvrage");
    private final static QName _SupprimerResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "supprimerResponse");
    private final static QName _ListerTout_QNAME = new QName("http://services.webservice.ocp4.com/", "listerTout");
    private final static QName _EnumererParOuvrageResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "enumererParOuvrageResponse");
    private final static QName _Supprimer_QNAME = new QName("http://services.webservice.ocp4.com/", "supprimer");
    private final static QName _ListerParUsagerResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParUsagerResponse");
    private final static QName _Ajouter_QNAME = new QName("http://services.webservice.ocp4.com/", "ajouter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.clientserviceReservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListerParUsagerResponse }
     * 
     */
    public ListerParUsagerResponse createListerParUsagerResponse() {
        return new ListerParUsagerResponse();
    }

    /**
     * Create an instance of {@link Ajouter }
     * 
     */
    public Ajouter createAjouter() {
        return new Ajouter();
    }

    /**
     * Create an instance of {@link EnumererParOuvrageResponse }
     * 
     */
    public EnumererParOuvrageResponse createEnumererParOuvrageResponse() {
        return new EnumererParOuvrageResponse();
    }

    /**
     * Create an instance of {@link Supprimer }
     * 
     */
    public Supprimer createSupprimer() {
        return new Supprimer();
    }

    /**
     * Create an instance of {@link SupprimerResponse }
     * 
     */
    public SupprimerResponse createSupprimerResponse() {
        return new SupprimerResponse();
    }

    /**
     * Create an instance of {@link ListerTout }
     * 
     */
    public ListerTout createListerTout() {
        return new ListerTout();
    }

    /**
     * Create an instance of {@link ListerParUsager }
     * 
     */
    public ListerParUsager createListerParUsager() {
        return new ListerParUsager();
    }

    /**
     * Create an instance of {@link AjouterResponse }
     * 
     */
    public AjouterResponse createAjouterResponse() {
        return new AjouterResponse();
    }

    /**
     * Create an instance of {@link ListerToutResponse }
     * 
     */
    public ListerToutResponse createListerToutResponse() {
        return new ListerToutResponse();
    }

    /**
     * Create an instance of {@link EnumererParOuvrage }
     * 
     */
    public EnumererParOuvrage createEnumererParOuvrage() {
        return new EnumererParOuvrage();
    }

    /**
     * Create an instance of {@link Ouvrage }
     * 
     */
    public Ouvrage createOuvrage() {
        return new Ouvrage();
    }

    /**
     * Create an instance of {@link Usager }
     * 
     */
    public Usager createUsager() {
        return new Usager();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParUsager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParUsager")
    public JAXBElement<ListerParUsager> createListerParUsager(ListerParUsager value) {
        return new JAXBElement<ListerParUsager>(_ListerParUsager_QNAME, ListerParUsager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "ajouterResponse")
    public JAXBElement<AjouterResponse> createAjouterResponse(AjouterResponse value) {
        return new JAXBElement<AjouterResponse>(_AjouterResponse_QNAME, AjouterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerToutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerToutResponse")
    public JAXBElement<ListerToutResponse> createListerToutResponse(ListerToutResponse value) {
        return new JAXBElement<ListerToutResponse>(_ListerToutResponse_QNAME, ListerToutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumererParOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "enumererParOuvrage")
    public JAXBElement<EnumererParOuvrage> createEnumererParOuvrage(EnumererParOuvrage value) {
        return new JAXBElement<EnumererParOuvrage>(_EnumererParOuvrage_QNAME, EnumererParOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "supprimerResponse")
    public JAXBElement<SupprimerResponse> createSupprimerResponse(SupprimerResponse value) {
        return new JAXBElement<SupprimerResponse>(_SupprimerResponse_QNAME, SupprimerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerTout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerTout")
    public JAXBElement<ListerTout> createListerTout(ListerTout value) {
        return new JAXBElement<ListerTout>(_ListerTout_QNAME, ListerTout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumererParOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "enumererParOuvrageResponse")
    public JAXBElement<EnumererParOuvrageResponse> createEnumererParOuvrageResponse(EnumererParOuvrageResponse value) {
        return new JAXBElement<EnumererParOuvrageResponse>(_EnumererParOuvrageResponse_QNAME, EnumererParOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supprimer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "supprimer")
    public JAXBElement<Supprimer> createSupprimer(Supprimer value) {
        return new JAXBElement<Supprimer>(_Supprimer_QNAME, Supprimer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParUsagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParUsagerResponse")
    public JAXBElement<ListerParUsagerResponse> createListerParUsagerResponse(ListerParUsagerResponse value) {
        return new JAXBElement<ListerParUsagerResponse>(_ListerParUsagerResponse_QNAME, ListerParUsagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ajouter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "ajouter")
    public JAXBElement<Ajouter> createAjouter(Ajouter value) {
        return new JAXBElement<Ajouter>(_Ajouter_QNAME, Ajouter.class, null, value);
    }

}
