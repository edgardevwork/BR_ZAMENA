package androidx.compose.p003ui.unit;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontScaling.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\"1\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m7105d2 = {"<set-?>", "", "DisableNonLinearFontScalingInCompose", "getDisableNonLinearFontScalingInCompose$annotations", "()V", "getDisableNonLinearFontScalingInCompose", "()Z", "setDisableNonLinearFontScalingInCompose", "(Z)V", "DisableNonLinearFontScalingInCompose$delegate", "Landroidx/compose/runtime/MutableState;", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFontScaling.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,105:1\n81#2:106\n107#2,2:107\n*S KotlinDebug\n*F\n+ 1 FontScaling.kt\nandroidx/compose/ui/unit/FontScalingKt\n*L\n43#1:106\n43#1:107,2\n*E\n"})
/* loaded from: classes3.dex */
public final class FontScalingKt {

    @NotNull
    private static final MutableState DisableNonLinearFontScalingInCompose$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getDisableNonLinearFontScalingInCompose$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalComposeUiApi
    public static final boolean getDisableNonLinearFontScalingInCompose() {
        return ((Boolean) DisableNonLinearFontScalingInCompose$delegate.getValue()).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static final void setDisableNonLinearFontScalingInCompose(boolean z) {
        DisableNonLinearFontScalingInCompose$delegate.setValue(Boolean.valueOf(z));
    }
}
