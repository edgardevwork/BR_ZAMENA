package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.DataInput;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public interface ByteArrayDataInput extends DataInput {
    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    boolean readBoolean();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    byte readByte();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    char readChar();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    double readDouble();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] b);

    @Override // java.io.DataInput
    void readFully(byte[] b, int off, int len);

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    int readInt();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    @CheckForNull
    String readLine();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    long readLong();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    short readShort();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    String readUTF();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    int readUnsignedByte();

    @Override // java.io.DataInput
    @CanIgnoreReturnValue
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int n);
}
