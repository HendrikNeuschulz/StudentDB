package ContactsAndFriends;

public class Friend extends Contact{
    public int telefonnummer;

    public Friend() {

    }

    public Friend(String contactName, int telefonnummer) {
        this.contactName=contactName;
        this.telefonnummer = telefonnummer;
    }


    @Override
    public String toString() {
        return "Friend{" +
                "contactName=" + contactName +
                " telefonnummer=" + telefonnummer +'\'' +
                '}';
    }
}
