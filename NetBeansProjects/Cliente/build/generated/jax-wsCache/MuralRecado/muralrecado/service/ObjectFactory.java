
package muralrecado.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the muralrecado.service package. 
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

    private final static QName _Inserir_QNAME = new QName("http://service.muralrecado/", "inserir");
    private final static QName _ConsultarResponse_QNAME = new QName("http://service.muralrecado/", "consultarResponse");
    private final static QName _Consultar_QNAME = new QName("http://service.muralrecado/", "consultar");
    private final static QName _InserirResponse_QNAME = new QName("http://service.muralrecado/", "inserirResponse");
    private final static QName _Remover_QNAME = new QName("http://service.muralrecado/", "remover");
    private final static QName _RemoverResponse_QNAME = new QName("http://service.muralrecado/", "removerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: muralrecado.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarResponse }
     * 
     */
    public ConsultarResponse createConsultarResponse() {
        return new ConsultarResponse();
    }

    /**
     * Create an instance of {@link Inserir }
     * 
     */
    public Inserir createInserir() {
        return new Inserir();
    }

    /**
     * Create an instance of {@link Consultar }
     * 
     */
    public Consultar createConsultar() {
        return new Consultar();
    }

    /**
     * Create an instance of {@link InserirResponse }
     * 
     */
    public InserirResponse createInserirResponse() {
        return new InserirResponse();
    }

    /**
     * Create an instance of {@link Remover }
     * 
     */
    public Remover createRemover() {
        return new Remover();
    }

    /**
     * Create an instance of {@link RemoverResponse }
     * 
     */
    public RemoverResponse createRemoverResponse() {
        return new RemoverResponse();
    }

    /**
     * Create an instance of {@link Recado }
     * 
     */
    public Recado createRecado() {
        return new Recado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inserir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.muralrecado/", name = "inserir")
    public JAXBElement<Inserir> createInserir(Inserir value) {
        return new JAXBElement<Inserir>(_Inserir_QNAME, Inserir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.muralrecado/", name = "consultarResponse")
    public JAXBElement<ConsultarResponse> createConsultarResponse(ConsultarResponse value) {
        return new JAXBElement<ConsultarResponse>(_ConsultarResponse_QNAME, ConsultarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Consultar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.muralrecado/", name = "consultar")
    public JAXBElement<Consultar> createConsultar(Consultar value) {
        return new JAXBElement<Consultar>(_Consultar_QNAME, Consultar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.muralrecado/", name = "inserirResponse")
    public JAXBElement<InserirResponse> createInserirResponse(InserirResponse value) {
        return new JAXBElement<InserirResponse>(_InserirResponse_QNAME, InserirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remover }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.muralrecado/", name = "remover")
    public JAXBElement<Remover> createRemover(Remover value) {
        return new JAXBElement<Remover>(_Remover_QNAME, Remover.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.muralrecado/", name = "removerResponse")
    public JAXBElement<RemoverResponse> createRemoverResponse(RemoverResponse value) {
        return new JAXBElement<RemoverResponse>(_RemoverResponse_QNAME, RemoverResponse.class, null, value);
    }

}
