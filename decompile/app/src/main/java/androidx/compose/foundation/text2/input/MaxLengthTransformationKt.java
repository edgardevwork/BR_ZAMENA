package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text2.input.InputTransformation;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: MaxLengthTransformation.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, m7105d2 = {"maxLengthInChars", "Landroidx/compose/foundation/text2/input/InputTransformation;", "Landroidx/compose/foundation/text2/input/InputTransformation$Companion;", "maxLength", "", "maxLengthInCodepoints", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class MaxLengthTransformationKt {
    @Stable
    @ExperimentalFoundationApi
    @NotNull
    public static final InputTransformation maxLengthInChars(@NotNull InputTransformation.Companion companion, int i) {
        return new MaxLengthFilter(i, false);
    }

    @Stable
    @ExperimentalFoundationApi
    @NotNull
    public static final InputTransformation maxLengthInCodepoints(@NotNull InputTransformation.Companion companion, int i) {
        return new MaxLengthFilter(i, true);
    }
}
