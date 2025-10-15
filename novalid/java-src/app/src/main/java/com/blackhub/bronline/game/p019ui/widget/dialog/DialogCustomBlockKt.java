package com.blackhub.bronline.game.p019ui.widget.dialog;

import androidx.annotation.ColorRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DialogCustomBlock.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001añ\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001e\u001a\u00020\u00132\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00060 ¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a\r\u0010&\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, m7105d2 = {"DEFAULT_SHADOW_BLUR", "", "DEFAULT_SHADOW_OFFSET_X", "DEFAULT_SHADOW_OFFSET_Y", "TEXT_ALPHA", "DialogCustomBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "bgColor", "", "dialogTitle", "", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centerTitleColor", "Landroidx/compose/ui/graphics/Color;", "radiusGradientTitle", "titleBrush", "Landroidx/compose/ui/graphics/Brush;", "isButtonApplyEnabled", "", "buttonApplyText", "buttonCancelText", "buttonTextStyle", "centerColorFirstButton", "centerColorSecondButton", "textAlphaSecondButton", "radiusGradientButtons", "brushFirstButton", "brushSecondButton", "onFirstButtonClick", "Lkotlin/Function0;", "onSecondButtonClick", "content", "Landroidx/compose/runtime/Composable;", "DialogCustomBlock-koCIM3s", "(Landroidx/compose/ui/Modifier;ILjava/lang/String;Landroidx/compose/ui/text/TextStyle;JFLandroidx/compose/ui/graphics/Brush;ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JJFFLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "PreviewDialogCustomBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class DialogCustomBlockKt {
    public static final float DEFAULT_SHADOW_BLUR = 10.0f;
    public static final float DEFAULT_SHADOW_OFFSET_X = 14.0f;
    public static final float DEFAULT_SHADOW_OFFSET_Y = 4.0f;
    public static final float TEXT_ALPHA = 0.7f;

    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DialogCustomBlock-koCIM3s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15083DialogCustomBlockkoCIM3s(@Nullable Modifier modifier, @ColorRes int i, @NotNull final String dialogTitle, @Nullable TextStyle textStyle, long j, float f, @Nullable Brush brush, boolean z, @Nullable String str, @Nullable String str2, @Nullable TextStyle textStyle2, long j2, long j3, float f2, float f3, @Nullable Brush brush2, @Nullable Brush brush3, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        TextStyle textStyle3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        TextStyle textStyleM14831montserratExtraBoldItalicCustomSp2884n0o;
        int i12;
        long jColorResource;
        float fM14409dpToPx8Feqmps;
        Modifier modifier2;
        Brush brushM11293radialGradientP_VxKs$default;
        String strStringResource;
        Brush brush4;
        String strStringResource2;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo;
        boolean z2;
        int i13;
        long jColorResource2;
        long jColorResource3;
        float fM14409dpToPx8Feqmps2;
        float f4;
        int i14;
        int i15;
        Brush brushM11293radialGradientP_VxKs$default2;
        Brush brush5;
        Brush brushM11293radialGradientP_VxKs$default3;
        Brush brush6;
        TextStyle textStyle4;
        boolean z3;
        float f5;
        Brush brush7;
        Function0<Unit> function03;
        Brush brush8;
        float f6;
        Function0<Unit> function04;
        String str3;
        float f7;
        String str4;
        long j4;
        long j5;
        int i16;
        TextStyle textStyle5;
        int i17;
        Modifier modifier3;
        Composer composer2;
        final TextStyle textStyle6;
        final float f8;
        final Brush brush9;
        final boolean z4;
        final String str5;
        final String str6;
        final TextStyle textStyle7;
        final long j6;
        final long j7;
        final float f9;
        final float f10;
        final long j8;
        final int i18;
        final Brush brush10;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(278713510);
        int i21 = i4 & 1;
        if (i21 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i22 = i4 & 2;
        if (i22 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            int i23 = 128;
            if ((i4 & 4) == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                i5 |= composerStartRestartGroup.changed(dialogTitle) ? 256 : 128;
            }
            if ((i2 & 7168) != 0) {
                if ((i4 & 8) == 0) {
                    textStyle3 = textStyle;
                    if (composerStartRestartGroup.changed(textStyle3)) {
                        i20 = 2048;
                    }
                    i5 |= i20;
                } else {
                    textStyle3 = textStyle;
                }
                i20 = 1024;
                i5 |= i20;
            } else {
                textStyle3 = textStyle;
            }
            int i24 = 8192;
            if ((i2 & 57344) == 0) {
                i5 |= ((i4 & 16) == 0 && composerStartRestartGroup.changed(j)) ? 16384 : 8192;
            }
            if ((i2 & 458752) == 0) {
                i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(f)) ? 131072 : 65536;
            }
            if ((i2 & 3670016) == 0) {
                i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(brush)) ? 1048576 : 524288;
            }
            i7 = i4 & 128;
            if (i7 == 0) {
                i5 |= 12582912;
            } else {
                if ((29360128 & i2) == 0) {
                    i5 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                }
                if ((i2 & 234881024) == 0) {
                    i5 |= ((i4 & 256) == 0 && composerStartRestartGroup.changed(str)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                if ((i2 & 1879048192) == 0) {
                    i5 |= ((i4 & 512) == 0 && composerStartRestartGroup.changed(str2)) ? 536870912 : 268435456;
                }
                if ((i3 & 14) == 0) {
                    i8 = i3 | (((i4 & 1024) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 4 : 2);
                } else {
                    i8 = i3;
                }
                if ((i3 & 112) == 0) {
                    i8 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(j2)) ? 32 : 16;
                }
                if ((i3 & 896) == 0) {
                    if ((i4 & 4096) == 0 && composerStartRestartGroup.changed(j3)) {
                        i23 = 256;
                    }
                    i8 |= i23;
                }
                int i25 = i8;
                i9 = i4 & 8192;
                if (i9 != 0) {
                    i25 |= 3072;
                } else {
                    if ((i3 & 7168) == 0) {
                        i25 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                    }
                    if ((i3 & 57344) == 0) {
                        if ((i4 & 16384) == 0 && composerStartRestartGroup.changed(f3)) {
                            i24 = 16384;
                        }
                        i25 |= i24;
                    }
                    if ((i3 & 458752) == 0) {
                        i25 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(brush2)) ? 131072 : 65536;
                    }
                    if ((i3 & 3670016) == 0) {
                        i25 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(brush3)) ? 1048576 : 524288;
                    }
                    i10 = i4 & 131072;
                    if (i10 == 0) {
                        i25 |= 12582912;
                    } else if ((i3 & 29360128) == 0) {
                        i25 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 262144;
                    if (i11 == 0) {
                        i25 |= 100663296;
                    } else if ((i3 & 234881024) == 0) {
                        i25 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i4 & 524288) != 0) {
                        i19 = (i3 & 1879048192) == 0 ? composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456 : 805306368;
                        if ((i5 & 1533916891) != 306783378 || (1533916891 & i25) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i21 == 0 ? Modifier.INSTANCE : modifier;
                                int i26 = i22 == 0 ? R.color.black_80 : i6;
                                if ((i4 & 8) == 0) {
                                    textStyleM14831montserratExtraBoldItalicCustomSp2884n0o = TypographyStyle.INSTANCE.m14831montserratExtraBoldItalicCustomSp2884n0o(R.dimen._19wsp, 0L, 0, OffsetKt.Offset(14.0f, 4.0f), 10.0f, 0L, composerStartRestartGroup, 1600518, 38);
                                    i5 &= -7169;
                                } else {
                                    textStyleM14831montserratExtraBoldItalicCustomSp2884n0o = textStyle3;
                                }
                                if ((i4 & 16) == 0) {
                                    i12 = 6;
                                    i5 &= -57345;
                                    jColorResource = ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6);
                                } else {
                                    i12 = 6;
                                    jColorResource = j;
                                }
                                if ((i4 & 32) == 0) {
                                    fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._320wdp, composerStartRestartGroup, i12), composerStartRestartGroup, 0);
                                    i5 &= -458753;
                                } else {
                                    fM14409dpToPx8Feqmps = f;
                                }
                                if ((i4 & 64) == 0) {
                                    modifier2 = modifier4;
                                    brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0L, fM14409dpToPx8Feqmps, 0, 10, (Object) null);
                                    i5 &= -3670017;
                                } else {
                                    modifier2 = modifier4;
                                    brushM11293radialGradientP_VxKs$default = brush;
                                }
                                boolean z5 = i7 == 0 ? true : z;
                                if ((i4 & 256) == 0) {
                                    strStringResource = StringResources_androidKt.stringResource(R.string.common_yes, composerStartRestartGroup, 6);
                                    i5 &= -234881025;
                                } else {
                                    strStringResource = str;
                                }
                                if ((i4 & 512) == 0) {
                                    brush4 = brushM11293radialGradientP_VxKs$default;
                                    strStringResource2 = StringResources_androidKt.stringResource(R.string.common_no, composerStartRestartGroup, 6);
                                    i5 = (-1879048193) & i5;
                                } else {
                                    brush4 = brushM11293radialGradientP_VxKs$default;
                                    strStringResource2 = str2;
                                }
                                if ((i4 & 1024) == 0) {
                                    textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._16wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126);
                                    i25 &= -15;
                                } else {
                                    textStyleM14811montserratBoldCustomSpIzzofJo = textStyle2;
                                }
                                TextStyle textStyle8 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                if ((i4 & 2048) == 0) {
                                    z2 = z5;
                                    i13 = 6;
                                    jColorResource2 = ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6);
                                    i25 &= -113;
                                } else {
                                    z2 = z5;
                                    i13 = 6;
                                    jColorResource2 = j2;
                                }
                                if ((i4 & 4096) == 0) {
                                    jColorResource3 = ColorResources_androidKt.colorResource(R.color.gray_blue, composerStartRestartGroup, i13);
                                    i25 &= -897;
                                } else {
                                    jColorResource3 = j3;
                                }
                                float f11 = i9 == 0 ? 0.7f : f2;
                                if ((i4 & 16384) == 0) {
                                    fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._130wdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                                    i25 &= -57345;
                                } else {
                                    fM14409dpToPx8Feqmps2 = f3;
                                }
                                if ((32768 & i4) == 0) {
                                    f4 = f11;
                                    i14 = i5;
                                    i15 = i26;
                                    brushM11293radialGradientP_VxKs$default2 = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource2), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0L, fM14409dpToPx8Feqmps2, 0, 10, (Object) null);
                                    i25 &= -458753;
                                } else {
                                    f4 = f11;
                                    i14 = i5;
                                    i15 = i26;
                                    brushM11293radialGradientP_VxKs$default2 = brush2;
                                }
                                if ((i4 & 65536) == 0) {
                                    brush5 = brushM11293radialGradientP_VxKs$default2;
                                    brushM11293radialGradientP_VxKs$default3 = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(jColorResource3), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0L, fM14409dpToPx8Feqmps2, 0, 10, (Object) null);
                                    i25 &= -3670017;
                                } else {
                                    brush5 = brushM11293radialGradientP_VxKs$default2;
                                    brushM11293radialGradientP_VxKs$default3 = brush3;
                                }
                                Function0<Unit> function07 = i10 == 0 ? null : function0;
                                if (i11 == 0) {
                                    brush6 = brush4;
                                    textStyle4 = textStyle8;
                                    z3 = z2;
                                    f5 = f4;
                                    brush7 = brush5;
                                    brush8 = brushM11293radialGradientP_VxKs$default3;
                                    f6 = fM14409dpToPx8Feqmps2;
                                    function04 = function07;
                                    function03 = null;
                                } else {
                                    brush6 = brush4;
                                    textStyle4 = textStyle8;
                                    z3 = z2;
                                    f5 = f4;
                                    brush7 = brush5;
                                    function03 = function02;
                                    brush8 = brushM11293radialGradientP_VxKs$default3;
                                    f6 = fM14409dpToPx8Feqmps2;
                                    function04 = function07;
                                }
                                str3 = strStringResource;
                                f7 = fM14409dpToPx8Feqmps;
                                str4 = strStringResource2;
                                j4 = jColorResource2;
                                j5 = jColorResource3;
                                i16 = i15;
                                textStyle5 = textStyleM14831montserratExtraBoldItalicCustomSp2884n0o;
                                i17 = i14;
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 8) != 0) {
                                    i5 &= -7169;
                                }
                                if ((i4 & 16) != 0) {
                                    i5 &= -57345;
                                }
                                if ((i4 & 32) != 0) {
                                    i5 &= -458753;
                                }
                                if ((i4 & 64) != 0) {
                                    i5 &= -3670017;
                                }
                                if ((i4 & 256) != 0) {
                                    i5 &= -234881025;
                                }
                                if ((i4 & 512) != 0) {
                                    i5 &= -1879048193;
                                }
                                if ((i4 & 1024) != 0) {
                                    i25 &= -15;
                                }
                                if ((i4 & 2048) != 0) {
                                    i25 &= -113;
                                }
                                if ((i4 & 4096) != 0) {
                                    i25 &= -897;
                                }
                                if ((i4 & 16384) != 0) {
                                    i25 &= -57345;
                                }
                                if ((32768 & i4) != 0) {
                                    i25 &= -458753;
                                }
                                if ((i4 & 65536) != 0) {
                                    i25 &= -3670017;
                                }
                                modifier3 = modifier;
                                jColorResource = j;
                                f7 = f;
                                brush6 = brush;
                                z3 = z;
                                str3 = str;
                                str4 = str2;
                                textStyle4 = textStyle2;
                                j4 = j2;
                                j5 = j3;
                                f5 = f2;
                                f6 = f3;
                                brush7 = brush2;
                                brush8 = brush3;
                                function04 = function0;
                                function03 = function02;
                                i17 = i5;
                                i16 = i6;
                                textStyle5 = textStyle3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(278713510, i17, i25, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlock (DialogCustomBlock.kt:93)");
                            }
                            final float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._300wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6);
                            long jColorResource4 = ColorResources_androidKt.colorResource(i16, composerStartRestartGroup, (i17 >> 3) & 14);
                            final Brush brush11 = brush6;
                            int i27 = i16;
                            final TextStyle textStyle9 = textStyle5;
                            final Function0<Unit> function08 = function04;
                            final Function0<Unit> function09 = function03;
                            final String str7 = str3;
                            final TextStyle textStyle10 = textStyle4;
                            final Brush brush12 = brush7;
                            final boolean z6 = z3;
                            final String str8 = str4;
                            final float f12 = f5;
                            final Brush brush13 = brush8;
                            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                public final void invoke(@Nullable Composer composer3, int i28) {
                                    if ((i28 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1356416614, i28, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlock.<anonymous> (DialogCustomBlock.kt:105)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        final float f13 = fDimensionResource3;
                                        final float f14 = fDimensionResource6;
                                        final float f15 = fDimensionResource4;
                                        final float f16 = fDimensionResource5;
                                        final Brush brush14 = brush11;
                                        final Function2<Composer, Integer, Unit> function22 = content;
                                        final String str9 = dialogTitle;
                                        final TextStyle textStyle11 = textStyle9;
                                        final Function0<Unit> function010 = function08;
                                        final Function0<Unit> function011 = function09;
                                        final float f17 = fDimensionResource;
                                        final float f18 = fDimensionResource2;
                                        final String str10 = str7;
                                        final TextStyle textStyle12 = textStyle10;
                                        final Brush brush15 = brush12;
                                        final boolean z7 = z6;
                                        final String str11 = str8;
                                        final float f19 = f12;
                                        final Brush brush16 = brush13;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-270267587);
                                        composer3.startReplaceableGroup(-3687241);
                                        Object objRememberedValue = composer3.rememberedValue();
                                        Composer.Companion companion3 = Composer.INSTANCE;
                                        if (objRememberedValue == companion3.getEmpty()) {
                                            objRememberedValue = new Measurer();
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        composer3.endReplaceableGroup();
                                        final Measurer measurer = (Measurer) objRememberedValue;
                                        composer3.startReplaceableGroup(-3687241);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (objRememberedValue2 == companion3.getEmpty()) {
                                            objRememberedValue2 = new ConstraintLayoutScope();
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                        composer3.startReplaceableGroup(-3687241);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (objRememberedValue3 == companion3.getEmpty()) {
                                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceableGroup();
                                        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer3, 4544);
                                        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                                        final Function0<Unit> function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                                        final int i29 = 0;
                                        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$invoke$lambda$10$$inlined$ConstraintLayout$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                                            }
                                        }, 1, null), ComposableLambdaKt.composableLambda(composer3, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$invoke$lambda$10$$inlined$ConstraintLayout$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i30) {
                                                Modifier.Companion companion4;
                                                if (((i30 & 11) ^ 2) != 0 || !composer4.getSkipping()) {
                                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                                    constraintLayoutScope.reset();
                                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                                    composer4.startReplaceableGroup(-1207687348);
                                                    boolean zChanged = composer4.changed(f13);
                                                    Object objRememberedValue4 = composer4.rememberedValue();
                                                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        final float f20 = f13;
                                                        objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f20, 0.0f, 4, null);
                                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    Modifier modifierM8159heightInVpY3zN4 = SizeKt.m8159heightInVpY3zN4(SizeKt.m8177width3ABfNKs(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f14)), ColorResources_androidKt.colorResource(R.color.black_80, composer4, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f14)), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6)), f15, f16);
                                                    composer4.startReplaceableGroup(-483455358);
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    Arrangement.Vertical top = arrangement.getTop();
                                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion6.getStart(), composer4, 0);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8159heightInVpY3zN4);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    Modifier modifierBackground$default = BackgroundKt.background$default(companion5, brush14, null, 0.0f, 6, null);
                                                    float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6);
                                                    long jColorResource5 = ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer4, 6);
                                                    float f21 = f14;
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(BorderKt.m7782borderxT4_qwU(modifierBackground$default, fDimensionResource7, jColorResource5, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(f21, f21, 0.0f, 0.0f, 12, null)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6), 1, null), 0.0f, 1, null);
                                                    composer4.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion6.getTopStart(), false, composer4, 0);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor3);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    TextKt.m10024Text4IGK_g(str9, BoxScopeInstance.INSTANCE.align(companion5, companion6.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle11, composer4, 0, 0, 65532);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    function22.invoke(composer4, 0);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(-1207685182);
                                                    boolean zChanged2 = composer4.changed(constrainedLayoutReferenceComponent1);
                                                    Object objRememberedValue5 = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$3$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue5), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6));
                                                    Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                                    composer4.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, companion6.getTop(), composer4, 6);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor4);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer4.startReplaceableGroup(-1990799935);
                                                    final Function0 function012 = function010;
                                                    if (function012 == null) {
                                                        companion4 = companion5;
                                                    } else {
                                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion5, f17), f18);
                                                        float fM14409dpToPx8Feqmps3 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composer4, 6), composer4, 0);
                                                        String str12 = str10;
                                                        TextStyle textStyle13 = textStyle12;
                                                        Brush brush17 = brush15;
                                                        boolean z8 = z7;
                                                        composer4.startReplaceableGroup(-939097299);
                                                        boolean zChanged3 = composer4.changed(function012);
                                                        Object objRememberedValue6 = composer4.rememberedValue();
                                                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$4$1$1$1
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
                                                                    function012.invoke();
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        companion4 = companion5;
                                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8177width3ABfNKs2, str12, textStyle13, 0.0f, 0, null, null, null, 0.0f, 0L, fM14409dpToPx8Feqmps3, brush17, null, null, 0.0f, 0.0f, false, false, null, z8, false, false, null, (Function0) objRememberedValue6, composer4, 0, 0, 0, 15722481);
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(-1207684141);
                                                    final Function0 function013 = function011;
                                                    if (function013 != null) {
                                                        Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, f17), f18);
                                                        String str13 = str11;
                                                        TextStyle textStyle14 = textStyle12;
                                                        float f22 = f19;
                                                        Brush brush18 = brush16;
                                                        composer4.startReplaceableGroup(-939096696);
                                                        boolean zChanged4 = composer4.changed(function013);
                                                        Object objRememberedValue7 = composer4.rememberedValue();
                                                        if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$4$2$1$1
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
                                                                    function013.invoke();
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue7);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8177width3ABfNKs3, str13, textStyle14, 0.0f, 0, null, null, null, f22, 0L, 0.0f, brush18, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue7, composer4, 0, 0, 0, 16772593);
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                                        function0Component2.invoke();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), measurePolicyComponent1, composer3, 48, 0);
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = composerStartRestartGroup;
                            FakeDialogKt.m15089FakeDialog3IgeMak(modifier3, jColorResource4, ComposableLambdaKt.composableLambda(composer2, -1356416614, true, function2), composer2, (i17 & 14) | 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            textStyle6 = textStyle5;
                            f8 = f7;
                            brush9 = brush6;
                            z4 = z3;
                            str5 = str3;
                            str6 = str4;
                            textStyle7 = textStyle4;
                            j6 = j4;
                            j7 = j5;
                            f9 = f5;
                            f10 = f6;
                            j8 = jColorResource;
                            i18 = i27;
                            brush10 = brush7;
                            function05 = function04;
                            function06 = function03;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j8 = j;
                            f8 = f;
                            z4 = z;
                            str5 = str;
                            j6 = j2;
                            j7 = j3;
                            f9 = f2;
                            f10 = f3;
                            brush10 = brush2;
                            brush8 = brush3;
                            function05 = function0;
                            function06 = function02;
                            composer2 = composerStartRestartGroup;
                            i18 = i6;
                            textStyle6 = textStyle3;
                            brush9 = brush;
                            str6 = str2;
                            textStyle7 = textStyle2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier3;
                            final Brush brush14 = brush8;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i28) {
                                    DialogCustomBlockKt.m15083DialogCustomBlockkoCIM3s(modifier5, i18, dialogTitle, textStyle6, j8, f8, brush9, z4, str5, str6, textStyle7, j6, j7, f9, f10, brush10, brush14, function05, function06, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i25 |= i19;
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i21 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if ((i4 & 8) == 0) {
                            }
                            if ((i4 & 16) == 0) {
                            }
                            if ((i4 & 32) == 0) {
                            }
                            if ((i4 & 64) == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i4 & 256) == 0) {
                            }
                            if ((i4 & 512) == 0) {
                            }
                            if ((i4 & 1024) == 0) {
                            }
                            TextStyle textStyle82 = textStyleM14811montserratBoldCustomSpIzzofJo;
                            if ((i4 & 2048) == 0) {
                            }
                            if ((i4 & 4096) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if ((i4 & 16384) == 0) {
                            }
                            if ((32768 & i4) == 0) {
                            }
                            if ((i4 & 65536) == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            str3 = strStringResource;
                            f7 = fM14409dpToPx8Feqmps;
                            str4 = strStringResource2;
                            j4 = jColorResource2;
                            j5 = jColorResource3;
                            i16 = i15;
                            textStyle5 = textStyleM14831montserratExtraBoldItalicCustomSp2884n0o;
                            i17 = i14;
                            modifier3 = modifier2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._46wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._23wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._300wdp, composerStartRestartGroup, 6);
                            final float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composerStartRestartGroup, 6);
                            long jColorResource42 = ColorResources_androidKt.colorResource(i16, composerStartRestartGroup, (i17 >> 3) & 14);
                            final Brush brush112 = brush6;
                            int i272 = i16;
                            final TextStyle textStyle92 = textStyle5;
                            final Function0<Unit> function082 = function04;
                            final Function0<Unit> function092 = function03;
                            final String str72 = str3;
                            final TextStyle textStyle102 = textStyle4;
                            final Brush brush122 = brush7;
                            final boolean z62 = z3;
                            final String str82 = str4;
                            final float f122 = f5;
                            final Brush brush132 = brush8;
                            Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                public final void invoke(@Nullable Composer composer3, int i28) {
                                    if ((i28 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1356416614, i28, -1, "com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlock.<anonymous> (DialogCustomBlock.kt:105)");
                                        }
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        final float f13 = fDimensionResource32;
                                        final float f14 = fDimensionResource62;
                                        final float f15 = fDimensionResource42;
                                        final float f16 = fDimensionResource52;
                                        final Brush brush142 = brush112;
                                        final Function2 function222 = content;
                                        final String str9 = dialogTitle;
                                        final TextStyle textStyle11 = textStyle92;
                                        final Function0 function010 = function082;
                                        final Function0 function011 = function092;
                                        final float f17 = fDimensionResource7;
                                        final float f18 = fDimensionResource22;
                                        final String str10 = str72;
                                        final TextStyle textStyle12 = textStyle102;
                                        final Brush brush15 = brush122;
                                        final boolean z7 = z62;
                                        final String str11 = str82;
                                        final float f19 = f122;
                                        final Brush brush16 = brush132;
                                        composer3.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                        composer3.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-270267587);
                                        composer3.startReplaceableGroup(-3687241);
                                        Object objRememberedValue = composer3.rememberedValue();
                                        Composer.Companion companion3 = Composer.INSTANCE;
                                        if (objRememberedValue == companion3.getEmpty()) {
                                            objRememberedValue = new Measurer();
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        composer3.endReplaceableGroup();
                                        final Measurer measurer = (Measurer) objRememberedValue;
                                        composer3.startReplaceableGroup(-3687241);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (objRememberedValue2 == companion3.getEmpty()) {
                                            objRememberedValue2 = new ConstraintLayoutScope();
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer3.endReplaceableGroup();
                                        final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                                        composer3.startReplaceableGroup(-3687241);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (objRememberedValue3 == companion3.getEmpty()) {
                                            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceableGroup();
                                        Pair<MeasurePolicy, Function0<Unit>> pairRememberConstraintLayoutMeasurePolicy = ConstraintLayoutKt.rememberConstraintLayoutMeasurePolicy(257, constraintLayoutScope, (MutableState<Boolean>) objRememberedValue3, measurer, composer3, 4544);
                                        MeasurePolicy measurePolicyComponent1 = pairRememberConstraintLayoutMeasurePolicy.component1();
                                        final Function0 function0Component2 = pairRememberConstraintLayoutMeasurePolicy.component2();
                                        final int i29 = 0;
                                        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$invoke$lambda$10$$inlined$ConstraintLayout$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
                                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                                ToolingUtilsKt.setDesignInfoProvider(semantics, measurer);
                                            }
                                        }, 1, null), ComposableLambdaKt.composableLambda(composer3, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$invoke$lambda$10$$inlined$ConstraintLayout$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            @Composable
                                            public final void invoke(@Nullable Composer composer4, int i30) {
                                                Modifier.Companion companion4;
                                                if (((i30 & 11) ^ 2) != 0 || !composer4.getSkipping()) {
                                                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                                    constraintLayoutScope.reset();
                                                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                                    final ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                                                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                                    composer4.startReplaceableGroup(-1207687348);
                                                    boolean zChanged = composer4.changed(f13);
                                                    Object objRememberedValue4 = composer4.rememberedValue();
                                                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        final float f20 = f13;
                                                        objRememberedValue4 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), f20, 0.0f, 4, null);
                                                                ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    Modifier modifierM8159heightInVpY3zN4 = SizeKt.m8159heightInVpY3zN4(SizeKt.m8177width3ABfNKs(BorderKt.m7782borderxT4_qwU(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue4), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f14)), ColorResources_androidKt.colorResource(R.color.black_80, composer4, 6), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6), ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f14)), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6)), f15, f16);
                                                    composer4.startReplaceableGroup(-483455358);
                                                    Arrangement arrangement = Arrangement.INSTANCE;
                                                    Arrangement.Vertical top = arrangement.getTop();
                                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion6.getStart(), composer4, 0);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8159heightInVpY3zN4);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor2);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    Modifier modifierBackground$default = BackgroundKt.background$default(companion5, brush142, null, 0.0f, 6, null);
                                                    float fDimensionResource72 = PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composer4, 6);
                                                    long jColorResource5 = ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer4, 6);
                                                    float f21 = f14;
                                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m8125paddingVpY3zN4$default(BorderKt.m7782borderxT4_qwU(modifierBackground$default, fDimensionResource72, jColorResource5, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(f21, f21, 0.0f, 0.0f, 12, null)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._10wdp, composer4, 6), 1, null), 0.0f, 1, null);
                                                    composer4.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion6.getTopStart(), false, composer4, 0);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor3);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    TextKt.m10024Text4IGK_g(str9, BoxScopeInstance.INSTANCE.align(companion5, companion6.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle11, composer4, 0, 0, 65532);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    function222.invoke(composer4, 0);
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(-1207685182);
                                                    boolean zChanged2 = composer4.changed(constrainedLayoutReferenceComponent1);
                                                    Object objRememberedValue5 = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = new Function1<ConstrainScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$3$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
                                                                invoke2(constrainScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull ConstrainScope constrainAs) {
                                                                Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getTop(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                                HorizontalAnchorable.DefaultImpls.m13977linkToVpY3zN4$default(constrainAs.getBottom(), constrainedLayoutReferenceComponent1.getBottom(), 0.0f, 0.0f, 6, null);
                                                            }
                                                        };
                                                        composer4.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue5), PrimitiveResources_androidKt.dimensionResource(R.dimen._421wdp, composer4, 6));
                                                    Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                                    composer4.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, companion6.getTop(), composer4, 6);
                                                    composer4.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
                                                    if (!(composer4.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer4.startReusableNode();
                                                    if (composer4.getInserting()) {
                                                        composer4.createNode(constructor4);
                                                    } else {
                                                        composer4.useNode();
                                                    }
                                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer4);
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                                    composer4.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    composer4.startReplaceableGroup(-1990799935);
                                                    final Function0<Unit> function012 = function010;
                                                    if (function012 == null) {
                                                        companion4 = companion5;
                                                    } else {
                                                        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion5, f17), f18);
                                                        float fM14409dpToPx8Feqmps3 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._180wdp, composer4, 6), composer4, 0);
                                                        String str12 = str10;
                                                        TextStyle textStyle13 = textStyle12;
                                                        Brush brush17 = brush15;
                                                        boolean z8 = z7;
                                                        composer4.startReplaceableGroup(-939097299);
                                                        boolean zChanged3 = composer4.changed(function012);
                                                        Object objRememberedValue6 = composer4.rememberedValue();
                                                        if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue6 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$4$1$1$1
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
                                                                    function012.invoke();
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue6);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        companion4 = companion5;
                                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8177width3ABfNKs2, str12, textStyle13, 0.0f, 0, null, null, null, 0.0f, 0L, fM14409dpToPx8Feqmps3, brush17, null, null, 0.0f, 0.0f, false, false, null, z8, false, false, null, (Function0) objRememberedValue6, composer4, 0, 0, 0, 15722481);
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(-1207684141);
                                                    final Function0<Unit> function013 = function011;
                                                    if (function013 != null) {
                                                        Modifier modifierM8177width3ABfNKs3 = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, f17), f18);
                                                        String str13 = str11;
                                                        TextStyle textStyle14 = textStyle12;
                                                        float f22 = f19;
                                                        Brush brush18 = brush16;
                                                        composer4.startReplaceableGroup(-939096696);
                                                        boolean zChanged4 = composer4.changed(function013);
                                                        Object objRememberedValue7 = composer4.rememberedValue();
                                                        if (zChanged4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue7 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt$DialogCustomBlock$1$1$1$4$2$1$1
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
                                                                    function013.invoke();
                                                                }
                                                            };
                                                            composer4.updateRememberedValue(objRememberedValue7);
                                                        }
                                                        composer4.endReplaceableGroup();
                                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(null, modifierM8177width3ABfNKs3, str13, textStyle14, 0.0f, 0, null, null, null, f22, 0L, 0.0f, brush18, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue7, composer4, 0, 0, 0, 16772593);
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endNode();
                                                    composer4.endReplaceableGroup();
                                                    composer4.endReplaceableGroup();
                                                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                                        function0Component2.invoke();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), measurePolicyComponent1, composer3, 48, 0);
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = composerStartRestartGroup;
                            FakeDialogKt.m15089FakeDialog3IgeMak(modifier3, jColorResource42, ComposableLambdaKt.composableLambda(composer2, -1356416614, true, function22), composer2, (i17 & 14) | 384, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            textStyle6 = textStyle5;
                            f8 = f7;
                            brush9 = brush6;
                            z4 = z3;
                            str5 = str3;
                            str6 = str4;
                            textStyle7 = textStyle4;
                            j6 = j4;
                            j7 = j5;
                            f9 = f5;
                            f10 = f6;
                            j8 = jColorResource;
                            i18 = i272;
                            brush10 = brush7;
                            function05 = function04;
                            function06 = function03;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 57344) == 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                if ((i3 & 3670016) == 0) {
                }
                i10 = i4 & 131072;
                if (i10 == 0) {
                }
                i11 = i4 & 262144;
                if (i11 == 0) {
                }
                if ((i4 & 524288) != 0) {
                }
                i25 |= i19;
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 234881024) == 0) {
            }
            if ((i2 & 1879048192) == 0) {
            }
            if ((i3 & 14) == 0) {
            }
            if ((i3 & 112) == 0) {
            }
            if ((i3 & 896) == 0) {
            }
            int i252 = i8;
            i9 = i4 & 8192;
            if (i9 != 0) {
            }
            if ((i3 & 57344) == 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            i10 = i4 & 131072;
            if (i10 == 0) {
            }
            i11 = i4 & 262144;
            if (i11 == 0) {
            }
            if ((i4 & 524288) != 0) {
            }
            i252 |= i19;
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i;
        int i232 = 128;
        if ((i4 & 4) == 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        int i242 = 8192;
        if ((i2 & 57344) == 0) {
        }
        if ((i2 & 458752) == 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i7 = i4 & 128;
        if (i7 == 0) {
        }
        if ((i2 & 234881024) == 0) {
        }
        if ((i2 & 1879048192) == 0) {
        }
        if ((i3 & 14) == 0) {
        }
        if ((i3 & 112) == 0) {
        }
        if ((i3 & 896) == 0) {
        }
        int i2522 = i8;
        i9 = i4 & 8192;
        if (i9 != 0) {
        }
        if ((i3 & 57344) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        i10 = i4 & 131072;
        if (i10 == 0) {
        }
        i11 = i4 & 262144;
        if (i11 == 0) {
        }
        if ((i4 & 524288) != 0) {
        }
        i2522 |= i19;
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewDialogCustomBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2047852264);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2047852264, i, -1, "com.blackhub.bronline.game.ui.widget.dialog.PreviewDialogCustomBlock (DialogCustomBlock.kt:205)");
            }
            m15083DialogCustomBlockkoCIM3s(null, R.color.total_black, "dialog", null, 0L, 0.0f, null, false, null, null, null, 0L, 0L, 0.0f, 0.0f, null, null, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt.PreviewDialogCustomBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt.PreviewDialogCustomBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$DialogCustomBlockKt.INSTANCE.m15080getLambda1$app_siteRelease(), composerStartRestartGroup, 432, 918552576, 131065);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.dialog.DialogCustomBlockKt.PreviewDialogCustomBlock.3
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
                    DialogCustomBlockKt.PreviewDialogCustomBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
