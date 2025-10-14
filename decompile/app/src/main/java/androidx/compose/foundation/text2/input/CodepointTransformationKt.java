package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text2.input.CodepointTransformation;
import androidx.compose.foundation.text2.input.internal.CodepointHelpers_jvmKt;
import androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator;
import androidx.compose.runtime.Stable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CodepointTransformation.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, m7105d2 = {"mask", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "Landroidx/compose/foundation/text2/input/CodepointTransformation$Companion;", FirebaseAnalytics.Param.CHARACTER, "", "toVisualText", "", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "codepointTransformation", "offsetMappingCalculator", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CodepointTransformationKt {
    @Stable
    @ExperimentalFoundationApi
    @NotNull
    public static final CodepointTransformation mask(@NotNull CodepointTransformation.Companion companion, char c) {
        return new MaskCodepointTransformation(c);
    }

    @NotNull
    public static final CharSequence toVisualText(@NotNull TextFieldCharSequence textFieldCharSequence, @NotNull CodepointTransformation codepointTransformation, @NotNull OffsetMappingCalculator offsetMappingCalculator) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < textFieldCharSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(textFieldCharSequence, i);
            int iTransform = codepointTransformation.transform(i2, iCodePointAt);
            int iCharCount = CodepointHelpers_jvmKt.charCount(iCodePointAt);
            if (iTransform != iCodePointAt) {
                offsetMappingCalculator.recordEditOperation(sb.length(), sb.length() + iCharCount, CodepointHelpers_jvmKt.charCount(iTransform));
                z = true;
            }
            StringHelpers_jvmKt.appendCodePointX(sb, iTransform);
            i += iCharCount;
            i2++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return z ? string : textFieldCharSequence;
    }
}
