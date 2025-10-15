package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IFramePlayerOptions.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0002\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "", "playerOptions", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getOrigin", "", "getOrigin$core_release", "toString", "Builder", "Companion", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class IFramePlayerOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    @NotNull
    public static final IFramePlayerOptions f11293default = new Builder().controls(1).build();

    @NotNull
    public final JSONObject playerOptions;

    public /* synthetic */ IFramePlayerOptions(JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject);
    }

    public IFramePlayerOptions(JSONObject jSONObject) {
        this.playerOptions = jSONObject;
    }

    /* compiled from: IFramePlayerOptions.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions$Companion;", "", "()V", "default", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "getDefault", "()Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final IFramePlayerOptions getDefault() {
            return IFramePlayerOptions.f11293default;
        }
    }

    @NotNull
    public String toString() {
        String string = this.playerOptions.toString();
        Intrinsics.checkNotNullExpressionValue(string, "playerOptions.toString()");
        return string;
    }

    @NotNull
    public final String getOrigin$core_release() throws JSONException {
        String string = this.playerOptions.getString("origin");
        Intrinsics.checkNotNullExpressionValue(string, "playerOptions.getString(Builder.ORIGIN)");
        return string;
    }

    /* compiled from: IFramePlayerOptions.kt */
    @Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m7105d2 = {"Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions$Builder;", "", "()V", "builderOptions", "Lorg/json/JSONObject;", "addInt", "", "key", "", "value", "", "addString", Builder.AUTO_PLAY, Builder.CONTROLS, "build", "Lcom/pierfrancescosoffritti/androidyoutubeplayer/core/player/options/IFramePlayerOptions;", "ccLoadPolicy", "fullscreen", Builder.f961FS, "ivLoadPolicy", "langPref", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, Builder.LIST, Builder.LIST_TYPE, "modestBranding", Builder.MUTE, "origin", "rel", "Companion", "core_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Builder {

        @NotNull
        public static final String AUTO_PLAY = "autoplay";

        @NotNull
        public static final String CC_LANG_PREF = "cc_lang_pref";

        @NotNull
        public static final String CC_LOAD_POLICY = "cc_load_policy";

        @NotNull
        public static final String CONTROLS = "controls";

        @NotNull
        public static final String ENABLE_JS_API = "enablejsapi";

        /* renamed from: FS */
        @NotNull
        public static final String f961FS = "fs";

        @NotNull
        public static final String IV_LOAD_POLICY = "iv_load_policy";

        @NotNull
        public static final String LIST = "list";

        @NotNull
        public static final String LIST_TYPE = "listType";

        @NotNull
        public static final String MODEST_BRANDING = "modestbranding";

        @NotNull
        public static final String MUTE = "mute";

        @NotNull
        public static final String ORIGIN = "origin";

        @NotNull
        public static final String REL = "rel";

        @NotNull
        public static final String SHOW_INFO = "showinfo";

        @NotNull
        public final JSONObject builderOptions = new JSONObject();

        public Builder() throws JSONException {
            addInt(AUTO_PLAY, 0);
            addInt(MUTE, 0);
            addInt(CONTROLS, 0);
            addInt(ENABLE_JS_API, 1);
            addInt(f961FS, 0);
            addString("origin", "https://www.youtube.com");
            addInt("rel", 0);
            addInt(SHOW_INFO, 0);
            addInt(IV_LOAD_POLICY, 3);
            addInt(MODEST_BRANDING, 1);
            addInt(CC_LOAD_POLICY, 0);
        }

        @NotNull
        public final IFramePlayerOptions build() {
            return new IFramePlayerOptions(this.builderOptions, null);
        }

        @NotNull
        public final Builder controls(int controls) throws JSONException {
            addInt(CONTROLS, controls);
            return this;
        }

        @NotNull
        public final Builder autoplay(int controls) throws JSONException {
            addInt(AUTO_PLAY, controls);
            return this;
        }

        @NotNull
        public final Builder mute(int controls) throws JSONException {
            addInt(MUTE, controls);
            return this;
        }

        @NotNull
        public final Builder rel(int rel) throws JSONException {
            addInt("rel", rel);
            return this;
        }

        @NotNull
        public final Builder ivLoadPolicy(int ivLoadPolicy) throws JSONException {
            addInt(IV_LOAD_POLICY, ivLoadPolicy);
            return this;
        }

        @NotNull
        public final Builder langPref(@NotNull String languageCode) throws JSONException {
            Intrinsics.checkNotNullParameter(languageCode, "languageCode");
            addString(CC_LANG_PREF, languageCode);
            return this;
        }

        @NotNull
        public final Builder ccLoadPolicy(int ccLoadPolicy) throws JSONException {
            addInt(CC_LOAD_POLICY, ccLoadPolicy);
            return this;
        }

        @NotNull
        public final Builder origin(@NotNull String origin) throws JSONException {
            Intrinsics.checkNotNullParameter(origin, "origin");
            addString("origin", origin);
            return this;
        }

        @NotNull
        public final Builder list(@NotNull String list) throws JSONException {
            Intrinsics.checkNotNullParameter(list, "list");
            addString(LIST, list);
            return this;
        }

        @NotNull
        public final Builder listType(@NotNull String listType) throws JSONException {
            Intrinsics.checkNotNullParameter(listType, "listType");
            addString(LIST_TYPE, listType);
            return this;
        }

        @NotNull
        public final Builder fullscreen(int fs) throws JSONException {
            addInt(f961FS, fs);
            return this;
        }

        @NotNull
        public final Builder modestBranding(int modestBranding) throws JSONException {
            addInt(MODEST_BRANDING, modestBranding);
            return this;
        }

        public final void addString(String key, String value) throws JSONException {
            try {
                this.builderOptions.put(key, value);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + key + ": " + value);
            }
        }

        public final void addInt(String key, int value) throws JSONException {
            try {
                this.builderOptions.put(key, value);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + key + ": " + value);
            }
        }
    }
}
