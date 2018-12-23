
package generated.clientserviceOuvrage;

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
@WebService(name = "OuvrageService", targetNamespace = "http://services.webservice.ocp4.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OuvrageService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listeReservationsComplete", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.ListeReservationsComplete")
    @ResponseWrapper(localName = "listeReservationsCompleteResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.ListeReservationsCompleteResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/listeReservationsCompleteRequest", output = "http://services.webservice.ocp4.com/OuvrageService/listeReservationsCompleteResponse")
    public Boolean listeReservationsComplete(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.clientserviceOuvrage.Ouvrage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rechercherParTitre", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.RechercherParTitre")
    @ResponseWrapper(localName = "rechercherParTitreResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.RechercherParTitreResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/rechercherParTitreRequest", output = "http://services.webservice.ocp4.com/OuvrageService/rechercherParTitreResponse")
    public List<Ouvrage> rechercherParTitre(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.clientserviceOuvrage.Ouvrage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rechercherParAuteur", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.RechercherParAuteur")
    @ResponseWrapper(localName = "rechercherParAuteurResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.RechercherParAuteurResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/rechercherParAuteurRequest", output = "http://services.webservice.ocp4.com/OuvrageService/rechercherParAuteurResponse")
    public List<Ouvrage> rechercherParAuteur(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<generated.clientserviceOuvrage.Ouvrage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rechercherParTitreEtAuteur", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.RechercherParTitreEtAuteur")
    @ResponseWrapper(localName = "rechercherParTitreEtAuteurResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.RechercherParTitreEtAuteurResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/rechercherParTitreEtAuteurRequest", output = "http://services.webservice.ocp4.com/OuvrageService/rechercherParTitreEtAuteurResponse")
    public List<Ouvrage> rechercherParTitreEtAuteur(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enCoursDEmprunt", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.EnCoursDEmprunt")
    @ResponseWrapper(localName = "enCoursDEmpruntResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.EnCoursDEmpruntResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/enCoursDEmpruntRequest", output = "http://services.webservice.ocp4.com/OuvrageService/enCoursDEmpruntResponse")
    public Boolean enCoursDEmprunt(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<generated.clientserviceOuvrage.Ouvrage>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerTout", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.ListerTout")
    @ResponseWrapper(localName = "listerToutResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.ListerToutResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/listerToutRequest", output = "http://services.webservice.ocp4.com/OuvrageService/listerToutResponse")
    public List<Ouvrage> listerTout();

    /**
     * 
     * @param arg0
     * @return
     *     returns generated.clientserviceOuvrage.Ouvrage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "trouverOuvrage", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.TrouverOuvrage")
    @ResponseWrapper(localName = "trouverOuvrageResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceOuvrage.TrouverOuvrageResponse")
    @Action(input = "http://services.webservice.ocp4.com/OuvrageService/trouverOuvrageRequest", output = "http://services.webservice.ocp4.com/OuvrageService/trouverOuvrageResponse")
    public Ouvrage trouverOuvrage(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

}
