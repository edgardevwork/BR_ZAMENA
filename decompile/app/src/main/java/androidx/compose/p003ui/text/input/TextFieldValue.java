package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.SaversKt;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextFieldValue.kt */
@Immutable
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007B#\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m7105d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", "copy", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<TextFieldValue, Object> Saver = SaverKt.Saver(new Function2<SaverScope, TextFieldValue, Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull TextFieldValue textFieldValue) {
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(textFieldValue.getText(), SaversKt.getAnnotatedStringSaver(), saverScope), SaversKt.save(TextRange.m13153boximpl(textFieldValue.getSelection()), SaversKt.getSaver(TextRange.INSTANCE), saverScope));
        }
    }, new Function1<Object, TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextFieldValue invoke(@NotNull Object obj) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<AnnotatedString, Object> annotatedStringSaver = SaversKt.getAnnotatedStringSaver();
            Boolean bool = Boolean.FALSE;
            TextRange textRangeRestore = null;
            AnnotatedString annotatedStringRestore = (Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : annotatedStringSaver.restore(obj2);
            Intrinsics.checkNotNull(annotatedStringRestore);
            Object obj3 = list.get(1);
            Saver<TextRange, Object> saver = SaversKt.getSaver(TextRange.INSTANCE);
            if (!Intrinsics.areEqual(obj3, bool) && obj3 != null) {
                textRangeRestore = saver.restore(obj3);
            }
            Intrinsics.checkNotNull(textRangeRestore);
            return new TextFieldValue(annotatedStringRestore, textRangeRestore.getPackedValue(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
    });

    /* renamed from: annotatedString, reason: from kotlin metadata and from toString */
    @NotNull
    private final AnnotatedString text;

    @Nullable
    private final TextRange composition;
    private final long selection;

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textRange);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textRange);
    }

    private TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        this.text = annotatedString;
        this.selection = TextRangeKt.m13171coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? TextRange.m13153boximpl(TextRangeKt.m13171coerceIn8ffj60Q(textRange.getPackedValue(), 0, getText().length())) : null;
    }

    @NotNull
    /* renamed from: getAnnotatedString, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? TextRange.INSTANCE.m13170getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j, TextRange textRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.INSTANCE.m13170getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (DefaultConstructorMarker) null);
    }

    private TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str, null, null, 6, null), j, textRange, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final String getText() {
        return this.text.getText();
    }

    /* renamed from: getSelection-d9O1mEE, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    @Nullable
    /* renamed from: getComposition-MzsxiRA, reason: from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    /* renamed from: copy-3r_uNRQ$default */
    public static /* synthetic */ TextFieldValue m13398copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.text;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m13400copy3r_uNRQ(annotatedString, j, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ */
    public final TextFieldValue m13400copy3r_uNRQ(@NotNull AnnotatedString annotatedString, long selection, @Nullable TextRange composition) {
        return new TextFieldValue(annotatedString, selection, composition, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-3r_uNRQ$default */
    public static /* synthetic */ TextFieldValue m13399copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, TextRange textRange, int i, Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m13401copy3r_uNRQ(str, j, textRange);
    }

    @NotNull
    /* renamed from: copy-3r_uNRQ */
    public final TextFieldValue m13401copy3r_uNRQ(@NotNull String text, long selection, @Nullable TextRange composition) {
        return new TextFieldValue(new AnnotatedString(text, null, null, 6, null), selection, composition, (DefaultConstructorMarker) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return TextRange.m13158equalsimpl0(this.selection, textFieldValue.selection) && Intrinsics.areEqual(this.composition, textFieldValue.composition) && Intrinsics.areEqual(this.text, textFieldValue.text);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + TextRange.m13166hashCodeimpl(this.selection)) * 31;
        TextRange textRange = this.composition;
        return iHashCode + (textRange != null ? TextRange.m13166hashCodeimpl(textRange.getPackedValue()) : 0);
    }

    @NotNull
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) TextRange.m13168toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Saver<TextFieldValue, Object> getSaver() {
            return TextFieldValue.Saver;
        }
    }
}
