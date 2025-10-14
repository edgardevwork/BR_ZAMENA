package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;

/* loaded from: classes8.dex */
public abstract class BCIRenumberedAttribute extends Attribute {
    public boolean renumbered;

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public abstract int getLength();

    public abstract int[] getStartPCs();

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public boolean hasBCIRenumbering() {
        return true;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public abstract String toString();

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public abstract void writeBody(DataOutputStream dataOutputStream) throws IOException;

    public BCIRenumberedAttribute(CPUTF8 cputf8) {
        super(cputf8);
    }

    public void renumber(final List<Integer> list) throws Pack200Exception {
        if (this.renumbered) {
            throw new Error("Trying to renumber a line number table that has already been renumbered");
        }
        this.renumbered = true;
        final int[] startPCs = getStartPCs();
        Arrays.setAll(startPCs, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute$$ExternalSyntheticLambda0
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return BCIRenumberedAttribute.lambda$renumber$0(list, startPCs, i);
            }
        });
    }

    public static /* synthetic */ int lambda$renumber$0(List list, int[] iArr, int i) {
        return ((Integer) list.get(iArr[i])).intValue();
    }
}
