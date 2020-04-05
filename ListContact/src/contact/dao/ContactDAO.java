package contact.dao;

import contact.entity.Contact;

import java.util.List;
/**
 * Интерфейс для определения функций хранилища данных о контактах
 */
public interface ContactDAO {
    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(Contact contact);
    // Редактирование контакта
    public void updateContact(Contact contact);
    // Удаление контакта по его ID
    public void deleteContact(Long contactId);
    // Получение контакта
    public Contact getContact(Long contactId);
    // Получение списка контактов
    public List<Contact> findContacts();
}
