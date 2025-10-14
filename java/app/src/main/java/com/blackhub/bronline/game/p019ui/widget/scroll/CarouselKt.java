package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Carousel.kt */
@SourceDebugExtension({"SMAP\nCarousel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Carousel.kt\ncom/blackhub/bronline/game/ui/widget/scroll/CarouselKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,471:1\n1116#2,6:472\n1116#2,6:478\n1116#2,6:484\n1116#2,6:490\n1116#2,6:496\n1#3:502\n154#4:503\n154#4:504\n*S KotlinDebug\n*F\n+ 1 Carousel.kt\ncom/blackhub/bronline/game/ui/widget/scroll/CarouselKt\n*L\n166#1:472,6\n260#1:478,6\n262#1:484,6\n269#1:490,6\n272#1:496,6\n367#1:503\n372#1:504\n*E\n"})
/* loaded from: classes3.dex */
public final class CarouselKt {
    public static final float DefaultCarouselMaxPercentage = 0.8f;
    public static final float DefaultCarouselMinPercentage = 0.2f;
    public static final float DefaultCarouselWidth = C2046Dp.m13666constructorimpl(60);
    public static final float DefaultCarouselHeight = C2046Dp.m13666constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Carousel(@NotNull final CarouselScrollState state, @Nullable Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f2, @Nullable CarouselColors carouselColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        int i5;
        float f4;
        CarouselColors carouselColors2;
        Modifier modifier3;
        float f5;
        float f6;
        int i6;
        CarouselColors carouselColorsM15105colorsro_MJ88;
        final CarouselColors carouselColors3;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2044995422);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f3 = f;
                    i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 7168) == 0) {
                        f4 = f2;
                        i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
                    }
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            carouselColors2 = carouselColors;
                            int i8 = composerStartRestartGroup.changed(carouselColors2) ? 16384 : 8192;
                            i3 |= i8;
                        } else {
                            carouselColors2 = carouselColors;
                        }
                        i3 |= i8;
                    } else {
                        carouselColors2 = carouselColors;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            f5 = i4 == 0 ? 0.2f : f3;
                            f6 = i5 == 0 ? 0.8f : f4;
                            if ((i2 & 16) == 0) {
                                i6 = i3 & (-57345);
                                carouselColorsM15105colorsro_MJ88 = CarouselDefaults.INSTANCE.m15105colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2044995422, i6, -1, "com.blackhub.bronline.game.ui.widget.scroll.Carousel (Carousel.kt:99)");
                                }
                                int i9 = (i6 << 6) & 7168;
                                int i10 = i6 << 9;
                                CarouselImpl(state.getValue(), state.getMaxValue(), state.getScrollableLength(), modifier3, state.isScrollInProgress(), f5, f6, carouselColorsM15105colorsro_MJ88, composerStartRestartGroup, i9 | (458752 & i10) | (3670016 & i10) | (i10 & 29360128));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f4 = f6;
                                float f8 = f5;
                                carouselColors3 = carouselColorsM15105colorsro_MJ88;
                                f7 = f8;
                            } else {
                                i6 = i3;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            f5 = f3;
                            f6 = f4;
                        }
                        carouselColorsM15105colorsro_MJ88 = carouselColors2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = (i6 << 6) & 7168;
                        int i102 = i6 << 9;
                        CarouselImpl(state.getValue(), state.getMaxValue(), state.getScrollableLength(), modifier3, state.isScrollInProgress(), f5, f6, carouselColorsM15105colorsro_MJ88, composerStartRestartGroup, i92 | (458752 & i102) | (3670016 & i102) | (i102 & 29360128));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        f4 = f6;
                        float f82 = f5;
                        carouselColors3 = carouselColorsM15105colorsro_MJ88;
                        f7 = f82;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        f7 = f3;
                        carouselColors3 = carouselColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier3;
                        final float f9 = f4;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.Carousel.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                CarouselKt.Carousel(state, modifier4, f7, f9, carouselColors3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                f4 = f2;
                if ((57344 & i) != 0) {
                }
                if ((46811 & i3) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            f4 = f2;
            if ((57344 & i) != 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((57344 & i) != 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Carousel(@NotNull final LazyListState state, @Nullable Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f2, @Nullable CarouselColors carouselColors, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        int i5;
        float f4;
        CarouselColors carouselColors2;
        float f5;
        float f6;
        CarouselColors carouselColorsM15105colorsro_MJ88;
        Modifier modifier3;
        final int orZero;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final float f7;
        final float f8;
        final CarouselColors carouselColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1148037277);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f3 = f;
                    i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 7168) == 0) {
                        f4 = f2;
                        i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
                    }
                    if ((i & 57344) != 0) {
                        if ((i2 & 16) == 0) {
                            carouselColors2 = carouselColors;
                            int i7 = composerStartRestartGroup.changed(carouselColors2) ? 16384 : 8192;
                            i3 |= i7;
                        } else {
                            carouselColors2 = carouselColors;
                        }
                        i3 |= i7;
                    } else {
                        carouselColors2 = carouselColors;
                    }
                    if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                            float f9 = i4 == 0 ? 0.2f : f3;
                            if (i5 != 0) {
                                f4 = 0.8f;
                            }
                            if ((i2 & 16) == 0) {
                                i3 &= -57345;
                                modifier3 = modifier5;
                                f5 = f9;
                                carouselColorsM15105colorsro_MJ88 = CarouselDefaults.INSTANCE.m15105colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                f6 = f4;
                            } else {
                                f5 = f9;
                                f6 = f4;
                                carouselColorsM15105colorsro_MJ88 = carouselColors2;
                                modifier3 = modifier5;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            f5 = f3;
                            f6 = f4;
                            carouselColorsM15105colorsro_MJ88 = carouselColors2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1148037277, i3, -1, "com.blackhub.bronline.game.ui.widget.scroll.Carousel (Carousel.kt:153)");
                        }
                        int mainAxisItemSpacing = state.getLayoutInfo().getMainAxisItemSpacing();
                        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt___CollectionsKt.firstOrNull((List) state.getLayoutInfo().getVisibleItemsInfo());
                        orZero = IntExtensionKt.getOrZero(lazyListItemInfo == null ? Integer.valueOf(lazyListItemInfo.getSize() + mainAxisItemSpacing) : null);
                        int totalItemsCount = (state.getLayoutInfo().getTotalItemsCount() * orZero) - mainAxisItemSpacing;
                        composerStartRestartGroup.startReplaceableGroup(-669932860);
                        int i8 = i3 & 14;
                        zChanged = (i8 != 4) | composerStartRestartGroup.changed(orZero);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Integer invoke() {
                                    return Integer.valueOf((state.getFirstVisibleItemIndex() * orZero) + state.getFirstVisibleItemScrollOffset());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i9 = i3 << 3;
                        composer2 = composerStartRestartGroup;
                        Carousel(state, totalItemsCount, modifier3, f5, f6, carouselColorsM15105colorsro_MJ88, (Function0) objRememberedValue, composerStartRestartGroup, i8 | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        f7 = f5;
                        f8 = f6;
                        carouselColors3 = carouselColorsM15105colorsro_MJ88;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        f7 = f3;
                        f8 = f4;
                        composer2 = composerStartRestartGroup;
                        carouselColors3 = carouselColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.Carousel.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i10) {
                                CarouselKt.Carousel(state, modifier4, f7, f8, carouselColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                f4 = f2;
                if ((i & 57344) != 0) {
                }
                if ((46811 & i3) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 16) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int mainAxisItemSpacing2 = state.getLayoutInfo().getMainAxisItemSpacing();
                        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt___CollectionsKt.firstOrNull((List) state.getLayoutInfo().getVisibleItemsInfo());
                        orZero = IntExtensionKt.getOrZero(lazyListItemInfo2 == null ? Integer.valueOf(lazyListItemInfo2.getSize() + mainAxisItemSpacing2) : null);
                        int totalItemsCount2 = (state.getLayoutInfo().getTotalItemsCount() * orZero) - mainAxisItemSpacing2;
                        composerStartRestartGroup.startReplaceableGroup(-669932860);
                        int i82 = i3 & 14;
                        zChanged = (i82 != 4) | composerStartRestartGroup.changed(orZero);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                @NotNull
                                public final Integer invoke() {
                                    return Integer.valueOf((state.getFirstVisibleItemIndex() * orZero) + state.getFirstVisibleItemScrollOffset());
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i92 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            Carousel(state, totalItemsCount2, modifier3, f5, f6, carouselColorsM15105colorsro_MJ88, (Function0) objRememberedValue, composerStartRestartGroup, i82 | (i92 & 896) | (i92 & 7168) | (i92 & 57344) | (i92 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            f7 = f5;
                            f8 = f6;
                            carouselColors3 = carouselColorsM15105colorsro_MJ88;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            f4 = f2;
            if ((i & 57344) != 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((i & 57344) != 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Carousel(@NotNull final LazyListState state, final int i, @Nullable Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f2, @Nullable CarouselColors carouselColors, @NotNull final Function0<Integer> scrolled, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f3;
        int i6;
        float f4;
        CarouselColors carouselColors2;
        Modifier modifier3;
        CarouselColors carouselColorsM15105colorsro_MJ88;
        float f5;
        float f6;
        Composer composer2;
        final Modifier modifier4;
        final float f7;
        final float f8;
        final CarouselColors carouselColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scrolled, "scrolled");
        Composer composerStartRestartGroup = composer.startRestartGroup(255913164);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    f3 = f;
                    i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= CpioConstants.C_ISBLK;
                } else {
                    if ((57344 & i2) == 0) {
                        f4 = f2;
                        i4 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                    }
                    if ((i2 & 458752) != 0) {
                        if ((i3 & 32) == 0) {
                            carouselColors2 = carouselColors;
                            int i9 = composerStartRestartGroup.changed(carouselColors2) ? 131072 : 65536;
                            i4 |= i9;
                        } else {
                            carouselColors2 = carouselColors;
                        }
                        i4 |= i9;
                    } else {
                        carouselColors2 = carouselColors;
                    }
                    if ((i3 & 64) != 0) {
                        i7 = (i2 & 3670016) == 0 ? composerStartRestartGroup.changedInstance(scrolled) ? 1048576 : 524288 : 1572864;
                        if ((2995931 & i4) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier2;
                            f7 = f3;
                            f8 = f4;
                            carouselColors3 = carouselColors2;
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i5 != 0) {
                                    f3 = 0.2f;
                                }
                                if (i6 != 0) {
                                    f4 = 0.8f;
                                }
                                if ((i3 & 32) == 0) {
                                    i4 &= -458753;
                                    modifier3 = modifier5;
                                    carouselColorsM15105colorsro_MJ88 = CarouselDefaults.INSTANCE.m15105colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                    f5 = f3;
                                    f6 = f4;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(255913164, i4, -1, "com.blackhub.bronline.game.ui.widget.scroll.Carousel (Carousel.kt:217)");
                                    }
                                    int i10 = (i4 << 3) & 8064;
                                    int i11 = i4 << 6;
                                    composer2 = composerStartRestartGroup;
                                    CarouselImpl(scrolled.invoke().intValue(), i - state.getLayoutInfo().getViewportEndOffset(), i, modifier3, state.isScrollInProgress(), f5, f6, carouselColorsM15105colorsro_MJ88, composerStartRestartGroup, i10 | (458752 & i11) | (i11 & 3670016) | (i11 & 29360128));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    f7 = f5;
                                    f8 = f6;
                                    carouselColors3 = carouselColorsM15105colorsro_MJ88;
                                } else {
                                    modifier3 = modifier5;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                                modifier3 = modifier2;
                            }
                            f5 = f3;
                            f6 = f4;
                            carouselColorsM15105colorsro_MJ88 = carouselColors2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i102 = (i4 << 3) & 8064;
                            int i112 = i4 << 6;
                            composer2 = composerStartRestartGroup;
                            CarouselImpl(scrolled.invoke().intValue(), i - state.getLayoutInfo().getViewportEndOffset(), i, modifier3, state.isScrollInProgress(), f5, f6, carouselColorsM15105colorsro_MJ88, composerStartRestartGroup, i102 | (458752 & i112) | (i112 & 3670016) | (i112 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            f7 = f5;
                            f8 = f6;
                            carouselColors3 = carouselColorsM15105colorsro_MJ88;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.Carousel.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    CarouselKt.Carousel(state, i, modifier4, f7, f8, carouselColors3, scrolled, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= i7;
                    if ((2995931 & i4) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i3 & 32) == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f4 = f2;
                if ((i2 & 458752) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                i4 |= i7;
                if ((2995931 & i4) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f3 = f;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            f4 = f2;
            if ((i2 & 458752) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            i4 |= i7;
            if ((2995931 & i4) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        f4 = f2;
        if ((i2 & 458752) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        i4 |= i7;
        if ((2995931 & i4) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0132  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Carousel(@NotNull final LazyGridState state, @Nullable Modifier modifier, final int i, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false, m9to = 1.0d, toInclusive = false) float f2, @Nullable CarouselColors carouselColors, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        float f3;
        int i6;
        float f4;
        CarouselColors carouselColors2;
        Modifier modifier3;
        float f5;
        int i7;
        CarouselColors carouselColorsM15105colorsro_MJ88;
        float f6;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Integer numValueOf;
        MutableIntState mutableIntState;
        Integer num;
        Composer composer2;
        final Modifier modifier4;
        final float f7;
        final float f8;
        final CarouselColors carouselColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-254725070);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    f3 = f;
                    i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((57344 & i2) == 0) {
                        f4 = f2;
                        i4 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                    }
                    if ((458752 & i2) != 0) {
                        if ((i3 & 32) == 0) {
                            carouselColors2 = carouselColors;
                            int i9 = composerStartRestartGroup.changed(carouselColors2) ? 131072 : 65536;
                            i4 |= i9;
                        } else {
                            carouselColors2 = carouselColors;
                        }
                        i4 |= i9;
                    } else {
                        carouselColors2 = carouselColors;
                    }
                    if ((374491 & i4) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            float f9 = i5 == 0 ? 0.2f : f3;
                            if (i6 != 0) {
                                f4 = 0.8f;
                            }
                            if ((i3 & 32) == 0) {
                                i7 = i4 & (-458753);
                                modifier3 = modifier5;
                                f5 = f9;
                                carouselColorsM15105colorsro_MJ88 = CarouselDefaults.INSTANCE.m15105colorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                f6 = f4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-254725070, i7, -1, "com.blackhub.bronline.game.ui.widget.scroll.Carousel (Carousel.kt:250)");
                                }
                                MutableIntState mutableIntState2 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$itemLengthInPx$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final MutableIntState invoke() {
                                        return SnapshotIntStateKt.mutableIntStateOf(0);
                                    }
                                }, composerStartRestartGroup, 3080, 6);
                                MutableIntState mutableIntState3 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$allItemsCount$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final MutableIntState invoke() {
                                        return SnapshotIntStateKt.mutableIntStateOf(0);
                                    }
                                }, composerStartRestartGroup, 3080, 6);
                                MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$ifWithPathRow$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final MutableState<Boolean> invoke() {
                                        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                    }
                                }, composerStartRestartGroup, 3080, 6);
                                MutableIntState mutableIntState4 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$rows$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final MutableIntState invoke() {
                                        return SnapshotIntStateKt.mutableIntStateOf(0);
                                    }
                                }, composerStartRestartGroup, 3080, 6);
                                MutableIntState mutableIntState5 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$allScrollSize$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final MutableIntState invoke() {
                                        return SnapshotIntStateKt.mutableIntStateOf(0);
                                    }
                                }, composerStartRestartGroup, 3080, 6);
                                MutableIntState mutableIntState6 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$maxScroll$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    @NotNull
                                    public final MutableIntState invoke() {
                                        return SnapshotIntStateKt.mutableIntStateOf(0);
                                    }
                                }, composerStartRestartGroup, 3080, 6);
                                composerStartRestartGroup.startReplaceableGroup(-669929429);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$offsetParam$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Integer invoke() {
                                            return Integer.valueOf(state.getFirstVisibleItemScrollOffset());
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int iIntValue = ((Number) ((State) objRememberedValue).getValue()).intValue();
                                composerStartRestartGroup.startReplaceableGroup(-669929323);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$firstVisibleItemIndex$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Integer invoke() {
                                            return Integer.valueOf(state.getFirstVisibleItemIndex());
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                int iIntValue2 = ((Number) ((State) objRememberedValue2).getValue()).intValue();
                                int intValue = ((iIntValue2 != 0 ? 0 : iIntValue2 / i) * mutableIntState2.getIntValue()) + iIntValue;
                                composerStartRestartGroup.startReplaceableGroup(-669929049);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0<LazyGridLayoutInfo>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$5$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final LazyGridLayoutInfo invoke() {
                                            return state.getLayoutInfo();
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt___CollectionsKt.firstOrNull((List) ((LazyGridLayoutInfo) ((State) objRememberedValue3).getValue()).getVisibleItemsInfo());
                                numValueOf = lazyGridItemInfo == null ? Integer.valueOf(IntSize.m13835getHeightimpl(lazyGridItemInfo.getSize())) : null;
                                composerStartRestartGroup.startReplaceableGroup(-669928948);
                                if (numValueOf != null) {
                                    mutableIntState = mutableIntState6;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    int iIntValue3 = numValueOf.intValue();
                                    if (iIntValue3 == 0) {
                                        composerStartRestartGroup.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup2 != null) {
                                            final Modifier modifier6 = modifier3;
                                            final float f10 = f5;
                                            final float f11 = f6;
                                            final CarouselColors carouselColors4 = carouselColorsM15105colorsro_MJ88;
                                            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$6$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                                    invoke(composer3, num2.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(@Nullable Composer composer3, int i10) {
                                                    CarouselKt.Carousel(state, modifier6, i, f10, f11, carouselColors4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    Integer numValueOf2 = Integer.valueOf(state.getLayoutInfo().getTotalItemsCount());
                                    composerStartRestartGroup.startReplaceableGroup(1571060798);
                                    boolean zChanged = ((i7 & 14) == 4) | composerStartRestartGroup.changed(mutableIntState2) | composerStartRestartGroup.changed(iIntValue3) | composerStartRestartGroup.changed(mutableIntState3) | composerStartRestartGroup.changed(mutableState) | ((i7 & 896) == 256) | composerStartRestartGroup.changed(mutableIntState4) | composerStartRestartGroup.changed(mutableIntState5) | composerStartRestartGroup.changed(mutableIntState6);
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                                        mutableIntState = mutableIntState6;
                                        num = numValueOf2;
                                        composer2 = composerStartRestartGroup;
                                        CarouselKt$Carousel$6$2$1 carouselKt$Carousel$6$2$1 = new CarouselKt$Carousel$6$2$1(mutableIntState2, iIntValue3, mutableIntState3, state, mutableState, i, mutableIntState4, mutableIntState5, mutableIntState, null);
                                        composer2.updateRememberedValue(carouselKt$Carousel$6$2$1);
                                        objRememberedValue4 = carouselKt$Carousel$6$2$1;
                                    } else {
                                        num = numValueOf2;
                                        mutableIntState = mutableIntState6;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    composer2.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 64);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer2.endReplaceableGroup();
                                if (mutableIntState.getIntValue() != 0) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup3 != null) {
                                        final Modifier modifier7 = modifier3;
                                        final float f12 = f5;
                                        final float f13 = f6;
                                        final CarouselColors carouselColors5 = carouselColorsM15105colorsro_MJ88;
                                        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.Carousel.7
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                                invoke(composer3, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(@Nullable Composer composer3, int i10) {
                                                CarouselKt.Carousel(state, modifier7, i, f12, f13, carouselColors5, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                CarouselImpl(intValue, mutableIntState.getIntValue(), mutableIntState5.getIntValue(), modifier3, state.isScrollInProgress(), f5, f6, carouselColorsM15105colorsro_MJ88, composer2, (i7 << 6) & 33496064);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                f7 = f5;
                                f8 = f6;
                                carouselColors3 = carouselColorsM15105colorsro_MJ88;
                            } else {
                                modifier3 = modifier5;
                                f5 = f9;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            modifier3 = modifier2;
                            f5 = f3;
                        }
                        f6 = f4;
                        carouselColorsM15105colorsro_MJ88 = carouselColors2;
                        i7 = i4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MutableIntState mutableIntState22 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$itemLengthInPx$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final MutableIntState invoke() {
                                return SnapshotIntStateKt.mutableIntStateOf(0);
                            }
                        }, composerStartRestartGroup, 3080, 6);
                        MutableIntState mutableIntState32 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$allItemsCount$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final MutableIntState invoke() {
                                return SnapshotIntStateKt.mutableIntStateOf(0);
                            }
                        }, composerStartRestartGroup, 3080, 6);
                        MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<Boolean>>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$ifWithPathRow$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final MutableState<Boolean> invoke() {
                                return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            }
                        }, composerStartRestartGroup, 3080, 6);
                        MutableIntState mutableIntState42 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$rows$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final MutableIntState invoke() {
                                return SnapshotIntStateKt.mutableIntStateOf(0);
                            }
                        }, composerStartRestartGroup, 3080, 6);
                        MutableIntState mutableIntState52 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$allScrollSize$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final MutableIntState invoke() {
                                return SnapshotIntStateKt.mutableIntStateOf(0);
                            }
                        }, composerStartRestartGroup, 3080, 6);
                        MutableIntState mutableIntState62 = (MutableIntState) RememberSaveableKt.m10957rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableIntState>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt$Carousel$maxScroll$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            @NotNull
                            public final MutableIntState invoke() {
                                return SnapshotIntStateKt.mutableIntStateOf(0);
                            }
                        }, composerStartRestartGroup, 3080, 6);
                        composerStartRestartGroup.startReplaceableGroup(-669929429);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int iIntValue4 = ((Number) ((State) objRememberedValue).getValue()).intValue();
                        composerStartRestartGroup.startReplaceableGroup(-669929323);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int iIntValue22 = ((Number) ((State) objRememberedValue2).getValue()).intValue();
                        int intValue2 = ((iIntValue22 != 0 ? 0 : iIntValue22 / i) * mutableIntState22.getIntValue()) + iIntValue4;
                        composerStartRestartGroup.startReplaceableGroup(-669929049);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) CollectionsKt___CollectionsKt.firstOrNull((List) ((LazyGridLayoutInfo) ((State) objRememberedValue3).getValue()).getVisibleItemsInfo());
                        if (lazyGridItemInfo2 == null) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-669928948);
                        if (numValueOf != null) {
                        }
                        composer2.endReplaceableGroup();
                        if (mutableIntState.getIntValue() != 0) {
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        f7 = f3;
                        f8 = f4;
                        composer2 = composerStartRestartGroup;
                        carouselColors3 = carouselColors2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.Carousel.8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                invoke(composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i10) {
                                CarouselKt.Carousel(state, modifier4, i, f7, f8, carouselColors3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= CpioConstants.C_ISBLK;
                f4 = f2;
                if ((458752 & i2) != 0) {
                }
                if ((374491 & i4) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            f4 = f2;
            if ((458752 & i2) != 0) {
            }
            if ((374491 & i4) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        f4 = f2;
        if ((458752 & i2) != 0) {
        }
        if ((374491 & i4) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CarouselImpl(final int i, final int i2, final int i3, final Modifier modifier, final boolean z, final float f, final float f2, final CarouselColors carouselColors, Composer composer, final int i4) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1281020215);
        if ((i4 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i5 |= composerStartRestartGroup.changed(i3) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((3670016 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
        }
        if ((29360128 & i4) == 0) {
            i5 |= composerStartRestartGroup.changed(carouselColors) ? 8388608 : 4194304;
        }
        if ((23967451 & i5) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1281020215, i5, -1, "com.blackhub.bronline.game.ui.widget.scroll.CarouselImpl (Carousel.kt:305)");
            }
            if (0.0f >= f) {
                throw new IllegalArgumentException("min should be > 0f.".toString());
            }
            if (f > f2) {
                throw new IllegalArgumentException("min should be < max.".toString());
            }
            if (f2 >= 1.0f) {
                throw new IllegalArgumentException("max should be less than 1f.".toString());
            }
            if (i3 <= 0 || i2 <= 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.CarouselImpl.4
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
                            CarouselKt.CarouselImpl(i, i2, i3, modifier, z, f, f2, carouselColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            CanvasKt.Canvas(SizeKt.m8174sizeVpY3zN4(modifier, DefaultCarouselWidth, DefaultCarouselHeight), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.CarouselImpl.5
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
                public final void invoke2(@NotNull DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    boolean z2 = Canvas.getLayoutDirection() == LayoutDirection.Ltr;
                    float fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.getDrawContext().mo11814getSizeNHjbRc());
                    float fM11165getHeightimpl = Size.m11165getHeightimpl(Canvas.getDrawContext().mo11814getSizeNHjbRc());
                    boolean z3 = fM11165getHeightimpl > fM11168getWidthimpl;
                    float f3 = z3 ? fM11165getHeightimpl : fM11168getWidthimpl;
                    if (!z3) {
                        fM11168getWidthimpl = fM11165getHeightimpl;
                    }
                    float fCoerceIn = RangesKt___RangesKt.coerceIn((r3 - i2) / i3, f, f2) * f3;
                    float f4 = f3 - fCoerceIn;
                    float f5 = (i / i2) * f4;
                    float f6 = fM11168getWidthimpl / 2;
                    float f7 = z2 ? f5 : f4 - f5;
                    boolean z4 = z3;
                    float f8 = fM11168getWidthimpl;
                    invoke$drawLine(z4, f6, Canvas, f8, carouselColors.backgroundBrush(z), 0.0f, f3);
                    invoke$drawLine(z4, f6, Canvas, f8, carouselColors.thumbBrush(z), f7, f7 + fCoerceIn);
                }

                public static final void invoke$drawLine(boolean z2, float f3, DrawScope drawScope, float f4, Brush brush, float f5, float f6) {
                    DrawScope.m11875drawLine1RTmtNc$default(drawScope, brush, z2 ? OffsetKt.Offset(f3, f5) : OffsetKt.Offset(f5, f3), z2 ? OffsetKt.Offset(f3, f6) : OffsetKt.Offset(f6, f3), f4, StrokeCap.INSTANCE.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                }
            }, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.CarouselKt.CarouselImpl.6
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
                    CarouselKt.CarouselImpl(i, i2, i3, modifier, z, f, f2, carouselColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1));
                }
            });
        }
    }

    public static final float getDefaultCarouselWidth() {
        return DefaultCarouselWidth;
    }

    public static final float getDefaultCarouselHeight() {
        return DefaultCarouselHeight;
    }
}

