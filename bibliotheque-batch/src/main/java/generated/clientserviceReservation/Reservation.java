
package generated.clientserviceReservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOuvrage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mailUsager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ouvrage" type="{http://services.webservice.ocp4.com/}ouvrage" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tsMailEnvoye" type="{http://services.webservice.ocp4.com/}timestamp" minOccurs="0"/>
 *         &lt;element name="usager" type="{http://services.webservice.ocp4.com/}usager" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "idOuvrage",
    "mailUsager",
    "ouvrage",
    "position",
    "tsMailEnvoye",
    "usager"
})
public class Reservation {

    protected Integer idOuvrage;
    protected String mailUsager;
    protected Ouvrage ouvrage;
    protected Integer position;
    protected Timestamp tsMailEnvoye;
    protected Usager usager;

    /**
     * Obtient la valeur de la propri�t� idOuvrage.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOuvrage() {
        return idOuvrage;
    }

    /**
     * D�finit la valeur de la propri�t� idOuvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOuvrage(Integer value) {
        this.idOuvrage = value;
    }

    /**
     * Obtient la valeur de la propri�t� mailUsager.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailUsager() {
        return mailUsager;
    }

    /**
     * D�finit la valeur de la propri�t� mailUsager.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailUsager(String value) {
        this.mailUsager = value;
    }

    /**
     * Obtient la valeur de la propri�t� ouvrage.
     * 
     * @return
     *     possible object is
     *     {@link Ouvrage }
     *     
     */
    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    /**
     * D�finit la valeur de la propri�t� ouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link Ouvrage }
     *     
     */
    public void setOuvrage(Ouvrage value) {
        this.ouvrage = value;
    }

    /**
     * Obtient la valeur de la propri�t� position.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * D�finit la valeur de la propri�t� position.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosition(Integer value) {
        this.position = value;
    }

    /**
     * Obtient la valeur de la propri�t� tsMailEnvoye.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getTsMailEnvoye() {
        return tsMailEnvoye;
    }

    /**
     * D�finit la valeur de la propri�t� tsMailEnvoye.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setTsMailEnvoye(Timestamp value) {
        this.tsMailEnvoye = value;
    }

    /**
     * Obtient la valeur de la propri�t� usager.
     * 
     * @return
     *     possible object is
     *     {@link Usager }
     *     
     */
    public Usager getUsager() {
        return usager;
    }

    /**
     * D�finit la valeur de la propri�t� usager.
     * 
     * @param value
     *     allowed object is
     *     {@link Usager }
     *     
     */
    public void setUsager(Usager value) {
        this.usager = value;
    }

}
