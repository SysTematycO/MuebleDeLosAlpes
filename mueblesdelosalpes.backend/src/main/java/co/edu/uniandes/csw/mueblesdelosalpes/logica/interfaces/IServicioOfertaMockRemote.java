package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import java.util.List;
import javax.ejb.Remote;


@Remote
public interface IServicioOfertaMockRemote {

    public void agregarOferta(Oferta oferta);

    public List<Oferta> listarOfertas();


}