package androidx.media3.ui.danmaku;

import android.content.Context;
import java.io.File;

public class DanmakuConfig {

    public static final int STYLE_NONE = 0;
    public static final int STYLE_STROKE = 1;
    public static final int STYLE_SHADOW = 2;
    public static final int STYLE_PROJECTION = 3;
    public static final int COLOR_MODE_DEFAULT = 0;
    public static final int COLOR_MODE_COLORFUL = 1;
    public static final int COLOR_MODE_GRADIENT = 2;

    public static final DanmakuConfig DEFAULT = new DanmakuConfig();

    public float textScale = 1.0f;
    public float transparency = 0f;
    public boolean textBold = false;
    public int styleMode = STYLE_STROKE;
    public float shadowTransparency = 0.1f;
    public float strokeWidthMultiplier = 0.12f;
    public float projectionOffsetXMultiplier = 0.08f;
    public float projectionOffsetYMultiplier = 0.08f;
    public float projectionTransparency = 0.2f;
    public int colorMode = COLOR_MODE_DEFAULT;
    public long durationMs = 8000L;
    public long fixedDurationMs = 5000L;
    public long timeOffsetMs = 0L;
    public int maxOnScreen = 150;
    public float scrollAreaRatio = 0.5f;
    public float scrollGapRatio = 0f;
    public float lineSpacing = 1.4f;
    public int maxScrollLines = 0;
    public int maxTopLines = 0;
    public int maxBottomLines = 0;
    public boolean showScroll = true;
    public boolean showTop = true;
    public boolean showBottom = true;
    public boolean showReverse = true;
    public boolean showPositioned = true;
    public boolean showSubtitle = true;
    public boolean showSpecial = true;

    public DanmakuConfig() {}

    public static class Builder {

        private final DanmakuConfig config = new DanmakuConfig();

        public Builder() {}

        public Builder setTextScale(float value) { config.textScale = value; return this; }
        public Builder setTransparency(float value) { config.transparency = value; return this; }
        public Builder setTextBold(boolean value) { config.textBold = value; return this; }
        public Builder setStyleMode(int value) { config.styleMode = value; return this; }
        public Builder setShadowTransparency(float value) { config.shadowTransparency = value; return this; }
        public Builder setStrokeWidthMultiplier(float value) { config.strokeWidthMultiplier = value; return this; }
        public Builder setProjectionOffsetXMultiplier(float value) { config.projectionOffsetXMultiplier = value; return this; }
        public Builder setProjectionOffsetYMultiplier(float value) { config.projectionOffsetYMultiplier = value; return this; }
        public Builder setProjectionTransparency(float value) { config.projectionTransparency = value; return this; }
        public Builder setColorMode(int value) { config.colorMode = value; return this; }
        public Builder setDurationMs(long value) { config.durationMs = value; return this; }
        public Builder setFixedDurationMs(long value) { config.fixedDurationMs = value; return this; }
        public Builder setTimeOffsetMs(long value) { config.timeOffsetMs = value; return this; }
        public Builder setMaxOnScreen(int value) { config.maxOnScreen = value; return this; }
        public Builder setScrollAreaRatio(float value) { config.scrollAreaRatio = value; return this; }
        public Builder setScrollGapRatio(float value) { config.scrollGapRatio = value; return this; }
        public Builder setLineSpacing(float value) { config.lineSpacing = value; return this; }
        public Builder setMaxScrollLines(int value) { config.maxScrollLines = value; return this; }
        public Builder setMaxTopLines(int value) { config.maxTopLines = value; return this; }
        public Builder setMaxBottomLines(int value) { config.maxBottomLines = value; return this; }
        public Builder setShowScroll(boolean value) { config.showScroll = value; return this; }
        public Builder setShowTop(boolean value) { config.showTop = value; return this; }
        public Builder setShowBottom(boolean value) { config.showBottom = value; return this; }
        public Builder setShowReverse(boolean value) { config.showReverse = value; return this; }
        public Builder setShowPositioned(boolean value) { config.showPositioned = value; return this; }
        public Builder setShowSubtitle(boolean value) { config.showSubtitle = value; return this; }
        public Builder setShowSpecial(boolean value) { config.showSpecial = value; return this; }

        public DanmakuConfig build() { return config; }
    }
}