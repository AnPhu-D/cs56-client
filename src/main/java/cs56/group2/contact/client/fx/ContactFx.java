package cs56.group2.contact.client.fx;

import cs56.group2.contact.client.model.Contact;
import javafx.beans.property.SimpleStringProperty;

public class ContactFx {

    // First, declare the class properties
    private int id = -1;
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty middleName;
    private SimpleStringProperty email;
    private SimpleStringProperty cell;

    public ContactFx() {
        firstName = new SimpleStringProperty();
        lastName = new SimpleStringProperty();
        middleName = new SimpleStringProperty();
        email = new SimpleStringProperty();
        cell = new SimpleStringProperty();
    }

    public ContactFx(Contact contact) {
        this(); // Calls the constructor with no parameter (seen above)

        // Once the contact has been created, populate it with the information from the Contact object
        this.id = contact.getId();
        this.firstName.set(contact.getFirstName());
        this.middleName.set(contact.getMiddleName());
        this.lastName.set(contact.getLastName());
        this.cell.set(contact.getCell());
        this.email.set(contact.getEmail());
    }

    public int getId() {
        // Getter method for ID
        return id;
    }

    public void setId(int id) {
        // Setter method for ID
        this.id = id;
    }

    public String getFirstName() {
        // Returns FirstName as a string
        return firstName.get();
    }

    public SimpleStringProperty firstNameProperty() {
        // Returns FirstName as a SSP
        return firstName;
    }

    public void setFirstName(String firstName) {
        // Sets FirstName SSP to String param
        this.firstName.set(firstName);
    }

    public String getLastName() {
        // Returns LastName as a string
        return lastName.get();
    }

    public SimpleStringProperty lastNameProperty() {
        // Returns LastName as a SSP
        return lastName;
    }

    public void setLastName(String lastName) {
        // Sets LastName SSP to String param
        this.lastName.set(lastName);
    }

    public String getMiddleName() {
        return middleName.get();
    }

    public SimpleStringProperty middleNameProperty() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName.set(middleName);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getCell() {
        return cell.get();
    }

    public SimpleStringProperty cellProperty() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell.set(cell);
    }

    // End of simple Getter/Setters section
    
    public Contact getContact() {
        // Creates a contact with the properties of this ContactFX object
        Contact contact = new Contact();
        contact.setId(id);
        contact.setFirstName(firstName.get());
        contact.setMiddleName(middleName.get());
        contact.setLastName(lastName.get());
        contact.setEmail(email.get());
        contact.setCell(cell.get());

        return contact;
    }

    @Override
    public String toString() {
        return "ContactFx{" +
            "id=" + id +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", middleName=" + middleName +
            ", email=" + email +
            ", cell=" + cell +
            '}';
    }
}
