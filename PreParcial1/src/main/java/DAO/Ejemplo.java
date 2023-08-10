package DAO;

import org.hibernate.Session;

public class Ejemplo {
    public void cargar_ejemplos()
    {
        try(Session session = HibernateUtil.getSession()) {
            String insertAutosQuery = "INSERT INTO autos (modelo, patente) VALUES " +
                    "('Auto1', 'ABC123')," +
                    "('Auto2', 'DEF456')," +
                    "('Auto3', 'GHI789')";
            session.createSQLQuery(insertAutosQuery).executeUpdate();

            String insertMultasQuery = "INSERT INTO multas (fecha, patente, monto, pagado) VALUES " +
                    "('2023-05-01', 'ABC123', 100.00, 1)," +
                    "('2023-05-05', 'ABC123', 200.00, 0)," +
                    "('2023-05-02', 'DEF456', 150.00, 1)," +
                    "('2023-05-08', 'DEF456', 300.00, 1)," +
                    "('2023-05-03', 'GHI789', 250.00, 1)," +
                    "('2023-05-09', 'GHI789', 100.00, 0)," +
                    "('2023-05-04', 'ABC123', 150.00, 1)," +
                    "('2023-05-10', 'ABC123', 100.00, 0)," +
                    "('2023-05-06', 'DEF456', 200.00, 1)," +
                    "('2023-05-11', 'DEF456', 250.00, 0)";
            session.createSQLQuery(insertMultasQuery).executeUpdate();
        }
    }

}
