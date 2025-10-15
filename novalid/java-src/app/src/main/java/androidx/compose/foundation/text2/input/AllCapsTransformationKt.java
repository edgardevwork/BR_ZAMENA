package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.p003ui.text.intl.Locale;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AllCapsTransformation.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m7105d2 = {"allCaps", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/foundation/text2/input/InputTransformation$Companion;", "locale", "Landroidx/compose/ui/text/intl/Locale;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class AllCapsTransformationKt {
    @Stable
    @ExperimentalFoundationApi
    @NotNull
    public static final InputTransformation allCaps(@NotNull InputTransformation.Companion companion, @NotNull Locale locale) {
        return new AllCapsTransformation(locale);
    }
}
