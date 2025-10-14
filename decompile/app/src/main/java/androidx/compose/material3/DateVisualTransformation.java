package androidx.compose.material3;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TransformedText;
import androidx.compose.p003ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DateInput.kt */
@Metadata(m7104d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\b\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m7105d2 = {"Landroidx/compose/material3/DateVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "(Landroidx/compose/material3/DateInputFormat;)V", "dateFormatLength", "", "dateOffsetTranslator", "androidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1", "Landroidx/compose/material3/DateVisualTransformation$dateOffsetTranslator$1;", "firstDelimiterOffset", "secondDelimiterOffset", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,377:1\n1183#2,3:378\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n358#1:378,3\n*E\n"})
/* loaded from: classes4.dex */
public final class DateVisualTransformation implements VisualTransformation {
    public final int dateFormatLength;

    @NotNull
    public final DateInputFormat dateInputFormat;

    @NotNull
    public final DateVisualTransformation$dateOffsetTranslator$1 dateOffsetTranslator = new OffsetMapping() { // from class: androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1
        @Override // androidx.compose.p003ui.text.input.OffsetMapping
        public int originalToTransformed(int offset) {
            if (offset < this.this$0.firstDelimiterOffset) {
                return offset;
            }
            if (offset < this.this$0.secondDelimiterOffset) {
                return offset + 1;
            }
            if (offset > this.this$0.dateFormatLength) {
                offset = this.this$0.dateFormatLength;
            }
            return offset + 2;
        }

        @Override // androidx.compose.p003ui.text.input.OffsetMapping
        public int transformedToOriginal(int offset) {
            return offset <= this.this$0.firstDelimiterOffset + (-1) ? offset : offset <= this.this$0.secondDelimiterOffset + (-1) ? offset - 1 : offset <= this.this$0.dateFormatLength + 1 ? offset - 2 : this.this$0.dateFormatLength;
        }
    };
    public final int firstDelimiterOffset;
    public final int secondDelimiterOffset;

    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.material3.DateVisualTransformation$dateOffsetTranslator$1] */
    public DateVisualTransformation(@NotNull DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        this.firstDelimiterOffset = StringsKt__StringsKt.indexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.secondDelimiterOffset = StringsKt__StringsKt.lastIndexOf$default((CharSequence) dateInputFormat.getPatternWithDelimiters(), dateInputFormat.getDelimiter(), 0, false, 6, (Object) null);
        this.dateFormatLength = dateInputFormat.getPatternWithoutDelimiters().length();
    }

    @Override // androidx.compose.p003ui.text.input.VisualTransformation
    @NotNull
    public TransformedText filter(@NotNull AnnotatedString text) {
        String text2;
        int i = 0;
        if (text.getText().length() > this.dateFormatLength) {
            text2 = StringsKt__StringsKt.substring(text.getText(), RangesKt___RangesKt.until(0, this.dateFormatLength));
        } else {
            text2 = text.getText();
        }
        String str = "";
        int i2 = 0;
        while (i < text2.length()) {
            int i3 = i2 + 1;
            String str2 = str + text2.charAt(i);
            if (i3 == this.firstDelimiterOffset || i2 + 2 == this.secondDelimiterOffset) {
                str = str2 + this.dateInputFormat.getDelimiter();
            } else {
                str = str2;
            }
            i++;
            i2 = i3;
        }
        return new TransformedText(new AnnotatedString(str, null, null, 6, null), this.dateOffsetTranslator);
    }
}
