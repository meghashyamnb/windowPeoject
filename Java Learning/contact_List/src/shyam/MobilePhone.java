package shyam;

import java.util.ArrayList;
import java.util.TreeMap;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();

    }

    public boolean addNewContacts(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is alredy on File");
            return false;

        }
        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition <0){
            System.out.println(oldContact.getName() +", was not found");
            return false;
        }
        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+", was replaced with "+ newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition <0){
            System.out.println(contact.getName() +", was not found");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getName()+", was deleted");
        return true;
    }

    private int findContact (Contact contact){
        return this.myContact.indexOf(contact);
    }
    private int findContact (String contactName){
        for (int i=0; i<this.myContact.size();i++){
            Contact contact = this.myContact.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >0){
            return contact.getName();
        }
        return null;
    }
}
