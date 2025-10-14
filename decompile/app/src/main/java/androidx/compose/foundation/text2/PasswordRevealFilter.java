package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BasicSecureTextField.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0004J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m7105d2 = {"Landroidx/compose/foundation/text2/PasswordRevealFilter;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "scheduleHide", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "", "revealCodepointIndex", "getRevealCodepointIndex$foundation_release", "()I", "setRevealCodepointIndex", "(I)V", "revealCodepointIndex$delegate", "Landroidx/compose/runtime/MutableIntState;", "getScheduleHide", "()Lkotlin/jvm/functions/Function0;", "hide", "transformInput", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/PasswordRevealFilter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,523:1\n75#2:524\n108#2,2:525\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/PasswordRevealFilter\n*L\n412#1:524\n412#1:525,2\n*E\n"})
/* loaded from: classes3.dex */
public final class PasswordRevealFilter implements InputTransformation {
    public static final int $stable = 0;

    /* renamed from: revealCodepointIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState revealCodepointIndex = SnapshotIntStateKt.mutableIntStateOf(-1);

    @NotNull
    private final Function0<Unit> scheduleHide;

    public PasswordRevealFilter(@NotNull Function0<Unit> function0) {
        this.scheduleHide = function0;
    }

    @NotNull
    public final Function0<Unit> getScheduleHide() {
        return this.scheduleHide;
    }

    private final void setRevealCodepointIndex(int i) {
        this.revealCodepointIndex.setIntValue(i);
    }

    public final int getRevealCodepointIndex$foundation_release() {
        return this.revealCodepointIndex.getIntValue();
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@NotNull TextFieldCharSequence originalValue, @NotNull TextFieldBuffer valueWithChanges) {
        if (valueWithChanges.getChanges().getChangeCount() != 1 || TextRange.m13161getLengthimpl(valueWithChanges.getChanges().mo8635getRangejx7JFs(0)) != 1 || TextRange.m13161getLengthimpl(valueWithChanges.getChanges().mo8634getOriginalRangejx7JFs(0)) != 0 || valueWithChanges.hasSelection()) {
            setRevealCodepointIndex(-1);
            return;
        }
        int iM13163getMinimpl = TextRange.m13163getMinimpl(valueWithChanges.getChanges().mo8635getRangejx7JFs(0));
        if (getRevealCodepointIndex$foundation_release() != iM13163getMinimpl) {
            this.scheduleHide.invoke();
            setRevealCodepointIndex(iM13163getMinimpl);
        }
    }

    public final void hide() {
        setRevealCodepointIndex(-1);
    }
}
