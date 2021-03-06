package main;

public class DBBinding {
    private String key;
    private String value;

    public DBBinding(String line) {
        String[] strArray = line.split(":");
        key = strArray[0].trim();
        value = strArray[1].trim();
    }

    public String getKey() { return key; }

    public String getValue() {
        return value;
    }

    public boolean equals(DBBinding bind) {
        return key.toLowerCase().equals(bind.getKey().toLowerCase())
                && value.toLowerCase().contains(bind.getValue().toLowerCase());
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }
}
