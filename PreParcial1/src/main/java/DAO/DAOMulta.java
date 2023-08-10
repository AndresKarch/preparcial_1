package DAO;

import Objetos.Auto;
import Objetos.Multa;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.Date;

public class DAOMulta {
    public void save(Multa multa)
    {
        try(Session session = HibernateUtil.getSession())
        {
            session.beginTransaction();
            session.save(multa);
            session.getTransaction().commit();
        }
    }
    public void update(int id, Date fecha, int id_patente, boolean pagado, BigDecimal monto)
    {
        try(Session session = HibernateUtil.getSession())
        {
            session.beginTransaction();
            Multa multa = session.get(Multa.class, id);
            multa.setFecha(fecha);
            multa.setMonto(monto);
            multa.setPagado(pagado);
            multa.setAuto(session.get(Auto.class,id_patente));
            session.update(multa);
            session.getTransaction().commit();
        }
    }
    public void delete(int id)
    {
        try(Session session = HibernateUtil.getSession())
        {
            session.beginTransaction();
            Multa multa = session.get(Multa.class, id);
            session.delete(multa);
            session.getTransaction().commit();
        }
    }
}
