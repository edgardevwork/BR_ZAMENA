package io.ktor.util;

import io.ktor.utils.p050io.core.Input;
import io.ktor.utils.p050io.core.InputArraysKt;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputJvm.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"asStream", "Ljava/io/InputStream;", "Lio/ktor/utils/io/core/Input;", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class InputJvmKt {
    @NotNull
    public static final InputStream asStream(@NotNull final Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        return new InputStream() { // from class: io.ktor.util.InputJvmKt.asStream.1
            @Override // java.io.InputStream
            public int read() {
                if (input.getEndOfInput()) {
                    return -1;
                }
                return input.readByte();
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] buffer, int offset, int length) {
                Intrinsics.checkNotNullParameter(buffer, "buffer");
                if (input.getEndOfInput()) {
                    return -1;
                }
                return InputArraysKt.readAvailable(input, buffer, offset, length);
            }

            @Override // java.io.InputStream
            public long skip(long count) {
                return input.discard(count);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                input.close();
            }
        };
    }
}
