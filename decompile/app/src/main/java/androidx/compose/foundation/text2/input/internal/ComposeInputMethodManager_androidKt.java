package androidx.compose.foundation.text2.input.internal;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* compiled from: ComposeInputMethodManager.android.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0001\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m7105d2 = {"ComposeInputMethodManagerFactory", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;", "ComposeInputMethodManager", SVG.View.NODE_NAME, "overrideComposeInputMethodManagerFactoryForTests", "factory", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class ComposeInputMethodManager_androidKt {

    @NotNull
    private static Function1<? super View, ? extends ComposeInputMethodManager> ComposeInputMethodManagerFactory = new Function1<View, ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ComposeInputMethodManager invoke(@NotNull View view) {
            return new ComposeInputMethodManagerImplApi24(view);
        }
    };

    @NotNull
    public static final ComposeInputMethodManager ComposeInputMethodManager(@NotNull View view) {
        return ComposeInputMethodManagerFactory.invoke(view);
    }

    @TestOnly
    @VisibleForTesting
    @NotNull
    public static final Function1<View, ComposeInputMethodManager> overrideComposeInputMethodManagerFactoryForTests(@NotNull Function1<? super View, ? extends ComposeInputMethodManager> function1) {
        Function1 function12 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = function1;
        return function12;
    }
}
