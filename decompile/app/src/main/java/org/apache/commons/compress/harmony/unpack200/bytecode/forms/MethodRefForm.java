package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;

/* loaded from: classes8.dex */
public class MethodRefForm extends ReferenceForm {
    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public int getPoolID() {
        return 11;
    }

    public MethodRefForm(int i, String str, int[] iArr) {
        super(i, str, iArr);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public int getOffset(OperandManager operandManager) {
        return operandManager.nextMethodRef();
    }
}
