package androidx.media3.common;

public class MediaEdition {

    public String name;
    public String url;
    public boolean selected;
    public long durationUs;
    public String label;

    public MediaEdition(String name, String url) {
        this.name = name;
        this.url = url;
        this.label = name;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}