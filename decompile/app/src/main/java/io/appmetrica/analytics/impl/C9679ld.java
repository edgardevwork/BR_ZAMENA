package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ld */
/* loaded from: classes6.dex */
public final class C9679ld implements NativeCrashHandler {

    /* renamed from: a */
    public final C9757og f8581a;

    /* renamed from: b */
    public final Function1 f8582b;

    public C9679ld(@NotNull C9757og c9757og, @NotNull Function1<? super String, Unit> function1) {
        this.f8581a = c9757og;
        this.f8582b = function1;
    }

    /* renamed from: a */
    public static final void m6392a(C9679ld c9679ld, NativeCrash nativeCrash, File file) {
        c9679ld.f8582b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    /* renamed from: b */
    public static final void m6393b(C9679ld c9679ld, NativeCrash nativeCrash, File file) {
        c9679ld.f8582b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(@NotNull final NativeCrash nativeCrash) {
        C10016z0 c10016z0;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C8761A0 c8761a0M4981a = C8786B0.m4981a(nativeCrash.getMetadata());
            Intrinsics.checkNotNull(c8761a0M4981a);
            c10016z0 = new C10016z0(source, handlerVersion, str, dumpFile, creationTime, c8761a0M4981a);
        } catch (Throwable unused) {
            c10016z0 = null;
        }
        if (c10016z0 == null) {
            this.f8582b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        C9757og c9757og = this.f8581a;
        Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.ld$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                C9679ld.m6392a(this.f$0, nativeCrash, (File) obj);
            }
        };
        c9757og.getClass();
        c9757og.m6609a(c10016z0, consumer, new C9682lg(c10016z0));
    }

    /* renamed from: a */
    public final void m6394a(@NotNull List<NativeCrash> list) {
        C10016z0 c10016z0;
        for (final NativeCrash nativeCrash : list) {
            try {
                NativeCrashSource source = nativeCrash.getSource();
                String handlerVersion = nativeCrash.getHandlerVersion();
                String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
                String dumpFile = nativeCrash.getDumpFile();
                long creationTime = nativeCrash.getCreationTime();
                C8761A0 c8761a0M4981a = C8786B0.m4981a(nativeCrash.getMetadata());
                Intrinsics.checkNotNull(c8761a0M4981a);
                c10016z0 = new C10016z0(source, handlerVersion, str, dumpFile, creationTime, c8761a0M4981a);
            } catch (Throwable unused) {
                c10016z0 = null;
            }
            if (c10016z0 != null) {
                C9757og c9757og = this.f8581a;
                Consumer consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.ld$$ExternalSyntheticLambda0
                    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                    public final void consume(Object obj) {
                        C9679ld.m6393b(this.f$0, nativeCrash, (File) obj);
                    }
                };
                c9757og.getClass();
                c9757og.m6609a(c10016z0, consumer, new C9707mg(c10016z0));
            } else {
                this.f8582b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            }
        }
    }
}
