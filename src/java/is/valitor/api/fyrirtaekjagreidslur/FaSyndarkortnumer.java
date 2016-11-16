
package is.valitor.api.fyrirtaekjagreidslur;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Notandanafn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lykilord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Samningsnumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SamningsKennitala" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PosiID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kortnumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gildistimi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Oryggisnumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Stillingar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notandanafn",
    "lykilord",
    "samningsnumer",
    "samningsKennitala",
    "posiID",
    "kortnumer",
    "gildistimi",
    "oryggisnumer",
    "stillingar"
})
@XmlRootElement(name = "FaSyndarkortnumer")
public class FaSyndarkortnumer {

    @XmlElement(name = "Notandanafn")
    protected String notandanafn;
    @XmlElement(name = "Lykilord")
    protected String lykilord;
    @XmlElement(name = "Samningsnumer")
    protected String samningsnumer;
    @XmlElement(name = "SamningsKennitala")
    protected String samningsKennitala;
    @XmlElement(name = "PosiID")
    protected String posiID;
    @XmlElement(name = "Kortnumer")
    protected String kortnumer;
    @XmlElement(name = "Gildistimi")
    protected String gildistimi;
    @XmlElement(name = "Oryggisnumer")
    protected String oryggisnumer;
    @XmlElement(name = "Stillingar")
    protected String stillingar;

    /**
     * Gets the value of the notandanafn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotandanafn() {
        return notandanafn;
    }

    /**
     * Sets the value of the notandanafn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotandanafn(String value) {
        this.notandanafn = value;
    }

    /**
     * Gets the value of the lykilord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLykilord() {
        return lykilord;
    }

    /**
     * Sets the value of the lykilord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLykilord(String value) {
        this.lykilord = value;
    }

    /**
     * Gets the value of the samningsnumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamningsnumer() {
        return samningsnumer;
    }

    /**
     * Sets the value of the samningsnumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamningsnumer(String value) {
        this.samningsnumer = value;
    }

    /**
     * Gets the value of the samningsKennitala property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamningsKennitala() {
        return samningsKennitala;
    }

    /**
     * Sets the value of the samningsKennitala property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamningsKennitala(String value) {
        this.samningsKennitala = value;
    }

    /**
     * Gets the value of the posiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosiID() {
        return posiID;
    }

    /**
     * Sets the value of the posiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosiID(String value) {
        this.posiID = value;
    }

    /**
     * Gets the value of the kortnumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKortnumer() {
        return kortnumer;
    }

    /**
     * Sets the value of the kortnumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKortnumer(String value) {
        this.kortnumer = value;
    }

    /**
     * Gets the value of the gildistimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGildistimi() {
        return gildistimi;
    }

    /**
     * Sets the value of the gildistimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGildistimi(String value) {
        this.gildistimi = value;
    }

    /**
     * Gets the value of the oryggisnumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOryggisnumer() {
        return oryggisnumer;
    }

    /**
     * Sets the value of the oryggisnumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOryggisnumer(String value) {
        this.oryggisnumer = value;
    }

    /**
     * Gets the value of the stillingar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStillingar() {
        return stillingar;
    }

    /**
     * Sets the value of the stillingar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStillingar(String value) {
        this.stillingar = value;
    }

}