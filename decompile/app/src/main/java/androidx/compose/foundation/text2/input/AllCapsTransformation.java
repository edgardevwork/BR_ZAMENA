package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text2.input.TextFieldBuffer;
import androidx.compose.p003ui.text.StringKt;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.p003ui.text.input.KeyboardCapitalization;
import androidx.compose.p003ui.text.intl.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AllCapsTransformation.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/AllCapsTransformation;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "locale", "Landroidx/compose/ui/text/intl/Locale;", "(Landroidx/compose/ui/text/intl/Locale;)V", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "transformInput", "", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAllCapsTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n+ 2 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,64:1\n545#2,7:65\n*S KotlinDebug\n*F\n+ 1 AllCapsTransformation.kt\nandroidx/compose/foundation/text2/input/AllCapsTransformation\n*L\n51#1:65,7\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class AllCapsTransformation implements InputTransformation {

    @NotNull
    public final KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m13369getCharactersIUNYP9k(), false, 0, 0, null, 30, null);

    @NotNull
    public final Locale locale;

    public static /* synthetic */ AllCapsTransformation copy$default(AllCapsTransformation allCapsTransformation, Locale locale, int i, Object obj) {
        if ((i & 1) != 0) {
            locale = allCapsTransformation.locale;
        }
        return allCapsTransformation.copy(locale);
    }

    /* renamed from: component1, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final AllCapsTransformation copy(@NotNull Locale locale) {
        return new AllCapsTransformation(locale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AllCapsTransformation) && Intrinsics.areEqual(this.locale, ((AllCapsTransformation) other).locale);
    }

    public int hashCode() {
        return this.locale.hashCode();
    }

    public AllCapsTransformation(@NotNull Locale locale) {
        this.locale = locale;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    @NotNull
    public KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@NotNull TextFieldCharSequence originalValue, @NotNull TextFieldBuffer valueWithChanges) {
        TextFieldBuffer.ChangeList changes = valueWithChanges.getChanges();
        for (int i = 0; i < changes.getChangeCount(); i++) {
            long jMo8635getRangejx7JFs = changes.mo8635getRangejx7JFs(i);
            changes.mo8634getOriginalRangejx7JFs(i);
            if (!TextRange.m13159getCollapsedimpl(jMo8635getRangejx7JFs)) {
                valueWithChanges.replace(TextRange.m13163getMinimpl(jMo8635getRangejx7JFs), TextRange.m13162getMaximpl(jMo8635getRangejx7JFs), StringKt.toUpperCase(TextRangeKt.m13172substringFDrldGo(valueWithChanges.asCharSequence(), jMo8635getRangejx7JFs), this.locale));
            }
        }
    }

    @NotNull
    public String toString() {
        return "InputTransformation.allCaps(locale=" + this.locale + ')';
    }
}
