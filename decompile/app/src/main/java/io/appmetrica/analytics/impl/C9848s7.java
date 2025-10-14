package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.s7 */
/* loaded from: classes6.dex */
public final class C9848s7 implements Converter {

    /* renamed from: a */
    public final C9823r7 f9039a;

    public C9848s7() {
        this(null, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m6793a(@NotNull C9873t7 c9873t7) {
        return MessageNano.toByteArray(this.f9039a.fromModel(c9873t7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f9039a.fromModel((C9873t7) obj));
    }

    public C9848s7(@NotNull C9823r7 c9823r7) {
        this.f9039a = c9823r7;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:15:0x0002, B:17:0x000f), top: B:22:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C9873t7 toModel(@Nullable byte[] bArr) {
        C9798q7 c9798q7;
        if (bArr != null) {
            try {
                c9798q7 = (C9798q7) MessageNano.mergeFrom(new C9798q7(), bArr);
                if (c9798q7 == null) {
                    c9798q7 = new C9798q7();
                }
            } catch (InvalidProtocolBufferNanoException unused) {
                c9798q7 = new C9798q7();
            }
        }
        return this.f9039a.toModel(c9798q7);
    }

    public /* synthetic */ C9848s7(C9823r7 c9823r7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C9823r7(null, 1, null) : c9823r7);
    }
}
