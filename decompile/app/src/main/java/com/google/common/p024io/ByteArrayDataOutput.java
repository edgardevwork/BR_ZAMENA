package com.google.common.p024io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.io.DataOutput;

@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes7.dex */
public interface ByteArrayDataOutput extends DataOutput {
    byte[] toByteArray();

    @Override // java.io.DataOutput
    void write(int b);

    @Override // java.io.DataOutput
    void write(byte[] b);

    @Override // java.io.DataOutput
    void write(byte[] b, int off, int len);

    @Override // java.io.DataOutput
    void writeBoolean(boolean v);

    @Override // java.io.DataOutput
    void writeByte(int v);

    @Override // java.io.DataOutput
    @Deprecated
    void writeBytes(String s);

    @Override // java.io.DataOutput
    void writeChar(int v);

    @Override // java.io.DataOutput
    void writeChars(String s);

    @Override // java.io.DataOutput
    void writeDouble(double v);

    @Override // java.io.DataOutput
    void writeFloat(float v);

    @Override // java.io.DataOutput
    void writeInt(int v);

    @Override // java.io.DataOutput
    void writeLong(long v);

    @Override // java.io.DataOutput
    void writeShort(int v);

    @Override // java.io.DataOutput
    void writeUTF(String s);
}
