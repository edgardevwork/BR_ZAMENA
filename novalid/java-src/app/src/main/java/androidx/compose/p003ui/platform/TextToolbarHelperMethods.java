package androidx.compose.p003ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTextToolbar.android.kt */
@StabilityInferred(parameters = 1)
@RequiresApi(23)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/ui/platform/TextToolbarHelperMethods;", "", "()V", "invalidateContentRect", "", "actionMode", "Landroid/view/ActionMode;", "startActionMode", SVG.View.NODE_NAME, "Landroid/view/View;", "actionModeCallback", "Landroid/view/ActionMode$Callback;", "type", "", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;

    @NotNull
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(23)
    @Nullable
    public final ActionMode startActionMode(@NotNull View view, @NotNull ActionMode.Callback actionModeCallback, int type) {
        return view.startActionMode(actionModeCallback, type);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void invalidateContentRect(@NotNull ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }
}
