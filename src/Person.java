public class Person {
    private String name;
    private Gender gender;
    private EyeColor eyeColor = EyeColor.BLUE;

    public Person(){}

    public Person(String name, Gender gender, EyeColor eyeColor) {
        this.name = name;
        this.gender = gender;
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender.getMagyarNev() + '\'' +
                ", eyeColor=" + eyeColor +
                '}';
    }
}
