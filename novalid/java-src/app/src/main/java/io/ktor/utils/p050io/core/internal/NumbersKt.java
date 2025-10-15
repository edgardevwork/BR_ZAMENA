package io.ktor.utils.p050io.core.internal;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Numbers.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0081\b¨\u0006\b"}, m7105d2 = {"failLongToIntConversion", "", "value", "", "name", "", "toIntOrFail", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class NumbersKt {
    @PublishedApi
    public static final int toIntOrFail(long j, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j < ParserMinimalBase.MAX_INT_L) {
            return (int) j;
        }
        failLongToIntConversion(j, name);
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final Void failLongToIntConversion(long j, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        throw new IllegalArgumentException("Long value " + j + " of " + name + " doesn't fit into 32-bit integer");
    }
}
