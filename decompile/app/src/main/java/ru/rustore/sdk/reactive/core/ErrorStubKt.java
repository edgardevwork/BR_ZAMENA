package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorStub.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m7105d2 = {"errorStub", "Lkotlin/Function1;", "", "", "getErrorStub", "()Lkotlin/jvm/functions/Function1;", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ErrorStubKt {

    @NotNull
    public static final Function1<Throwable, Unit> errorStub = new Function1<Throwable, Unit>() { // from class: ru.rustore.sdk.reactive.core.ErrorStubKt$errorStub$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            throw new IllegalStateException("Error not implemented".toString());
        }
    };

    @NotNull
    public static final Function1<Throwable, Unit> getErrorStub() {
        return errorStub;
    }
}
