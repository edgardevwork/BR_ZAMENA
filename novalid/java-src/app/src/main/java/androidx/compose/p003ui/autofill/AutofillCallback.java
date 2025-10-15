package androidx.compose.p003ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AutofillCallback.android.kt */
@StabilityInferred(parameters = 1)
@RequiresApi(26)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "()V", "onAutofillEvent", "", SVG.View.NODE_NAME, "Landroid/view/View;", "virtualId", "", "event", "register", "autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "unregister", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class AutofillCallback extends AutofillManager$AutofillCallback {
    public static final int $stable = 0;

    @NotNull
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    public void onAutofillEvent(@NotNull View view, int virtualId, int event) {
        String str;
        super.onAutofillEvent(view, virtualId, event);
        if (event == 1) {
            str = "Autofill popup was shown.";
        } else if (event == 2) {
            str = "Autofill popup was hidden.";
        } else if (event == 3) {
            str = "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Unknown status event.";
        }
        Log.d("Autofill Status", str);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void register(@NotNull AndroidAutofill autofill) {
        autofill.getAutofillManager().registerCallback(AutofillCallback$$ExternalSyntheticApiModelOutline0.m116m(this));
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void unregister(@NotNull AndroidAutofill autofill) {
        autofill.getAutofillManager().unregisterCallback(AutofillCallback$$ExternalSyntheticApiModelOutline0.m116m(this));
    }
}
