package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public interface PrimitiveSink {
    @CanIgnoreReturnValue
    PrimitiveSink putBoolean(boolean b);

    @CanIgnoreReturnValue
    PrimitiveSink putByte(byte b);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(ByteBuffer bytes);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bytes);

    @CanIgnoreReturnValue
    PrimitiveSink putBytes(byte[] bytes, int off, int len);

    @CanIgnoreReturnValue
    PrimitiveSink putChar(char c);

    @CanIgnoreReturnValue
    PrimitiveSink putDouble(double d);

    @CanIgnoreReturnValue
    PrimitiveSink putFloat(float f);

    @CanIgnoreReturnValue
    PrimitiveSink putInt(int i);

    @CanIgnoreReturnValue
    PrimitiveSink putLong(long l);

    @CanIgnoreReturnValue
    PrimitiveSink putShort(short s);

    @CanIgnoreReturnValue
    PrimitiveSink putString(CharSequence charSequence, Charset charset);

    @CanIgnoreReturnValue
    PrimitiveSink putUnencodedChars(CharSequence charSequence);
}
