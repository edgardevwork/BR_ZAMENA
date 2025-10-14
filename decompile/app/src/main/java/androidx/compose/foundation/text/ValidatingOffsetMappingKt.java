package androidx.compose.foundation.text;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.text.input.VisualTransformation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ValidatingOffsetMapping.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, m7105d2 = {"ValidatingEmptyOffsetMappingIdentity", "Landroidx/compose/ui/text/input/OffsetMapping;", "getValidatingEmptyOffsetMappingIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "filterWithValidation", "Landroidx/compose/ui/text/input/TransformedText;", "Landroidx/compose/ui/text/input/VisualTransformation;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ValidatingOffsetMappingKt {

    @NotNull
    private static final OffsetMapping ValidatingEmptyOffsetMappingIdentity = new ValidatingOffsetMapping(OffsetMapping.INSTANCE.getIdentity(), 0, 0);

    @NotNull
    public static final OffsetMapping getValidatingEmptyOffsetMappingIdentity() {
        return ValidatingEmptyOffsetMappingIdentity;
    }

    @NotNull
    public static final TransformedText filterWithValidation(@NotNull VisualTransformation visualTransformation, @NotNull AnnotatedString annotatedString) {
        TransformedText transformedTextFilter = visualTransformation.filter(annotatedString);
        return new TransformedText(transformedTextFilter.getText(), new ValidatingOffsetMapping(transformedTextFilter.getOffsetMapping(), annotatedString.length(), transformedTextFilter.getText().length()));
    }
}
