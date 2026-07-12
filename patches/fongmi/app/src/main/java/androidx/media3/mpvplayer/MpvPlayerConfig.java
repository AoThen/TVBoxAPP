package androidx.media3.mpvplayer;

import android.content.Context;
import java.io.File;

public class MpvPlayerConfig {

    public static final String VIDEO_OUTPUT_GPU_NEXT = "gpu-next";

    private MpvPlayerConfig() {}

    public static class Builder {

        public Builder() {}

        public Builder setDefaultUserAgent(String userAgent) { return this; }

        public Builder setHlsHttpPersistent(boolean persistent) { return this; }

        public Builder addConfigDirectory(File dir) { return this; }

        public Builder addAndroidFontConfig(File configDir, File cacheDir) { return this; }

        public Builder addAndroidDefaults(String videoOutputDriver, File cacheDir) { return this; }

        public Builder addTlsCaFileFromAsset(Context context, String assetPath, File outputPath) { return this; }

        public Builder addPostInitStringOption(String key, String value) { return this; }

        public Builder addPreInitStringOption(String key, String value) { return this; }

        public Builder addDiskCacheOptions(File cacheDir, int seconds, int mb) { return this; }

        public Builder addAndroidSubtitleOptions(Context context, boolean enabled, double position, double scale) { return this; }

        public MpvPlayerConfig build() { return new MpvPlayerConfig(); }
    }
}