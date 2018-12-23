
package generated.clientserviceOuvrage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.clientserviceOuvrage package. 
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

    private final static QName _TrouverOuvrageResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverOuvrageResponse");
    private final static QName _EnCoursDEmpruntResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "enCoursDEmpruntResponse");
    private final static QName _ListeReservationsCompleteResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listeReservationsCompleteResponse");
    private final static QName _EnCoursDEmprunt_QNAME = new QName("http://services.webservice.ocp4.com/", "enCoursDEmprunt");
    private final static QName _ListerTout_QNAME = new QName("http://services.webservice.ocp4.com/", "listerTout");
    private final static QName _ListeReservationsComplete_QNAME = new QName("http://services.webservice.ocp4.com/", "listeReservationsComplete");
    private final static QName _RechercherParTitre_QNAME = new QName("http://services.webservice.ocp4.com/", "rechercherParTitre");
    private final static QName _RechercherParAuteur_QNAME = new QName("http://services.webservice.ocp4.com/", "rechercherParAuteur");
    private final static QName _RechercherParTitreEtAuteur_QNAME = new QName("http://services.webservice.ocp4.com/", "rechercherParTitreEtAuteur");
    private final static QName _RechercherParAuteurResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "rechercherParAuteurResponse");
    private final static QName _ListerToutResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerToutResponse");
    private final static QName _RechercherParTitreResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "rechercherParTitreResponse");
    private final static QName _RechercherParTitreEtAuteurResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "rechercherParTitreEtAuteurResponse");
    private final static QName _TrouverOuvrage_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverOuvrage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.clientserviceOuvrage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercherParTitreEtAuteur }
     * 
     */
    public RechercherParTitreEtAuteur createRechercherParTitreEtAuteur() {
        return new RechercherParTitreEtAuteur();
    }

    /**
     * Create an instance of {@link RechercherParAuteur }
     * 
     */
    public RechercherParAuteur createRechercherParAuteur() {
        return new RechercherParAuteur();
    }

    /**
     * Create an instance of {@link EnCoursDEmpruntResponse }
     * 
     */
    public EnCoursDEmpruntResponse createEnCoursDEmpruntResponse() {
        return new EnCoursDEmpruntResponse();
    }

    /**
     * Create an instance of {@link ListeReservationsCompleteResponse }
     * 
     */
    public ListeReservationsCompleteResponse createListeReservationsCompleteResponse() {
        return new ListeReservationsCompleteResponse();
    }

    /**
     * Create an instance of {@link EnCoursDEmprunt }
     * 
     */
    public EnCoursDEmprunt createEnCoursDEmprunt() {
        return new EnCoursDEmprunt();
    }

    /**
     * Create an instance of {@link ListerTout }
     * 
     */
    public ListerTout createListerTout() {
        return new ListerTout();
    }

    /**
     * Create an instance of {@link ListeReservationsComplete }
     * 
     */
    public ListeReservationsComplete createListeReservationsComplete() {
        return new ListeReservationsComplete();
    }

    /**
     * Create an instance of {@link RechercherParTitre }
     * 
     */
    public RechercherParTitre createRechercherParTitre() {
        return new RechercherParTitre();
    }

    /**
     * Create an instance of {@link TrouverOuvrageResponse }
     * 
     */
    public TrouverOuvrageResponse createTrouverOuvrageResponse() {
        return new TrouverOuvrageResponse();
    }

    /**
     * Create an instance of {@link RechercherParTitreEtAuteurResponse }
     * 
     */
    public RechercherParTitreEtAuteurResponse createRechercherParTitreEtAuteurResponse() {
        return new RechercherParTitreEtAuteurResponse();
    }

    /**
     * Create an instance of {@link TrouverOuvrage }
     * 
     */
    public TrouverOuvrage createTrouverOuvrage() {
        return new TrouverOuvrage();
    }

    /**
     * Create an instance of {@link RechercherParAuteurResponse }
     * 
     */
    public RechercherParAuteurResponse createRechercherParAuteurResponse() {
        return new RechercherParAuteurResponse();
    }

    /**
     * Create an instance of {@link ListerToutResponse }
     * 
     */
    public ListerToutResponse createListerToutResponse() {
        return new ListerToutResponse();
    }

    /**
     * Create an instance of {@link RechercherParTitreResponse }
     * 
     */
    public RechercherParTitreResponse createRechercherParTitreResponse() {
        return new RechercherParTitreResponse();
    }

    /**
     * Create an instance of {@link Ouvrage }
     * 
     */
    public Ouvrage createOuvrage() {
        return new Ouvrage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverOuvrageResponse")
    public JAXBElement<TrouverOuvrageResponse> createTrouverOuvrageResponse(TrouverOuvrageResponse value) {
        return new JAXBElement<TrouverOuvrageResponse>(_TrouverOuvrageResponse_QNAME, TrouverOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnCoursDEmpruntResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "enCoursDEmpruntResponse")
    public JAXBElement<EnCoursDEmpruntResponse> createEnCoursDEmpruntResponse(EnCoursDEmpruntResponse value) {
        return new JAXBElement<EnCoursDEmpruntResponse>(_EnCoursDEmpruntResponse_QNAME, EnCoursDEmpruntResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeReservationsCompleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listeReservationsCompleteResponse")
    public JAXBElement<ListeReservationsCompleteResponse> createListeReservationsCompleteResponse(ListeReservationsCompleteResponse value) {
        return new JAXBElement<ListeReservationsCompleteResponse>(_ListeReservationsCompleteResponse_QNAME, ListeReservationsCompleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnCoursDEmprunt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "enCoursDEmprunt")
    public JAXBElement<EnCoursDEmprunt> createEnCoursDEmprunt(EnCoursDEmprunt value) {
        return new JAXBElement<EnCoursDEmprunt>(_EnCoursDEmprunt_QNAME, EnCoursDEmprunt.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeReservationsComplete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listeReservationsComplete")
    public JAXBElement<ListeReservationsComplete> createListeReservationsComplete(ListeReservationsComplete value) {
        return new JAXBElement<ListeReservationsComplete>(_ListeReservationsComplete_QNAME, ListeReservationsComplete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParTitre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "rechercherParTitre")
    public JAXBElement<RechercherParTitre> createRechercherParTitre(RechercherParTitre value) {
        return new JAXBElement<RechercherParTitre>(_RechercherParTitre_QNAME, RechercherParTitre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "rechercherParAuteur")
    public JAXBElement<RechercherParAuteur> createRechercherParAuteur(RechercherParAuteur value) {
        return new JAXBElement<RechercherParAuteur>(_RechercherParAuteur_QNAME, RechercherParAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParTitreEtAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "rechercherParTitreEtAuteur")
    public JAXBElement<RechercherParTitreEtAuteur> createRechercherParTitreEtAuteur(RechercherParTitreEtAuteur value) {
        return new JAXBElement<RechercherParTitreEtAuteur>(_RechercherParTitreEtAuteur_QNAME, RechercherParTitreEtAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "rechercherParAuteurResponse")
    public JAXBElement<RechercherParAuteurResponse> createRechercherParAuteurResponse(RechercherParAuteurResponse value) {
        return new JAXBElement<RechercherParAuteurResponse>(_RechercherParAuteurResponse_QNAME, RechercherParAuteurResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParTitreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "rechercherParTitreResponse")
    public JAXBElement<RechercherParTitreResponse> createRechercherParTitreResponse(RechercherParTitreResponse value) {
        return new JAXBElement<RechercherParTitreResponse>(_RechercherParTitreResponse_QNAME, RechercherParTitreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherParTitreEtAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "rechercherParTitreEtAuteurResponse")
    public JAXBElement<RechercherParTitreEtAuteurResponse> createRechercherParTitreEtAuteurResponse(RechercherParTitreEtAuteurResponse value) {
        return new JAXBElement<RechercherParTitreEtAuteurResponse>(_RechercherParTitreEtAuteurResponse_QNAME, RechercherParTitreEtAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverOuvrage")
    public JAXBElement<TrouverOuvrage> createTrouverOuvrage(TrouverOuvrage value) {
        return new JAXBElement<TrouverOuvrage>(_TrouverOuvrage_QNAME, TrouverOuvrage.class, null, value);
    }

}
