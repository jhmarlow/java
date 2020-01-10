// UDACITY - Java OOP Example: The Contacts Manager
// Create class to store contact information
class Contact{
    String name;
    String email;
    String phoneNumber;
}

class ContactManager {

    // Fields:
    Contact [] myFriends;
    int friendsCount;

    //Constructor myFriends limited to 500
    ContactManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    //Methods
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    // search against string name
    Contact searchContact(String searchName) {
        for (int i=0; i<500;i++) {
            if (myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}

// class to run on script call
class Main {
    public static void main(String [] args){

        //instantiate contact manager object
        ContactManager myContactManager = new ContactManager();

        //instantiate contact class and pass to contact manager
        Contact friend1 = new Contact();
        friend1.name = "jon";
        friend1.phoneNumber = "0344335";
        myContactManager.addContact(friend1);

        Contact friend2 = new Contact();
        friend2.name = "selma";
        friend2.phoneNumber = "03645335";
        myContactManager.addContact(friend2);

        Contact friend3 = new Contact();
        friend3.name = "louise";
        friend3.phoneNumber = "03265635";
        myContactManager.addContact(friend3);

        // print out selmas phone number
        System.out.println(myContactManager.searchContact("selma").phoneNumber);

    }
}