import java.util.HashMap;

public class testDrivenData {
    public HashMap sampleData()
    {
        Person person1 = new Person("Swayam", "Shekhawat", "Mumbai", "Kalyan", "Maharashtra", 411028, "7903990740","swayam7@gmail.com");
        Person person2 = new Person("Shubham", "kumar", "takiyapar", "nalanda", "bihar", 802502, "9097666710","shubh3@gmail.com");
        Person person3 = new Person("Anu", "Priya", "anishabad", "biharsharif", "bihar", 801501, "8083555912","anu12@gmail.com");
        Person person4 = new Person("Twinkle", "Khanna", "sadisopur", "darbhanga", "bihar",  800002, "8765439021", "twinkky03@gmail.com");
        Person person5 = new Person("Aditya", "Kumar", "rupaspur", "hajipur", "bihar",  801502, "9876543210", "adi15@gmail.com");
        Person person6 = new Person("Vikash", "Pal", "sultanpur", "gaya", "bihar",  801502, "7784624315", "bholu123@gmail.com");

        HashMap <String, Person> testData = new HashMap<String, Person>();
        testData.put(person1.getEmailId(), person1);
        testData.put(person2.getEmailId(), person2);
        testData.put(person3.getEmailId(), person3);
        testData.put(person4.getEmailId(), person4);
        testData.put(person5.getEmailId(), person5);
        testData.put(person6.getEmailId(), person6);

        return testData;
    }
}
