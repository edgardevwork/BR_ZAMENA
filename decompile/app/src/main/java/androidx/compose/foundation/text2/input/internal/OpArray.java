package androidx.compose.foundation.text2.input.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OffsetMappingCalculator.kt */
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00102K\u0010\u0018\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00150\u0019H\u0086\b¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\nJ-\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0006\u0092\u0001\u00020\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m7105d2 = {"Landroidx/compose/foundation/text2/input/internal/OpArray;", "", "size", "", "constructor-impl", "(I)[I", SavedStateHandle.VALUES, "", "([I)[I", "getSize-impl", "([I)I", "copyOf", "newSize", "copyOf-S4-kM8k", "([II)[I", "equals", "", "other", "equals-impl", "([ILjava/lang/Object;)Z", "forEach", "", "max", "reversed", "block", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", TypedValues.CycleType.S_WAVE_OFFSET, "srcLen", "destLen", "forEach-impl", "([IIZLkotlin/jvm/functions/Function3;)V", "hashCode", "hashCode-impl", "set", FirebaseAnalytics.Param.INDEX, "set-impl", "([IIIII)V", "toString", "", "toString-impl", "([I)Ljava/lang/String;", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class OpArray {

    @Deprecated
    public static final int ElementSize = 3;

    @NotNull
    public final int[] values;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OpArray m8672boximpl(int[] iArr) {
        return new OpArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m8674constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8676equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && Intrinsics.areEqual(iArr, ((OpArray) obj).getValues());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8677equalsimpl0(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual(iArr, iArr2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8681hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8683toStringimpl(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m8676equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m8681hashCodeimpl(this.values);
    }

    public String toString() {
        return m8683toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int[] getValues() {
        return this.values;
    }

    public /* synthetic */ OpArray(int[] iArr) {
        this.values = iArr;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m8673constructorimpl(int i) {
        return m8674constructorimpl(new int[i * 3]);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m8680getSizeimpl(int[] iArr) {
        return iArr.length / 3;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m8682setimpl(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i * 3;
        iArr[i5] = i2;
        iArr[i5 + 1] = i3;
        iArr[i5 + 2] = i4;
    }

    @NotNull
    /* renamed from: copyOf-S4-kM8k, reason: not valid java name */
    public static final int[] m8675copyOfS4kM8k(int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i * 3);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        return m8674constructorimpl(iArrCopyOf);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m8678forEachimpl(int[] iArr, int i, boolean z, @NotNull Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 3;
                function3.invoke(Integer.valueOf(iArr[i3]), Integer.valueOf(iArr[i3 + 1]), Integer.valueOf(iArr[i3 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i4 = i * 3;
            function3.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
        }
    }

    /* renamed from: forEach-impl$default, reason: not valid java name */
    public static /* synthetic */ void m8679forEachimpl$default(int[] iArr, int i, boolean z, Function3 function3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (i < 0) {
            return;
        }
        if (!z) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * 3;
                function3.invoke(Integer.valueOf(iArr[i4]), Integer.valueOf(iArr[i4 + 1]), Integer.valueOf(iArr[i4 + 2]));
            }
            return;
        }
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            int i5 = i * 3;
            function3.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr[i5 + 1]), Integer.valueOf(iArr[i5 + 2]));
        }
    }
}
