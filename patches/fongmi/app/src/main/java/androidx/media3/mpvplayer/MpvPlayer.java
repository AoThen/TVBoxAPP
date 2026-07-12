package androidx.media3.mpvplayer;

import android.content.Context;
import androidx.media3.common.ForwardingPlayer;
import androidx.media3.common.Player;
import java.lang.reflect.Proxy;

public class MpvPlayer extends ForwardingPlayer {

    private static final Player STUB = (Player) Proxy.newProxyInstance(
        Player.class.getClassLoader(),
        new Class<?>[] { Player.class },
        (proxy, method, args) -> {
            Class<?> rt = method.getReturnType();
            if (rt == void.class) return null;
            if (rt == boolean.class) return false;
            if (rt == int.class) return 0;
            if (rt == long.class) return 0L;
            if (rt == float.class) return 0f;
            return null;
        }
    );

    public static boolean isAvailable() { return false; }

    public MpvPlayer() { super(STUB); }

    public void setSubtitleOptions(MpvPlayerConfig config) {}

    public static class Builder {
        private final Context context;
        private int decode;
        private MpvPlayerConfig config;

        public Builder(Context context) { this.context = context; }

        public Builder setDecode(int decode) { this.decode = decode; return this; }

        public Builder setConfig(MpvPlayerConfig config) { this.config = config; return this; }

        public MpvPlayer build() { return new MpvPlayer(); }
    }
}