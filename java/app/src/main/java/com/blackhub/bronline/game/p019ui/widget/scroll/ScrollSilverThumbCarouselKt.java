package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.foundation.lazy.LazyListState;
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

/* compiled from: ScrollSilverThumbCarousel.kt */
/* loaded from: classes3.dex */
public final class ScrollSilverThumbCarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollSilverThumbCarousel(@Nullable Modifier modifier, @NotNull final LazyListState scrollState, float f, float f2, @Nullable Brush brush, @Nullable Brush brush2, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        int i4;
        float f4;
        Brush brushM11297verticalGradient8A3gB4$default;
        Brush brush3;
        Modifier modifier3;
        float f5;
        Brush brushM11289horizontalGradient8A3gB4$default;
        float f6;
        Brush brush4;
        Composer composer2;
        final Modifier modifier4;
        final float f7;
        final float f8;
        final Brush brush5;
        final Brush brush6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Composer composerStartRestartGroup = composer.startRestartGroup(514099283);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                f3 = f;
                i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    f4 = f2;
                    i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        brushM11297verticalGradient8A3gB4$default = brush;
                        int i7 = composerStartRestartGroup.changed(brushM11297verticalGradient8A3gB4$default) ? 16384 : 8192;
                        i3 |= i7;
                    } else {
                        brushM11297verticalGradient8A3gB4$default = brush;
                    }
                    i3 |= i7;
                } else {
                    brushM11297verticalGradient8A3gB4$default = brush;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        brush3 = brush2;
                        int i8 = composerStartRestartGroup.changed(brush3) ? 131072 : 65536;
                        i3 |= i8;
                    } else {
                        brush3 = brush2;
                    }
                    i3 |= i8;
                } else {
                    brush3 = brush2;
                }
                if ((374491 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        float f9 = i6 == 0 ? 0.1f : f3;
                        if (i4 != 0) {
                            f4 = 0.15f;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.INSTANCE.m11377getWhite0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        }
                        if ((i2 & 32) == 0) {
                            i3 &= -458753;
                            modifier3 = modifier5;
                            f5 = f9;
                            brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            f6 = f4;
                            brush4 = brushM11297verticalGradient8A3gB4$default;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(514099283, i3, -1, "com.blackhub.bronline.game.ui.widget.scroll.ScrollSilverThumbCarousel (ScrollSilverThumbCarousel.kt:27)");
                            }
                            composer2 = composerStartRestartGroup;
                            CarouselKt.Carousel(scrollState, modifier3, f5, f6, CarouselDefaults.INSTANCE.colors(brush4, null, brushM11289horizontalGradient8A3gB4$default, null, composerStartRestartGroup, ((i3 >> 12) & 14) | CpioConstants.C_ISBLK | ((i3 >> 9) & 896), 10), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            f7 = f5;
                            f8 = f6;
                            brush5 = brush4;
                            brush6 = brushM11289horizontalGradient8A3gB4$default;
                        } else {
                            modifier3 = modifier5;
                            f5 = f9;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        modifier3 = modifier2;
                        f5 = f3;
                    }
                    f6 = f4;
                    brush4 = brushM11297verticalGradient8A3gB4$default;
                    brushM11289horizontalGradient8A3gB4$default = brush3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    CarouselKt.Carousel(scrollState, modifier3, f5, f6, CarouselDefaults.INSTANCE.colors(brush4, null, brushM11289horizontalGradient8A3gB4$default, null, composerStartRestartGroup, ((i3 >> 12) & 14) | CpioConstants.C_ISBLK | ((i3 >> 9) & 896), 10), composerStartRestartGroup, ((i3 >> 3) & 14) | ((i3 << 3) & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    f7 = f5;
                    f8 = f6;
                    brush5 = brush4;
                    brush6 = brushM11289horizontalGradient8A3gB4$default;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    f7 = f3;
                    f8 = f4;
                    brush5 = brushM11297verticalGradient8A3gB4$default;
                    brush6 = brush3;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.scroll.ScrollSilverThumbCarouselKt.ScrollSilverThumbCarousel.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i9) {
                            ScrollSilverThumbCarouselKt.ScrollSilverThumbCarousel(modifier4, scrollState, f7, f8, brush5, brush6, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            f4 = f2;
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) == 0) {
            }
            if ((374491 & i3) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        f4 = f2;
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) == 0) {
        }
        if ((374491 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}

