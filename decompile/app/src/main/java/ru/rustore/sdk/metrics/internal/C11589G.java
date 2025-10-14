package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* renamed from: ru.rustore.sdk.metrics.internal.G */
/* loaded from: classes5.dex */
public final class C11589G extends Lambda implements Function1<C11592J, CharSequence> {

    /* renamed from: a */
    public static final C11589G f10620a = new C11589G();

    public C11589G() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(C11592J c11592j) {
        C11592J it = c11592j;
        Intrinsics.checkNotNullParameter(it, "it");
        return "'" + it.f10628a + ExtendedMessageFormat.QUOTE;
    }
}
