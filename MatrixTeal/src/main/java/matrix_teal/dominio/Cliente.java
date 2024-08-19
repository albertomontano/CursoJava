package matrix_teal.dominio;

import java.util.Date;
import java.util.Objects;

public class Cliente {
    private int id;
    private String tipoPersona;
    private String nombreCompletoCliente;
    private String rfcCliente;
    private String curpCliente;
    private Date fechaNacimientoCliente;
    private String domicilioFiscalCliente;
    private String domicilioNegocioCliente;
    private String personaContactoPrincipalCliente;
    private String emailSatCliente;
    private String emailContactoCliente;
    private String obligacionesFiscalesCliente;
    private String ciecCliente;
    private String contraClienteFiel;
    private Date fechaVencimientoFiel;
    private Date fechaVencimientoObligaciones;
    private double montoHonorariosClienteSIva;
    private Date fechaPagoHonoraCliente;

    //Constructor vacio
    public Cliente() {}

    //Constructor que recibe solo id, para eliminacion por medio de busqueda por id
    public Cliente(int id){
        this.id = id;
    }

    //Constructor sin id para la creacion de nuevo cliente
    public Cliente (
            String tipoPersona,
            String nombreCompletoCliente,
            String rfcCliente,
            String curpCliente,
            Date fechaNacimientoCliente,
            String domicilioFiscalCliente,
            String domicilioNegocioCliente,
            String personaContactoPrincipalCliente,
            String emailSatCliente,
            String emailContactoCliente,
            String obligacionesFiscalesCliente,
            String ciecCliente,
            String contraClienteFiel,
            Date fechaVencimientoFiel,
            Date fechaVencimientoObligaciones,
            double montoHonorariosClienteSIva,
            Date fechaPagoHonoraCliente
    ){
        this.tipoPersona = tipoPersona;
        this.nombreCompletoCliente = nombreCompletoCliente;
        this.rfcCliente = rfcCliente;
        this.curpCliente = curpCliente;
        this.fechaNacimientoCliente = fechaNacimientoCliente;
        this.domicilioFiscalCliente = domicilioFiscalCliente;
        this.domicilioNegocioCliente = domicilioNegocioCliente;
        this.personaContactoPrincipalCliente = personaContactoPrincipalCliente;
        this.emailSatCliente = emailSatCliente;
        this.emailContactoCliente = emailContactoCliente;
        this.obligacionesFiscalesCliente = obligacionesFiscalesCliente;
        this.ciecCliente = ciecCliente;
        this.contraClienteFiel = contraClienteFiel;
        this.fechaVencimientoFiel = fechaVencimientoFiel;
        this.fechaVencimientoObligaciones = fechaVencimientoObligaciones;
        this.montoHonorariosClienteSIva = montoHonorariosClienteSIva;
        this.fechaPagoHonoraCliente = fechaPagoHonoraCliente;




    }

    //Constructor para recuperar toda la informacion de cliente (incluye id)
    public Cliente (
            int id,
            String tipoPersona,
            String nombreCompletoCliente,
            String rfcCliente,
            String curpCliente,
            Date fechaNacimientoCliente,
            String domicilioFiscalCliente,
            String domicilioNegocioCliente,
            String personaContactoPrincipalCliente,
            String emailSatCliente,
            String emailContactoCliente,
            String obligacionesFiscalesCliente,
            String ciecCliente,
            String contraClienteFiel,
            Date fechaVencimientoFiel,
            Date fechaVencimientoObligaciones,
            double montoHonorariosClienteSIva,
            Date fechaPagoHonoraCliente
    ){
        this(
                tipoPersona,
                nombreCompletoCliente,
                rfcCliente,
                curpCliente,
                fechaNacimientoCliente,
                domicilioFiscalCliente,
                domicilioNegocioCliente,
                personaContactoPrincipalCliente,
                emailSatCliente,
                emailContactoCliente,
                obligacionesFiscalesCliente,
                ciecCliente,
                contraClienteFiel,
                fechaVencimientoFiel,
                fechaVencimientoObligaciones,
                montoHonorariosClienteSIva,
                fechaPagoHonoraCliente
                );
        this.id = id;



    }

    //Se agregan metodos get y set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getNombreCompletoCliente() {
        return nombreCompletoCliente;
    }

    public void setNombreCompletoCliente(String nombreCompletoCliente) {
        this.nombreCompletoCliente = nombreCompletoCliente;
    }

    public String getRfcCliente() {
        return rfcCliente;
    }

    public void setRfcCliente(String rfcCliente) {
        this.rfcCliente = rfcCliente;
    }

    public String getCurpCliente() {
        return curpCliente;
    }

    public void setCurpCliente(String curpCliente) {
        this.curpCliente = curpCliente;
    }

    public Date getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(Date fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public String getDomicilioFiscalCliente() {
        return domicilioFiscalCliente;
    }

    public void setDomicilioFiscalCliente(String domicilioFiscalCliente) {
        this.domicilioFiscalCliente = domicilioFiscalCliente;
    }

    public String getDomicilioNegocioCliente() {
        return domicilioNegocioCliente;
    }

    public void setDomicilioNegocioCliente(String domicilioNegocioCliente) {
        this.domicilioNegocioCliente = domicilioNegocioCliente;
    }

    public String getPersonaContactoPrincipalCliente() {
        return personaContactoPrincipalCliente;
    }

    public void setPersonaContactoPrincipalCliente(String personaContactoPrincipalCliente) {
        this.personaContactoPrincipalCliente = personaContactoPrincipalCliente;
    }

    public String getEmailSatCliente() {
        return emailSatCliente;
    }

    public void setEmailSatCliente(String emailSatCliente) {
        this.emailSatCliente = emailSatCliente;
    }

    public String getEmailContactoCliente() {
        return emailContactoCliente;
    }

    public void setEmailContactoCliente(String emailContactoCliente) {
        this.emailContactoCliente = emailContactoCliente;
    }

    public String getObligacionesFiscalesCliente() {
        return obligacionesFiscalesCliente;
    }

    public void setObligacionesFiscalesCliente(String obligacionesFiscalesCliente) {
        this.obligacionesFiscalesCliente = obligacionesFiscalesCliente;
    }

    public String getCiecCliente() {
        return ciecCliente;
    }

    public void setCiecCliente(String ciecCliente) {
        this.ciecCliente = ciecCliente;
    }

    public String getContraClienteFiel() {
        return contraClienteFiel;
    }

    public void setContraClienteFiel(String contraClienteFiel) {
        this.contraClienteFiel = contraClienteFiel;
    }

    public Date getFechaVencimientoFiel() {
        return fechaVencimientoFiel;
    }

    public void setFechaVencimientoFiel(Date fechaVencimientoFiel) {
        this.fechaVencimientoFiel = fechaVencimientoFiel;
    }

    public Date getFechaVencimientoObligaciones() {
        return fechaVencimientoObligaciones;
    }

    public void setFechaVencimientoObligaciones(Date fechaVencimientoObligaciones) {
        this.fechaVencimientoObligaciones = fechaVencimientoObligaciones;
    }

    public double getMontoHonorariosClienteSIva() {
        return montoHonorariosClienteSIva;
    }

    public void setMontoHonorariosClienteSIva(double montoHonorariosClienteSIva) {
        this.montoHonorariosClienteSIva = montoHonorariosClienteSIva;
    }

    public Date getFechaPagoHonoraCliente() {
        return fechaPagoHonoraCliente;
    }

    public void setFechaPagoHonoraCliente(Date fechaPagoHonoraCliente) {
        this.fechaPagoHonoraCliente = fechaPagoHonoraCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", tipoPersona='" + tipoPersona + '\'' +
                ", nombreCompletoCliente='" + nombreCompletoCliente + '\'' +
                ", rfcCliente='" + rfcCliente + '\'' +
                ", curpCliente='" + curpCliente + '\'' +
                ", fechaNacimientoCliente=" + fechaNacimientoCliente +
                ", domicilioFiscalCliente='" + domicilioFiscalCliente + '\'' +
                ", domicilioNegocioCliente='" + domicilioNegocioCliente + '\'' +
                ", personaContactoPrincipalCliente='" + personaContactoPrincipalCliente + '\'' +
                ", emailSatCliente='" + emailSatCliente + '\'' +
                ", emailContactoCliente='" + emailContactoCliente + '\'' +
                ", obligacionesFiscalesCliente='" + obligacionesFiscalesCliente + '\'' +
                ", ciecCliente='" + ciecCliente + '\'' +
                ", contraClienteFiel='" + contraClienteFiel + '\'' +
                ", fechaVencimientoFiel=" + fechaVencimientoFiel +
                ", fechaVencimientoObligaciones=" + fechaVencimientoObligaciones +
                ", montoHonorariosClienteSIva=" + montoHonorariosClienteSIva +
                ", fechaPagoHonoraCliente=" + fechaPagoHonoraCliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && Double.compare(montoHonorariosClienteSIva, cliente.montoHonorariosClienteSIva) == 0 && Objects.equals(tipoPersona, cliente.tipoPersona) && Objects.equals(nombreCompletoCliente, cliente.nombreCompletoCliente) && Objects.equals(rfcCliente, cliente.rfcCliente) && Objects.equals(curpCliente, cliente.curpCliente) && Objects.equals(fechaNacimientoCliente, cliente.fechaNacimientoCliente) && Objects.equals(domicilioFiscalCliente, cliente.domicilioFiscalCliente) && Objects.equals(domicilioNegocioCliente, cliente.domicilioNegocioCliente) && Objects.equals(personaContactoPrincipalCliente, cliente.personaContactoPrincipalCliente) && Objects.equals(emailSatCliente, cliente.emailSatCliente) && Objects.equals(emailContactoCliente, cliente.emailContactoCliente) && Objects.equals(obligacionesFiscalesCliente, cliente.obligacionesFiscalesCliente) && Objects.equals(ciecCliente, cliente.ciecCliente) && Objects.equals(contraClienteFiel, cliente.contraClienteFiel) && Objects.equals(fechaVencimientoFiel, cliente.fechaVencimientoFiel) && Objects.equals(fechaVencimientoObligaciones, cliente.fechaVencimientoObligaciones) && Objects.equals(fechaPagoHonoraCliente, cliente.fechaPagoHonoraCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoPersona, nombreCompletoCliente, rfcCliente, curpCliente, fechaNacimientoCliente, domicilioFiscalCliente, domicilioNegocioCliente, personaContactoPrincipalCliente, emailSatCliente, emailContactoCliente, obligacionesFiscalesCliente, ciecCliente, contraClienteFiel, fechaVencimientoFiel, fechaVencimientoObligaciones, montoHonorariosClienteSIva, fechaPagoHonoraCliente);
    }
}
