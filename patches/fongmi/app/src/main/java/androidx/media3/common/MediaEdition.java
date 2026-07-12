package androidx.media3.common;

public class MediaEdition {

    public String name;
    public String url;

    public MediaEdition(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}