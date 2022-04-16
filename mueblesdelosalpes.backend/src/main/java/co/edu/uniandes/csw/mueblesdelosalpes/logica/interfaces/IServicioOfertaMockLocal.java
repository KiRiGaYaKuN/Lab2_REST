/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ IServicioVendedoresMockLocal.java
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 3.0
 *
 * Ejercicio: Muebles de los Alpes
 * Autor: Juan Sebastián Urrego
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;


import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import java.util.List;
import javax.ejb.Local;


/**
 * Contrato funcional de los servicios de administración de los vendedores del sistema
 * @author Juan Sebastián Urrego
 */
@Local
public interface IServicioOfertaMockLocal
{
    
    /**
     *
     * @param oferta
     * @throws OperacionInvalidaException
     */
    public void agregarOferta(Oferta oferta)throws OperacionInvalidaException;


    public List<Oferta> getOfertas();
    
}
