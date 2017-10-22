
package muralrecado.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inserir complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apelido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserir", propOrder = {
    "recado",
    "apelido"
})
public class Inserir {

    protected String recado;
    protected String apelido;

    /**
     * Obtém o valor da propriedade recado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecado() {
        return recado;
    }

    /**
     * Define o valor da propriedade recado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecado(String value) {
        this.recado = value;
    }

    /**
     * Obtém o valor da propriedade apelido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Define o valor da propriedade apelido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApelido(String value) {
        this.apelido = value;
    }

}
