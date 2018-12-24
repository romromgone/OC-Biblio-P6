
package generated.clientserviceReservation;

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
@WebService(name = "ReservationService", targetNamespace = "http://services.webservice.ocp4.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "enumererParOuvrage", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.EnumererParOuvrage")
    @ResponseWrapper(localName = "enumererParOuvrageResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.EnumererParOuvrageResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/enumererParOuvrageRequest", output = "http://services.webservice.ocp4.com/ReservationService/enumererParOuvrageResponse")
    public Integer enumererParOuvrage(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @return
     *     returns java.util.List<generated.clientserviceReservation.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerDelaiDepasse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerDelaiDepasse")
    @ResponseWrapper(localName = "listerDelaiDepasseResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerDelaiDepasseResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/listerDelaiDepasseRequest", output = "http://services.webservice.ocp4.com/ReservationService/listerDelaiDepasseResponse")
    public List<Reservation> listerDelaiDepasse();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "ajouterTSMailEnvoye", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.AjouterTSMailEnvoye")
    @ResponseWrapper(localName = "ajouterTSMailEnvoyeResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.AjouterTSMailEnvoyeResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/ajouterTSMailEnvoyeRequest", output = "http://services.webservice.ocp4.com/ReservationService/ajouterTSMailEnvoyeResponse")
    public void ajouterTSMailEnvoye(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @return
     *     returns java.util.List<generated.clientserviceReservation.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerPourChaqueOuvragePremierePosition", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerPourChaqueOuvragePremierePosition")
    @ResponseWrapper(localName = "listerPourChaqueOuvragePremierePositionResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerPourChaqueOuvragePremierePositionResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/listerPourChaqueOuvragePremierePositionRequest", output = "http://services.webservice.ocp4.com/ReservationService/listerPourChaqueOuvragePremierePositionResponse")
    public List<Reservation> listerPourChaqueOuvragePremierePosition();

    /**
     * 
     * @return
     *     returns java.util.List<generated.clientserviceReservation.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerTout", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerTout")
    @ResponseWrapper(localName = "listerToutResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerToutResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/listerToutRequest", output = "http://services.webservice.ocp4.com/ReservationService/listerToutResponse")
    public List<Reservation> listerTout();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<generated.clientserviceReservation.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listerParUsager", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerParUsager")
    @ResponseWrapper(localName = "listerParUsagerResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.ListerParUsagerResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/listerParUsagerRequest", output = "http://services.webservice.ocp4.com/ReservationService/listerParUsagerResponse")
    public List<Reservation> listerParUsager(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "ajouter", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.Ajouter")
    @ResponseWrapper(localName = "ajouterResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.AjouterResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/ajouterRequest", output = "http://services.webservice.ocp4.com/ReservationService/ajouterResponse")
    public void ajouter(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "supprimer", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.Supprimer")
    @ResponseWrapper(localName = "supprimerResponse", targetNamespace = "http://services.webservice.ocp4.com/", className = "generated.clientserviceReservation.SupprimerResponse")
    @Action(input = "http://services.webservice.ocp4.com/ReservationService/supprimerRequest", output = "http://services.webservice.ocp4.com/ReservationService/supprimerResponse")
    public void supprimer(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Integer arg2);

}
