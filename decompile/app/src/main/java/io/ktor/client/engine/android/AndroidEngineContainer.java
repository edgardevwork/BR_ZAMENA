package io.ktor.client.engine.android;

import io.ktor.client.HttpClientEngineContainer;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Android.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lio/ktor/client/engine/android/AndroidEngineContainer;", "Lio/ktor/client/HttpClientEngineContainer;", "()V", "factory", "Lio/ktor/client/engine/HttpClientEngineFactory;", "getFactory", "()Lio/ktor/client/engine/HttpClientEngineFactory;", "toString", "", "ktor-client-android"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class AndroidEngineContainer implements HttpClientEngineContainer {

    @NotNull
    public final HttpClientEngineFactory<?> factory = Android.INSTANCE;

    @Override // io.ktor.client.HttpClientEngineContainer
    @NotNull
    public HttpClientEngineFactory<?> getFactory() {
        return this.factory;
    }

    @NotNull
    public String toString() {
        return "Android";
    }
}
