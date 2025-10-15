package com.blackhub.bronline.game.p019ui.gifts;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.DrawableRes;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.motion.widget.Key;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.common.resources.ColorResourceCompose;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsOpenPrizeBlockUI.kt */
@Metadata(m7104d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001ay\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dH\u0007¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010#\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0014X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0003X\u008a\u0084\u0002"}, m7105d2 = {"ANIMATION_DURATION", "", "FULL_ROTATION", "", "HALF_ROTATION", "HEIGHT_FOR_COLUMN_CARD", "HEIGHT_FOR_TOP_TEXT_BOX", "LOTTIE_ITERATIONS", "SCALE_FOR_RAYS", "VALUE_FOR_CAMERA_DISTANCE", "WEIGHT_FOR_IMAGE", "WEIGHT_FOR_TEXT", "WIDTH_FOR_COLUMN_CARD", "GiftsOpenPrizeBlockUI", "", "modifier", "Landroidx/compose/ui/Modifier;", "giftName", "", "isStandard", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "giftImageRes", "rewardImageRes", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "isButtonGetVisible", "onFlipClick", "Lkotlin/Function0;", "onButtonGetClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;IILandroidx/compose/ui/graphics/ImageBitmap;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UpgradeObjectEventOpenPrizeBlockUIPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "rotate", "isRotated", "imageResId", "isStartAnim", Key.ROTATION}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGiftsOpenPrizeBlockUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsOpenPrizeBlockUI.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsOpenPrizeBlockUIKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,253:1\n1116#2,6:254\n1116#2,6:260\n1116#2,6:266\n1116#2,6:272\n1116#2,6:278\n1116#2,6:388\n1116#2,6:394\n68#3,6:284\n74#3:318\n69#3,5:354\n74#3:387\n78#3:444\n78#3:454\n79#4,11:290\n79#4,11:325\n79#4,11:359\n79#4,11:406\n92#4:438\n92#4:443\n92#4:448\n92#4:453\n456#5,8:301\n464#5,3:315\n456#5,8:336\n464#5,3:350\n456#5,8:370\n464#5,3:384\n456#5,8:417\n464#5,3:431\n467#5,3:435\n467#5,3:440\n467#5,3:445\n467#5,3:450\n3737#6,6:309\n3737#6,6:344\n3737#6,6:378\n3737#6,6:425\n74#7,6:319\n80#7:353\n74#7,6:400\n80#7:434\n84#7:439\n84#7:449\n74#8:455\n81#9:456\n107#9,2:457\n81#9:459\n107#9,2:460\n81#9:465\n107#9,2:466\n81#9:468\n75#10:462\n108#10,2:463\n*S KotlinDebug\n*F\n+ 1 GiftsOpenPrizeBlockUI.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsOpenPrizeBlockUIKt\n*L\n98#1:254,6\n99#1:260,6\n100#1:266,6\n101#1:272,6\n106#1:278,6\n180#1:388,6\n189#1:394,6\n132#1:284,6\n132#1:318\n159#1:354,5\n159#1:387\n159#1:444\n132#1:454\n132#1:290,11\n141#1:325,11\n159#1:359,11\n178#1:406,11\n178#1:438\n159#1:443\n141#1:448\n132#1:453\n132#1:301,8\n132#1:315,3\n141#1:336,8\n141#1:350,3\n159#1:370,8\n159#1:384,3\n178#1:417,8\n178#1:431,3\n178#1:435,3\n159#1:440,3\n141#1:445,3\n132#1:450,3\n132#1:309,6\n141#1:344,6\n159#1:378,6\n178#1:425,6\n141#1:319,6\n141#1:353\n178#1:400,6\n178#1:434\n178#1:439\n141#1:449\n248#1:455\n98#1:456\n98#1:457,2\n99#1:459\n99#1:460,2\n101#1:465\n101#1:466,2\n103#1:468\n100#1:462\n100#1:463,2\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsOpenPrizeBlockUIKt {
    public static final int ANIMATION_DURATION = 500;
    public static final float FULL_ROTATION = 180.0f;
    public static final float HALF_ROTATION = 90.0f;
    public static final float HEIGHT_FOR_COLUMN_CARD = 0.94f;
    public static final float HEIGHT_FOR_TOP_TEXT_BOX = 0.18f;
    public static final int LOTTIE_ITERATIONS = 10;
    public static final float SCALE_FOR_RAYS = 1.3f;
    public static final int VALUE_FOR_CAMERA_DISTANCE = 88;
    public static final float WEIGHT_FOR_IMAGE = 0.8f;
    public static final float WEIGHT_FOR_TEXT = 0.2f;
    public static final float WIDTH_FOR_COLUMN_CARD = 0.8f;

    /* JADX WARN: Removed duplicated region for block: B:116:0x0528 A[PHI: r5 r10
  0x0528: PHI (r5v36 int) = (r5v22 int), (r5v37 int) binds: [B:115:0x0526, B:111:0x051e] A[DONT_GENERATE, DONT_INLINE]
  0x0528: PHI (r10v35 boolean) = (r10v32 boolean), (r10v36 boolean) binds: [B:115:0x0526, B:111:0x051e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0549 A[PHI: r12
  0x0549: PHI (r12v14 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r12v11 kotlin.jvm.functions.Function0<kotlin.Unit>), (r12v15 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:125:0x0547, B:121:0x053c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GiftsOpenPrizeBlockUI(@Nullable Modifier modifier, @Nullable String str, final boolean z, @Nullable AnnotatedString annotatedString, @DrawableRes final int i, @DrawableRes final int i2, @Nullable final ImageBitmap imageBitmap, final boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Composer composer, final int i3, final int i4) {
        String strEmpty;
        int i5;
        AnnotatedString annotatedStringGiftsTitleIfStandard;
        int i6;
        int i7;
        final boolean z3;
        int i8;
        final Function0<Unit> function03;
        int i9;
        int i10;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float f;
        String upperCase;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1233472542);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i4 & 2) != 0) {
            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            i5 = i3 & (-113);
        } else {
            strEmpty = str;
            i5 = i3;
        }
        if ((i4 & 8) != 0) {
            annotatedStringGiftsTitleIfStandard = StringResourceCompose.INSTANCE.giftsTitleIfStandard(z, composerStartRestartGroup, ((i5 >> 6) & 14) | 48);
            i5 &= -7169;
        } else {
            annotatedStringGiftsTitleIfStandard = annotatedString;
        }
        final Function0<Unit> function04 = (i4 & 256) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function0<Unit> function05 = (i4 & 512) != 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233472542, i5, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUI (GiftsOpenPrizeBlockUI.kt:81)");
        }
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6));
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_30, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray_blue_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
        composerStartRestartGroup.startReplaceableGroup(550125056);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final MutableState mutableState = (MutableState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(550125112);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion2.getEmpty()) {
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
            objRememberedValue3 = mutableStateMutableStateOf$default;
        }
        MutableState mutableState2 = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(550125169);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(i);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        MutableIntState mutableIntState = (MutableIntState) objRememberedValue4;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(550125237);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        final MutableState mutableState3 = (MutableState) objRememberedValue5;
        composerStartRestartGroup.endReplaceableGroup();
        float f2 = GiftsOpenPrizeBlockUI$lambda$1(mutableState) ? 180.0f : 0.0f;
        final String str2 = strEmpty;
        Function0<Unit> function06 = function05;
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        String strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        composerStartRestartGroup.startReplaceableGroup(550125457);
        boolean z4 = (((i3 & 234881024) ^ 100663296) > 67108864 && composerStartRestartGroup.changed(function04)) || (i3 & 100663296) == 67108864;
        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue6 == companion2.getEmpty()) {
            objRememberedValue6 = new Function1<Float, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$rotation$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                    invoke(f3.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f3) {
                    function04.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, tweenSpecTween$default, 0.0f, strEmpty2, (Function1) objRememberedValue6, composerStartRestartGroup, 48, 4);
        boolean z5 = GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f;
        final boolean z6 = GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) == 180.0f;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z5), new C56053(z5, imageBitmap, i2, i, mutableState2, mutableIntState, null), composerStartRestartGroup, 64);
        int i11 = ((i5 >> 6) & 14) | 48;
        ComposeExtensionKt.IfFalse(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1726218521, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer2, int i12) {
                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1726218521, i12, -1, "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUI.<anonymous> (GiftsOpenPrizeBlockUI.kt:124)");
                }
                Boolean boolValueOf = Boolean.valueOf(z6);
                composer2.startReplaceableGroup(829499530);
                boolean zChanged = composer2.changed(z6);
                boolean z7 = z6;
                MutableState<Boolean> mutableState4 = mutableState3;
                Object objRememberedValue7 = composer2.rememberedValue();
                if (zChanged || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$4$1$1(z7, mutableState4, null);
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, i11);
        Modifier modifierBackground$default = BackgroundKt.background$default(SizeKt.m8174sizeVpY3zN4(PaddingKt.m8125paddingVpY3zN4$default(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._160sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._184sdp, composerStartRestartGroup, 6)), brushM11297verticalGradient8A3gB4$default, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierBackground$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion5 = Modifier.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        final Function0<Unit> function07 = function04;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion5);
        final Modifier modifier3 = modifier2;
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierZIndex = ZIndexModifierKt.zIndex(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight(BackgroundKt.background$default(companion5, ColorResourceCompose.INSTANCE.getGiftsPurchaseGiftTitleBgColor(z, composerStartRestartGroup, i11), roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null), 0.18f), 0.0f, 1, null), null, false, 3, null), 2.0f);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10025TextIbK3jfQ(annotatedStringGiftsTitleIfStandard, modifierZIndex, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3), composerStartRestartGroup, (i5 >> 9) & 14, 0, 131068);
        Modifier modifierZIndex2 = ZIndexModifierKt.zIndex(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), 1.0f);
        Alignment center = companion3.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierZIndex2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1215594881);
        if (GiftsOpenPrizeBlockUI$lambda$10(mutableState3)) {
            i6 = 1;
            LottieLoopKt.LottieLoop(GraphicsLayerModifierKt.graphicsLayer(SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null), new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$5$1$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setScaleX(1.3f);
                    graphicsLayer.setScaleY(1.3f);
                }
            }), R.raw.anim_bp_rays, 10, composerStartRestartGroup, 438, 0);
        } else {
            i6 = 1;
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(-1215594300);
        boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue7 == companion2.getEmpty()) {
            objRememberedValue7 = new Function1<GraphicsLayerScope, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$5$1$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
                    Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                    graphicsLayer.setRotationY(GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState));
                    graphicsLayer.setCameraDistance(88 * graphicsLayer.getDensity());
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(BackgroundKt.background$default(BackgroundKt.m7770backgroundbw27NRU(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(GraphicsLayerModifierKt.graphicsLayer(companion5, (Function1) objRememberedValue7), 0.94f), 0.8f), ColorResources_androidKt.colorResource(R.color.black_gray_blue_2, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4), brushM11297verticalGradient8A3gB4$default2, roundedCornerShapeM8392RoundedCornerShape0680j_4, 0.0f, 4, null), companion3.getCenter(), false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-1215593744);
        if (((i3 & 29360128) ^ 12582912) > 8388608) {
            i7 = i6;
            z3 = z2;
            if (composerStartRestartGroup.changed(z3)) {
                i8 = i7;
            }
            if (((i3 & 1879048192) ^ 805306368) <= 536870912) {
                function03 = function06;
                if (composerStartRestartGroup.changed(function03)) {
                    i9 = i7;
                }
                i10 = i8 | i9;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i10 != 0 || objRememberedValue == companion2.getEmpty()) {
                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$5$1$1$3$1
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
                            GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$2(mutableState, true);
                            if (z3) {
                                function03.invoke();
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierNoRippleClickable$default = ComposeExtensionKt.noRippleClickable$default(modifierWrapContentSize$default, false, (Function0) objRememberedValue, i7, null);
                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                if (imageBitmap != null && GiftsOpenPrizeBlockUI$lambda$4(mutableState2)) {
                    composerStartRestartGroup.startReplaceableGroup(298020495);
                    ImageKt.m7827Image5hnEew(imageBitmap, null, GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion5, 0.8f, false, 2, null), 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6), 1, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, composerStartRestartGroup, 24632, 232);
                    composerStartRestartGroup.endReplaceableGroup();
                    f = 0.0f;
                } else {
                    composerStartRestartGroup.startReplaceableGroup(298021113);
                    f = 0.0f;
                    ImageKt.Image(PainterResources_androidKt.painterResource(mutableIntState.getIntValue(), composerStartRestartGroup, 0), (String) null, GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion5, 0.8f, false, 2, null), 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6), 1, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) < 90.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                Modifier modifierM11501graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(SizeKt.wrapContentSize$default(columnScopeInstance.weight(companion5, 0.2f, true), null, false, 3, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f ? 180.0f : f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null);
                composerStartRestartGroup.startReplaceableGroup(298022055);
                if (GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f) {
                    upperCase = str2;
                } else {
                    upperCase = StringResources_androidKt.stringResource(R.string.upgrade_object_event_press_to_open, composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.m10024Text4IGK_g(upperCase, modifierM11501graphicsLayerAp8cVGQ$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final AnnotatedString annotatedString2 = annotatedStringGiftsTitleIfStandard;
                    final Function0<Unit> function08 = function03;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI.6
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
                            GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI(modifier3, str2, z, annotatedString2, i, i2, imageBitmap, z2, function07, function08, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                        }
                    });
                    return;
                }
                return;
            }
            function03 = function06;
            if ((i3 & 805306368) == 536870912) {
                i9 = 0;
            }
            i10 = i8 | i9;
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i10 != 0) {
                objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$5$1$1$3$1
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
                        GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$2(mutableState, true);
                        if (z3) {
                            function03.invoke();
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierNoRippleClickable$default2 = ComposeExtensionKt.noRippleClickable$default(modifierWrapContentSize$default, false, (Function0) objRememberedValue, i7, null);
            Alignment.Horizontal centerHorizontally2 = companion3.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor42 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy22, companion4.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap42, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting()) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf42.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            if (imageBitmap != null) {
                composerStartRestartGroup.startReplaceableGroup(298021113);
                f = 0.0f;
                ImageKt.Image(PainterResources_androidKt.painterResource(mutableIntState.getIntValue(), composerStartRestartGroup, 0), (String) null, GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(PaddingKt.m8125paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion5, 0.8f, false, 2, null), 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6), 1, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) < 90.0f ? 180.0f : 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
                composerStartRestartGroup.endReplaceableGroup();
            }
            Modifier modifierM11501graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(SizeKt.wrapContentSize$default(columnScopeInstance.weight(companion5, 0.2f, true), null, false, 3, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f ? 180.0f : f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null);
            composerStartRestartGroup.startReplaceableGroup(298022055);
            if (GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f) {
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m10024Text4IGK_g(upperCase, modifierM11501graphicsLayerAp8cVGQ$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        } else {
            i7 = i6;
            z3 = z2;
        }
        if ((i3 & 12582912) != 8388608) {
            i8 = 0;
        }
        if (((i3 & 1879048192) ^ 805306368) <= 536870912) {
        }
        if ((i3 & 805306368) == 536870912) {
        }
        i10 = i8 | i9;
        objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (i10 != 0) {
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierNoRippleClickable$default22 = ComposeExtensionKt.noRippleClickable$default(modifierWrapContentSize$default, false, (Function0) objRememberedValue, i7, null);
        Alignment.Horizontal centerHorizontally22 = companion3.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally22, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor422 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf422 = LayoutKt.modifierMaterializerOf(modifierNoRippleClickable$default22);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
        }
        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy222, companion4.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap422, companion4.getSetResolvedCompositionLocals());
        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting()) {
        }
        function3ModifierMaterializerOf422.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        if (imageBitmap != null) {
        }
        Modifier modifierM11501graphicsLayerAp8cVGQ$default22 = GraphicsLayerModifierKt.m11501graphicsLayerAp8cVGQ$default(SizeKt.wrapContentSize$default(columnScopeInstance.weight(companion5, 0.2f, true), null, false, 3, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f ? 180.0f : f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 130943, null);
        composerStartRestartGroup.startReplaceableGroup(298022055);
        if (GiftsOpenPrizeBlockUI$lambda$13(stateAnimateFloatAsState) >= 90.0f) {
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m10024Text4IGK_g(upperCase, modifierM11501graphicsLayerAp8cVGQ$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14849montserratSemiBold10spOr8ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void GiftsOpenPrizeBlockUI$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void GiftsOpenPrizeBlockUI$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void GiftsOpenPrizeBlockUI$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: GiftsOpenPrizeBlockUI.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$3", m7120f = "GiftsOpenPrizeBlockUI.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt$GiftsOpenPrizeBlockUI$3 */
    /* loaded from: classes7.dex */
    public static final class C56053 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ int $giftImageRes;
        public final /* synthetic */ ImageBitmap $imageBitmap;
        public final /* synthetic */ MutableIntState $imageResId$delegate;
        public final /* synthetic */ boolean $isRotateMoreHalf;
        public final /* synthetic */ MutableState<Boolean> $isRotated$delegate;
        public final /* synthetic */ int $rewardImageRes;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56053(boolean z, ImageBitmap imageBitmap, int i, int i2, MutableState<Boolean> mutableState, MutableIntState mutableIntState, Continuation<? super C56053> continuation) {
            super(2, continuation);
            this.$isRotateMoreHalf = z;
            this.$imageBitmap = imageBitmap;
            this.$rewardImageRes = i;
            this.$giftImageRes = i2;
            this.$isRotated$delegate = mutableState;
            this.$imageResId$delegate = mutableIntState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C56053(this.$isRotateMoreHalf, this.$imageBitmap, this.$rewardImageRes, this.$giftImageRes, this.$isRotated$delegate, this.$imageResId$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C56053) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$isRotateMoreHalf && AnyExtensionKt.isNull(this.$imageBitmap) && IntExtensionKt.isNotZero(Boxing.boxInt(this.$rewardImageRes))) {
                GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$5(this.$isRotated$delegate, true);
                GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$8(this.$imageResId$delegate, this.$rewardImageRes);
            } else if (!this.$isRotateMoreHalf || !AnyExtensionKt.isNotNull(this.$imageBitmap)) {
                GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$8(this.$imageResId$delegate, this.$giftImageRes);
            } else {
                GiftsOpenPrizeBlockUIKt.GiftsOpenPrizeBlockUI$lambda$5(this.$isRotated$delegate, true);
            }
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(apiLevel = 33, device = "spec:id=reference_phone,shape=Normal,width=844,height=390,unit=dp,dpi=420")
    public static final void UpgradeObjectEventOpenPrizeBlockUIPreview(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500849255);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500849255, i, -1, "com.blackhub.bronline.game.ui.gifts.UpgradeObjectEventOpenPrizeBlockUIPreview (GiftsOpenPrizeBlockUI.kt:240)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            GiftsOpenPrizeBlockUI(null, "ДОДГЕ ВУПЕР ОЧЕНЯ БЫСТРЫЙ МАКСИМАЛЬНАЯ МОЩНЫЙ", false, null, R.drawable.ic_standard_gift, R.drawable.img_logo_br_big, AndroidImageBitmap_androidKt.asImageBitmap(BitmapUtilsKt.getBitmap(resources, R.drawable.img_logo_br_big)), false, null, null, composerStartRestartGroup, 14901680, 777);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsOpenPrizeBlockUIKt.UpgradeObjectEventOpenPrizeBlockUIPreview.1
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
                    GiftsOpenPrizeBlockUIKt.UpgradeObjectEventOpenPrizeBlockUIPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean GiftsOpenPrizeBlockUI$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final boolean GiftsOpenPrizeBlockUI$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GiftsOpenPrizeBlockUI$lambda$8(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
    }

    public static final boolean GiftsOpenPrizeBlockUI$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final float GiftsOpenPrizeBlockUI$lambda$13(State<Float> state) {
        return state.getValue().floatValue();
    }
}
