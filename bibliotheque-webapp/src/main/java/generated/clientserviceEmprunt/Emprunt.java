
package generated.clientserviceEmprunt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour emprunt complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="emprunt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateDeb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exemplaire" type="{http://services.webservice.ocp4.com/}exemplaire" minOccurs="0"/>
 *         &lt;element name="idExemplaire" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mailUsager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prolonge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rendu" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "emprunt", propOrder = {
    "dateDeb",
    "dateFin",
    "exemplaire",
    "idExemplaire",
    "mailUsager",
    "prolonge",
    "rendu",
    "usager"
})
public class Emprunt {

    protected String dateDeb;
    protected String dateFin;
    protected Exemplaire exemplaire;
    protected Integer idExemplaire;
    protected String mailUsager;
    protected Boolean prolonge;
    protected Boolean rendu;
    protected Usager usager;

    /**
     * Obtient la valeur de la propriété dateDeb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDeb() {
        return dateDeb;
    }

    /**
     * Définit la valeur de la propriété dateDeb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDeb(String value) {
        this.dateDeb = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFin(String value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété exemplaire.
     * 
     * @return
     *     possible object is
     *     {@link Exemplaire }
     *     
     */
    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    /**
     * Définit la valeur de la propriété exemplaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemplaire }
     *     
     */
    public void setExemplaire(Exemplaire value) {
        this.exemplaire = value;
    }

    /**
     * Obtient la valeur de la propriété idExemplaire.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdExemplaire() {
        return idExemplaire;
    }

    /**
     * Définit la valeur de la propriété idExemplaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdExemplaire(Integer value) {
        this.idExemplaire = value;
    }

    /**
     * Obtient la valeur de la propriété mailUsager.
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
     * Définit la valeur de la propriété mailUsager.
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
     * Obtient la valeur de la propriété prolonge.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProlonge() {
        return prolonge;
    }

    /**
     * Définit la valeur de la propriété prolonge.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProlonge(Boolean value) {
        this.prolonge = value;
    }

    /**
     * Obtient la valeur de la propriété rendu.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRendu() {
        return rendu;
    }

    /**
     * Définit la valeur de la propriété rendu.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRendu(Boolean value) {
        this.rendu = value;
    }

    /**
     * Obtient la valeur de la propriété usager.
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
     * Définit la valeur de la propriété usager.
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
