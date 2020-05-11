class ContactsManagerMain {

    // Fields:
    Contacts [] myFriends;
    int friendsCount;
    String name;
    String number;

    //constructor
    ContactsManager(){
        this.friendsCount = 0;
        myFriends = new  Contact[500];
    }

    //Methods
    void addContact(Contact contact){
        myFriends[this.friendsCount] = contact;
        this.friendsCount++;
    }

    Contact searchContact(String searchName) {
        for (int i=0; i<500;i++) {
            if (myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}


public class ContactsManager {

    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();
        myContactsManager.name = "johnny";
        myContactsManager.number = "1";
    }
∏