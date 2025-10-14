package com.blackhub.bronline.game.p019ui.blackpass;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.ColorResourceCompose;
import com.blackhub.bronline.game.common.resources.FontResourceCompose;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.donate.data.PreviewPrize;
import com.blackhub.bronline.game.gui.donate.viewmodel.DonateMainViewModel;
import com.blackhub.bronline.game.p019ui.widget.anim.LottieLoopKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonFillWithNarrowOvalGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.NarrowOvalWithGradientCustomKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassPrizeDialogNew.kt */
@Metadata(m7104d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aQ\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a)\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m7105d2 = {"ALPHA_FOR_YELLOW_OVAL", "", "ASPECT_RATIO_FOR_CONTENT_BOX", "MAX_HEIGHT_FOR_CONTENT_BOX", "MAX_WIDTH_FOR_AWARD_ANIM", "PADDING_FOR_BUTTON", "SCALE_FOR_RAYS", "SCALE_X_OF_BG_BLUR", "SCALE_Y_OF_BG_BLUR", "BlackPassPrizeDialogContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "image", "Landroid/graphics/Bitmap;", "name", "", "typeOfAward", "", "isSuperAward", "", "buttonClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BlackPassPrizeDialogNew", "previewPrize", "Lcom/blackhub/bronline/game/gui/donate/data/PreviewPrize;", "viewModel", "Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/donate/data/PreviewPrize;Lcom/blackhub/bronline/game/gui/donate/viewmodel/DonateMainViewModel;Landroidx/compose/runtime/Composer;II)V", "PreviewBlackPassPrizeDialogNew", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassPrizeDialogNew.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassPrizeDialogNew.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassPrizeDialogNewKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,317:1\n1116#2,6:318\n1116#2,6:627\n69#3,5:324\n74#3:357\n69#3,5:358\n74#3:391\n68#3,6:392\n74#3:426\n67#3,7:427\n74#3:462\n67#3,7:498\n74#3:533\n78#3:538\n69#3,5:544\n74#3:577\n78#3:582\n78#3:587\n78#3:592\n69#3,5:593\n74#3:626\n78#3:637\n78#3:642\n78#3:647\n79#4,11:329\n79#4,11:363\n79#4,11:398\n79#4,11:434\n79#4,11:469\n79#4,11:505\n92#4:537\n92#4:542\n79#4,11:549\n92#4:581\n92#4:586\n92#4:591\n79#4,11:598\n92#4:636\n92#4:641\n92#4:646\n456#5,8:340\n464#5,3:354\n456#5,8:374\n464#5,3:388\n456#5,8:409\n464#5,3:423\n456#5,8:445\n464#5,3:459\n456#5,8:480\n464#5,3:494\n456#5,8:516\n464#5,3:530\n467#5,3:534\n467#5,3:539\n456#5,8:560\n464#5,3:574\n467#5,3:578\n467#5,3:583\n467#5,3:588\n456#5,8:609\n464#5,3:623\n467#5,3:633\n467#5,3:638\n467#5,3:643\n3737#6,6:348\n3737#6,6:382\n3737#6,6:417\n3737#6,6:453\n3737#6,6:488\n3737#6,6:524\n3737#6,6:568\n3737#6,6:617\n74#7,6:463\n80#7:497\n84#7:543\n74#8:648\n*S KotlinDebug\n*F\n+ 1 BlackPassPrizeDialogNew.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassPrizeDialogNewKt\n*L\n129#1:318,6\n300#1:627,6\n136#1:324,5\n136#1:357\n187#1:358,5\n187#1:391\n189#1:392,6\n189#1:426\n205#1:427,7\n205#1:462\n237#1:498,7\n237#1:533\n237#1:538\n271#1:544,5\n271#1:577\n271#1:582\n205#1:587\n189#1:592\n287#1:593,5\n287#1:626\n287#1:637\n187#1:642\n136#1:647\n136#1:329,11\n187#1:363,11\n189#1:398,11\n205#1:434,11\n206#1:469,11\n237#1:505,11\n237#1:537\n206#1:542\n271#1:549,11\n271#1:581\n205#1:586\n189#1:591\n287#1:598,11\n287#1:636\n187#1:641\n136#1:646\n136#1:340,8\n136#1:354,3\n187#1:374,8\n187#1:388,3\n189#1:409,8\n189#1:423,3\n205#1:445,8\n205#1:459,3\n206#1:480,8\n206#1:494,3\n237#1:516,8\n237#1:530,3\n237#1:534,3\n206#1:539,3\n271#1:560,8\n271#1:574,3\n271#1:578,3\n205#1:583,3\n189#1:588,3\n287#1:609,8\n287#1:623,3\n287#1:633,3\n187#1:638,3\n136#1:643,3\n136#1:348,6\n187#1:382,6\n189#1:417,6\n205#1:453,6\n206#1:488,6\n237#1:524,6\n271#1:568,6\n287#1:617,6\n206#1:463,6\n206#1:497\n206#1:543\n311#1:648\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassPrizeDialogNewKt {
    public static final float ALPHA_FOR_YELLOW_OVAL = 0.6f;
    public static final float ASPECT_RATIO_FOR_CONTENT_BOX = 1.0f;
    public static final float MAX_HEIGHT_FOR_CONTENT_BOX = 0.75f;
    public static final float MAX_WIDTH_FOR_AWARD_ANIM = 0.7f;
    public static final float PADDING_FOR_BUTTON = 0.85f;
    public static final float SCALE_FOR_RAYS = 1.5f;
    public static final float SCALE_X_OF_BG_BLUR = 3.5f;
    public static final float SCALE_Y_OF_BG_BLUR = 1.3f;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "не используется больше")
    @Composable
    public static final void BlackPassPrizeDialogNew(@Nullable Modifier modifier, @Nullable PreviewPrize previewPrize, @NotNull final DonateMainViewModel viewModel, @Nullable Composer composer, final int i, final int i2) {
        PreviewPrize previewPrize2;
        int i3;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-108450877);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            previewPrize2 = new PreviewPrize(null, null, 0, 0, 0, 0, false, null, 255, null);
        } else {
            previewPrize2 = previewPrize;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-108450877, i3, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNew (BlackPassPrizeDialogNew.kt:76)");
        }
        BlackPassPrizeDialogContent(modifier2, previewPrize2.getImage(), previewPrize2.getName(), previewPrize2.getTypeOfAward(), previewPrize2.getTypeReward(), new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt.BlackPassPrizeDialogNew.1
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
                viewModel.closePreviewPrize();
            }
        }, composerStartRestartGroup, (i3 & 14) | 64, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final PreviewPrize previewPrize3 = previewPrize2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt.BlackPassPrizeDialogNew.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    BlackPassPrizeDialogNewKt.BlackPassPrizeDialogNew(modifier3, previewPrize3, viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0116  */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v46 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "не используется больше")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlackPassPrizeDialogContent(@Nullable Modifier modifier, @Nullable Bitmap bitmap, @Nullable String str, int i, boolean z, @Nullable Function0<Unit> function0, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        String strEmpty;
        int i5;
        int i6;
        boolean z2;
        int i7;
        Function0<Unit> function02;
        Modifier modifier3;
        Bitmap bitmap2;
        Function0<Unit> function03;
        int i8;
        String strStringResource;
        Object objRememberedValue;
        Composer.Companion companion;
        Function0<Unit> function04;
        Bitmap bitmap3;
        Modifier modifier4;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM10870constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM10870constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        int currentCompositeKeyHash6;
        Composer composerM10870constructorimpl6;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6;
        float f;
        float f2;
        boolean z3;
        ?? r4;
        int currentCompositeKeyHash7;
        Composer composerM10870constructorimpl7;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7;
        boolean z4;
        Object objRememberedValue2;
        final Function0<Unit> function05;
        final int i9;
        final String str2;
        final Bitmap bitmap4;
        final Function0<Unit> function06;
        final boolean z5;
        int i10;
        float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(663461095);
        int i11 = i3 & 1;
        if (i11 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 16;
        }
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                strEmpty = str;
                int i13 = composerStartRestartGroup.changed(strEmpty) ? 256 : 128;
                i4 |= i13;
            } else {
                strEmpty = str;
            }
            i4 |= i13;
        } else {
            strEmpty = str;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 7168) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((57344 & i2) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    function02 = function0;
                } else {
                    function02 = function0;
                    if ((i2 & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                    }
                }
                if (i12 != 2 || (i4 & 374491) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        bitmap2 = i12 == 0 ? null : bitmap;
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                        }
                        if (i14 != 0) {
                            i5 = 0;
                        }
                        if (i6 != 0) {
                            z2 = false;
                        }
                        function03 = i7 == 0 ? new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt.BlackPassPrizeDialogContent.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        } : function0;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        bitmap2 = bitmap;
                        function03 = function0;
                        modifier3 = modifier2;
                    }
                    int i15 = i4;
                    String str3 = strEmpty;
                    i8 = i5;
                    boolean z6 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(663461095, i15, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogContent (BlackPassPrizeDialogNew.kt:96)");
                    }
                    boolean z7 = i8 != 0 || i8 == 4;
                    if (i8 == 0) {
                        composerStartRestartGroup.startReplaceableGroup(1402748861);
                        strStringResource = StringResources_androidKt.stringResource(R.string.black_pass_prize_title_1, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                        ColorResourceCompose colorResourceCompose = ColorResourceCompose.INSTANCE;
                        long jM14391getBPPrizeDialogButtonBgColorXeAY9LY = colorResourceCompose.m14391getBPPrizeDialogButtonBgColorXeAY9LY(z7, composerStartRestartGroup, 48);
                        long jM14392getBPPrizeDialogButtonTextColorXeAY9LY = colorResourceCompose.m14392getBPPrizeDialogButtonTextColorXeAY9LY(z7, composerStartRestartGroup, 48);
                        String bPPrizeDialogButtonText = StringResourceCompose.INSTANCE.getBPPrizeDialogButtonText(z7, composerStartRestartGroup, 48);
                        long jM14393getBPPrizeDialogTitleBgColorXeAY9LY = colorResourceCompose.m14393getBPPrizeDialogTitleBgColorXeAY9LY(z7, composerStartRestartGroup, 48);
                        TextStyle bPPrizeDialogTitleTextStyle = FontResourceCompose.INSTANCE.getBPPrizeDialogTitleTextStyle(z7, composerStartRestartGroup, 48);
                        float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._200sdp, composerStartRestartGroup, 6);
                        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._360sdp, composerStartRestartGroup, 6);
                        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                        float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._140sdp, composerStartRestartGroup, 6);
                        float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._160sdp, composerStartRestartGroup, 6);
                        float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._120sdp, composerStartRestartGroup, 6);
                        float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
                        float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(1402750123);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        function04 = function03;
                        if (objRememberedValue == companion.getEmpty()) {
                            if (i8 == 0) {
                                f3 = 0.0f;
                                i10 = 2;
                            } else {
                                i10 = 2;
                                f3 = 1.0f;
                            }
                            Animatable animatableAnimatable$default = AnimatableKt.Animatable$default(f3, 0.0f, i10, null);
                            composerStartRestartGroup.updateRememberedValue(animatableAnimatable$default);
                            objRememberedValue = animatableAnimatable$default;
                        }
                        Animatable animatable = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Pair pair = new Pair(Float.valueOf(1.5f), 500);
                        Pair pair2 = new Pair(Float.valueOf(0.7f), 250);
                        bitmap3 = bitmap2;
                        Pair pair3 = new Pair(Float.valueOf(1.2f), 250);
                        Pair pair4 = new Pair(Float.valueOf(0.9f), 150);
                        String str4 = strStringResource;
                        Pair pair5 = new Pair(Float.valueOf(1.0f), 50);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment center = companion2.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        modifier4 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (!z7) {
                            composerStartRestartGroup.startReplaceableGroup(-1787097856);
                            LottieLoopKt.LottieLoop(ScaleKt.scale(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.7f), 1.5f), R.raw.anim_bp_rays, 0, composerStartRestartGroup, 54, 4);
                            if (i8 == 0) {
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$1(animatable, pair, pair2, pair3, pair4, pair5, null), composerStartRestartGroup, 70);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1787095972);
                            LottieLoopKt.LottieLoop(ScaleKt.scale(SizeKt.m8174sizeVpY3zN4(Modifier.INSTANCE, fDimensionResource2, fDimensionResource), 3.5f, 1.3f), R.raw.anim_bp_red_gradient, 0, composerStartRestartGroup, 48, 4);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierScale = ScaleKt.scale(companion4, ((Number) animatable.getValue()).floatValue());
                        Alignment center2 = companion2.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierScale);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Modifier modifierBorder = BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight(companion4, 0.75f), 1.0f, false, 2, null), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6))), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU()), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6)));
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBorder);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor3);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor4);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor5);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(BackgroundKt.m7770backgroundbw27NRU(companion4, jM14393getBPPrizeDialogTitleBgColorXeAY9LY, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null)), 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 5, null);
                        String upperCase = str4.toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        TextKt.m10024Text4IGK_g(upperCase, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bPPrizeDialogTitleTextStyle, composerStartRestartGroup, 0, 0, 65020);
                        Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, fDimensionResource3, 0.0f, 0.0f, 13, null);
                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                        TextKt.m10024Text4IGK_g(str3, modifierM8127paddingqDBjuR0$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, 0L, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, (i15 >> 6) & 14, 0, 65532);
                        Alignment center3 = companion2.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor6);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy5, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        if (!z6) {
                            composerStartRestartGroup.startReplaceableGroup(1276465708);
                            f = fDimensionResource8;
                            f2 = 0.0f;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_stars, composerStartRestartGroup, 6), (String) null, PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(SizeKt.m8172size3ABfNKs(companion4, fDimensionResource4), ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6), composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            f = fDimensionResource8;
                            f2 = 0.0f;
                            composerStartRestartGroup.startReplaceableGroup(1276466404);
                            NarrowOvalWithGradientCustomKt.m15096NarrowOvalWithGradientCustomiJQMabo(AlphaKt.alpha(SizeKt.m8172size3ABfNKs(companion4, fDimensionResource5), 0.6f), ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        composerStartRestartGroup.startReplaceableGroup(488218448);
                        if (bitmap3 != null) {
                            ImageKt.m7827Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmap3), null, SizeKt.fillMaxSize$default(companion4, f2, 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 440, SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER);
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-678087150);
                        if (i8 != 2) {
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, f2, 1, null);
                            Alignment bottomEnd = companion2.getBottomEnd();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(bottomEnd, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor7);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyRememberBoxMeasurePolicy6, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                                composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                                composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                            }
                            function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(PaddingKt.m8123padding3ABfNKs(companion4, f), PrimitiveResources_androidKt.dimensionResource(R.dimen._31wdp, composerStartRestartGroup, 6));
                            r4 = 0;
                            z3 = true;
                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_lock_close_fill, composerStartRestartGroup, 6), (String) null, modifierM8172size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            z3 = true;
                            r4 = 0;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(companion4, 0.85f);
                        Alignment bottomCenter = companion2.getBottomCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, r4, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r4);
                        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor8);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy7, companion3.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
                        setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                        }
                        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((int) r4));
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, fDimensionResource6), fDimensionResource7);
                        float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._7sdp, composerStartRestartGroup, 6);
                        TextStyle textStyleM14869mullerBold16spOr12ssp67j0QOw = typographyStyle.m14869mullerBold16spOr12ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                        composerStartRestartGroup.startReplaceableGroup(-678085757);
                        z4 = (i15 & 458752) != 131072 ? z3 : r4;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                            function05 = function04;
                            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$2$2$1$1
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
                                    function05.invoke();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            function05 = function04;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        MainButtonFillWithNarrowOvalGradientKt.m15076MainButtonFillWithNarrowOvalGradientOKqFZno(modifierM8158height3ABfNKs, bPPrizeDialogButtonText, textStyleM14869mullerBold16spOr12ssp67j0QOw, jM14392getBPPrizeDialogButtonTextColorXeAY9LY, jM14391getBPPrizeDialogButtonBgColorXeAY9LY, fDimensionResource9, false, false, false, false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0, 960);
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
                        i9 = i8;
                        str2 = str3;
                        bitmap4 = bitmap3;
                        function06 = function05;
                        z5 = z6;
                    } else {
                        if (i8 == 1) {
                            composerStartRestartGroup.startReplaceableGroup(1402748984);
                            strStringResource = StringResources_androidKt.stringResource(R.string.black_pass_prize_title_2, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (i8 == 2 || i8 == 3) {
                            composerStartRestartGroup.startReplaceableGroup(1402749158);
                            strStringResource = StringResources_androidKt.stringResource(R.string.black_pass_preview_title, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else if (i8 != 4) {
                            composerStartRestartGroup.startReplaceableGroup(1402749247);
                            composerStartRestartGroup.endReplaceableGroup();
                            strStringResource = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                        }
                        ColorResourceCompose colorResourceCompose2 = ColorResourceCompose.INSTANCE;
                        long jM14391getBPPrizeDialogButtonBgColorXeAY9LY2 = colorResourceCompose2.m14391getBPPrizeDialogButtonBgColorXeAY9LY(z7, composerStartRestartGroup, 48);
                        long jM14392getBPPrizeDialogButtonTextColorXeAY9LY2 = colorResourceCompose2.m14392getBPPrizeDialogButtonTextColorXeAY9LY(z7, composerStartRestartGroup, 48);
                        String bPPrizeDialogButtonText2 = StringResourceCompose.INSTANCE.getBPPrizeDialogButtonText(z7, composerStartRestartGroup, 48);
                        long jM14393getBPPrizeDialogTitleBgColorXeAY9LY2 = colorResourceCompose2.m14393getBPPrizeDialogTitleBgColorXeAY9LY(z7, composerStartRestartGroup, 48);
                        TextStyle bPPrizeDialogTitleTextStyle2 = FontResourceCompose.INSTANCE.getBPPrizeDialogTitleTextStyle(z7, composerStartRestartGroup, 48);
                        float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._200sdp, composerStartRestartGroup, 6);
                        float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._360sdp, composerStartRestartGroup, 6);
                        float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                        float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._140sdp, composerStartRestartGroup, 6);
                        float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._160sdp, composerStartRestartGroup, 6);
                        float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._120sdp, composerStartRestartGroup, 6);
                        float fDimensionResource72 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
                        float fDimensionResource82 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(1402750123);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        function04 = function03;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        Animatable animatable2 = (Animatable) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Pair pair6 = new Pair(Float.valueOf(1.5f), 500);
                        Pair pair22 = new Pair(Float.valueOf(0.7f), 250);
                        bitmap3 = bitmap2;
                        Pair pair32 = new Pair(Float.valueOf(1.2f), 250);
                        Pair pair42 = new Pair(Float.valueOf(0.9f), 150);
                        String str42 = strStringResource;
                        Pair pair52 = new Pair(Float.valueOf(1.0f), 50);
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        Alignment center4 = companion22.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        modifier4 = modifier3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor9 = companion32.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy8, companion32.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap9, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            if (!z7) {
                            }
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierScale2 = ScaleKt.scale(companion42, ((Number) animatable2.getValue()).floatValue());
                            Alignment center22 = companion22.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierScale2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl2.getInserting()) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                Modifier modifierBorder2 = BorderKt.border(BackgroundKt.m7770backgroundbw27NRU(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxHeight(companion42, 0.75f), 1.0f, false, 2, null), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6))), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6), Color.INSTANCE.m11377getWhite0d7_KjU()), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6)));
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy32 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierBorder2);
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy32, companion32.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl3.getInserting()) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy42 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(companion42);
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy42, companion32.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl4.getInserting()) {
                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        function3ModifierMaterializerOf42.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
                                        Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor52 = companion32.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf52 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default2);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap52, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash5 = companion32.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl5.getInserting()) {
                                            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                            function3ModifierMaterializerOf52.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            Modifier modifierM8127paddingqDBjuR0$default3 = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(BackgroundKt.m7770backgroundbw27NRU(companion42, jM14393getBPPrizeDialogTitleBgColorXeAY9LY2, RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._13sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null)), 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 5, null);
                                            String upperCase2 = str42.toUpperCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                            TextAlign.Companion companion52 = TextAlign.INSTANCE;
                                            TextKt.m10024Text4IGK_g(upperCase2, modifierM8127paddingqDBjuR0$default3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion52.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bPPrizeDialogTitleTextStyle2, composerStartRestartGroup, 0, 0, 65020);
                                            Modifier modifierM8127paddingqDBjuR0$default22 = PaddingKt.m8127paddingqDBjuR0$default(companion42, 0.0f, fDimensionResource32, 0.0f, 0.0f, 13, null);
                                            TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                            TextKt.m10024Text4IGK_g(str3, modifierM8127paddingqDBjuR0$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._20wsp, 0L, companion52.m13558getCentere0LSkKk(), 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 122), composerStartRestartGroup, (i15 >> 6) & 14, 0, 65532);
                                            Alignment center32 = companion22.getCenter();
                                            composerStartRestartGroup.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy52 = BoxKt.rememberBoxMeasurePolicy(center32, false, composerStartRestartGroup, 6);
                                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap62 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor62 = companion32.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf62 = LayoutKt.modifierMaterializerOf(companion42);
                                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                            Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy52, companion32.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap62, companion32.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash6 = companion32.getSetCompositeKeyHash();
                                            if (!composerM10870constructorimpl6.getInserting()) {
                                                composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                                composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                                function3ModifierMaterializerOf62.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                if (!z6) {
                                                }
                                                composerStartRestartGroup.startReplaceableGroup(488218448);
                                                if (bitmap3 != null) {
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.startReplaceableGroup(-678087150);
                                                if (i8 != 2) {
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                Modifier modifierFillMaxHeight2 = SizeKt.fillMaxHeight(companion42, 0.85f);
                                                Alignment bottomCenter2 = companion22.getBottomCenter();
                                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy72 = BoxKt.rememberBoxMeasurePolicy(bottomCenter2, r4, composerStartRestartGroup, 6);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r4);
                                                CompositionLocalMap currentCompositionLocalMap82 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor82 = companion32.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf82 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight2);
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy72, companion32.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap82, companion32.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash7 = companion32.getSetCompositeKeyHash();
                                                if (!composerM10870constructorimpl7.getInserting()) {
                                                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                                    function3ModifierMaterializerOf82.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((int) r4));
                                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion42, fDimensionResource62), fDimensionResource72);
                                                    float fDimensionResource92 = PrimitiveResources_androidKt.dimensionResource(R.dimen._7sdp, composerStartRestartGroup, 6);
                                                    TextStyle textStyleM14869mullerBold16spOr12ssp67j0QOw2 = typographyStyle2.m14869mullerBold16spOr12ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15);
                                                    composerStartRestartGroup.startReplaceableGroup(-678085757);
                                                    if ((i15 & 458752) != 131072) {
                                                    }
                                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                    if (z4) {
                                                        function05 = function04;
                                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt$BlackPassPrizeDialogContent$2$2$2$1$1
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
                                                                function05.invoke();
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        MainButtonFillWithNarrowOvalGradientKt.m15076MainButtonFillWithNarrowOvalGradientOKqFZno(modifierM8158height3ABfNKs2, bPPrizeDialogButtonText2, textStyleM14869mullerBold16spOr12ssp67j0QOw2, jM14392getBPPrizeDialogButtonTextColorXeAY9LY2, jM14391getBPPrizeDialogButtonBgColorXeAY9LY2, fDimensionResource92, false, false, false, false, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 0, 960);
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
                                                        i9 = i8;
                                                        str2 = str3;
                                                        bitmap4 = bitmap3;
                                                        function06 = function05;
                                                        z5 = z6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    bitmap4 = bitmap;
                    modifier4 = modifier2;
                    str2 = strEmpty;
                    i9 = i5;
                    z5 = z2;
                    function06 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt.BlackPassPrizeDialogContent.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i16) {
                            BlackPassPrizeDialogNewKt.BlackPassPrizeDialogContent(modifier5, bitmap4, str2, i9, z5, function06, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= CpioConstants.C_ISBLK;
            z2 = z;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            if (i12 != 2) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    int i152 = i4;
                    String str32 = strEmpty;
                    i8 = i5;
                    boolean z62 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (i8 != 0) {
                        if (i8 == 0) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z2 = z;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        if (i12 != 2) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBlackPassPrizeDialogNew(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-79899706);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-79899706, i, -1, "com.blackhub.bronline.game.ui.blackpass.PreviewBlackPassPrizeDialogNew (BlackPassPrizeDialogNew.kt:308)");
            }
            Drawable drawable = ContextCompat.getDrawable((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), R.drawable.img_logo_br_big);
            BlackPassPrizeDialogContent(null, drawable != null ? DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null) : null, "КОРОЛЕВА МАНИПУЛЯЦИЙ", 2, false, null, composerStartRestartGroup, 28096, 33);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeDialogNewKt.PreviewBlackPassPrizeDialogNew.1
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
                    BlackPassPrizeDialogNewKt.PreviewBlackPassPrizeDialogNew(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
