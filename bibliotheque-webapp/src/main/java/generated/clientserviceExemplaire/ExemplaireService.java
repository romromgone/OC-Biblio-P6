
package generated.clientserviceExemplaire;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExemplaireService", targetNamespace = "http://services.webservice.ocp4.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExemplaireService {


    /**
     * 
     * @param arg0
     * @return
     *     returns generated.clientserviceExemplaire.Exemplaire
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trouverExemplaire", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceExemplaire.TrouverExemplaire")
    @ResponseWrapper(localName = "trouverExemplaireResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceExemplaire.TrouverExemplaireResponse")
    @Action(input = "http://services.webservice.ocp4.com/ExemplaireService/trouverExemplaireRequest", output = "http://services.webservice.ocp4.com/ExemplaireService/trouverExemplaireResponse")
    public Exemplaire trouverExemplaire(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.clientserviceExemplaire.Exemplaire>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerParEdition", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceExemplaire.ListerParEdition")
    @ResponseWrapper(localName = "listerParEditionResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceExemplaire.ListerParEditionResponse")
    @Action(input = "http://services.webservice.ocp4.com/ExemplaireService/listerParEditionRequest", output = "http://services.webservice.ocp4.com/ExemplaireService/listerParEditionResponse")
    public List<Exemplaire> listerParEdition(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}