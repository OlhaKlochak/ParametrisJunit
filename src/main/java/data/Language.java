package data;

public enum Language {
    EN("en"),
    ES("es"),
    DE("de");
    String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
