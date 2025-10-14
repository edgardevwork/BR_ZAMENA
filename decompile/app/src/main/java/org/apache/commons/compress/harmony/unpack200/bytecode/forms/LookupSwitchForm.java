package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;
import org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode;
import org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager;

/* loaded from: classes5.dex */
public class LookupSwitchForm extends SwitchForm {
    public LookupSwitchForm(int i, String str) {
        super(i, str);
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(ByteCode byteCode, final OperandManager operandManager, int i) {
        int iNextCaseCount = operandManager.nextCaseCount();
        int iNextLabel = operandManager.nextLabel();
        int[] iArr = new int[iNextCaseCount];
        Arrays.setAll(iArr, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm$$ExternalSyntheticLambda0
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return LookupSwitchForm.lambda$setByteCodeOperands$0(operandManager, i2);
            }
        });
        int[] iArr2 = new int[iNextCaseCount];
        Arrays.setAll(iArr2, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm$$ExternalSyntheticLambda1
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return LookupSwitchForm.lambda$setByteCodeOperands$1(operandManager, i2);
            }
        });
        int[] iArr3 = new int[iNextCaseCount + 1];
        iArr3[0] = iNextLabel;
        int i2 = 1;
        System.arraycopy(iArr2, 0, iArr3, 1, iNextCaseCount);
        byteCode.setByteCodeTargets(iArr3);
        int i3 = i % 4;
        int i4 = 3 - i3;
        int i5 = iNextCaseCount * 4;
        int[] iArr4 = new int[(12 - i3) + i5 + i5];
        iArr4[0] = byteCode.getOpcode();
        int i6 = 0;
        while (i6 < i4) {
            iArr4[i2] = 0;
            i6++;
            i2++;
        }
        iArr4[i2] = -1;
        iArr4[i2 + 1] = -1;
        iArr4[i2 + 2] = -1;
        iArr4[i2 + 3] = -1;
        setRewrite4Bytes(iNextCaseCount, i2 + 4, iArr4);
        int i7 = i2 + 8;
        for (int i8 = 0; i8 < iNextCaseCount; i8++) {
            setRewrite4Bytes(iArr[i8], i7, iArr4);
            iArr4[i7 + 4] = -1;
            iArr4[i7 + 5] = -1;
            int i9 = i7 + 7;
            iArr4[i7 + 6] = -1;
            i7 += 8;
            iArr4[i9] = -1;
        }
        byteCode.setRewrite(iArr4);
    }

    public static /* synthetic */ int lambda$setByteCodeOperands$0(OperandManager operandManager, int i) {
        return operandManager.nextCaseValues();
    }

    public static /* synthetic */ int lambda$setByteCodeOperands$1(OperandManager operandManager, int i) {
        return operandManager.nextLabel();
    }
}
