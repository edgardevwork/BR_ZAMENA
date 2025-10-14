package androidx.compose.p003ui.node;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MyersDiff.kt */
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u000bJ\u000f\u0010(\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000b\u0088\u0001\u0002¨\u0006,"}, m7105d2 = {"Landroidx/compose/ui/node/Snake;", "", "data", "", "constructor-impl", "([I)[I", "getData", "()[I", "diagonalSize", "", "getDiagonalSize-impl", "([I)I", "endX", "getEndX-impl", "endY", "getEndY-impl", "hasAdditionOrRemoval", "", "getHasAdditionOrRemoval-impl", "([I)Z", "isAddition", "isAddition-impl", "reverse", "getReverse-impl", "startX", "getStartX-impl", "startY", "getStartY-impl", "addDiagonalToStack", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "equals", "other", "equals-impl", "([ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class Snake {

    @NotNull
    public final int[] data;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m12875boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m12876constructorimpl(@NotNull int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12877equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && Intrinsics.areEqual(iArr, ((Snake) obj).m12889unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12878equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12886hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public boolean equals(Object obj) {
        return m12877equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m12886hashCodeimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m12889unboximpl() {
        return this.data;
    }

    public /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    @NotNull
    public final int[] getData() {
        return this.data;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m12884getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m12885getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m12880getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m12881getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m12883getReverseimpl(int[] iArr) {
        return iArr[4] != 0;
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m12879getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m12880getEndXimpl(iArr) - m12884getStartXimpl(iArr), m12881getEndYimpl(iArr) - m12885getStartYimpl(iArr));
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    public static final boolean m12882getHasAdditionOrRemovalimpl(int[] iArr) {
        return m12881getEndYimpl(iArr) - m12885getStartYimpl(iArr) != m12880getEndXimpl(iArr) - m12884getStartXimpl(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    public static final boolean m12887isAdditionimpl(int[] iArr) {
        return m12881getEndYimpl(iArr) - m12885getStartYimpl(iArr) > m12880getEndXimpl(iArr) - m12884getStartXimpl(iArr);
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m12874addDiagonalToStackimpl(int[] iArr, @NotNull IntStack intStack) {
        if (m12882getHasAdditionOrRemovalimpl(iArr)) {
            if (m12883getReverseimpl(iArr)) {
                intStack.pushDiagonal(m12884getStartXimpl(iArr), m12885getStartYimpl(iArr), m12879getDiagonalSizeimpl(iArr));
                return;
            } else if (m12887isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m12884getStartXimpl(iArr), m12885getStartYimpl(iArr) + 1, m12879getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m12884getStartXimpl(iArr) + 1, m12885getStartYimpl(iArr), m12879getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m12884getStartXimpl(iArr), m12885getStartYimpl(iArr), m12880getEndXimpl(iArr) - m12884getStartXimpl(iArr));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12888toStringimpl(int[] iArr) {
        return "Snake(" + m12884getStartXimpl(iArr) + ',' + m12885getStartYimpl(iArr) + ',' + m12880getEndXimpl(iArr) + ',' + m12881getEndYimpl(iArr) + ',' + m12883getReverseimpl(iArr) + ')';
    }

    @NotNull
    public String toString() {
        return m12888toStringimpl(this.data);
    }
}
