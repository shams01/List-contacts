package contact.dao;
/**
 * Фабрика для создания экземпляра ContactDAO
 */
public class ContactDAOFactory {
    public static ContactDAO getContactDAO(){
        return new ContactSimpleDAO();
    }
}
