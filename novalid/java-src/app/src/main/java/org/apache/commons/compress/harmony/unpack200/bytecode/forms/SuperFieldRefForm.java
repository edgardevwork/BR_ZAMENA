package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;

/* loaded from: classes5.dex */
public class SuperFieldRefForm extends ClassSpecificReferenceForm {
    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public int getPoolID() {
        return 10;
    }

    public SuperFieldRefForm(int i, String str, int[] iArr) {
        super(i, str, iArr);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    public int getOffset(OperandManager operandManager) {
        return operandManager.nextSuperFieldRef();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm
    public String context(OperandManager operandManager) {
        return operandManager.getSuperClass();
    }
}
