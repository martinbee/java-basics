public class MobilePhone {
  public void openContactsApp() {
    System.out.println("Opening up the contacts app...\n");

    Contacts contactsAppInstance = new Contacts();
    contactsAppInstance.run();
  }
}
