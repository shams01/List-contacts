package contact.Test;

import contact.business.ContactManager;
import contact.entity.Contact;


import java.util.List;

/**
 * Класс для запуска тестовых вызовов
 */
public class ContactTest {
    public static void main(String[] args) {
        ContactManager conMan = new ContactManager();

        Contact c1 = new Contact("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru");
        Contact c2 = new Contact("Сергей", "Иванов", "+7-911-890-7755", "ivanov@google.com");
        Contact c3 = new Contact("Татьяна", "Семенова", "+7-911-890-1164", "semenova@mail.ru");

        System.out.println("===ADD CONTACT===");
        Long cId1 = conMan.addContact(c1);
        Long cId2 = conMan.addContact(c2);
        Long cId3 = conMan.addContact(c3);
        List<Contact> resultCon1 = conMan.findContacts();
        for(Contact listCon : resultCon1){
            System.out.println(listCon);
        }

        System.out.println("===UPDATE CONTACT===");
        Contact c4 = new Contact(cId1,"Tom", "Redl", "+7-911-748-32-45", "redl@yandex.ru");
        conMan.updateContact(c4);
        List<Contact> resultCon2 = conMan.findContacts();
        for(Contact listCon : resultCon2){
            System.out.println(listCon);
        }

        System.out.println("===DELETE CONTACT===");
        conMan.deleteContact(cId1);
        List<Contact> resultCon3 = conMan.findContacts();
        for(Contact listCon : resultCon3){
            System.out.println(listCon);
        }

        System.out.println("===GET CONTACT===");
        Contact getCon = conMan.getContact(cId2);
        System.out.println(getCon);
    }
}
