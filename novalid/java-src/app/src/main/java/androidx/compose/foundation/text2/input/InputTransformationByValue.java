package androidx.compose.foundation.text2.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InputTransformation.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B=\u00126\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\tJ9\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003JC\u0010\r\u001a\u00020\u000028\b\u0002\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016RA\u0010\u0002\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/InputTransformationByValue;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "transformation", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "old", "proposed", "(Lkotlin/jvm/functions/Function2;)V", "getTransformation", "()Lkotlin/jvm/functions/Function2;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "transformInput", "", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputTransformationByValue implements InputTransformation {

    @NotNull
    public final Function2<CharSequence, CharSequence, CharSequence> transformation;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputTransformationByValue copy$default(InputTransformationByValue inputTransformationByValue, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = inputTransformationByValue.transformation;
        }
        return inputTransformationByValue.copy(function2);
    }

    @NotNull
    public final Function2<CharSequence, CharSequence, CharSequence> component1() {
        return this.transformation;
    }

    @NotNull
    public final InputTransformationByValue copy(@NotNull Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> transformation) {
        return new InputTransformationByValue(transformation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InputTransformationByValue) && Intrinsics.areEqual(this.transformation, ((InputTransformationByValue) other).transformation);
    }

    public int hashCode() {
        return this.transformation.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputTransformationByValue(@NotNull Function2<? super CharSequence, ? super CharSequence, ? extends CharSequence> function2) {
        this.transformation = function2;
    }

    @NotNull
    public final Function2<CharSequence, CharSequence, CharSequence> getTransformation() {
        return this.transformation;
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@NotNull TextFieldCharSequence originalValue, @NotNull TextFieldBuffer valueWithChanges) {
        TextFieldCharSequence textFieldCharSequenceM8639toTextFieldCharSequenceOEnZFl4$foundation_release$default = TextFieldBuffer.m8639toTextFieldCharSequenceOEnZFl4$foundation_release$default(valueWithChanges, null, 1, null);
        CharSequence charSequenceInvoke = this.transformation.invoke(originalValue, textFieldCharSequenceM8639toTextFieldCharSequenceOEnZFl4$foundation_release$default);
        if (charSequenceInvoke == textFieldCharSequenceM8639toTextFieldCharSequenceOEnZFl4$foundation_release$default) {
            return;
        }
        if (charSequenceInvoke == originalValue) {
            valueWithChanges.revertAllChanges();
        } else {
            valueWithChanges.setTextIfChanged$foundation_release(charSequenceInvoke);
        }
    }

    @NotNull
    public String toString() {
        return "InputTransformation.byValue(transformation=" + this.transformation + ')';
    }
}
