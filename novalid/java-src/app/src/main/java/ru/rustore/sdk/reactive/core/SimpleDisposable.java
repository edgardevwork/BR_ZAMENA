package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;

/* compiled from: SimpleDisposable.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"Lru/rustore/sdk/reactive/core/SimpleDisposable;", "Lru/rustore/sdk/reactive/core/Disposable;", "()V", "disposed", "", "dispose", "", "isDisposed", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class SimpleDisposable implements Disposable {
    public volatile boolean disposed;

    @Override // ru.rustore.sdk.reactive.core.Disposable
    /* renamed from: isDisposed, reason: from getter */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // ru.rustore.sdk.reactive.core.Disposable
    public void dispose() {
        this.disposed = true;
    }
}
