package androidx.compose.material3.windowsizeclass;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowSizeClass.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m7105d2 = {"Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "", "value", "", "constructor-impl", "(I)I", "compareTo", "other", "compareTo-pav6bQQ", "(II)I", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3-window-size-class_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@JvmInline
/* loaded from: classes3.dex */
public final class WindowHeightSizeClass implements Comparable<WindowHeightSizeClass> {

    @NotNull
    private static final List<WindowHeightSizeClass> AllSizeClassList;

    @NotNull
    private static final Set<WindowHeightSizeClass> AllSizeClasses;
    private static final int Compact;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Set<WindowHeightSizeClass> DefaultSizeClasses;
    private static final int Expanded;
    private static final int Medium;
    private final int value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowHeightSizeClass m10810boximpl(int i) {
        return new WindowHeightSizeClass(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10812constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10813equalsimpl(int i, Object obj) {
        return (obj instanceof WindowHeightSizeClass) && i == ((WindowHeightSizeClass) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10814equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10815hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m10813equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m10815hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(WindowHeightSizeClass windowHeightSizeClass) {
        return m10817compareTopav6bQQ(windowHeightSizeClass.getValue());
    }

    private /* synthetic */ WindowHeightSizeClass(int i) {
        this.value = i;
    }

    /* renamed from: compareTo-pav6bQQ, reason: not valid java name */
    public int m10817compareTopav6bQQ(int i) {
        return m10811compareTopav6bQQ(this.value, i);
    }

    /* renamed from: compareTo-pav6bQQ, reason: not valid java name */
    public static int m10811compareTopav6bQQ(int i, int i2) {
        Companion companion = INSTANCE;
        return C2046Dp.m13665compareTo0680j_4(companion.m10820breakpointsr04XMo(i), companion.m10820breakpointsr04XMo(i2));
    }

    @NotNull
    public String toString() {
        return m10816toStringimpl(this.value);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10816toStringimpl(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("WindowHeightSizeClass.");
        if (m10814equalsimpl0(i, Compact)) {
            str = "Compact";
        } else if (m10814equalsimpl0(i, Medium)) {
            str = "Medium";
        } else {
            str = m10814equalsimpl0(i, Expanded) ? "Expanded" : "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* compiled from: WindowSizeClass.kt */
    @Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0019*\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0013\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0015\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m7105d2 = {"Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass$Companion;", "", "()V", "AllSizeClassList", "", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "getAllSizeClassList$annotations", "AllSizeClasses", "", "getAllSizeClasses$annotations", "getAllSizeClasses", "()Ljava/util/Set;", "Compact", "getCompact-Pt018CI", "()I", "I", "DefaultSizeClasses", "getDefaultSizeClasses$annotations", "getDefaultSizeClasses", "Expanded", "getExpanded-Pt018CI", "Medium", "getMedium-Pt018CI", "fromHeight", "height", "Landroidx/compose/ui/unit/Dp;", "supportedSizeClasses", "fromHeight-BkRwncw$material3_window_size_class_release", "(FLjava/util/Set;)I", "breakpoint", "breakpoint-sr04XMo", "(I)F", "material3-window-size-class_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nWindowSizeClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowSizeClass.kt\nandroidx/compose/material3/windowsizeclass/WindowHeightSizeClass$Companion\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,294:1\n154#2:295\n154#2:296\n154#2:297\n154#2:298\n1#3:299\n33#4,6:300\n*S KotlinDebug\n*F\n+ 1 WindowSizeClass.kt\nandroidx/compose/material3/windowsizeclass/WindowHeightSizeClass$Companion\n*L\n263#1:295\n264#1:296\n265#1:297\n277#1:298\n280#1:300,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getAllSizeClassList$annotations() {
        }

        public static /* synthetic */ void getAllSizeClasses$annotations() {
        }

        public static /* synthetic */ void getDefaultSizeClasses$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getCompact-Pt018CI, reason: not valid java name */
        public final int m10822getCompactPt018CI() {
            return WindowHeightSizeClass.Compact;
        }

        /* renamed from: getMedium-Pt018CI, reason: not valid java name */
        public final int m10824getMediumPt018CI() {
            return WindowHeightSizeClass.Medium;
        }

        /* renamed from: getExpanded-Pt018CI, reason: not valid java name */
        public final int m10823getExpandedPt018CI() {
            return WindowHeightSizeClass.Expanded;
        }

        @NotNull
        public final Set<WindowHeightSizeClass> getDefaultSizeClasses() {
            return WindowHeightSizeClass.DefaultSizeClasses;
        }

        @NotNull
        public final Set<WindowHeightSizeClass> getAllSizeClasses() {
            return WindowHeightSizeClass.AllSizeClasses;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: breakpoint-sr04XMo, reason: not valid java name */
        public final float m10820breakpointsr04XMo(int i) {
            if (!WindowHeightSizeClass.m10814equalsimpl0(i, m10823getExpandedPt018CI())) {
                if (WindowHeightSizeClass.m10814equalsimpl0(i, m10824getMediumPt018CI())) {
                    return C2046Dp.m13666constructorimpl(480);
                }
                return C2046Dp.m13666constructorimpl(0);
            }
            return C2046Dp.m13666constructorimpl(TypedValues.Custom.TYPE_INT);
        }

        /* renamed from: fromHeight-BkRwncw$material3_window_size_class_release, reason: not valid java name */
        public final int m10821fromHeightBkRwncw$material3_window_size_class_release(float height, @NotNull Set<WindowHeightSizeClass> supportedSizeClasses) {
            if (C2046Dp.m13665compareTo0680j_4(height, C2046Dp.m13666constructorimpl(0)) < 0) {
                throw new IllegalArgumentException("Width must not be negative".toString());
            }
            if (!(!supportedSizeClasses.isEmpty())) {
                throw new IllegalArgumentException("Must support at least one size class".toString());
            }
            int iM10823getExpandedPt018CI = m10823getExpandedPt018CI();
            List list = WindowHeightSizeClass.AllSizeClassList;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int value = ((WindowHeightSizeClass) list.get(i)).getValue();
                if (supportedSizeClasses.contains(WindowHeightSizeClass.m10810boximpl(value))) {
                    if (C2046Dp.m13665compareTo0680j_4(height, WindowHeightSizeClass.INSTANCE.m10820breakpointsr04XMo(value)) >= 0) {
                        return value;
                    }
                    iM10823getExpandedPt018CI = value;
                }
            }
            return iM10823getExpandedPt018CI;
        }
    }

    static {
        int iM10812constructorimpl = m10812constructorimpl(0);
        Compact = iM10812constructorimpl;
        int iM10812constructorimpl2 = m10812constructorimpl(1);
        Medium = iM10812constructorimpl2;
        int iM10812constructorimpl3 = m10812constructorimpl(2);
        Expanded = iM10812constructorimpl3;
        DefaultSizeClasses = SetsKt__SetsKt.setOf((Object[]) new WindowHeightSizeClass[]{m10810boximpl(iM10812constructorimpl), m10810boximpl(iM10812constructorimpl2), m10810boximpl(iM10812constructorimpl3)});
        List<WindowHeightSizeClass> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new WindowHeightSizeClass[]{m10810boximpl(iM10812constructorimpl3), m10810boximpl(iM10812constructorimpl2), m10810boximpl(iM10812constructorimpl)});
        AllSizeClassList = listListOf;
        AllSizeClasses = CollectionsKt___CollectionsKt.toSet(listListOf);
    }
}
