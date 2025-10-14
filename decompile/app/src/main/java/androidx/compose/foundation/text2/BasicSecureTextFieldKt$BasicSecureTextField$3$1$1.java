package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.ImeActionHandler;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicSecureTextField.kt */
@Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class BasicSecureTextFieldKt$BasicSecureTextField$3$1$1 implements ImeActionHandler, FunctionAdapter {
    public final /* synthetic */ ImeActionHandler $tmp0;

    public BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(ImeActionHandler imeActionHandler) {
        this.$tmp0 = imeActionHandler;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof ImeActionHandler) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, ImeActionHandler.class, "onImeAction", "onImeAction-KlQnJC8(I)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text2.input.ImeActionHandler
    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    public final boolean mo8632onImeActionKlQnJC8(int i) {
        return this.$tmp0.mo8632onImeActionKlQnJC8(i);
    }
}
