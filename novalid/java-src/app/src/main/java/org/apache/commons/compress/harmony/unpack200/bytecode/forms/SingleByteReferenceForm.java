package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;

/* loaded from: classes8.dex */
public abstract class SingleByteReferenceForm extends ReferenceForm {
    public boolean widened;

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public abstract int getOffset(OperandManager operandManager);

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public abstract int getPoolID();

    public SingleByteReferenceForm(int i, String str, int[] iArr) {
        super(i, str, iArr);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public void setNestedEntries(ByteCode byteCode, OperandManager operandManager, int i) throws Pack200Exception {
        super.setNestedEntries(byteCode, operandManager, i);
        if (this.widened) {
            byteCode.setNestedPositions(new int[][]{new int[]{0, 2}});
        } else {
            byteCode.setNestedPositions(new int[][]{new int[]{0, 1}});
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public boolean nestedMustStartClassPool() {
        return !this.widened;
    }
}
