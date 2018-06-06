
package generated.clientserviceEdition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.clientserviceEdition package. 
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

    private final static QName _TrouverEditionResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverEditionResponse");
    private final static QName _TrouverEdition_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverEdition");
    private final static QName _ListerParOuvrageResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParOuvrageResponse");
    private final static QName _ListerParOuvrage_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParOuvrage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.clientserviceEdition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListerParOuvrage }
     * 
     */
    public ListerParOuvrage createListerParOuvrage() {
        return new ListerParOuvrage();
    }

    /**
     * Create an instance of {@link ListerParOuvrageResponse }
     * 
     */
    public ListerParOuvrageResponse createListerParOuvrageResponse() {
        return new ListerParOuvrageResponse();
    }

    /**
     * Create an instance of {@link TrouverEditionResponse }
     * 
     */
    public TrouverEditionResponse createTrouverEditionResponse() {
        return new TrouverEditionResponse();
    }

    /**
     * Create an instance of {@link TrouverEdition }
     * 
     */
    public TrouverEdition createTrouverEdition() {
        return new TrouverEdition();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverEditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverEditionResponse")
    public JAXBElement<TrouverEditionResponse> createTrouverEditionResponse(TrouverEditionResponse value) {
        return new JAXBElement<TrouverEditionResponse>(_TrouverEditionResponse_QNAME, TrouverEditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverEdition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverEdition")
    public JAXBElement<TrouverEdition> createTrouverEdition(TrouverEdition value) {
        return new JAXBElement<TrouverEdition>(_TrouverEdition_QNAME, TrouverEdition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParOuvrageResponse")
    public JAXBElement<ListerParOuvrageResponse> createListerParOuvrageResponse(ListerParOuvrageResponse value) {
        return new JAXBElement<ListerParOuvrageResponse>(_ListerParOuvrageResponse_QNAME, ListerParOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParOuvrage")
    public JAXBElement<ListerParOuvrage> createListerParOuvrage(ListerParOuvrage value) {
        return new JAXBElement<ListerParOuvrage>(_ListerParOuvrage_QNAME, ListerParOuvrage.class, null, value);
    }

}
