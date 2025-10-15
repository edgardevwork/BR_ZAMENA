package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Padding.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0014\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a*\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a>\u0010\u001b\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m7105d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", TtmlNode.START, "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", TtmlNode.LEFT, TtmlNode.RIGHT, "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n154#2:476\n154#2:477\n154#2:478\n154#2:479\n154#2:480\n154#2:481\n154#2:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n50#1:468\n51#1:469\n52#1:470\n53#1:471\n83#1:472\n84#1:473\n156#1:474\n157#1:475\n158#1:476\n159#1:477\n275#1:478\n285#1:479\n286#1:480\n287#1:481\n288#1:482\n*E\n"})
/* loaded from: classes.dex */
public final class PaddingKt {

    /* compiled from: Padding.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.PaddingKt$padding$1 */
    public static final class C05591 extends Lambda implements Function1<InspectorInfo, Unit> {
        public final /* synthetic */ float $bottom;
        public final /* synthetic */ float $end;
        public final /* synthetic */ float $start;
        public final /* synthetic */ float $top;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05591(float f, float f2, float f3, float f4) {
            super(1);
            f = f;
            f = f2;
            f = f3;
            f = f4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("padding");
            inspectorInfo.getProperties().set(TtmlNode.START, C2046Dp.m13664boximpl(f));
            inspectorInfo.getProperties().set("top", C2046Dp.m13664boximpl(f));
            inspectorInfo.getProperties().set("end", C2046Dp.m13664boximpl(f));
            inspectorInfo.getProperties().set("bottom", C2046Dp.m13664boximpl(f));
        }
    }

    @Stable
    @NotNull
    /* renamed from: padding-qDBjuR0 */
    public static final Modifier m8126paddingqDBjuR0(@NotNull Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.1
            public final /* synthetic */ float $bottom;
            public final /* synthetic */ float $end;
            public final /* synthetic */ float $start;
            public final /* synthetic */ float $top;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05591(float f5, float f22, float f32, float f42) {
                super(1);
                f = f5;
                f = f22;
                f = f32;
                f = f42;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set(TtmlNode.START, C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("top", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("end", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("bottom", C2046Dp.m13664boximpl(f));
            }
        }, null));
    }

    /* compiled from: Padding.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.PaddingKt$padding$2 */
    public static final class C05602 extends Lambda implements Function1<InspectorInfo, Unit> {
        public final /* synthetic */ float $horizontal;
        public final /* synthetic */ float $vertical;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05602(float f, float f2) {
            super(1);
            f = f;
            f = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("padding");
            inspectorInfo.getProperties().set("horizontal", C2046Dp.m13664boximpl(f));
            inspectorInfo.getProperties().set("vertical", C2046Dp.m13664boximpl(f));
        }
    }

    @Stable
    @NotNull
    /* renamed from: padding-VpY3zN4 */
    public static final Modifier m8124paddingVpY3zN4(@NotNull Modifier modifier, float f, float f2) {
        return modifier.then(new PaddingElement(f, f2, f, f2, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.2
            public final /* synthetic */ float $horizontal;
            public final /* synthetic */ float $vertical;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05602(float f3, float f22) {
                super(1);
                f = f3;
                f = f22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("horizontal", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("vertical", C2046Dp.m13664boximpl(f));
            }
        }, null));
    }

    /* compiled from: Padding.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.PaddingKt$padding$3 */
    public static final class C05613 extends Lambda implements Function1<InspectorInfo, Unit> {
        public final /* synthetic */ float $all;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05613(float f) {
            super(1);
            f = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("padding");
            inspectorInfo.setValue(C2046Dp.m13664boximpl(f));
        }
    }

    @Stable
    @NotNull
    /* renamed from: padding-3ABfNKs */
    public static final Modifier m8123padding3ABfNKs(@NotNull Modifier modifier, float f) {
        return modifier.then(new PaddingElement(f, f, f, f, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.3
            public final /* synthetic */ float $all;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05613(float f2) {
                super(1);
                f = f2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.setValue(C2046Dp.m13664boximpl(f));
            }
        }, null));
    }

    /* compiled from: Padding.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.PaddingKt$padding$4 */
    public static final class C05624 extends Lambda implements Function1<InspectorInfo, Unit> {
        public C05624() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("padding");
            inspectorInfo.getProperties().set("paddingValues", paddingValues);
        }
    }

    @Stable
    @NotNull
    public static final Modifier padding(@NotNull Modifier modifier, @NotNull PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.4
            public C05624() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        }));
    }

    @Stable
    @NotNull
    /* renamed from: absolutePadding-qDBjuR0 */
    public static final Modifier m8121absolutePaddingqDBjuR0(@NotNull Modifier modifier, final float f, final float f2, final float f3, final float f4) {
        return modifier.then(new PaddingElement(f, f2, f3, f4, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set(TtmlNode.LEFT, C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("top", C2046Dp.m13664boximpl(f2));
                inspectorInfo.getProperties().set(TtmlNode.RIGHT, C2046Dp.m13664boximpl(f3));
                inspectorInfo.getProperties().set("bottom", C2046Dp.m13664boximpl(f4));
            }
        }, null));
    }

    @Stable
    public static final float calculateStartPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo8074calculateLeftPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo8075calculateRightPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    public static final float calculateEndPadding(@NotNull PaddingValues paddingValues, @NotNull LayoutDirection layoutDirection) {
        if (layoutDirection == LayoutDirection.Ltr) {
            return paddingValues.mo8075calculateRightPaddingu2uoSUM(layoutDirection);
        }
        return paddingValues.mo8074calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-0680j_4 */
    public static final PaddingValues m8116PaddingValues0680j_4(float f) {
        return new PaddingValues(f, f, f, f, null);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-YgX7TsA */
    public static final PaddingValues m8117PaddingValuesYgX7TsA(float f, float f2) {
        return new PaddingValues(f, f2, f, f2, null);
    }

    @Stable
    @NotNull
    /* renamed from: PaddingValues-a9UjIt4 */
    public static final PaddingValues m8119PaddingValuesa9UjIt4(float f, float f2, float f3, float f4) {
        return new PaddingValues(f, f2, f3, f4, null);
    }

    /* renamed from: padding-qDBjuR0$default */
    public static /* synthetic */ Modifier m8127paddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C2046Dp.m13666constructorimpl(0);
        }
        return m8126paddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: padding-VpY3zN4$default */
    public static /* synthetic */ Modifier m8125paddingVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        return m8124paddingVpY3zN4(modifier, f, f2);
    }

    /* renamed from: absolutePadding-qDBjuR0$default */
    public static /* synthetic */ Modifier m8122absolutePaddingqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C2046Dp.m13666constructorimpl(0);
        }
        return m8121absolutePaddingqDBjuR0(modifier, f, f2, f3, f4);
    }

    /* renamed from: PaddingValues-YgX7TsA$default */
    public static /* synthetic */ PaddingValues m8118PaddingValuesYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        return m8117PaddingValuesYgX7TsA(f, f2);
    }

    /* renamed from: PaddingValues-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m8120PaddingValuesa9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f3 = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f4 = C2046Dp.m13666constructorimpl(0);
        }
        return m8119PaddingValuesa9UjIt4(f, f2, f3, f4);
    }
}
