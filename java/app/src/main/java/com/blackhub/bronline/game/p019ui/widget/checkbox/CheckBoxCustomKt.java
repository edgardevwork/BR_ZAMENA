package com.blackhub.bronline.game.p019ui.widget.checkbox;

import android.annotation.SuppressLint;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CheckBoxCustom.kt */
@SourceDebugExtension({"SMAP\nCheckBoxCustom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckBoxCustom.kt\ncom/blackhub/bronline/game/ui/widget/checkbox/CheckBoxCustomKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n1116#2,6:131\n1116#2,6:137\n154#3:143\n*S KotlinDebug\n*F\n+ 1 CheckBoxCustom.kt\ncom/blackhub/bronline/game/ui/widget/checkbox/CheckBoxCustomKt\n*L\n69#1:131,6\n76#1:137,6\n127#1:143\n*E\n"})
/* loaded from: classes3.dex */
public final class CheckBoxCustomKt {
    public static final float WEIGHT_IMAGE = 0.7f;

    /* compiled from: CheckBoxCustom.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt$CheckBoxCustom$3 */
    /* loaded from: classes8.dex */
    public static final class C64023 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Brush $bgSelectedColorBrush;
        public final /* synthetic */ Brush $bgUnselectedColorBrush;
        public final /* synthetic */ Brush $borderSelectedColorBrush;
        public final /* synthetic */ int $borderSelectedWidth;
        public final /* synthetic */ Brush $borderUnselectedColorBrush;
        public final /* synthetic */ int $borderUnselectedWidth;
        public final /* synthetic */ int $checkboxCornerShape;
        public final /* synthetic */ MutableState<Boolean> $checkboxStatus;
        public final /* synthetic */ int $selectedImageId;
        public final /* synthetic */ Integer $unselectedImageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64023(MutableState<Boolean> mutableState, int i, int i2, Brush brush, Brush brush2, Integer num, int i3, Brush brush3, Brush brush4, int i4, int i5, int i6, int i7) {
            super(2);
            mutableState = mutableState;
            i = i;
            i = i2;
            brush = brush;
            brush = brush2;
            num = num;
            i = i3;
            brush = brush3;
            brush = brush4;
            i = i4;
            i = i5;
            i = i6;
            i = i7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CheckBoxCustomKt.CheckBoxCustom(modifier, mutableState, i, i, brush, brush, num, i, brush, brush, i, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: CheckBoxCustom.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt$PreviewCheckBoxCustom$1 */
    /* loaded from: classes8.dex */
    public static final class C64031 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64031(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            CheckBoxCustomKt.PreviewCheckBoxCustom(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:409:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckBoxCustom(@Nullable Modifier modifier, @NotNull final MutableState<Boolean> checkboxStatus, @DimenRes int i, @DimenRes int i2, @Nullable Brush brush, @Nullable Brush brush2, @DrawableRes @Nullable Integer num, @DimenRes int i3, @Nullable Brush brush3, @Nullable Brush brush4, @DrawableRes int i4, @Nullable Composer composer, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        Brush brush5;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Brush brushM11289horizontalGradient8A3gB4$default;
        Brush brushM11289horizontalGradient8A3gB4$default2;
        Modifier modifier2;
        int i17;
        Brush brushM11289horizontalGradient8A3gB4$default3;
        Brush brush6;
        Brush brushM11289horizontalGradient8A3gB4$default4;
        Modifier modifier3;
        int i18;
        Brush brush7;
        int i19;
        Brush brush8;
        Brush brush9;
        int i20;
        Integer num2;
        int i21;
        Brush brush10;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        Object objRememberedValue2;
        int i22;
        Modifier modifier4;
        int i23;
        Brush brush11;
        Brush brush12;
        Integer num3;
        int i24;
        Brush brush13;
        Brush brush14;
        int i25;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(checkboxStatus, "checkboxStatus");
        Composer composerStartRestartGroup = composer.startRestartGroup(-199641322);
        int i26 = i7 & 1;
        if (i26 != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i8 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        if ((i7 & 2) != 0) {
            i8 |= 48;
        } else if ((i5 & 112) == 0) {
            i8 |= composerStartRestartGroup.changed(checkboxStatus) ? 32 : 16;
        }
        int i27 = i7 & 4;
        if (i27 != 0) {
            i8 |= 384;
        } else {
            if ((i5 & 896) == 0) {
                i9 = i;
                i8 |= composerStartRestartGroup.changed(i9) ? 256 : 128;
            }
            i10 = i7 & 8;
            if (i10 == 0) {
                i8 |= 3072;
            } else {
                if ((i5 & 7168) == 0) {
                    i11 = i2;
                    i8 |= composerStartRestartGroup.changed(i11) ? 2048 : 1024;
                }
                if ((57344 & i5) == 0) {
                    if ((i7 & 16) == 0) {
                        brush5 = brush;
                        int i28 = composerStartRestartGroup.changed(brush5) ? 16384 : 8192;
                        i8 |= i28;
                    } else {
                        brush5 = brush;
                    }
                    i8 |= i28;
                } else {
                    brush5 = brush;
                }
                if ((i5 & 458752) == 0) {
                    i8 |= ((i7 & 32) == 0 && composerStartRestartGroup.changed(brush2)) ? 131072 : 65536;
                }
                i12 = i7 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                } else if ((i5 & 3670016) == 0) {
                    i8 |= composerStartRestartGroup.changed(num) ? 1048576 : 524288;
                }
                i13 = i7 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i5 & 29360128) == 0) {
                    i8 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                }
                if ((i5 & 234881024) == 0) {
                    i8 |= ((i7 & 256) == 0 && composerStartRestartGroup.changed(brush3)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((i5 & 1879048192) == 0) {
                    i8 |= ((i7 & 512) == 0 && composerStartRestartGroup.changed(brush4)) ? 536870912 : 268435456;
                }
                i14 = i7 & 1024;
                if (i14 != 0) {
                    i16 = i6 | 6;
                } else {
                    if ((i6 & 14) != 0) {
                        i15 = i6;
                        if ((i8 & 1533916891) == 306783378 || (i15 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i5 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i26 == 0 ? Modifier.INSTANCE : modifier;
                                int i29 = i27 == 0 ? R.dimen._10wdp : i9;
                                int i30 = R.dimen._2wdp;
                                if (i10 != 0) {
                                    i11 = R.dimen._2wdp;
                                }
                                if ((i7 & 16) == 0) {
                                    brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                    i8 &= -57345;
                                } else {
                                    brushM11289horizontalGradient8A3gB4$default = brush5;
                                }
                                if ((i7 & 32) == 0) {
                                    brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_30, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_gray_30, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                    i8 &= -458753;
                                } else {
                                    brushM11289horizontalGradient8A3gB4$default2 = brush2;
                                }
                                Integer num4 = i12 == 0 ? null : num;
                                if (i13 == 0) {
                                    i30 = i3;
                                }
                                if ((i7 & 256) == 0) {
                                    modifier2 = modifier5;
                                    i17 = i29;
                                    brushM11289horizontalGradient8A3gB4$default3 = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                    i8 &= -234881025;
                                } else {
                                    modifier2 = modifier5;
                                    i17 = i29;
                                    brushM11289horizontalGradient8A3gB4$default3 = brush3;
                                }
                                if ((i7 & 512) == 0) {
                                    brush6 = brushM11289horizontalGradient8A3gB4$default3;
                                    brushM11289horizontalGradient8A3gB4$default4 = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                    i8 = (-1879048193) & i8;
                                } else {
                                    brush6 = brushM11289horizontalGradient8A3gB4$default3;
                                    brushM11289horizontalGradient8A3gB4$default4 = brush4;
                                }
                                if (i14 == 0) {
                                    modifier3 = modifier2;
                                    brush7 = brushM11289horizontalGradient8A3gB4$default4;
                                    i18 = R.drawable.ic_check_main;
                                } else {
                                    modifier3 = modifier2;
                                    i18 = i4;
                                    brush7 = brushM11289horizontalGradient8A3gB4$default4;
                                }
                                i19 = i30;
                                brush8 = brushM11289horizontalGradient8A3gB4$default;
                                brush9 = brushM11289horizontalGradient8A3gB4$default2;
                                i20 = i11;
                                num2 = num4;
                                i21 = i17;
                                brush10 = brush6;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i7 & 16) != 0) {
                                    i8 &= -57345;
                                }
                                if ((i7 & 32) != 0) {
                                    i8 &= -458753;
                                }
                                if ((i7 & 256) != 0) {
                                    i8 &= -234881025;
                                }
                                if ((i7 & 512) != 0) {
                                    i8 &= -1879048193;
                                }
                                modifier3 = modifier;
                                brush9 = brush2;
                                num2 = num;
                                i19 = i3;
                                brush10 = brush3;
                                brush7 = brush4;
                                i18 = i4;
                                i20 = i11;
                                brush8 = brush5;
                                i21 = i9;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-199641322, i8, i15, "com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustom (CheckBoxCustom.kt:67)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(864515014);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(864515223);
                            z = (i8 & 112) != 32;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt$CheckBoxCustom$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        checkboxStatus.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            int i31 = i21;
                            SurfaceKt.m9876SurfaceT9BRK9s(ClickableKt.m7803clickableO2vRcR0$default(modifier3, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i21, composerStartRestartGroup, (i8 >> 6) & 14)), Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2019972187, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt.CheckBoxCustom.2
                                public final /* synthetic */ Brush $bgSelectedColorBrush;
                                public final /* synthetic */ Brush $bgUnselectedColorBrush;
                                public final /* synthetic */ Brush $borderSelectedColorBrush;
                                public final /* synthetic */ int $borderSelectedWidth;
                                public final /* synthetic */ Brush $borderUnselectedColorBrush;
                                public final /* synthetic */ int $borderUnselectedWidth;
                                public final /* synthetic */ int $checkboxCornerShape;
                                public final /* synthetic */ MutableState<Boolean> $checkboxStatus;
                                public final /* synthetic */ int $selectedImageId;
                                public final /* synthetic */ Integer $unselectedImageId;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C64012(final MutableState<Boolean> checkboxStatus2, Brush brush72, int i192, Brush brush102, int i212, Brush brush92, int i202, Brush brush82, int i182, Integer num22) {
                                    super(2);
                                    mutableState = checkboxStatus2;
                                    brush = brush72;
                                    i = i192;
                                    brush = brush102;
                                    i = i212;
                                    brush = brush92;
                                    i = i202;
                                    brush = brush82;
                                    i = i182;
                                    num = num22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num5) {
                                    invoke(composer2, num5.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i32) {
                                    if ((i32 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2019972187, i32, -1, "com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustom.<anonymous> (CheckBoxCustom.kt:81)");
                                        }
                                        if (mutableState.getValue().booleanValue()) {
                                            composer2.startReplaceableGroup(-969647055);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            Modifier modifierM7784borderziNgDLE = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), brush, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(i, composer2, 0), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i, composer2, 0)));
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            int i33 = i;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(i33, composer2, 0), (String) null, SizeKt.fillMaxSize(companion2, 0.7f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(-969646320);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierM7784borderziNgDLE2 = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), brush, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(i, composer2, 0), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i, composer2, 0)));
                                            Alignment center2 = Alignment.INSTANCE.getCenter();
                                            Integer num5 = num;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE2);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(-969645790);
                                            if (num5 != null) {
                                                int iIntValue = num5.intValue();
                                                ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composer2, 0), (String) null, SizeKt.fillMaxSize(companion4, 0.7f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, 12583296, 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i22 = i31;
                            modifier4 = modifier3;
                            i23 = i202;
                            brush11 = brush82;
                            brush12 = brush92;
                            num3 = num22;
                            i24 = i192;
                            brush13 = brush102;
                            brush14 = brush72;
                            i25 = i182;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier4 = modifier;
                            brush12 = brush2;
                            num3 = num;
                            brush13 = brush3;
                            i25 = i4;
                            i22 = i9;
                            i23 = i11;
                            brush11 = brush5;
                            i24 = i3;
                            brush14 = brush4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt.CheckBoxCustom.3
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Brush $bgSelectedColorBrush;
                                public final /* synthetic */ Brush $bgUnselectedColorBrush;
                                public final /* synthetic */ Brush $borderSelectedColorBrush;
                                public final /* synthetic */ int $borderSelectedWidth;
                                public final /* synthetic */ Brush $borderUnselectedColorBrush;
                                public final /* synthetic */ int $borderUnselectedWidth;
                                public final /* synthetic */ int $checkboxCornerShape;
                                public final /* synthetic */ MutableState<Boolean> $checkboxStatus;
                                public final /* synthetic */ int $selectedImageId;
                                public final /* synthetic */ Integer $unselectedImageId;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C64023(final MutableState<Boolean> checkboxStatus2, int i222, int i232, Brush brush112, Brush brush122, Integer num32, int i242, Brush brush132, Brush brush142, int i252, int i52, int i62, int i72) {
                                    super(2);
                                    mutableState = checkboxStatus2;
                                    i = i222;
                                    i = i232;
                                    brush = brush112;
                                    brush = brush122;
                                    num = num32;
                                    i = i242;
                                    brush = brush132;
                                    brush = brush142;
                                    i = i252;
                                    i = i52;
                                    i = i62;
                                    i = i72;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num5) {
                                    invoke(composer2, num5.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i32) {
                                    CheckBoxCustomKt.CheckBoxCustom(modifier, mutableState, i, i, brush, brush, num, i, brush, brush, i, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i16 = i62 | (composerStartRestartGroup.changed(i4) ? 4 : 2);
                }
                i15 = i16;
                if ((i8 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i52 & 1) != 0) {
                        if (i26 == 0) {
                        }
                        if (i27 == 0) {
                        }
                        int i302 = R.dimen._2wdp;
                        if (i10 != 0) {
                        }
                        if ((i72 & 16) == 0) {
                        }
                        if ((i72 & 32) == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if ((i72 & 256) == 0) {
                        }
                        if ((i72 & 512) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        i192 = i302;
                        brush82 = brushM11289horizontalGradient8A3gB4$default;
                        brush92 = brushM11289horizontalGradient8A3gB4$default2;
                        i202 = i11;
                        num22 = num4;
                        i212 = i17;
                        brush102 = brush6;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(864515014);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(864515223);
                        if ((i8 & 112) != 32) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt$CheckBoxCustom$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    checkboxStatus2.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            int i312 = i212;
                            SurfaceKt.m9876SurfaceT9BRK9s(ClickableKt.m7803clickableO2vRcR0$default(modifier3, mutableInteractionSource2, null, false, null, null, (Function0) objRememberedValue2, 28, null), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i212, composerStartRestartGroup, (i8 >> 6) & 14)), Color.INSTANCE.m11375getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2019972187, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt.CheckBoxCustom.2
                                public final /* synthetic */ Brush $bgSelectedColorBrush;
                                public final /* synthetic */ Brush $bgUnselectedColorBrush;
                                public final /* synthetic */ Brush $borderSelectedColorBrush;
                                public final /* synthetic */ int $borderSelectedWidth;
                                public final /* synthetic */ Brush $borderUnselectedColorBrush;
                                public final /* synthetic */ int $borderUnselectedWidth;
                                public final /* synthetic */ int $checkboxCornerShape;
                                public final /* synthetic */ MutableState<Boolean> $checkboxStatus;
                                public final /* synthetic */ int $selectedImageId;
                                public final /* synthetic */ Integer $unselectedImageId;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C64012(final MutableState<Boolean> checkboxStatus2, Brush brush72, int i192, Brush brush102, int i212, Brush brush92, int i202, Brush brush82, int i182, Integer num22) {
                                    super(2);
                                    mutableState = checkboxStatus2;
                                    brush = brush72;
                                    i = i192;
                                    brush = brush102;
                                    i = i212;
                                    brush = brush92;
                                    i = i202;
                                    brush = brush82;
                                    i = i182;
                                    num = num22;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num5) {
                                    invoke(composer2, num5.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer2, int i32) {
                                    if ((i32 & 11) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2019972187, i32, -1, "com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustom.<anonymous> (CheckBoxCustom.kt:81)");
                                        }
                                        if (mutableState.getValue().booleanValue()) {
                                            composer2.startReplaceableGroup(-969647055);
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            Modifier modifierM7784borderziNgDLE = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), brush, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(i, composer2, 0), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i, composer2, 0)));
                                            Alignment center = Alignment.INSTANCE.getCenter();
                                            int i33 = i;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ImageKt.Image(PainterResources_androidKt.painterResource(i33, composer2, 0), (String) null, SizeKt.fillMaxSize(companion2, 0.7f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        } else {
                                            composer2.startReplaceableGroup(-969646320);
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            Modifier modifierM7784borderziNgDLE2 = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), brush, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(i, composer2, 0), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i, composer2, 0)));
                                            Alignment center2 = Alignment.INSTANCE.getCenter();
                                            Integer num5 = num;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE2);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(-969645790);
                                            if (num5 != null) {
                                                int iIntValue = num5.intValue();
                                                ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composer2, 0), (String) null, SizeKt.fillMaxSize(companion4, 0.7f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                                            }
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, 12583296, 120);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i222 = i312;
                            modifier4 = modifier3;
                            i232 = i202;
                            brush112 = brush82;
                            brush122 = brush92;
                            num32 = num22;
                            i242 = i192;
                            brush132 = brush102;
                            brush142 = brush72;
                            i252 = i182;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i11 = i2;
            if ((57344 & i52) == 0) {
            }
            if ((i52 & 458752) == 0) {
            }
            i12 = i72 & 64;
            if (i12 != 0) {
            }
            i13 = i72 & 128;
            if (i13 != 0) {
            }
            if ((i52 & 234881024) == 0) {
            }
            if ((i52 & 1879048192) == 0) {
            }
            i14 = i72 & 1024;
            if (i14 != 0) {
            }
            i15 = i16;
            if ((i8 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i9 = i;
        i10 = i72 & 8;
        if (i10 == 0) {
        }
        i11 = i2;
        if ((57344 & i52) == 0) {
        }
        if ((i52 & 458752) == 0) {
        }
        i12 = i72 & 64;
        if (i12 != 0) {
        }
        i13 = i72 & 128;
        if (i13 != 0) {
        }
        if ((i52 & 234881024) == 0) {
        }
        if ((i52 & 1879048192) == 0) {
        }
        i14 = i72 & 1024;
        if (i14 != 0) {
        }
        i15 = i16;
        if ((i8 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CheckBoxCustom.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCheckBoxCustom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckBoxCustom.kt\ncom/blackhub/bronline/game/ui/widget/checkbox/CheckBoxCustomKt$CheckBoxCustom$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,130:1\n69#2,5:131\n74#2:164\n78#2:169\n69#2,5:170\n74#2:203\n78#2:208\n79#3,11:136\n92#3:168\n79#3,11:175\n92#3:207\n456#4,8:147\n464#4,3:161\n467#4,3:165\n456#4,8:186\n464#4,3:200\n467#4,3:204\n3737#5,6:155\n3737#5,6:194\n*S KotlinDebug\n*F\n+ 1 CheckBoxCustom.kt\ncom/blackhub/bronline/game/ui/widget/checkbox/CheckBoxCustomKt$CheckBoxCustom$2\n*L\n83#1:131,5\n83#1:164\n83#1:169\n100#1:170,5\n100#1:203\n100#1:208\n83#1:136,11\n83#1:168\n100#1:175,11\n100#1:207\n83#1:147,8\n83#1:161,3\n83#1:165,3\n100#1:186,8\n100#1:200,3\n100#1:204,3\n83#1:155,6\n100#1:194,6\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt$CheckBoxCustom$2 */
    /* loaded from: classes8.dex */
    public static final class C64012 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Brush $bgSelectedColorBrush;
        public final /* synthetic */ Brush $bgUnselectedColorBrush;
        public final /* synthetic */ Brush $borderSelectedColorBrush;
        public final /* synthetic */ int $borderSelectedWidth;
        public final /* synthetic */ Brush $borderUnselectedColorBrush;
        public final /* synthetic */ int $borderUnselectedWidth;
        public final /* synthetic */ int $checkboxCornerShape;
        public final /* synthetic */ MutableState<Boolean> $checkboxStatus;
        public final /* synthetic */ int $selectedImageId;
        public final /* synthetic */ Integer $unselectedImageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64012(final MutableState<Boolean> checkboxStatus2, Brush brush72, int i192, Brush brush102, int i212, Brush brush92, int i202, Brush brush82, int i182, Integer num22) {
            super(2);
            mutableState = checkboxStatus2;
            brush = brush72;
            i = i192;
            brush = brush102;
            i = i212;
            brush = brush92;
            i = i202;
            brush = brush82;
            i = i182;
            num = num22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num5) {
            invoke(composer2, num5.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer2, int i32) {
            if ((i32 & 11) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2019972187, i32, -1, "com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustom.<anonymous> (CheckBoxCustom.kt:81)");
                }
                if (mutableState.getValue().booleanValue()) {
                    composer2.startReplaceableGroup(-969647055);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM7784borderziNgDLE = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), brush, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(i, composer2, 0), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i, composer2, 0)));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    int i33 = i;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(i33, composer2, 0), (String) null, SizeKt.fillMaxSize(companion2, 0.7f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-969646320);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Modifier modifierM7784borderziNgDLE2 = BorderKt.m7784borderziNgDLE(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), brush, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(i, composer2, 0), brush, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(i, composer2, 0)));
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    Integer num5 = num;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7784borderziNgDLE2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-969645790);
                    if (num5 != null) {
                        int iIntValue = num5.intValue();
                        ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composer2, 0), (String) null, SizeKt.fillMaxSize(companion4, 0.7f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @Preview(name = "CheckBoxCustom")
    public static final void PreviewCheckBoxCustom(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2090572207);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2090572207, i, -1, "com.blackhub.bronline.game.ui.widget.checkbox.PreviewCheckBoxCustom (CheckBoxCustom.kt:124)");
            }
            CheckBoxCustom(SizeKt.m8172size3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(40)), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null), 0, 0, null, null, null, 0, null, null, 0, composerStartRestartGroup, 6, 0, 2044);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.checkbox.CheckBoxCustomKt.PreviewCheckBoxCustom.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64031(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    CheckBoxCustomKt.PreviewCheckBoxCustom(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

