public enum Gender {
    WOMAN("NŐ", "UOMO"),
    MAN("FÉRFI", "DONNA");

    Gender(String magyarNev, String olaszNev){
        this.magyarNev = magyarNev;
        this.olaszNev = olaszNev;
    }