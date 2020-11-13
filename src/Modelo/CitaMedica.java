
package Modelo;
import java.sql.*;


public class CitaMedica {
    
    private String IDCitaMed;
    private Date Fecha;
    private String Estado;
 

    public CitaMedica() {
    }

    public CitaMedica(String IDCitaMed, Date Fecha, String Estado) {
        this.IDCitaMed = IDCitaMed;
        this.Fecha = Fecha;
        this.Estado = Estado;
    }

    /**
     * @return the IDCitaMed
     */
    public String getIDCitaMed() {
        return IDCitaMed;
    }

    /**
     * @param IDCitaMed the IDCitaMed to set
     */
    public void setIDCitaMed(String IDCitaMed) {
        this.IDCitaMed = IDCitaMed;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
