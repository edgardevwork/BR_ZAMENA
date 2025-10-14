package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposeInputMethodManager.android.kt */
@RequiresApi(24)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi24;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;", SVG.View.NODE_NAME, "Landroid/view/View;", "(Landroid/view/View;)V", "sendKeyEvent", "", "event", "Landroid/view/KeyEvent;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public class ComposeInputMethodManagerImplApi24 extends ComposeInputMethodManagerImplApi21 {
    public ComposeInputMethodManagerImplApi24(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(@NotNull KeyEvent event) {
        requireImm().dispatchKeyEventFromInputMethod(getView(), event);
    }
}
