package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes7.dex */
public class ClassFile {
    public int accessFlags;
    public Attribute[] attributes;
    public ClassFileEntry[] fields;
    public int[] interfaces;
    public int major;
    public ClassFileEntry[] methods;
    public int minor;
    public int superClass;
    public int thisClass;
    public final int magic = -889275714;
    public ClassConstantPool pool = new ClassConstantPool();

    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(-889275714);
        dataOutputStream.writeShort(this.minor);
        dataOutputStream.writeShort(this.major);
        dataOutputStream.writeShort(this.pool.size() + 1);
        int i = 1;
        while (i <= this.pool.size()) {
            ConstantPoolEntry constantPoolEntry = (ConstantPoolEntry) this.pool.get(i);
            constantPoolEntry.doWrite(dataOutputStream);
            if (constantPoolEntry.getTag() == 6 || constantPoolEntry.getTag() == 5) {
                i++;
            }
            i++;
        }
        dataOutputStream.writeShort(this.accessFlags);
        dataOutputStream.writeShort(this.thisClass);
        dataOutputStream.writeShort(this.superClass);
        dataOutputStream.writeShort(this.interfaces.length);
        for (int i2 : this.interfaces) {
            dataOutputStream.writeShort(i2);
        }
        dataOutputStream.writeShort(this.fields.length);
        for (ClassFileEntry classFileEntry : this.fields) {
            classFileEntry.write(dataOutputStream);
        }
        dataOutputStream.writeShort(this.methods.length);
        for (ClassFileEntry classFileEntry2 : this.methods) {
            classFileEntry2.write(dataOutputStream);
        }
        dataOutputStream.writeShort(this.attributes.length);
        for (Attribute attribute : this.attributes) {
            attribute.write(dataOutputStream);
        }
    }
}
