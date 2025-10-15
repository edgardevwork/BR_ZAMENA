package io.ktor.utils.p050io.core;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.osgi.core.ManifestParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: Closeable.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u0004\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, m7105d2 = {ManifestParser.ATTR_USE, "R", "C", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "block", "Lkotlin/Function1;", "(Ljava/io/Closeable;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class CloseableKt {
    public static final <C extends Closeable, R> R use(@NotNull C c, @NotNull Function1<? super C, ? extends R> block) throws IOException {
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            R rInvoke = block.invoke(c);
            InlineMarker.finallyStart(1);
            c.close();
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }
}
