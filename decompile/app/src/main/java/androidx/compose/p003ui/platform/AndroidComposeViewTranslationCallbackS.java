package androidx.compose.p003ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeView.android.kt */
@StabilityInferred(parameters = 1)
@RequiresApi(31)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m7105d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewTranslationCallbackS;", "", "()V", "clearViewTranslationCallback", "", SVG.View.NODE_NAME, "Landroid/view/View;", "setViewTranslationCallback", "translationCallback", "Landroid/view/translation/ViewTranslationCallback;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;

    @NotNull
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final void setViewTranslationCallback(@NotNull View view, @NotNull ViewTranslationCallback translationCallback) {
        view.setViewTranslationCallback(translationCallback);
    }

    @DoNotInline
    @RequiresApi(31)
    public final void clearViewTranslationCallback(@NotNull View view) {
        view.clearViewTranslationCallback();
    }
}
