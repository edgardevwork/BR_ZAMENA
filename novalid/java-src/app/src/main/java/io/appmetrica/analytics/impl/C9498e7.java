package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.e7 */
/* loaded from: classes8.dex */
public final class C9498e7 implements Converter {

    /* renamed from: a */
    public final C9473d7 f7993a;

    public C9498e7() {
        this(null, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m6044a(@NotNull C9523f7 c9523f7) {
        return MessageNano.toByteArray(this.f7993a.fromModel(c9523f7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f7993a.fromModel((C9523f7) obj));
    }

    public C9498e7(@NotNull C9473d7 c9473d7) {
        this.f7993a = c9473d7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:15:0x0002, B:17:0x000f), top: B:22:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9523f7 toModel(@Nullable byte[] bArr) {
        C9748o7 c9748o7;
        if (bArr != null) {
            try {
                c9748o7 = (C9748o7) MessageNano.mergeFrom(new C9748o7(), bArr);
                if (c9748o7 == null) {
                    c9748o7 = new C9748o7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                c9748o7 = new C9748o7();
            }
        }
        return this.f7993a.toModel(c9748o7);
    }

    public /* synthetic */ C9498e7(C9473d7 c9473d7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C9473d7(null, null, 3, null) : c9473d7);
    }
}
