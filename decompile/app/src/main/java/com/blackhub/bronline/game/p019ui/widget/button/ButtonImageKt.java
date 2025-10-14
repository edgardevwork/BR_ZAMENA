package com.blackhub.bronline.game.p019ui.widget.button;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonImage.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a@\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m7105d2 = {"ButtonImage", "", "modifier", "Landroidx/compose/ui/Modifier;", "seasonColor", "Landroidx/compose/ui/graphics/Color;", "buttonImageId", "", "onFinishClick", "Lkotlin/Function0;", "ButtonImage-bWB7cM8", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Color;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewButtonImage", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nButtonImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonImage.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonImageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,44:1\n154#2:45\n*S KotlinDebug\n*F\n+ 1 ButtonImage.kt\ncom/blackhub/bronline/game/ui/widget/button/ButtonImageKt\n*L\n41#1:45\n*E\n"})
/* loaded from: classes3.dex */
public final class ButtonImageKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: ButtonImage-bWB7cM8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15070ButtonImagebWB7cM8(@Nullable Modifier modifier, @Nullable Color color, @DrawableRes int i, @NotNull final Function0<Unit> onFinishClick, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Color color2;
        int i5;
        int i6;
        Composer composer2;
        final Modifier modifier3;
        final Color color3;
        final int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onFinishClick, "onFinishClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-821669279);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                color2 = color;
                i4 |= composerStartRestartGroup.changed(color2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onFinishClick) ? 2048 : 1024;
                }
                if ((i4 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    final Color color4 = i9 == 0 ? null : color2;
                    final int i10 = i5 == 0 ? R.drawable.ic_plus_yellow : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-821669279, i4, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonImage (ButtonImage.kt:22)");
                    }
                    Color color5 = color4;
                    int i11 = i10;
                    composer2 = composerStartRestartGroup;
                    ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier4, null, false, null, false, false, false, false, null, 0, 0L, null, onFinishClick, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186353872, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonImageKt$ButtonImage$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                        @Composable
                        public final void invoke(@Nullable Composer composer3, int i12) {
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-186353872, i12, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonImage.<anonymous> (ButtonImage.kt:27)");
                                }
                                ColorFilter colorFilterM11381tintxETnrds$default = null;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Painter painterPainterResource = PainterResources_androidKt.painterResource(i10, composer3, 0);
                                Color color6 = color4;
                                if (color6 != null) {
                                    colorFilterM11381tintxETnrds$default = ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, color6.m11350unboximpl(), 0, 2, null);
                                }
                                ImageKt.Image(painterPainterResource, (String) null, modifierFillMaxSize$default, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM11381tintxETnrds$default, composer3, 440, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, i4 & 14, ((i4 >> 3) & 896) | 3072, 4094);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    color3 = color5;
                    i7 = i11;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    color3 = color2;
                    i7 = i6;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonImageKt$ButtonImage$2
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
                            ButtonImageKt.m15070ButtonImagebWB7cM8(modifier3, color3, i7, onFinishClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 384;
            i6 = i;
            if ((i3 & 8) != 0) {
            }
            if ((i4 & 5851) != 1170) {
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Color color52 = color4;
                int i112 = i10;
                composer2 = composerStartRestartGroup;
                ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(modifier4, null, false, null, false, false, false, false, null, 0, 0L, null, onFinishClick, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186353872, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonImageKt$ButtonImage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer3, int i12) {
                        if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-186353872, i12, -1, "com.blackhub.bronline.game.ui.widget.button.ButtonImage.<anonymous> (ButtonImage.kt:27)");
                            }
                            ColorFilter colorFilterM11381tintxETnrds$default = null;
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Painter painterPainterResource = PainterResources_androidKt.painterResource(i10, composer3, 0);
                            Color color6 = color4;
                            if (color6 != null) {
                                colorFilterM11381tintxETnrds$default = ColorFilter.Companion.m11381tintxETnrds$default(ColorFilter.INSTANCE, color6.m11350unboximpl(), 0, 2, null);
                            }
                            ImageKt.Image(painterPainterResource, (String) null, modifierFillMaxSize$default, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM11381tintxETnrds$default, composer3, 440, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, i4 & 14, ((i4 >> 3) & 896) | 3072, 4094);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                color3 = color52;
                i7 = i112;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        color2 = color;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i3 & 8) != 0) {
        }
        if ((i4 & 5851) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void PreviewButtonImage(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1751880114);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1751880114, i, -1, "com.blackhub.bronline.game.ui.widget.button.PreviewButtonImage (ButtonImage.kt:38)");
            }
            m15070ButtonImagebWB7cM8(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(50)), null, 0, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonImageKt.PreviewButtonImage.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.button.ButtonImageKt.PreviewButtonImage.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    ButtonImageKt.PreviewButtonImage(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
