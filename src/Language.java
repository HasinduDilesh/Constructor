public class Language {
    String language;
    Language(String a){
        language = a;
        System.out.println(language + " is language...");
    }

    public static void main(String[] args) {
        Language l1 = new Language("Sinhala");
        Language l2 = new Language("English");
        Language l3 = new Language("Tamil");
    }
}
