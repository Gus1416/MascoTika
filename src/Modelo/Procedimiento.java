
package Modelo;



public class Procedimiento {
    
    private String IDProcedimiento;
    private String Tipo;
    private int MontoUnitario;
    private String DescripcionProcedimiento;
    private int MontoServAdom;
    private int CodigoCategoria;
    private int IDPaciente;

    public Procedimiento() {
    }

    public Procedimiento(String IDProcedimiento, String Tipo,int MontoUnitario, int MontoServAdom,String DescripcionProcedimiento, int CodigoCategoria, int IDPaciente) {
        this.IDProcedimiento = IDProcedimiento;
        this.Tipo = Tipo;
        this.MontoUnitario = MontoUnitario;
        this.DescripcionProcedimiento = DescripcionProcedimiento;
        this.MontoServAdom = MontoServAdom;
        this.CodigoCategoria = CodigoCategoria;
        this.IDPaciente = IDPaciente;
    }


    
  
  
    
    /**
     * @return the IDProcedimiento
     */
    public String getIDProcedimiento() {
        return IDProcedimiento;
    }

    /**
     * @param IDProcedimiento the IDProcedimiento to set
     */
    public void setIDProcedimiento(String IDProcedimiento) {
        this.IDProcedimiento = IDProcedimiento;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the MontoUnitario
     */
    public int getMontoUnitario() {
        return MontoUnitario;
    }

    /**
     * @param MontoUnitario the MontoUnitario to set
     */
    public void setMontoUnitario(int MontoUnitario) {
        this.MontoUnitario = MontoUnitario;
    }

    /**
     * @return the DescripcionProcedimiento
     */
    public String getDescripcionProcedimiento() {
        return DescripcionProcedimiento;
    }

    /**
     * @param DescripcionProcedimiento the DescripcionProcedimiento to set
     */
    public void setDescripcionProcedimiento(String DescripcionProcedimiento) {
        this.DescripcionProcedimiento = DescripcionProcedimiento;
    }

    /**
     * @return the MontoServAdom
     */
    public int getMontoServAdom() {
        return MontoServAdom;
    }

    /**
     * @param MontoServAdom the MontoServAdom to set
     */
    public void setMontoServAdom(int MontoServAdom) {
        this.MontoServAdom = MontoServAdom;
    }
    
}
