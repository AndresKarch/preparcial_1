package Logica;
import DAO.DAOAuto;
import Objetos.Auto;
public class Autos {
    DAOAuto DAOauto = new DAOAuto();
    public void nuevo_auto(String modelo, String patente)
    {
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setPatente(patente);
        DAOauto.save(auto);
    }
    public void eliminar_auto(int id)
    {
        DAOauto.delete(id);
    }
    public void actualizar_auto(String modelo, String patente)
    {
        Auto auto = new Auto();
        auto.setModelo(modelo);
        auto.setPatente(patente);
        DAOauto.save(auto);
    }
}
