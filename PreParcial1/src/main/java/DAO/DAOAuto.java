package DAO;

import Objetos.Auto;
import org.hibernate.Session;

public class DAOAuto {
    public void save(Auto auto)
    {
        try(Session session = HibernateUtil.getSession())
        {
            session.beginTransaction();
            session.save(auto);
            session.getTransaction().commit();
        }
    }
    public void update(int id, String modelo, String patente)
    {
        try(Session session = HibernateUtil.getSession())
        {
            session.beginTransaction();
            Auto auto = session.get(Auto.class,id);
            auto.setPatente(patente);
            auto.setModelo(modelo);
            session.update(auto);
            session.getTransaction().commit();
        }
    }
    public void delete(int id)
    {
        try(Session session = HibernateUtil.getSession())
        {
            session.beginTransaction();
            Auto auto = session.get(Auto.class, id);
            session.delete(auto);
            session.getTransaction().commit();
        }
    }

}
