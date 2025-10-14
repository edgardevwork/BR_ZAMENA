package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InputTransformation.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m7105d2 = {"then", "Landroidx/compose/foundation/text2/input/InputTransformation;", LinkHeader.Rel.Next, "thenOrNull", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class InputTransformationKt {
    @JvmName(name = "thenOrNull")
    @Nullable
    @Stable
    @ExperimentalFoundationApi
    public static final InputTransformation thenOrNull(@Nullable InputTransformation inputTransformation, @Nullable InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : then(inputTransformation, inputTransformation2);
    }

    @Stable
    @ExperimentalFoundationApi
    @NotNull
    public static final InputTransformation then(@NotNull InputTransformation inputTransformation, @NotNull InputTransformation inputTransformation2) {
        return new FilterChain(inputTransformation, inputTransformation2);
    }
}
