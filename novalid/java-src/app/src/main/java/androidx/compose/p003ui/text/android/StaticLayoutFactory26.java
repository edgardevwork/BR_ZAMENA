package androidx.compose.p003ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticLayoutFactory.kt */
@RequiresApi(26)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m7105d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory26;", "", "()V", "setJustificationMode", "", "builder", "Landroid/text/StaticLayout$Builder;", "justificationMode", "", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class StaticLayoutFactory26 {

    @NotNull
    public static final StaticLayoutFactory26 INSTANCE = new StaticLayoutFactory26();

    @JvmStatic
    @DoNotInline
    public static final void setJustificationMode(@NotNull StaticLayout.Builder builder, int justificationMode) {
        builder.setJustificationMode(justificationMode);
    }
}
