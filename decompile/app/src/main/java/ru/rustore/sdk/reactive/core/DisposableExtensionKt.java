package ru.rustore.sdk.reactive.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DisposableExtension.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, m7105d2 = {"ifNotDisposed", "", "Lru/rustore/sdk/reactive/core/Disposable;", "block", "Lkotlin/Function0;", "sdk-public-reactive_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class DisposableExtensionKt {
    public static final void ifNotDisposed(@NotNull Disposable disposable, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(disposable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (disposable.getDisposed()) {
            return;
        }
        block.invoke();
    }
}
