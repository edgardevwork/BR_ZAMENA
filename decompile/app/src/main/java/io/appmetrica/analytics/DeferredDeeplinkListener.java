package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public interface DeferredDeeplinkListener {

    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain deferred deeplink."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");


        /* renamed from: a */
        private final String f5961a;

        Error(String str) {
            this.f5961a = str;
        }

        public String getDescription() {
            return this.f5961a;
        }
    }

    void onDeeplinkLoaded(@NonNull String str);

    void onError(@NonNull Error error, @Nullable String str);
}
