public enum Gender {
    WOMAN("NŐ", "UOMO"),
    MAN("FÉRFI", "DONNA");

    private String magyarNev;
    private String olaszNev;

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

    Gender(String magyarNev, String olaszNev) {
        this.magyarNev = magyarNev;
        this.olaszNev = olaszNev;
    }
    }