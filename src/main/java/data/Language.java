package data;

public enum Language {
    EN("en"),
    DE("de");
    String lang;

    Language(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }
}
