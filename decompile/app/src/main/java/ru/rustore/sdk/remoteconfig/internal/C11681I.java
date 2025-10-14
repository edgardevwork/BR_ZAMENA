package ru.rustore.sdk.remoteconfig.internal;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.I */
/* loaded from: classes5.dex */
public final class C11681I implements RemoteConfigClientEventListener {

    /* renamed from: a */
    public final RemoteConfigClientEventListener f10824a;

    /* renamed from: b */
    public final Lazy f10825b;

    /* renamed from: ru.rustore.sdk.remoteconfig.internal.I$a */
    /* loaded from: classes6.dex */
    public static final class a extends Lambda implements Function0<Handler> {

        /* renamed from: a */
        public static final a f10826a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public C11681I(RemoteConfigClientEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f10824a = listener;
        this.f10825b = LazyKt__LazyJVMKt.lazy(a.f10826a);
    }

    /* renamed from: a */
    public static final void m7516a(C11681I this$0, RemoteConfigException.BackgroundConfigUpdateError exception) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        this$0.f10824a.backgroundJobErrors(exception);
    }

    /* renamed from: b */
    public static final void m7517b(C11681I this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10824a.initComplete();
    }

    /* renamed from: c */
    public static final void m7518c(C11681I this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10824a.memoryCacheUpdated();
    }

    /* renamed from: d */
    public static final void m7519d(C11681I this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10824a.persistentStorageUpdated();
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void backgroundJobErrors(final RemoteConfigException.BackgroundConfigUpdateError exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        ((Handler) this.f10825b.getValue()).post(new Runnable() { // from class: ru.rustore.sdk.remoteconfig.internal.I$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C11681I.m7516a(this.f$0, exception);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void firstLoadComplete() {
        ((Handler) this.f10825b.getValue()).post(new Runnable() { // from class: ru.rustore.sdk.remoteconfig.internal.I$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C11681I.m7514a(this.f$0);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void initComplete() {
        ((Handler) this.f10825b.getValue()).post(new Runnable() { // from class: ru.rustore.sdk.remoteconfig.internal.I$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11681I.m7517b(this.f$0);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void memoryCacheUpdated() {
        ((Handler) this.f10825b.getValue()).post(new Runnable() { // from class: ru.rustore.sdk.remoteconfig.internal.I$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C11681I.m7518c(this.f$0);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void persistentStorageUpdated() {
        ((Handler) this.f10825b.getValue()).post(new Runnable() { // from class: ru.rustore.sdk.remoteconfig.internal.I$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C11681I.m7519d(this.f$0);
            }
        });
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void remoteConfigNetworkRequestFailure(final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ((Handler) this.f10825b.getValue()).post(new Runnable() { // from class: ru.rustore.sdk.remoteconfig.internal.I$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11681I.m7515a(this.f$0, throwable);
            }
        });
    }

    /* renamed from: a */
    public static final void m7514a(C11681I this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10824a.firstLoadComplete();
    }

    /* renamed from: a */
    public static final void m7515a(C11681I this$0, Throwable throwable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(throwable, "$throwable");
        this$0.f10824a.remoteConfigNetworkRequestFailure(throwable);
    }
}
