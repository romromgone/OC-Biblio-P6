
package generated.clientserviceEmprunt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.clientserviceEmprunt package. 
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

    private final static QName _ListerEnCoursParUsagerResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerEnCoursParUsagerResponse");
    private final static QName _ListerNonRendusParUsagerResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerNonRendusParUsagerResponse");
    private final static QName _EnCoursPourExemplaire_QNAME = new QName("http://services.webservice.ocp4.com/", "EnCoursPourExemplaire");
    private final static QName _ListerNonRendus_QNAME = new QName("http://services.webservice.ocp4.com/", "listerNonRendus");
    private final static QName _ListerNonRendusParUsager_QNAME = new QName("http://services.webservice.ocp4.com/", "listerNonRendusParUsager");
    private final static QName _TrouverEmprunt_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverEmprunt");
    private final static QName _EnCoursPourExemplaireResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "EnCoursPourExemplaireResponse");
    private final static QName _ListerEnCoursParUsager_QNAME = new QName("http://services.webservice.ocp4.com/", "listerEnCoursParUsager");
    private final static QName _ListerNonRendusResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerNonRendusResponse");
    private final static QName _ParseException_QNAME = new QName("http://services.webservice.ocp4.com/", "ParseException");
    private final static QName _ProlongerResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "prolongerResponse");
    private final static QName _TrouverEmpruntResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverEmpruntResponse");
    private final static QName _Prolonger_QNAME = new QName("http://services.webservice.ocp4.com/", "prolonger");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.clientserviceEmprunt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListerNonRendusParUsager }
     * 
     */
    public ListerNonRendusParUsager createListerNonRendusParUsager() {
        return new ListerNonRendusParUsager();
    }

    /**
     * Create an instance of {@link TrouverEmprunt }
     * 
     */
    public TrouverEmprunt createTrouverEmprunt() {
        return new TrouverEmprunt();
    }

    /**
     * Create an instance of {@link ListerNonRendus }
     * 
     */
    public ListerNonRendus createListerNonRendus() {
        return new ListerNonRendus();
    }

    /**
     * Create an instance of {@link EnCoursPourExemplaire }
     * 
     */
    public EnCoursPourExemplaire createEnCoursPourExemplaire() {
        return new EnCoursPourExemplaire();
    }

    /**
     * Create an instance of {@link ListerEnCoursParUsagerResponse }
     * 
     */
    public ListerEnCoursParUsagerResponse createListerEnCoursParUsagerResponse() {
        return new ListerEnCoursParUsagerResponse();
    }

    /**
     * Create an instance of {@link ListerNonRendusParUsagerResponse }
     * 
     */
    public ListerNonRendusParUsagerResponse createListerNonRendusParUsagerResponse() {
        return new ListerNonRendusParUsagerResponse();
    }

    /**
     * Create an instance of {@link ProlongerResponse }
     * 
     */
    public ProlongerResponse createProlongerResponse() {
        return new ProlongerResponse();
    }

    /**
     * Create an instance of {@link TrouverEmpruntResponse }
     * 
     */
    public TrouverEmpruntResponse createTrouverEmpruntResponse() {
        return new TrouverEmpruntResponse();
    }

    /**
     * Create an instance of {@link Prolonger }
     * 
     */
    public Prolonger createProlonger() {
        return new Prolonger();
    }

    /**
     * Create an instance of {@link EnCoursPourExemplaireResponse }
     * 
     */
    public EnCoursPourExemplaireResponse createEnCoursPourExemplaireResponse() {
        return new EnCoursPourExemplaireResponse();
    }

    /**
     * Create an instance of {@link ListerEnCoursParUsager }
     * 
     */
    public ListerEnCoursParUsager createListerEnCoursParUsager() {
        return new ListerEnCoursParUsager();
    }

    /**
     * Create an instance of {@link ListerNonRendusResponse }
     * 
     */
    public ListerNonRendusResponse createListerNonRendusResponse() {
        return new ListerNonRendusResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link Emprunt }
     * 
     */
    public Emprunt createEmprunt() {
        return new Emprunt();
    }

    /**
     * Create an instance of {@link Edition }
     * 
     */
    public Edition createEdition() {
        return new Edition();
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
     * Create an instance of {@link Exemplaire }
     * 
     */
    public Exemplaire createExemplaire() {
        return new Exemplaire();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerEnCoursParUsagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerEnCoursParUsagerResponse")
    public JAXBElement<ListerEnCoursParUsagerResponse> createListerEnCoursParUsagerResponse(ListerEnCoursParUsagerResponse value) {
        return new JAXBElement<ListerEnCoursParUsagerResponse>(_ListerEnCoursParUsagerResponse_QNAME, ListerEnCoursParUsagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerNonRendusParUsagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerNonRendusParUsagerResponse")
    public JAXBElement<ListerNonRendusParUsagerResponse> createListerNonRendusParUsagerResponse(ListerNonRendusParUsagerResponse value) {
        return new JAXBElement<ListerNonRendusParUsagerResponse>(_ListerNonRendusParUsagerResponse_QNAME, ListerNonRendusParUsagerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnCoursPourExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "EnCoursPourExemplaire")
    public JAXBElement<EnCoursPourExemplaire> createEnCoursPourExemplaire(EnCoursPourExemplaire value) {
        return new JAXBElement<EnCoursPourExemplaire>(_EnCoursPourExemplaire_QNAME, EnCoursPourExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerNonRendus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerNonRendus")
    public JAXBElement<ListerNonRendus> createListerNonRendus(ListerNonRendus value) {
        return new JAXBElement<ListerNonRendus>(_ListerNonRendus_QNAME, ListerNonRendus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerNonRendusParUsager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerNonRendusParUsager")
    public JAXBElement<ListerNonRendusParUsager> createListerNonRendusParUsager(ListerNonRendusParUsager value) {
        return new JAXBElement<ListerNonRendusParUsager>(_ListerNonRendusParUsager_QNAME, ListerNonRendusParUsager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverEmprunt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverEmprunt")
    public JAXBElement<TrouverEmprunt> createTrouverEmprunt(TrouverEmprunt value) {
        return new JAXBElement<TrouverEmprunt>(_TrouverEmprunt_QNAME, TrouverEmprunt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnCoursPourExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "EnCoursPourExemplaireResponse")
    public JAXBElement<EnCoursPourExemplaireResponse> createEnCoursPourExemplaireResponse(EnCoursPourExemplaireResponse value) {
        return new JAXBElement<EnCoursPourExemplaireResponse>(_EnCoursPourExemplaireResponse_QNAME, EnCoursPourExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerEnCoursParUsager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerEnCoursParUsager")
    public JAXBElement<ListerEnCoursParUsager> createListerEnCoursParUsager(ListerEnCoursParUsager value) {
        return new JAXBElement<ListerEnCoursParUsager>(_ListerEnCoursParUsager_QNAME, ListerEnCoursParUsager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerNonRendusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerNonRendusResponse")
    public JAXBElement<ListerNonRendusResponse> createListerNonRendusResponse(ListerNonRendusResponse value) {
        return new JAXBElement<ListerNonRendusResponse>(_ListerNonRendusResponse_QNAME, ListerNonRendusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProlongerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "prolongerResponse")
    public JAXBElement<ProlongerResponse> createProlongerResponse(ProlongerResponse value) {
        return new JAXBElement<ProlongerResponse>(_ProlongerResponse_QNAME, ProlongerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverEmpruntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverEmpruntResponse")
    public JAXBElement<TrouverEmpruntResponse> createTrouverEmpruntResponse(TrouverEmpruntResponse value) {
        return new JAXBElement<TrouverEmpruntResponse>(_TrouverEmpruntResponse_QNAME, TrouverEmpruntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prolonger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "prolonger")
    public JAXBElement<Prolonger> createProlonger(Prolonger value) {
        return new JAXBElement<Prolonger>(_Prolonger_QNAME, Prolonger.class, null, value);
    }

}
