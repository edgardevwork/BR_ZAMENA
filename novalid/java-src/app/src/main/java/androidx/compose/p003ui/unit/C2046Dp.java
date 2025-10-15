package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dp.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u000fJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u000fJ\u001e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m7105d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", TtmlNode.TAG_DIV, "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", ScriptTagPayloadReader.KEY_TIMES, "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
/* renamed from: androidx.compose.ui.unit.Dp */
/* loaded from: classes3.dex */
public final class C2046Dp implements Comparable<C2046Dp> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final float Hairline = m13666constructorimpl(0.0f);
    private static final float Infinity = m13666constructorimpl(Float.POSITIVE_INFINITY);
    private static final float Unspecified = m13666constructorimpl(Float.NaN);
    private final float value;

    /* renamed from: box-impl */
    public static final /* synthetic */ C2046Dp m13664boximpl(float f) {
        return new C2046Dp(f);
    }

    /* renamed from: constructor-impl */
    public static float m13666constructorimpl(float f) {
        return f;
    }

    @Stable
    /* renamed from: div-0680j_4 */
    public static final float m13667div0680j_4(float f, float f2) {
        return f / f2;
    }

    /* renamed from: equals-impl */
    public static boolean m13670equalsimpl(float f, Object obj) {
        return (obj instanceof C2046Dp) && Float.compare(f, ((C2046Dp) obj).m13680unboximpl()) == 0;
    }

    /* renamed from: equals-impl0 */
    public static final boolean m13671equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl */
    public static int m13672hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    public boolean equals(Object obj) {
        return m13670equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m13672hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl */
    public final /* synthetic */ float m13680unboximpl() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C2046Dp c2046Dp) {
        return m13679compareTo0680j_4(c2046Dp.m13680unboximpl());
    }

    private /* synthetic */ C2046Dp(float f) {
        this.value = f;
    }

    public final float getValue() {
        return this.value;
    }

    @Stable
    /* renamed from: plus-5rwHm24 */
    public static final float m13674plus5rwHm24(float f, float f2) {
        return m13666constructorimpl(f + f2);
    }

    @Stable
    /* renamed from: minus-5rwHm24 */
    public static final float m13673minus5rwHm24(float f, float f2) {
        return m13666constructorimpl(f - f2);
    }

    @Stable
    /* renamed from: unaryMinus-D9Ej5fM */
    public static final float m13678unaryMinusD9Ej5fM(float f) {
        return m13666constructorimpl(-f);
    }

    @Stable
    /* renamed from: div-u2uoSUM */
    public static final float m13668divu2uoSUM(float f, float f2) {
        return m13666constructorimpl(f / f2);
    }

    @Stable
    /* renamed from: div-u2uoSUM */
    public static final float m13669divu2uoSUM(float f, int i) {
        return m13666constructorimpl(f / i);
    }

    @Stable
    /* renamed from: times-u2uoSUM */
    public static final float m13675timesu2uoSUM(float f, float f2) {
        return m13666constructorimpl(f * f2);
    }

    @Stable
    /* renamed from: times-u2uoSUM */
    public static final float m13676timesu2uoSUM(float f, int i) {
        return m13666constructorimpl(f * i);
    }

    @Stable
    /* renamed from: compareTo-0680j_4 */
    public static int m13665compareTo0680j_4(float f, float f2) {
        return Float.compare(f, f2);
    }

    @Stable
    /* renamed from: compareTo-0680j_4 */
    public int m13679compareTo0680j_4(float f) {
        return m13665compareTo0680j_4(this.value, f);
    }

    @Stable
    @NotNull
    public String toString() {
        return m13677toStringimpl(this.value);
    }

    /* compiled from: Dp.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m7105d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.ui.unit.Dp$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        /* renamed from: getHairline-D9Ej5fM$annotations */
        public static /* synthetic */ void m13681getHairlineD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getInfinity-D9Ej5fM$annotations */
        public static /* synthetic */ void m13682getInfinityD9Ej5fM$annotations() {
        }

        @Stable
        /* renamed from: getUnspecified-D9Ej5fM$annotations */
        public static /* synthetic */ void m13683getUnspecifiedD9Ej5fM$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getHairline-D9Ej5fM */
        public final float m13684getHairlineD9Ej5fM() {
            return C2046Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM */
        public final float m13685getInfinityD9Ej5fM() {
            return C2046Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM */
        public final float m13686getUnspecifiedD9Ej5fM() {
            return C2046Dp.Unspecified;
        }
    }

    @Stable
    @NotNull
    /* renamed from: toString-impl */
    public static String m13677toStringimpl(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }
}
