package ContactsAndFriends;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {
    private String modelName;
    private String brand;

    List<Contact> contactlist = new ArrayList<>();

    public Smartphone(String modelName, String brand, List<Contact> contactlist) {
        this.modelName = modelName;
        this.brand = brand;
        this.contactlist = contactlist;
    }
    public Smartphone() {
    }

    public boolean startradio(){
        boolean radioStarted=true;
        String StrRadioStarted="Radio started";
        System.out.println(StrRadioStarted);
        return radioStarted;
    }

    public boolean stopRadio(){
        boolean radioStarted=false;
        String StrRadioStarted="Radio stopped";
        System.out.println(StrRadioStarted);
        return radioStarted;
    }

    public String getPosition(){
        String position="Köln";
        return position;
    }


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    public void setContactList(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", contactList=" + contactlist +
                '}';
    }

    public void addContact(Contact nContact){
        contactlist.add(nContact);
    }
    public Contact getContact(int index){
       return  contactlist.get(index);
    }

    public Contact getContactByName(String name){

        for(int i=0;i>=contactlist.size();i++){

            String listContactName = contactlist.get(i).getContactName();

            if(name.equals(listContactName)){
                return contactlist.get(i);
            }
        }

        return null;
    }

    public void removeContactByName(String name){

        for(int i=0;i>=contactlist.size();i++) {

            String listContactName = contactlist.get(i).getContactName();

            if (name.equals(listContactName)) {
                contactlist.remove(i);
            }
        }

    }


}

