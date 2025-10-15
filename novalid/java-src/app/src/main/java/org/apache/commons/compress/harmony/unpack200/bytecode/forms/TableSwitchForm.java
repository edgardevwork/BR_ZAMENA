package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;

/* loaded from: classes5.dex */
public class TableSwitchForm extends SwitchForm {
    public TableSwitchForm(int i, String str) {
        super(i, str);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(ByteCode byteCode, final OperandManager operandManager, int i) {
        int iNextCaseCount = operandManager.nextCaseCount();
        int iNextLabel = operandManager.nextLabel();
        int iNextCaseValues = operandManager.nextCaseValues();
        int[] iArr = new int[iNextCaseCount];
        Arrays.setAll(iArr, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm$$ExternalSyntheticLambda0
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return TableSwitchForm.lambda$setByteCodeOperands$0(operandManager, i2);
            }
        });
        int[] iArr2 = new int[iNextCaseCount + 1];
        iArr2[0] = iNextLabel;
        int i2 = 1;
        System.arraycopy(iArr, 0, iArr2, 1, iNextCaseCount);
        byteCode.setByteCodeTargets(iArr2);
        int i3 = (iNextCaseValues + iNextCaseCount) - 1;
        int i4 = i % 4;
        int i5 = 3 - i4;
        int[] iArr3 = new int[(16 - i4) + (iNextCaseCount * 4)];
        iArr3[0] = byteCode.getOpcode();
        int i6 = 0;
        while (i6 < i5) {
            iArr3[i2] = 0;
            i6++;
            i2++;
        }
        iArr3[i2] = -1;
        iArr3[i2 + 1] = -1;
        iArr3[i2 + 2] = -1;
        iArr3[i2 + 3] = -1;
        setRewrite4Bytes(iNextCaseValues, i2 + 4, iArr3);
        setRewrite4Bytes(i3, i2 + 8, iArr3);
        int i7 = i2 + 12;
        for (int i8 = 0; i8 < iNextCaseCount; i8++) {
            iArr3[i7] = -1;
            iArr3[i7 + 1] = -1;
            int i9 = i7 + 3;
            iArr3[i7 + 2] = -1;
            i7 += 4;
            iArr3[i9] = -1;
        }
        byteCode.setRewrite(iArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$setByteCodeOperands$0(OperandManager operandManager, int i) {
        return operandManager.nextLabel();
    }
}
