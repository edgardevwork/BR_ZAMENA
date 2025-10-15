package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Offset.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a*\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m7105d2 = {"absoluteOffset", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "absoluteOffset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset-VpY3zN4", "foundation-layout_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n154#2:257\n154#2:258\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n49#1:257\n75#1:258\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetKt {

    /* compiled from: Offset.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.OffsetKt$offset$1 */
    public static final class C05571 extends Lambda implements Function1<InspectorInfo, Unit> {

        /* renamed from: $x */
        public final /* synthetic */ float f43$x;

        /* renamed from: $y */
        public final /* synthetic */ float f44$y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05571(float f, float f2) {
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
            inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
            inspectorInfo.getProperties().set("x", C2046Dp.m13664boximpl(f));
            inspectorInfo.getProperties().set("y", C2046Dp.m13664boximpl(f));
        }
    }

    @Stable
    @NotNull
    /* renamed from: offset-VpY3zN4 */
    public static final Modifier m8083offsetVpY3zN4(@NotNull Modifier modifier, float f, float f2) {
        return modifier.then(new OffsetModifierElement(f, f2, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.1

            /* renamed from: $x */
            public final /* synthetic */ float f43$x;

            /* renamed from: $y */
            public final /* synthetic */ float f44$y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05571(float f3, float f22) {
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
                inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
                inspectorInfo.getProperties().set("x", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("y", C2046Dp.m13664boximpl(f));
            }
        }, null));
    }

    /* compiled from: Offset.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$1 */
    public static final class C05551 extends Lambda implements Function1<InspectorInfo, Unit> {

        /* renamed from: $x */
        public final /* synthetic */ float f41$x;

        /* renamed from: $y */
        public final /* synthetic */ float f42$y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05551(float f, float f2) {
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
            inspectorInfo.setName("absoluteOffset");
            inspectorInfo.getProperties().set("x", C2046Dp.m13664boximpl(f));
            inspectorInfo.getProperties().set("y", C2046Dp.m13664boximpl(f));
        }
    }

    @Stable
    @NotNull
    /* renamed from: absoluteOffset-VpY3zN4 */
    public static final Modifier m8081absoluteOffsetVpY3zN4(@NotNull Modifier modifier, float f, float f2) {
        return modifier.then(new OffsetModifierElement(f, f2, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.1

            /* renamed from: $x */
            public final /* synthetic */ float f41$x;

            /* renamed from: $y */
            public final /* synthetic */ float f42$y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05551(float f3, float f22) {
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("x", C2046Dp.m13664boximpl(f));
                inspectorInfo.getProperties().set("y", C2046Dp.m13664boximpl(f));
            }
        }, null));
    }

    /* compiled from: Offset.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.OffsetKt$offset$2 */
    public static final class C05582 extends Lambda implements Function1<InspectorInfo, Unit> {
        public final /* synthetic */ Function1<Density, IntOffset> $offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05582(Function1<? super Density, IntOffset> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
            inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
        }
    }

    @NotNull
    public static final Modifier offset(@NotNull Modifier modifier, @NotNull Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxModifier(function1, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.2
            public final /* synthetic */ Function1<Density, IntOffset> $offset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05582(Function1<? super Density, IntOffset> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
                inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
            }
        }));
    }

    /* compiled from: Offset.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$2 */
    public static final class C05562 extends Lambda implements Function1<InspectorInfo, Unit> {
        public final /* synthetic */ Function1<Density, IntOffset> $offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C05562(Function1<? super Density, IntOffset> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
            inspectorInfo.setName("absoluteOffset");
            inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
        }
    }

    @NotNull
    public static final Modifier absoluteOffset(@NotNull Modifier modifier, @NotNull Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxModifier(function1, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.2
            public final /* synthetic */ Function1<Density, IntOffset> $offset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05562(Function1<? super Density, IntOffset> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
            }
        }));
    }

    /* renamed from: offset-VpY3zN4$default */
    public static /* synthetic */ Modifier m8084offsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        return m8083offsetVpY3zN4(modifier, f, f2);
    }

    /* renamed from: absoluteOffset-VpY3zN4$default */
    public static /* synthetic */ Modifier m8082absoluteOffsetVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C2046Dp.m13666constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f2 = C2046Dp.m13666constructorimpl(0);
        }
        return m8081absoluteOffsetVpY3zN4(modifier, f, f2);
    }
}
