package androidx.compose.foundation.text2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: BasicSecureTextField.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class SecureTextFieldController$passwordRevealFilter$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public SecureTextFieldController$passwordRevealFilter$1(Object obj) {
        super(0, obj, SecureTextFieldController.class, "scheduleHide", "scheduleHide()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SecureTextFieldController) this.receiver).scheduleHide();
    }
}
