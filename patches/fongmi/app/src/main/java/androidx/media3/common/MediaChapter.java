package androidx.media3.common;

public class MediaChapter {

    public String title;
    public long startTimeMs;
    public long endTimeMs;
    public boolean selected;
    public long timeUs;
    public String label;

    public MediaChapter(String title, long startTimeMs, long endTimeMs) {
        this.title = title;
        this.startTimeMs = startTimeMs;
        this.endTimeMs = endTimeMs;
        this.label = title;
        this.timeUs = startTimeMs * 1000;
    }

    public String getTitle() {
        return title;
    }

    public long getStartTimeMs() {
        return startTimeMs;
    }

    public long getEndTimeMs() {
        return endTimeMs;
    }
}