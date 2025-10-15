package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;

/* loaded from: classes5.dex */
public class ThisInitMethodRefForm extends InitMethodReferenceForm {
    public ThisInitMethodRefForm(int i, String str, int[] iArr) {
        super(i, str, iArr);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm
    public String context(OperandManager operandManager) {
        return operandManager.getCurrentClass();
    }
}
