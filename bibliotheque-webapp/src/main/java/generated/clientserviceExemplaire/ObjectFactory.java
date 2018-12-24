
package generated.clientserviceExemplaire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.clientserviceExemplaire package. 
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

    private final static QName _ListerParEditionResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParEditionResponse");
    private final static QName _TrouverExemplaire_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverExemplaire");
    private final static QName _TrouverExemplaireResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverExemplaireResponse");
    private final static QName _ListerParEdition_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParEdition");
    private final static QName _TrouverExemplaireDisponible_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverExemplaireDisponible");
    private final static QName _TrouverExemplaireDisponibleResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverExemplaireDisponibleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.clientserviceExemplaire
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrouverExemplaireDisponibleResponse }
     * 
     */
    public TrouverExemplaireDisponibleResponse createTrouverExemplaireDisponibleResponse() {
        return new TrouverExemplaireDisponibleResponse();
    }

    /**
     * Create an instance of {@link ListerParEdition }
     * 
     */
    public ListerParEdition createListerParEdition() {
        return new ListerParEdition();
    }

    /**
     * Create an instance of {@link TrouverExemplaireDisponible }
     * 
     */
    public TrouverExemplaireDisponible createTrouverExemplaireDisponible() {
        return new TrouverExemplaireDisponible();
    }

    /**
     * Create an instance of {@link TrouverExemplaireResponse }
     * 
     */
    public TrouverExemplaireResponse createTrouverExemplaireResponse() {
        return new TrouverExemplaireResponse();
    }

    /**
     * Create an instance of {@link ListerParEditionResponse }
     * 
     */
    public ListerParEditionResponse createListerParEditionResponse() {
        return new ListerParEditionResponse();
    }

    /**
     * Create an instance of {@link TrouverExemplaire }
     * 
     */
    public TrouverExemplaire createTrouverExemplaire() {
        return new TrouverExemplaire();
    }

    /**
     * Create an instance of {@link Ouvrage }
     * 
     */
    public Ouvrage createOuvrage() {
        return new Ouvrage();
    }

    /**
     * Create an instance of {@link Edition }
     * 
     */
    public Edition createEdition() {
        return new Edition();
    }

    /**
     * Create an instance of {@link Exemplaire }
     * 
     */
    public Exemplaire createExemplaire() {
        return new Exemplaire();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParEditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParEditionResponse")
    public JAXBElement<ListerParEditionResponse> createListerParEditionResponse(ListerParEditionResponse value) {
        return new JAXBElement<ListerParEditionResponse>(_ListerParEditionResponse_QNAME, ListerParEditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverExemplaire")
    public JAXBElement<TrouverExemplaire> createTrouverExemplaire(TrouverExemplaire value) {
        return new JAXBElement<TrouverExemplaire>(_TrouverExemplaire_QNAME, TrouverExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverExemplaireResponse")
    public JAXBElement<TrouverExemplaireResponse> createTrouverExemplaireResponse(TrouverExemplaireResponse value) {
        return new JAXBElement<TrouverExemplaireResponse>(_TrouverExemplaireResponse_QNAME, TrouverExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParEdition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParEdition")
    public JAXBElement<ListerParEdition> createListerParEdition(ListerParEdition value) {
        return new JAXBElement<ListerParEdition>(_ListerParEdition_QNAME, ListerParEdition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverExemplaireDisponible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverExemplaireDisponible")
    public JAXBElement<TrouverExemplaireDisponible> createTrouverExemplaireDisponible(TrouverExemplaireDisponible value) {
        return new JAXBElement<TrouverExemplaireDisponible>(_TrouverExemplaireDisponible_QNAME, TrouverExemplaireDisponible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverExemplaireDisponibleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverExemplaireDisponibleResponse")
    public JAXBElement<TrouverExemplaireDisponibleResponse> createTrouverExemplaireDisponibleResponse(TrouverExemplaireDisponibleResponse value) {
        return new JAXBElement<TrouverExemplaireDisponibleResponse>(_TrouverExemplaireDisponibleResponse_QNAME, TrouverExemplaireDisponibleResponse.class, null, value);
    }

}
