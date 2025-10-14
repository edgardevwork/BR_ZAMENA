package ru.rustore.sdk.billingclient.impl.data.mapper;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.mapper.b */
/* loaded from: classes8.dex */
public final class C11447b extends Lambda implements Function1<Byte, CharSequence> {

    /* renamed from: a */
    public static final C11447b f10235a = new C11447b();

    public C11447b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b.byteValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        return str;
    }
}
