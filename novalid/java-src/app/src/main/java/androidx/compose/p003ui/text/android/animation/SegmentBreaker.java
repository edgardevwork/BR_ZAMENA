package androidx.compose.p003ui.text.android.animation;

import android.text.Layout;
import androidx.compose.p003ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p003ui.text.android.LayoutCompatKt;
import androidx.compose.p003ui.text.android.LayoutHelper;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: SegmentBreaker.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 ListUtils.kt\nandroidx/compose/ui/text/android/ListUtilsKt\n*L\n1#1,308:1\n33#2,6:309\n74#2,11:315\n74#2,11:326\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n61#1:309,6\n221#1:315,11\n270#1:326,11\n*E\n"})
/* loaded from: classes2.dex */
public final class SegmentBreaker {
    public static final int $stable = 0;

    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* compiled from: SegmentBreaker.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(layoutHelper.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i2);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i2);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i3 = 0; i3 < runCount; i3++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i3) + paragraphStart));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(treeSet);
    }

    private final List<Integer> breakWithBreakIterator(CharSequence text, BreakIterator breaker) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(text, 0, text.length());
        List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        breaker.setText(charSequenceCharacterIterator);
        while (breaker.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breaker.current()));
        }
        return listMutableListOf;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i == 2) {
            List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i2 < paragraphCount) {
                listMutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i2)));
                i2++;
            }
            return listMutableListOf;
        }
        if (i != 3) {
            if (i == 4) {
                return breakInWords(layoutHelper);
            }
            if (i == 5) {
                return breakWithBreakIterator(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Integer> listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0);
        int lineCount = layout.getLineCount();
        while (i2 < lineCount) {
            listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i2)));
            i2++;
        }
        return listMutableListOf2;
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean dropSpaces) {
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i == 3) {
            return breakSegmentWithLine(layoutHelper, dropSpaces);
        }
        if (i == 4) {
            return breakSegmentWithWord(layoutHelper, dropSpaces);
        }
        if (i == 5) {
            return breakSegmentWithChar(layoutHelper, dropSpaces);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return CollectionsKt__CollectionsJVMKt.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            int paragraphStart = layoutHelper.getParagraphStart(i);
            int paragraphEnd = layoutHelper.getParagraphEnd(i);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i = 0; i < lineCount; i++) {
            arrayList.add(new Segment(layout.getLineStart(i), layout.getLineEnd(i), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i)) : 0, layout.getLineTop(i), dropSpaces ? (int) Math.ceil(layout.getLineRight(i)) : layout.getWidth(), layout.getLineBottom(i)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean dropSpaces) {
        int i;
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets);
                int i2 = 0;
                while (i2 < lastIndex) {
                    i2++;
                    Integer num2 = listBreakOffsets.get(i2);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z2);
                    boolean z3 = layout.getParagraphDirection(lineForOffset) == -1 ? z : z2;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z3) {
                        z = z2;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z, z2));
                    int iCeil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z3, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (dropSpaces && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i = lineForOffset;
                        if (layout.getLineEnd(i) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i = lineForOffset;
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(i), iMax, layout.getLineBottom(i)));
                    num = num2;
                    z = true;
                    z2 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (listBreakOffsets.size() != 0) {
            boolean z = true;
            if (listBreakOffsets.size() == 1) {
                CollectionsKt__CollectionsKt.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets);
                int i = 0;
                while (i < lastIndex) {
                    i++;
                    Integer num2 = listBreakOffsets.get(i);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!dropSpaces || iIntValue != iIntValue2 + 1 || !layoutHelper.isLineEndSpace(layout.getText().charAt(iIntValue2))) {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z2);
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == -1 ? z : z2;
                        boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                        if (zIsRtlCharAt != z3) {
                            z = z2;
                        }
                        int iCeil = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z, z2));
                        int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z3, true));
                        arrayList.add(new Segment(iIntValue2, iIntValue, Math.min(iCeil, iCeil2), layout.getLineTop(lineForOffset), Math.max(iCeil, iCeil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(Unit.INSTANCE);
                    num = num2;
                    z = true;
                    z2 = false;
                }
            }
        }
        return arrayList;
    }
}
