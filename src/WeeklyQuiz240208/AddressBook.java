package WeeklyQuiz240208;

import java.util.*;


public class AddressBook {
    private List<ContactsPractice.Contact> list = new ArrayList<>();

    public static void main(String[] args) {

        ContactsPractice.Contact contact = new ContactsPractice.Contact();
        Contact businessContact = new BusinessContact();

        contact.setName("쿠로미");
        contact.setPhoneNumber("010-1234-5678");
        System.out.println(contact);

    }
}
