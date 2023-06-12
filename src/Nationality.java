public enum Nationality {
    HUNGARIAN("MAGYAR", "UNGHERESE"),
    ENGLISH("ANGOL", "INGLESE"),
    GERMAN("NÉMET", "TADESCO"),
    ITALIAN("OLASZ", "ITALIANO");


private String magyarNev;
private String olaszNev;


    Nationality(String magyarNev, String olaszNev) {
        this.magyarNev = magyarNev;
        this.olaszNev = olaszNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public String getOlaszNev() {
        return olaszNev;
    }

    public void setMagyarNev(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public void setOlaszNev(String olaszNev) {
        this.olaszNev = olaszNev;
    }


}
