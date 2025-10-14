package androidx.compose.p003ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.input.pointer.AndroidPointerIcon;
import androidx.compose.p003ui.input.pointer.PointerIcon;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidComposeView.android.kt */
@RequiresApi(24)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, m7105d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "()V", "setPointerIcon", "", SVG.View.NODE_NAME, "Landroid/view/View;", "icon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidComposeViewVerificationHelperMethodsN {

    @NotNull
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    @DoNotInline
    @RequiresApi(24)
    public final void setPointerIcon(@NotNull View view, @Nullable PointerIcon icon) {
        android.view.PointerIcon systemIcon;
        if (icon instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) icon).getPointerIcon();
        } else if (icon instanceof androidx.compose.p003ui.input.pointer.AndroidPointerIcon) {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), ((androidx.compose.p003ui.input.pointer.AndroidPointerIcon) icon).getType());
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (Intrinsics.areEqual(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
