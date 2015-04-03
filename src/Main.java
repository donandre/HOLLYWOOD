import org.hibernate.Session;

public class Main {
    public static void main(final String[] args){
        System.out.println("aaa");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        System.out.println("Is connected = " + session.isConnected());
        session.close();
        System.out.println("Is connected = "+session.isConnected());
    }
}


