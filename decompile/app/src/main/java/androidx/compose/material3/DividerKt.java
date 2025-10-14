package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Divider.kt */
@Metadata(m7104d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a0\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a0\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a0\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7105d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "HorizontalDivider", "HorizontalDivider-9IZ8Weo", "VerticalDivider", "VerticalDivider-9IZ8Weo", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,118:1\n1116#2,6:119\n1116#2,6:125\n74#3:131\n174#4:132\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material3/DividerKt\n*L\n52#1:119,6\n78#1:125,6\n98#1:131\n98#1:132\n*E\n"})
/* loaded from: classes4.dex */
public final class DividerKt {
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: HorizontalDivider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9424HorizontalDivider9IZ8Weo(@Nullable Modifier modifier, final float f, final long j, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    f = DividerDefaults.INSTANCE.m9422getThicknessD9Ej5fM();
                }
                if ((i2 & 4) != 0) {
                    j = DividerDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(75144485, i3, -1, "androidx.compose.material3.HorizontalDivider (Divider.kt:51)");
                }
                z = true;
                Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f);
                composerStartRestartGroup.startReplaceableGroup(941664184);
                boolean z3 = (i3 & 112) != 32;
                if ((((i3 & 896) ^ 384) > 256 || !composerStartRestartGroup.changed(j)) && (i3 & 384) != 256) {
                    z = false;
                }
                z2 = z3 | z;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope drawScope) {
                            float f2 = 2;
                            DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(0.0f, drawScope.mo7874toPx0680j_4(f) / f2), OffsetKt.Offset(Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()), drawScope.mo7874toPx0680j_4(f) / f2), drawScope.mo7874toPx0680j_4(f), 0, null, 0.0f, null, 0, 496, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM8158height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                z = true;
                Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), f);
                composerStartRestartGroup.startReplaceableGroup(941664184);
                if ((i3 & 112) != 32) {
                }
                if (((i3 & 896) ^ 384) > 256) {
                    z = false;
                    z2 = z3 | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                        objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope drawScope) {
                                float f2 = 2;
                                DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(0.0f, drawScope.mo7874toPx0680j_4(f) / f2), OffsetKt.Offset(Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()), drawScope.mo7874toPx0680j_4(f) / f2), drawScope.mo7874toPx0680j_4(f), 0, null, 0.0f, null, 0, 496, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                } else {
                    z = false;
                    z2 = z3 | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                    }
                }
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        final long j2 = j;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    DividerKt.m9424HorizontalDivider9IZ8Weo(modifier2, f2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: VerticalDivider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9425VerticalDivider9IZ8Weo(@Nullable Modifier modifier, final float f, final long j, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534852205);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    f = DividerDefaults.INSTANCE.m9422getThicknessD9Ej5fM();
                }
                if ((i2 & 4) != 0) {
                    j = DividerDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534852205, i3, -1, "androidx.compose.material3.VerticalDivider (Divider.kt:77)");
                }
                z = true;
                Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), f);
                composerStartRestartGroup.startReplaceableGroup(1779728798);
                boolean z3 = (i3 & 112) != 32;
                if ((((i3 & 896) ^ 384) > 256 || !composerStartRestartGroup.changed(j)) && (i3 & 384) != 256) {
                    z = false;
                }
                z2 = z3 | z;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope drawScope) {
                            float f2 = 2;
                            DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(drawScope.mo7874toPx0680j_4(f) / f2, 0.0f), OffsetKt.Offset(drawScope.mo7874toPx0680j_4(f) / f2, Size.m11165getHeightimpl(drawScope.mo11889getSizeNHjbRc())), drawScope.mo7874toPx0680j_4(f), 0, null, 0.0f, null, 0, 496, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM8177width3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                z = true;
                Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null), f);
                composerStartRestartGroup.startReplaceableGroup(1779728798);
                if ((i3 & 112) != 32) {
                }
                if (((i3 & 896) ^ 384) > 256) {
                    z = false;
                    z2 = z3 | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                        objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope drawScope) {
                                float f2 = 2;
                                DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(drawScope.mo7874toPx0680j_4(f) / f2, 0.0f), OffsetKt.Offset(drawScope.mo7874toPx0680j_4(f) / f2, Size.m11165getHeightimpl(drawScope.mo11889getSizeNHjbRc())), drawScope.mo7874toPx0680j_4(f), 0, null, 0.0f, null, 0, 496, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8177width3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                } else {
                    z = false;
                    z2 = z3 | z;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                    }
                }
            }
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        final long j2 = j;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    DividerKt.m9425VerticalDivider9IZ8Weo(modifier2, f2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Renamed to HorizontalDivider", replaceWith = @ReplaceWith(expression = "HorizontalDivider(modifier, thickness, color)", imports = {}))
    @Composable
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9423Divider9IZ8Weo(@Nullable Modifier modifier, float f, long j, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1562471785);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j)) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceableGroup(1232937226);
                if (!C2046Dp.m13671equalsimpl0(f, C2046Dp.INSTANCE.m13684getHairlineD9Ej5fM())) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), fM13666constructorimpl), j, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    f = DividerDefaults.INSTANCE.m9422getThicknessD9Ej5fM();
                }
                if ((i2 & 4) != 0) {
                    j = DividerDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1562471785, i3, -1, "androidx.compose.material3.Divider (Divider.kt:95)");
                }
                composerStartRestartGroup.startReplaceableGroup(1232937226);
                float fM13666constructorimpl = !C2046Dp.m13671equalsimpl0(f, C2046Dp.INSTANCE.m13684getHairlineD9Ej5fM()) ? C2046Dp.m13666constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity()) : f;
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), fM13666constructorimpl), j, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final float f2 = f;
        final long j2 = j;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DividerKt$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    DividerKt.m9423Divider9IZ8Weo(modifier2, f2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
