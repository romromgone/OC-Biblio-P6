
package generated.clientserviceUsager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.clientserviceUsager package. 
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

    private final static QName _TrouverUsager_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverUsager");
    private final static QName _TrouverUsagerResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverUsagerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.clientserviceUsager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrouverUsagerResponse }
     * 
     */
    public TrouverUsagerResponse createTrouverUsagerResponse() {
        return new TrouverUsagerResponse();
    }

    /**
     * Create an instance of {@link TrouverUsager }
     * 
     */
    public TrouverUsager createTrouverUsager() {
        return new TrouverUsager();
    }

    /**
     * Create an instance of {@link Usager }
     * 
     */
    public Usager createUsager() {
        return new Usager();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverUsager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverUsager")
    public JAXBElement<TrouverUsager> createTrouverUsager(TrouverUsager value) {
        return new JAXBElement<TrouverUsager>(_TrouverUsager_QNAME, TrouverUsager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverUsagerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "trouverUsagerResponse")
    public JAXBElement<TrouverUsagerResponse> createTrouverUsagerResponse(TrouverUsagerResponse value) {
        return new JAXBElement<TrouverUsagerResponse>(_TrouverUsagerResponse_QNAME, TrouverUsagerResponse.class, null, value);
    }

}
