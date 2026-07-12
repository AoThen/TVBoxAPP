package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.RenderersFactory;

public class DiskPreloadManager {

    public static class Options {

        public final long durationMs;
        public final int maxThreads;

        private Options(long durationMs, int maxThreads) {
            this.durationMs = durationMs;
            this.maxThreads = maxThreads;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private long durationMs = 30000;
            private int maxThreads = 2;

            public Builder() {}

            public Builder setDurationMs(long durationMs) { this.durationMs = durationMs; return this; }
            public Builder setMaxThreads(int maxThreads) { this.maxThreads = maxThreads; return this; }
            public Options build() { return new Options(durationMs, maxThreads); }
        }
    }

    public static class Builder {

        public Builder(Object cache, Object upstreamDataSourceFactory, RenderersFactory renderersFactory) {}

        public Builder setPriorityTaskManager(PriorityTaskManager priorityTaskManager) { return this; }
        public DiskPreloadManager build() { return new DiskPreloadManager(); }
    }

    public DiskPreloadManager() {}

    public void start(ExoPlayer player, androidx.media3.common.MediaItem mediaItem, Options options) {}

    public void release() {}
}