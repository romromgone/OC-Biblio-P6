
package generated.clientserviceReservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour enumererParOuvrageResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="enumererParOuvrageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enumererParOuvrageResponse", propOrder = {
    "_return"
})
public class EnumererParOuvrageResponse {

    @XmlElement(name = "return")
    protected Integer _return;

    /**
     * Obtient la valeur de la propri�t� return.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturn() {
        return _return;
    }

    /**
     * D�finit la valeur de la propri�t� return.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturn(Integer value) {
        this._return = value;
    }

}
