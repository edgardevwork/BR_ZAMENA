package androidx.compose.foundation.text2.input;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MaxLengthTransformation.kt */
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/MaxLengthFilter;", "Landroidx/compose/foundation/text2/input/InputTransformation;", "maxLength", "", "inCodepoints", "", "(IZ)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "transformInput", "", "originalValue", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "valueWithChanges", "Landroidx/compose/foundation/text2/input/TextFieldBuffer;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMaxLengthTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxLengthTransformation.kt\nandroidx/compose/foundation/text2/input/MaxLengthFilter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
/* loaded from: classes3.dex */
public final /* data */ class MaxLengthFilter implements InputTransformation {
    public final boolean inCodepoints;
    public final int maxLength;

    public static /* synthetic */ MaxLengthFilter copy$default(MaxLengthFilter maxLengthFilter, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = maxLengthFilter.maxLength;
        }
        if ((i2 & 2) != 0) {
            z = maxLengthFilter.inCodepoints;
        }
        return maxLengthFilter.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getInCodepoints() {
        return this.inCodepoints;
    }

    @NotNull
    public final MaxLengthFilter copy(int maxLength, boolean inCodepoints) {
        return new MaxLengthFilter(maxLength, inCodepoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxLengthFilter)) {
            return false;
        }
        MaxLengthFilter maxLengthFilter = (MaxLengthFilter) other;
        return this.maxLength == maxLengthFilter.maxLength && this.inCodepoints == maxLengthFilter.inCodepoints;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxLength) * 31) + Boolean.hashCode(this.inCodepoints);
    }

    public MaxLengthFilter(int i, boolean z) {
        this.maxLength = i;
        this.inCodepoints = z;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxLength must be at least zero, was " + i).toString());
    }

    @Override // androidx.compose.foundation.text2.input.InputTransformation
    public void transformInput(@NotNull TextFieldCharSequence originalValue, @NotNull TextFieldBuffer valueWithChanges) {
        if ((this.inCodepoints ? valueWithChanges.getCodepointLength() : valueWithChanges.getLength()) > this.maxLength) {
            valueWithChanges.revertAllChanges();
        }
    }

    @NotNull
    public String toString() {
        return "InputTransformation." + (this.inCodepoints ? "maxLengthInCodepoints" : "maxLengthInChars") + "(maxLength=" + this.maxLength + ')';
    }
}
