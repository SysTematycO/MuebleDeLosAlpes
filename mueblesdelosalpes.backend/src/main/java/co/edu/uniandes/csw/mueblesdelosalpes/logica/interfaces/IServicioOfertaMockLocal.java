package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.List;
import javax.ejb.Local;


@Local
public interface IServicioOfertaMockLocal {

    public void agregarOferta(Oferta oferta);

    public List<Oferta> listarOfertas();


}