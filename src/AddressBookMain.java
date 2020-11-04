public class AddressBookMain {
    public static void main(String[] args) {
        Person person = new Person();

        //setting the value of contact details
        person.setfName("Shubham");
        person.setlName("Kumar");
        person.setEmailId("swayam007@gmail.com");
        person.setPhoneNumber("91 7903990740");
        person.setAddress("Sultanpur");
        person.setZip(801503);
        person.setCity("Patna");
        person.setState("Bihar");

        System.out.println("Details of Person" +person);
    }
}
