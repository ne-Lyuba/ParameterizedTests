package Data;

public enum Languages {
    UA("ua"),
    RU("ru");

    private String lang;
    Languages(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
