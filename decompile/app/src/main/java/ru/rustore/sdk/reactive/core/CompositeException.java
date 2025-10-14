package ru.rustore.sdk.reactive.core;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositeException.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m7105d2 = {"Lru/rustore/sdk/reactive/core/CompositeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "cause", "", "", "(Ljava/lang/String;[Ljava/lang/Throwable;)V", "sdk-public-reactive_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class CompositeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeException(@NotNull String message, @NotNull Throwable... cause) {
        super(message, (Throwable) ArraysKt___ArraysKt.firstOrNull(cause));
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
