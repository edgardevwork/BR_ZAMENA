package org.apache.commons.compress.harmony.pack200;

import com.fasterxml.jackson.core.JsonParser;
import org.objectweb.asm.ClassReader;

/* loaded from: classes7.dex */
public class Pack200ClassReader extends ClassReader {
    public boolean anySyntheticAttributes;
    public String fileName;
    public boolean lastConstantHadWideIndex;
    public int lastUnsignedShort;

    public Pack200ClassReader(byte[] bArr) {
        super(bArr);
    }

    public int readUnsignedShort(int i) {
        int unsignedShort = super.readUnsignedShort(i);
        if (i > 0 && this.b[i - 1] == 19) {
            this.lastUnsignedShort = unsignedShort;
        } else {
            this.lastUnsignedShort = JsonParser.MIN_SHORT_I;
        }
        return unsignedShort;
    }

    public Object readConst(int i, char[] cArr) {
        this.lastConstantHadWideIndex = i == this.lastUnsignedShort;
        return super.readConst(i, cArr);
    }

    public String readUTF8(int i, char[] cArr) {
        String utf8 = super.readUTF8(i, cArr);
        if (!this.anySyntheticAttributes && "Synthetic".equals(utf8)) {
            this.anySyntheticAttributes = true;
        }
        return utf8;
    }

    public boolean lastConstantHadWideIndex() {
        return this.lastConstantHadWideIndex;
    }

    public boolean hasSyntheticAttributes() {
        return this.anySyntheticAttributes;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public String getFileName() {
        return this.fileName;
    }
}
