public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ági", Gender.WOMAN, EyeColor.BROWN);

        System.out.println(person.toString());
        person.getGender().getMagyarNev();
    }
}