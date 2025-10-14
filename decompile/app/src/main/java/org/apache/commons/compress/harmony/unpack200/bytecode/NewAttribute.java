package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class NewAttribute extends BCIRenumberedAttribute {
    public final List<Object> body;
    public final int layoutIndex;
    public final List<Integer> lengths;
    public ClassConstantPool pool;

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    public int[] getStartPCs() {
        return null;
    }

    public NewAttribute(CPUTF8 cputf8, int i) {
        super(cputf8);
        this.lengths = new ArrayList();
        this.body = new ArrayList();
        this.layoutIndex = i;
    }

    public int getLayoutIndex() {
        return this.layoutIndex;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public int getLength() {
        Iterator<Integer> it = this.lengths.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public void writeBody(DataOutputStream dataOutputStream) throws IOException {
        long jLongValue;
        int iIndexOf;
        for (int i = 0; i < this.lengths.size(); i++) {
            int iIntValue = this.lengths.get(i).intValue();
            Object obj = this.body.get(i);
            if (obj instanceof Long) {
                jLongValue = ((Long) obj).longValue();
            } else {
                if (obj instanceof ClassFileEntry) {
                    iIndexOf = this.pool.indexOf((ClassFileEntry) obj);
                } else if (obj instanceof BCValue) {
                    iIndexOf = ((BCValue) obj).actualValue;
                } else {
                    jLongValue = 0;
                }
                jLongValue = iIndexOf;
            }
            if (iIntValue == 1) {
                dataOutputStream.writeByte((int) jLongValue);
            } else if (iIntValue == 2) {
                dataOutputStream.writeShort((int) jLongValue);
            } else if (iIntValue == 4) {
                dataOutputStream.writeInt((int) jLongValue);
            } else if (iIntValue == 8) {
                dataOutputStream.writeLong(jLongValue);
            }
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return this.attributeName.underlyingString();
    }

    public void addInteger(int i, long j) {
        this.lengths.add(Integer.valueOf(i));
        this.body.add(Long.valueOf(j));
    }

    public void addBCOffset(int i, int i2) {
        this.lengths.add(Integer.valueOf(i));
        this.body.add(new BCOffset(i2));
    }

    public void addBCIndex(int i, int i2) {
        this.lengths.add(Integer.valueOf(i));
        this.body.add(new BCIndex(i2));
    }

    public void addBCLength(int i, int i2) {
        this.lengths.add(Integer.valueOf(i));
        this.body.add(new BCLength(i2));
    }

    public void addToBody(int i, Object obj) {
        this.lengths.add(Integer.valueOf(i));
        this.body.add(obj);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool classConstantPool) {
        super.resolve(classConstantPool);
        for (Object obj : this.body) {
            if (obj instanceof ClassFileEntry) {
                ((ClassFileEntry) obj).resolve(classConstantPool);
            }
        }
        this.pool = classConstantPool;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public ClassFileEntry[] getNestedClassFileEntries() {
        Iterator<Object> it = this.body.iterator();
        int i = 1;
        int i2 = 1;
        while (it.hasNext()) {
            if (it.next() instanceof ClassFileEntry) {
                i2++;
            }
        }
        ClassFileEntry[] classFileEntryArr = new ClassFileEntry[i2];
        classFileEntryArr[0] = getAttributeName();
        for (Object obj : this.body) {
            if (obj instanceof ClassFileEntry) {
                classFileEntryArr[i] = (ClassFileEntry) obj;
                i++;
            }
        }
        return classFileEntryArr;
    }

    /* loaded from: classes6.dex */
    public static class BCOffset extends BCValue {
        public int index;
        public final int offset;

        public BCOffset(int i) {
            super();
            this.offset = i;
        }

        public void setIndex(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes6.dex */
    public static class BCIndex extends BCValue {
        public final int index;

        public BCIndex(int i) {
            super();
            this.index = i;
        }
    }

    /* loaded from: classes6.dex */
    public static class BCLength extends BCValue {
        public final int length;

        public BCLength(int i) {
            super();
            this.length = i;
        }
    }

    /* loaded from: classes7.dex */
    public static abstract class BCValue {
        public int actualValue;

        public BCValue() {
        }

        public void setActualValue(int i) {
            this.actualValue = i;
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    public void renumber(List<Integer> list) {
        if (this.renumbered) {
            return;
        }
        Object obj = null;
        for (Object obj2 : this.body) {
            if (obj2 instanceof BCIndex) {
                BCIndex bCIndex = (BCIndex) obj2;
                bCIndex.setActualValue(list.get(bCIndex.index).intValue());
            } else if (obj2 instanceof BCOffset) {
                BCOffset bCOffset = (BCOffset) obj2;
                if (obj instanceof BCIndex) {
                    int i = ((BCIndex) obj).index + bCOffset.offset;
                    bCOffset.setIndex(i);
                    bCOffset.setActualValue(list.get(i).intValue());
                } else if (obj instanceof BCOffset) {
                    int i2 = ((BCOffset) obj).index + bCOffset.offset;
                    bCOffset.setIndex(i2);
                    bCOffset.setActualValue(list.get(i2).intValue());
                } else {
                    bCOffset.setActualValue(list.get(bCOffset.offset).intValue());
                }
            } else if (obj2 instanceof BCLength) {
                BCLength bCLength = (BCLength) obj2;
                BCIndex bCIndex2 = (BCIndex) obj;
                bCLength.setActualValue(list.get(bCIndex2.index + bCLength.length).intValue() - bCIndex2.actualValue);
            }
            obj = obj2;
        }
        this.renumbered = true;
    }
}
