package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmptyDisposable.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/reactive/core/EmptyDisposable;", "Lru/rustore/sdk/reactive/core/Disposable;", "()V", "dispose", "", "isDisposed", "", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class EmptyDisposable implements Disposable {

    @NotNull
    public static final EmptyDisposable INSTANCE = new EmptyDisposable();

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    /* renamed from: isDisposed */
    public boolean getDisposed() {
        return false;
    }
}
