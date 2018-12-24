
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

    private final static QName _ModifierOptionRappelResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "modifierOptionRappelResponse");
    private final static QName _ListerParOptionRappel_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParOptionRappel");
    private final static QName _ModifierOptionRappel_QNAME = new QName("http://services.webservice.ocp4.com/", "modifierOptionRappel");
    private final static QName _TrouverUsager_QNAME = new QName("http://services.webservice.ocp4.com/", "trouverUsager");
    private final static QName _ListerParOptionRappelResponse_QNAME = new QName("http://services.webservice.ocp4.com/", "listerParOptionRappelResponse");
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
     * Create an instance of {@link ListerParOptionRappelResponse }
     * 
     */
    public ListerParOptionRappelResponse createListerParOptionRappelResponse() {
        return new ListerParOptionRappelResponse();
    }

    /**
     * Create an instance of {@link ModifierOptionRappelResponse }
     * 
     */
    public ModifierOptionRappelResponse createModifierOptionRappelResponse() {
        return new ModifierOptionRappelResponse();
    }

    /**
     * Create an instance of {@link ListerParOptionRappel }
     * 
     */
    public ListerParOptionRappel createListerParOptionRappel() {
        return new ListerParOptionRappel();
    }

    /**
     * Create an instance of {@link ModifierOptionRappel }
     * 
     */
    public ModifierOptionRappel createModifierOptionRappel() {
        return new ModifierOptionRappel();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierOptionRappelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "modifierOptionRappelResponse")
    public JAXBElement<ModifierOptionRappelResponse> createModifierOptionRappelResponse(ModifierOptionRappelResponse value) {
        return new JAXBElement<ModifierOptionRappelResponse>(_ModifierOptionRappelResponse_QNAME, ModifierOptionRappelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParOptionRappel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParOptionRappel")
    public JAXBElement<ListerParOptionRappel> createListerParOptionRappel(ListerParOptionRappel value) {
        return new JAXBElement<ListerParOptionRappel>(_ListerParOptionRappel_QNAME, ListerParOptionRappel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierOptionRappel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "modifierOptionRappel")
    public JAXBElement<ModifierOptionRappel> createModifierOptionRappel(ModifierOptionRappel value) {
        return new JAXBElement<ModifierOptionRappel>(_ModifierOptionRappel_QNAME, ModifierOptionRappel.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerParOptionRappelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.ocp4.com/", name = "listerParOptionRappelResponse")
    public JAXBElement<ListerParOptionRappelResponse> createListerParOptionRappelResponse(ListerParOptionRappelResponse value) {
        return new JAXBElement<ListerParOptionRappelResponse>(_ListerParOptionRappelResponse_QNAME, ListerParOptionRappelResponse.class, null, value);
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
