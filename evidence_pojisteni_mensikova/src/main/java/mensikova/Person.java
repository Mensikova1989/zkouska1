package mensikova;

/**
 * @author Mensikova
 */
public class Person {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    
    /**
     * Creating new person - constructor
     * @param name Person name.
     * @param surname Person surname
     * @param age Age of person.
     * @param phoneNumber Phone number of person.
     */
    public Person(String name, String surname, int age, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age =  age;
        this.phoneNumber = phoneNumber;
    }

    /** Getting person attributies **/

    /**
    * @return
    * This will return person's name
    **/
    public String getname() {
        return name;
    }

    /**
     * @return
     * This will return person's surname
     */
    public String getsurname() {
        return surname;
    }

    /**
     * @return
     * This will return person's age
     */
    public int getage() {
        return age;
    }

    /**
     * @return
     * This will return preson's phone number
     */
    public String getphoneNumber() {
        return phoneNumber;
    }

    /* Changing person attributies */
    /**
     * @param name
     * This will change person name
     */
    public void changename(String name) {
        this.name = name;
    }

    /**
     * @param surname
     * This will change person surname
     */
    public void changesurname(String surname) {
        this.surname = surname;
    }

    /**
     * @param age
     * This will change persons age
     */
    public void changeage(int age) {
        this.age = age;
    }

    /**
     * @param phoneNumber
     * This will change persons phone number
     */
    public void changephoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\t" + name + "\t" + surname + "\t" + age + "\t" + phoneNumber;
    }
}
