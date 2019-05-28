package constructor;

public class Constructor_new {
        private String creatorName = "Петя";

    public Constructor_new(String creatorName) {
        this.creatorName = creatorName;
        System.out.println("Класс " +Constructor_new.class.getSimpleName());

        System.out.println("Создатель " + creatorName);
    }
}

// Вот это в main
// Constructor_new test = new Constructor_new("Вася");