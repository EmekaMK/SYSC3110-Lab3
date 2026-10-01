import java.util.ArrayList;
public class AddressBook {


    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void removeBuddy(int index) {
        if(index >= 0 && index < buddies.size()) {
            buddies.remove(index);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("Lab 3 github changes");
        System.out.println("Online changes");
        System.out.println("Branch changes");
    }
}
