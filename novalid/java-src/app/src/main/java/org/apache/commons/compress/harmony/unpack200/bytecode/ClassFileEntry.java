package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class ClassFileEntry {
    public static final ClassFileEntry[] NONE = new ClassFileEntry[0];
    public boolean resolved;

    public abstract void doWrite(DataOutputStream dataOutputStream) throws IOException;

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public ClassFileEntry[] getNestedClassFileEntries() {
        return NONE;
    }

    public void resolve(ClassConstantPool classConstantPool) {
        this.resolved = true;
    }

    public int objectHashCode() {
        return super.hashCode();
    }

    public final void write(DataOutputStream dataOutputStream) throws IOException {
        if (!this.resolved) {
            throw new IllegalStateException("Entry has not been resolved");
        }
        doWrite(dataOutputStream);
    }
}
