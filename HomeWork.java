import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        
        // Добавление контактов в телефонную книгу
        addContact(phoneBook, "Маша", "1234567890");
        addContact(phoneBook, "Саша", "9876543210");
        addContact(phoneBook, "Джоха", "5678901234");
        addContact(phoneBook, "Марк", "1122334455");
        addContact(phoneBook, "Саша", "6789054321");
        
        // Вывод списка контактов в отсортированном по убыванию порядке
        sortedPrint(phoneBook);
    }
    
    // Метод для добавления контакта в телефонную книгу
    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> phoneList = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneList.add(phoneNumber);
        phoneBook.put(name, phoneList);
    }
    
    
    public static void sortedPrint(Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((a, b) -> b.getValue().size() - a.getValue().size());
        
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " phone numbers");
        }
    }
}