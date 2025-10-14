package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScrollSilverThumbCarouselGrid.kt */
/* loaded from: classes3.dex */
public final class ScrollSilverThumbCarouselGridKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollSilverThumbCarouselGrid(@Nullable Modifier modifier, @NotNull final LazyGridState scrollState, final int i, float f, float f2, @Nullable Brush brush, @Nullable Brush brush2, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        float f3;
        int i5;
        float f4;
        Brush brushM11289horizontalGradient8A3gB4$default;
        Brush brush3;
        Modifier modifier3;
        float f5;
        Brush brush4;
        Brush brushM11289horizontalGradient8A3gB4$default2;
        float f6;
        int i6;
        final Modifier modifier4;
        final float f7;
        final float f8;
        final Brush brush5;
        final Brush brush6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-712095048);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 7168) == 0) {
                f3 = f;
                i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 57344) == 0) {
                    f4 = f2;
                    i4 |= composerStartRestartGroup.changed(f4) ? 16384 : 8192;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        brushM11289horizontalGradient8A3gB4$default = brush;
                        int i9 = composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default) ? 131072 : 65536;
                        i4 |= i9;
                    } else {
                        brushM11289horizontalGradient8A3gB4$default = brush;
                    }
                    i4 |= i9;
                } else {
                    brushM11289horizontalGradient8A3gB4$default = brush;
                }
                if ((3670016 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        brush3 = brush2;
                        int i10 = composerStartRestartGroup.changed(brush3) ? 1048576 : 524288;
                        i4 |= i10;
                    } else {
                        brush3 = brush2;
                    }
                    i4 |= i10;
                } else {
                    brush3 = brush2;
                }
                if ((2995931 & i4) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        float f9 = i8 == 0 ? 0.1f : f3;
                        if (i5 != 0) {
                            f4 = 0.15f;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                            brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                        }
                        if ((i3 & 64) == 0) {
                            i4 &= -3670017;
                            modifier3 = modifier5;
                            f6 = f9;
                            brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            f5 = f4;
                            brush4 = brushM11289horizontalGradient8A3gB4$default;
                        } else {
                            modifier3 = modifier5;
                            f5 = f4;
                            brush4 = brushM11289horizontalGradient8A3gB4$default;
                            brushM11289horizontalGradient8A3gB4$default2 = brush3;
                            f6 = f9;
                        }
                        i6 = i4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        modifier3 = modifier2;
                        f5 = f4;
                        brush4 = brushM11289horizontalGradient8A3gB4$default;
                        brushM11289horizontalGradient8A3gB4$default2 = brush3;
                        i6 = i4;
                        f6 = f3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-712095048, i6, -1, "com.blackhub.bronline.game.ui.widget.scroll.ScrollSilverThumbCarouselGrid (ScrollSilverThumbCarouselGrid.kt:30)");
                    }
                    int i11 = i6;
                    CarouselKt.Carousel(scrollState, modifier3, i, f6, f5, CarouselDefaults.INSTANCE.colors(brush4, null, brushM11289horizontalGradient8A3gB4$default2, null, composerStartRestartGroup, ((i6 >> 15) & 14) | CpioConstants.C_ISBLK | ((i6 >> 12) & 896), 10), composerStartRestartGroup, ((i11 >> 3) & 14) | ((i11 << 3) & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    f7 = f6;
                    f8 = f5;
                    brush5 = brush4;
                    brush6 = brushM11289horizontalGradient8A3gB4$default2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    f7 = f3;
                    f8 = f4;
                    brush5 = brushM11289horizontalGradient8A3gB4$default;
                    brush6 = brush3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i12) {
                            ScrollSilverThumbCarouselGridKt.ScrollSilverThumbCarouselGrid(modifier4, scrollState, i, f7, f8, brush5, brush6, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= CpioConstants.C_ISBLK;
            f4 = f2;
            if ((458752 & i2) == 0) {
            }
            if ((3670016 & i2) == 0) {
            }
            if ((2995931 & i4) != 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    i6 = i4;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i6;
                    CarouselKt.Carousel(scrollState, modifier3, i, f6, f5, CarouselDefaults.INSTANCE.colors(brush4, null, brushM11289horizontalGradient8A3gB4$default2, null, composerStartRestartGroup, ((i6 >> 15) & 14) | CpioConstants.C_ISBLK | ((i6 >> 12) & 896), 10), composerStartRestartGroup, ((i112 >> 3) & 14) | ((i112 << 3) & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    f7 = f6;
                    f8 = f5;
                    brush5 = brush4;
                    brush6 = brushM11289horizontalGradient8A3gB4$default2;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f3 = f;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        f4 = f2;
        if ((458752 & i2) == 0) {
        }
        if ((3670016 & i2) == 0) {
        }
        if ((2995931 & i4) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}

