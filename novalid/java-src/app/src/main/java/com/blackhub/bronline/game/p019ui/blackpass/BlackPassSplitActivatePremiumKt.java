package com.blackhub.bronline.game.p019ui.blackpass;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.AlphaKt;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.geometry.OffsetKt;
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
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.p019ui.widget.block.ClickAnimateBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.ButtonWithLineKt;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassSplitActivatePremium.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m7105d2 = {"ALPHA_FOR_BEAR_IMAGE", "", "SCALE_FOR_IMAGE", "SCALE_FOR_IMAGE_1", "BlackPassSplitActivateBP", "", "modifier", "Landroidx/compose/ui/Modifier;", "imgOfferSplit", "Landroid/graphics/Bitmap;", "premiumSubtitle", "Landroidx/compose/ui/text/AnnotatedString;", "premiumDeluxeSubtitle", "nameDeluxeCar", "", "imgDeluxeCar", "premiumPrice", "premiumDeluxePrice", "isButtonBuyPremiumEnabled", "", "bannerTitlePrize1", "onShowPrizesList", "Lkotlin/Function0;", "onButtonBuyPremiumClick", "onButtonBuyPremiumDeluxeClick", "(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewBlackPassSplitActivateBP", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassSplitActivatePremium.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassSplitActivatePremium.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassSplitActivatePremiumKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,414:1\n91#2,2:415\n93#2:445\n91#2,2:557\n93#2:587\n97#2:598\n86#2,7:766\n93#2:801\n97#2:806\n86#2,7:807\n93#2:842\n97#2:1128\n97#2:1149\n79#3,11:417\n79#3,11:453\n79#3,11:488\n79#3,11:523\n92#3:555\n79#3,11:559\n92#3:597\n79#3,11:605\n92#3:637\n92#3:648\n92#3:653\n79#3,11:662\n79#3,11:697\n79#3,11:732\n92#3:764\n79#3,11:773\n92#3:805\n79#3,11:814\n79#3,11:850\n79#3,11:885\n79#3,11:920\n92#3:952\n79#3,11:960\n92#3:992\n79#3,11:1000\n92#3:1032\n79#3,11:1040\n92#3:1072\n92#3:1077\n92#3:1082\n79#3,11:1090\n92#3:1122\n92#3:1127\n92#3:1138\n92#3:1143\n92#3:1148\n456#4,8:428\n464#4,3:442\n456#4,8:464\n464#4,3:478\n456#4,8:499\n464#4,3:513\n456#4,8:534\n464#4,3:548\n467#4,3:552\n456#4,8:570\n464#4,3:584\n467#4,3:594\n456#4,8:616\n464#4,3:630\n467#4,3:634\n467#4,3:645\n467#4,3:650\n456#4,8:673\n464#4,3:687\n456#4,8:708\n464#4,3:722\n456#4,8:743\n464#4,3:757\n467#4,3:761\n456#4,8:784\n464#4,3:798\n467#4,3:802\n456#4,8:825\n464#4,3:839\n456#4,8:861\n464#4,3:875\n456#4,8:896\n464#4,3:910\n456#4,8:931\n464#4,3:945\n467#4,3:949\n456#4,8:971\n464#4,3:985\n467#4,3:989\n456#4,8:1011\n464#4,3:1025\n467#4,3:1029\n456#4,8:1051\n464#4,3:1065\n467#4,3:1069\n467#4,3:1074\n467#4,3:1079\n456#4,8:1101\n464#4,3:1115\n467#4,3:1119\n467#4,3:1124\n467#4,3:1135\n467#4,3:1140\n467#4,3:1145\n3737#5,6:436\n3737#5,6:472\n3737#5,6:507\n3737#5,6:542\n3737#5,6:578\n3737#5,6:624\n3737#5,6:681\n3737#5,6:716\n3737#5,6:751\n3737#5,6:792\n3737#5,6:833\n3737#5,6:869\n3737#5,6:904\n3737#5,6:939\n3737#5,6:979\n3737#5,6:1019\n3737#5,6:1059\n3737#5,6:1109\n73#6,7:446\n80#6:481\n74#6,6:482\n80#6:516\n84#6:649\n84#6:654\n74#6,6:691\n80#6:725\n73#6,7:843\n80#6:878\n84#6:1083\n74#6,6:1084\n80#6:1118\n84#6:1123\n84#6:1139\n68#7,6:517\n74#7:551\n78#7:556\n68#7,6:599\n74#7:633\n78#7:638\n67#7,7:655\n74#7:690\n68#7,6:726\n74#7:760\n78#7:765\n68#7,6:879\n74#7:913\n68#7,6:914\n74#7:948\n78#7:953\n68#7,6:954\n74#7:988\n78#7:993\n68#7,6:994\n74#7:1028\n78#7:1033\n68#7,6:1034\n74#7:1068\n78#7:1073\n78#7:1078\n78#7:1144\n1116#8,6:588\n1116#8,6:639\n1116#8,6:1129\n*S KotlinDebug\n*F\n+ 1 BlackPassSplitActivatePremium.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassSplitActivatePremiumKt\n*L\n89#1:415,2\n89#1:445\n121#1:557,2\n121#1:587\n121#1:598\n217#1:766,7\n217#1:801\n217#1:806\n237#1:807,7\n237#1:842\n237#1:1128\n89#1:1149\n89#1:417,11\n94#1:453,11\n95#1:488,11\n102#1:523,11\n102#1:555\n121#1:559,11\n121#1:597\n146#1:605,11\n146#1:637\n95#1:648\n94#1:653\n186#1:662,11\n187#1:697,11\n195#1:732,11\n195#1:764\n217#1:773,11\n217#1:805\n237#1:814,11\n239#1:850,11\n247#1:885,11\n251#1:920,11\n251#1:952\n272#1:960,11\n272#1:992\n293#1:1000,11\n293#1:1032\n317#1:1040,11\n317#1:1072\n247#1:1077\n239#1:1082\n345#1:1090,11\n345#1:1122\n237#1:1127\n187#1:1138\n186#1:1143\n89#1:1148\n89#1:428,8\n89#1:442,3\n94#1:464,8\n94#1:478,3\n95#1:499,8\n95#1:513,3\n102#1:534,8\n102#1:548,3\n102#1:552,3\n121#1:570,8\n121#1:584,3\n121#1:594,3\n146#1:616,8\n146#1:630,3\n146#1:634,3\n95#1:645,3\n94#1:650,3\n186#1:673,8\n186#1:687,3\n187#1:708,8\n187#1:722,3\n195#1:743,8\n195#1:757,3\n195#1:761,3\n217#1:784,8\n217#1:798,3\n217#1:802,3\n237#1:825,8\n237#1:839,3\n239#1:861,8\n239#1:875,3\n247#1:896,8\n247#1:910,3\n251#1:931,8\n251#1:945,3\n251#1:949,3\n272#1:971,8\n272#1:985,3\n272#1:989,3\n293#1:1011,8\n293#1:1025,3\n293#1:1029,3\n317#1:1051,8\n317#1:1065,3\n317#1:1069,3\n247#1:1074,3\n239#1:1079,3\n345#1:1101,8\n345#1:1115,3\n345#1:1119,3\n237#1:1124,3\n187#1:1135,3\n186#1:1140,3\n89#1:1145,3\n89#1:436,6\n94#1:472,6\n95#1:507,6\n102#1:542,6\n121#1:578,6\n146#1:624,6\n186#1:681,6\n187#1:716,6\n195#1:751,6\n217#1:792,6\n237#1:833,6\n239#1:869,6\n247#1:904,6\n251#1:939,6\n272#1:979,6\n293#1:1019,6\n317#1:1059,6\n345#1:1109,6\n94#1:446,7\n94#1:481\n95#1:482,6\n95#1:516\n95#1:649\n94#1:654\n187#1:691,6\n187#1:725\n239#1:843,7\n239#1:878\n239#1:1083\n345#1:1084,6\n345#1:1118\n345#1:1123\n187#1:1139\n102#1:517,6\n102#1:551\n102#1:556\n146#1:599,6\n146#1:633\n146#1:638\n186#1:655,7\n186#1:690\n195#1:726,6\n195#1:760\n195#1:765\n247#1:879,6\n247#1:913\n251#1:914,6\n251#1:948\n251#1:953\n272#1:954,6\n272#1:988\n272#1:993\n293#1:994,6\n293#1:1028\n293#1:1033\n317#1:1034,6\n317#1:1068\n317#1:1073\n247#1:1078\n186#1:1144\n137#1:588,6\n180#1:639,6\n376#1:1129,6\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassSplitActivatePremiumKt {
    public static final float ALPHA_FOR_BEAR_IMAGE = 0.05f;
    public static final float SCALE_FOR_IMAGE = 1.25f;
    public static final float SCALE_FOR_IMAGE_1 = 1.1f;

    /* compiled from: BlackPassSplitActivatePremium.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$BlackPassSplitActivateBP$2 */
    public static final class C49112 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AnnotatedString $bannerTitlePrize1;
        public final /* synthetic */ Bitmap $imgDeluxeCar;
        public final /* synthetic */ Bitmap $imgOfferSplit;
        public final /* synthetic */ boolean $isButtonBuyPremiumEnabled;
        public final /* synthetic */ String $nameDeluxeCar;
        public final /* synthetic */ Function0<Unit> $onButtonBuyPremiumClick;
        public final /* synthetic */ Function0<Unit> $onButtonBuyPremiumDeluxeClick;
        public final /* synthetic */ Function0<Unit> $onShowPrizesList;
        public final /* synthetic */ String $premiumDeluxePrice;
        public final /* synthetic */ AnnotatedString $premiumDeluxeSubtitle;
        public final /* synthetic */ String $premiumPrice;
        public final /* synthetic */ AnnotatedString $premiumSubtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49112(Bitmap bitmap, AnnotatedString annotatedString, AnnotatedString annotatedString2, String str, Bitmap bitmap2, String str2, String str3, boolean z, AnnotatedString annotatedString3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2, int i3) {
            super(2);
            bitmap = bitmap;
            annotatedString = annotatedString;
            annotatedString = annotatedString2;
            str = str;
            bitmap = bitmap2;
            str = str2;
            str = str3;
            z = z;
            annotatedString = annotatedString3;
            function0 = function0;
            function0 = function02;
            function0 = function03;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BlackPassSplitActivatePremiumKt.BlackPassSplitActivateBP(modifier, bitmap, annotatedString, annotatedString, str, bitmap, str, str, z, annotatedString, function0, function0, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: BlackPassSplitActivatePremium.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$PreviewBlackPassSplitActivateBP$4 */
    public static final class C49154 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49154(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            BlackPassSplitActivatePremiumKt.PreviewBlackPassSplitActivateBP(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void BlackPassSplitActivateBP(@Nullable Modifier modifier, @Nullable Bitmap bitmap, @NotNull AnnotatedString premiumSubtitle, @NotNull AnnotatedString premiumDeluxeSubtitle, @NotNull String nameDeluxeCar, @Nullable Bitmap bitmap2, @NotNull String premiumPrice, @NotNull String premiumDeluxePrice, boolean z, @NotNull AnnotatedString bannerTitlePrize1, @NotNull final Function0<Unit> onShowPrizesList, @NotNull final Function0<Unit> onButtonBuyPremiumClick, @NotNull final Function0<Unit> onButtonBuyPremiumDeluxeClick, @Nullable Composer composer, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(premiumSubtitle, "premiumSubtitle");
        Intrinsics.checkNotNullParameter(premiumDeluxeSubtitle, "premiumDeluxeSubtitle");
        Intrinsics.checkNotNullParameter(nameDeluxeCar, "nameDeluxeCar");
        Intrinsics.checkNotNullParameter(premiumPrice, "premiumPrice");
        Intrinsics.checkNotNullParameter(premiumDeluxePrice, "premiumDeluxePrice");
        Intrinsics.checkNotNullParameter(bannerTitlePrize1, "bannerTitlePrize1");
        Intrinsics.checkNotNullParameter(onShowPrizesList, "onShowPrizesList");
        Intrinsics.checkNotNullParameter(onButtonBuyPremiumClick, "onButtonBuyPremiumClick");
        Intrinsics.checkNotNullParameter(onButtonBuyPremiumDeluxeClick, "onButtonBuyPremiumDeluxeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-200310524);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-200310524, i, i2, "com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivateBP (BlackPassSplitActivatePremium.kt:69)");
        }
        Brush.Companion companion = Brush.INSTANCE;
        Brush brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_blue, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0L, 0.0f, 0, 14, (Object) null);
        Brush brushM11293radialGradientP_VxKs$default2 = Brush.Companion.m11293radialGradientP_VxKs$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_red_40, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0L, 0.0f, 0, 14, (Object) null);
        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6));
        RoundedCornerShape roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 12, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._291wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._235wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4);
        Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._44wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.light_gray_blue_25, composerStartRestartGroup, 6), roundedCornerShapeM8394RoundedCornerShapea9UjIt4$default);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getCenter());
        String strStringResource = StringResources_androidKt.stringResource(R.string.black_pass_premium_title, composerStartRestartGroup, 6);
        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
        TextKt.m10024Text4IGK_g(strStringResource, modifierAlign, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14816montserratBoldItalicCustomSpbl3sdaw(R.dimen._17wdp, 0L, 0, OffsetKt.Offset(0.0f, 2.0f), 0.0f, composerStartRestartGroup, 199686, 22), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 13, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        Arrangement.HorizontalOrVertical center = arrangement.getCenter();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, centerVertically2, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8127paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        int i4 = i >> 6;
        TextKt.m10025TextIbK3jfQ(premiumSubtitle, PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 11, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, i4 & 14, 0, 131068);
        Modifier modifierM8172size3ABfNKs = SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(-1009431611);
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composerStartRestartGroup.changed(onShowPrizesList)) || (i2 & 6) == 4;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$BlackPassSplitActivateBP$1$1$1$2$1$1
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
                    onShowPrizesList.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_button_search, composerStartRestartGroup, 6), (String) null, ClickableKt.m7805clickableXHw0xAI$default(modifierM8172size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._236wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._114wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor6);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxKt.Box(boxScopeInstance.align(BackgroundKt.background$default(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._99wdp, composerStartRestartGroup, 6)), brushM11293radialGradientP_VxKs$default, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), companion2.getCenter()), composerStartRestartGroup, 0);
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(ScaleKt.scale(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), 1.25f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8wdp, composerStartRestartGroup, 6), 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._9wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_premium_prize_2, composerStartRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._14wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65534);
        Modifier modifierM8084offsetVpY3zN4$default = androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._100wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6), 1, null);
        composerStartRestartGroup.startReplaceableGroup(-1024754894);
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composerStartRestartGroup.changed(onButtonBuyPremiumClick)) || (i2 & 48) == 32;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$BlackPassSplitActivateBP$1$1$1$4$1
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
                    onButtonBuyPremiumClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i5 = i >> 9;
        ButtonWithLineKt.ButtonWithLine(modifierM8084offsetVpY3zN4$default, 0, 0, R.dimen._12wsp, premiumPrice, z, 0, 0.0f, (Function0) objRememberedValue2, composerStartRestartGroup, (i4 & 57344) | 3072 | (i5 & 458752), 198);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor7);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM7770backgroundbw27NRU3 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._280wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._460wdp, composerStartRestartGroup, 6)), ColorResources_androidKt.colorResource(R.color.total_black_90, composerStartRestartGroup, 6), roundedCornerShapeM8392RoundedCornerShape0680j_4);
        Alignment.Horizontal centerHorizontally3 = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor8);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl8 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl8, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
            composerM10870constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            composerM10870constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
        }
        function3ModifierMaterializerOf8.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._52wdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor9 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor9);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl9 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl9, measurePolicyRememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl9, currentCompositionLocalMap9, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
            composerM10870constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
            composerM10870constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
        }
        function3ModifierMaterializerOf9.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_task_card, composerStartRestartGroup, 6), (String) null, SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 25016, 104);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_premium_deluxe_title, composerStartRestartGroup, 6), boxScopeInstance.align(companion4, companion2.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14816montserratBoldItalicCustomSpbl3sdaw(R.dimen._25wdp, 0L, 0, OffsetKt.Offset(0.0f, 2.0f), 0.0f, composerStartRestartGroup, 199686, 22), composerStartRestartGroup, 0, 0, 65532);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically3, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor10 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(companion4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor10);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl10 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl10, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl10, currentCompositionLocalMap10, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl10.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
            composerM10870constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
            composerM10870constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
        }
        function3ModifierMaterializerOf10.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10025TextIbK3jfQ(premiumDeluxeSubtitle, PaddingKt.m8125paddingVpY3zN4$default(companion4, 0.0f, 0.0f, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._12wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, (i5 & 14) | 48, 0, 131068);
        ClickAnimateBlockKt.m15038ClickAnimateBlockwxWwho(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._29wdp, composerStartRestartGroup, 6)), null, false, null, false, false, false, false, null, 0, 0L, onShowPrizesList, null, ComposableSingletons$BlackPassSplitActivatePremiumKt.INSTANCE.m14894getLambda1$app_siteRelease(), composerStartRestartGroup, 0, ((i2 << 3) & 112) | 3072, 6142);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._16wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor11 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(companion4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor11);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl11 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl11, measurePolicyRowMeasurePolicy4, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl11, currentCompositionLocalMap11, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl11.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
            composerM10870constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
            composerM10870constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
        }
        function3ModifierMaterializerOf11.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Alignment.Horizontal centerHorizontally4 = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally4, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor12 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(companion4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor12);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl12 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl12, measurePolicyColumnMeasurePolicy4, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl12, currentCompositionLocalMap12, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl12.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
            composerM10870constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
            composerM10870constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
        }
        function3ModifierMaterializerOf12.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_premium_deluxe_include, composerStartRestartGroup, 6), AlphaKt.alpha(companion4, 0.5f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 48, 0, 65532);
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._211wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._132wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash13 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor13 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor13);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl13 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl13, measurePolicyRememberBoxMeasurePolicy5, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl13, currentCompositionLocalMap13, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash13 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl13.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl13.rememberedValue(), Integer.valueOf(currentCompositeKeyHash13))) {
            composerM10870constructorimpl13.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash13));
            composerM10870constructorimpl13.apply(Integer.valueOf(currentCompositeKeyHash13), setCompositeKeyHash13);
        }
        function3ModifierMaterializerOf13.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._63wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._108wdp, composerStartRestartGroup, 6));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash14 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor14 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor14);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl14 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl14, measurePolicyRememberBoxMeasurePolicy6, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl14, currentCompositionLocalMap14, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash14 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl14.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl14.rememberedValue(), Integer.valueOf(currentCompositeKeyHash14))) {
            composerM10870constructorimpl14.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash14));
            composerM10870constructorimpl14.apply(Integer.valueOf(currentCompositeKeyHash14), setCompositeKeyHash14);
        }
        function3ModifierMaterializerOf14.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_level_up, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(BackgroundKt.background$default(companion4, brushM11293radialGradientP_VxKs$default, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._41wdp, composerStartRestartGroup, 6)), companion2.getTopCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        Modifier modifierAlign2 = boxScopeInstance.align(companion4, companion2.getBottomCenter());
        TextStyle textStyleM14862montserratSemiBoldCustomSpcv9FZhg = typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62);
        TextAlign.Companion companion5 = TextAlign.INSTANCE;
        TextKt.m10025TextIbK3jfQ(bannerTitlePrize1, modifierAlign2, 0L, 0L, null, null, null, 0L, null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, textStyleM14862montserratSemiBoldCustomSpcv9FZhg, composerStartRestartGroup, (i >> 27) & 14, 0, 130556);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._63wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._108wdp, composerStartRestartGroup, 6)), companion2.getTopEnd());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash15 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor15 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierAlign3);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor15);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl15 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl15, measurePolicyRememberBoxMeasurePolicy7, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl15, currentCompositionLocalMap15, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash15 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl15.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl15.rememberedValue(), Integer.valueOf(currentCompositeKeyHash15))) {
            composerM10870constructorimpl15.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash15));
            composerM10870constructorimpl15.apply(Integer.valueOf(currentCompositeKeyHash15), setCompositeKeyHash15);
        }
        function3ModifierMaterializerOf15.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.vip_platinum, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(BackgroundKt.background$default(companion4, brushM11293radialGradientP_VxKs$default, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._41wdp, composerStartRestartGroup, 6)), companion2.getTopCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.banner_title_prize_2, composerStartRestartGroup, 6), boxScopeInstance.align(companion4, companion2.getBottomCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65020);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign4 = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._63wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._108wdp, composerStartRestartGroup, 6)), companion2.getBottomEnd());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash16 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor16 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierAlign4);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor16);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl16 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl16, measurePolicyRememberBoxMeasurePolicy8, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl16, currentCompositionLocalMap16, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash16 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl16.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl16.rememberedValue(), Integer.valueOf(currentCompositeKeyHash16))) {
            composerM10870constructorimpl16.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash16));
            composerM10870constructorimpl16.apply(Integer.valueOf(currentCompositeKeyHash16), setCompositeKeyHash16);
        }
        function3ModifierMaterializerOf16.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_dust, composerStartRestartGroup, 6), (String) null, boxScopeInstance.align(SizeKt.m8172size3ABfNKs(BackgroundKt.background$default(companion4, brushM11293radialGradientP_VxKs$default, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._41wdp, composerStartRestartGroup, 6)), companion2.getTopCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_premium_prize_3, composerStartRestartGroup, 6), PaddingKt.m8127paddingqDBjuR0$default(boxScopeInstance.align(companion4, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65020);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierAlign5 = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._72wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._108wdp, composerStartRestartGroup, 6)), companion2.getBottomStart());
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash17 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor17 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierAlign5);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor17);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl17 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl17, measurePolicyRememberBoxMeasurePolicy9, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl17, currentCompositionLocalMap17, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash17 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl17.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl17.rememberedValue(), Integer.valueOf(currentCompositeKeyHash17))) {
            composerM10870constructorimpl17.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash17));
            composerM10870constructorimpl17.apply(Integer.valueOf(currentCompositeKeyHash17), setCompositeKeyHash17);
        }
        function3ModifierMaterializerOf17.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap, androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(ScaleKt.scale(boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(BackgroundKt.background$default(companion4, brushM11293radialGradientP_VxKs$default, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._57wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._108wdp, composerStartRestartGroup, 6)), companion2.getTopCenter()), 1.1f), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6), 1, null), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_premium_prize_2, composerStartRestartGroup, 6), boxScopeInstance.align(companion4, companion2.getBottomCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion5.m13558getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._8wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 0, 0, 65020);
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
        SpacerKt.Spacer(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._30wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._134wdp, composerStartRestartGroup, 6));
        Alignment.Horizontal centerHorizontally5 = companion2.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally5, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash18 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor18 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor18);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM10870constructorimpl18 = Updater.m10870constructorimpl(composerStartRestartGroup);
        Updater.m10877setimpl(composerM10870constructorimpl18, measurePolicyColumnMeasurePolicy5, companion3.getSetMeasurePolicy());
        Updater.m10877setimpl(composerM10870constructorimpl18, currentCompositionLocalMap18, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash18 = companion3.getSetCompositeKeyHash();
        if (composerM10870constructorimpl18.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl18.rememberedValue(), Integer.valueOf(currentCompositeKeyHash18))) {
            composerM10870constructorimpl18.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash18));
            composerM10870constructorimpl18.apply(Integer.valueOf(currentCompositeKeyHash18), setCompositeKeyHash18);
        }
        function3ModifierMaterializerOf18.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.black_pass_premium_deluxe_unique_car, composerStartRestartGroup, 6), AlphaKt.alpha(companion4, 0.5f), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._10wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, 48, 0, 65532);
        SpacerKt.Spacer(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._4wdp, composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap2, ScaleKt.scale(SizeKt.fillMaxWidth$default(BackgroundKt.background$default(SizeKt.m8158height3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._94wdp, composerStartRestartGroup, 6)), brushM11293radialGradientP_VxKs$default2, RoundedCornerShapeKt.getCircleShape(), 0.0f, 4, null), 0.0f, 1, null), 1.25f), null, null, 0.0f, null, 0, composerStartRestartGroup, 8, 124);
        TextKt.m10024Text4IGK_g(nameDeluxeCar, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14862montserratSemiBoldCustomSpcv9FZhg(R.dimen._15wdp, 0L, 0, 0L, 0.0f, null, composerStartRestartGroup, 1572870, 62), composerStartRestartGroup, (i >> 12) & 14, 0, 65534);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM8084offsetVpY3zN4$default2 = androidx.compose.foundation.layout.OffsetKt.m8084offsetVpY3zN4$default(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._182wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._14wdp, composerStartRestartGroup, 6), 1, null);
        composerStartRestartGroup.startReplaceableGroup(-1024745405);
        boolean z4 = (((i2 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(onButtonBuyPremiumDeluxeClick)) || (i2 & 384) == 256;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$BlackPassSplitActivateBP$1$2$1$4$1
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
                    onButtonBuyPremiumDeluxeClick.invoke();
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ButtonWithLineKt.ButtonWithLine(modifierM8084offsetVpY3zN4$default2, 0, 0, R.dimen._12wsp, premiumDeluxePrice, false, 0, 0.0f, (Function0) objRememberedValue3, composerStartRestartGroup, (i5 & 57344) | 3072, 230);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_br_logo_yellow, composerStartRestartGroup, 6), (String) null, AlphaKt.alpha(boxScopeInstance.align(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._224wdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._245wdp, composerStartRestartGroup, 6)), companion2.getCenter()), 0.05f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt.BlackPassSplitActivateBP.2
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$changed1;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ AnnotatedString $bannerTitlePrize1;
                public final /* synthetic */ Bitmap $imgDeluxeCar;
                public final /* synthetic */ Bitmap $imgOfferSplit;
                public final /* synthetic */ boolean $isButtonBuyPremiumEnabled;
                public final /* synthetic */ String $nameDeluxeCar;
                public final /* synthetic */ Function0<Unit> $onButtonBuyPremiumClick;
                public final /* synthetic */ Function0<Unit> $onButtonBuyPremiumDeluxeClick;
                public final /* synthetic */ Function0<Unit> $onShowPrizesList;
                public final /* synthetic */ String $premiumDeluxePrice;
                public final /* synthetic */ AnnotatedString $premiumDeluxeSubtitle;
                public final /* synthetic */ String $premiumPrice;
                public final /* synthetic */ AnnotatedString $premiumSubtitle;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C49112(Bitmap bitmap3, AnnotatedString premiumSubtitle2, AnnotatedString premiumDeluxeSubtitle2, String nameDeluxeCar2, Bitmap bitmap22, String premiumPrice2, String premiumDeluxePrice2, boolean z5, AnnotatedString bannerTitlePrize12, final Function0<Unit> onShowPrizesList2, final Function0<Unit> onButtonBuyPremiumClick2, final Function0<Unit> onButtonBuyPremiumDeluxeClick2, int i6, int i22, int i32) {
                    super(2);
                    bitmap = bitmap3;
                    annotatedString = premiumSubtitle2;
                    annotatedString = premiumDeluxeSubtitle2;
                    str = nameDeluxeCar2;
                    bitmap = bitmap22;
                    str = premiumPrice2;
                    str = premiumDeluxePrice2;
                    z = z5;
                    annotatedString = bannerTitlePrize12;
                    function0 = onShowPrizesList2;
                    function0 = onButtonBuyPremiumClick2;
                    function0 = onButtonBuyPremiumDeluxeClick2;
                    i = i6;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    BlackPassSplitActivatePremiumKt.BlackPassSplitActivateBP(modifier, bitmap, annotatedString, annotatedString, str, bitmap, str, str, z, annotatedString, function0, function0, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* compiled from: BlackPassSplitActivatePremium.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$PreviewBlackPassSplitActivateBP$1 */
    public static final class C49121 extends Lambda implements Function0<Unit> {
        public static final C49121 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BlackPassSplitActivatePremium.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$PreviewBlackPassSplitActivateBP$2 */
    public static final class C49132 extends Lambda implements Function0<Unit> {
        public static final C49132 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BlackPassSplitActivatePremium.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt$PreviewBlackPassSplitActivateBP$3 */
    public static final class C49143 extends Lambda implements Function0<Unit> {
        public static final C49143 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBlackPassSplitActivateBP(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2033706219);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2033706219, i, -1, "com.blackhub.bronline.game.ui.blackpass.PreviewBlackPassSplitActivateBP (BlackPassSplitActivatePremium.kt:393)");
            }
            composer2 = composerStartRestartGroup;
            BlackPassSplitActivateBP(SizeKt.fillMaxWidth$default(SizeKt.m8158height3ABfNKs(PaddingKt.m8125paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._13wdp, composerStartRestartGroup, 6), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._317wdp, composerStartRestartGroup, 6)), 0.0f, 1, null), null, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.black_pass_premium_subtitle_html, composerStartRestartGroup, 6)), StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.black_pass_premium_deluxe_subtitle_html, composerStartRestartGroup, 6)), "BMW M4 GT3", null, "790BC", "1699BC", true, StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.banner_title_prize_1_html, composerStartRestartGroup, 6)), C49121.INSTANCE, C49132.INSTANCE, C49143.INSTANCE, composerStartRestartGroup, 115040304, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassSplitActivatePremiumKt.PreviewBlackPassSplitActivateBP.4
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C49154(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    BlackPassSplitActivatePremiumKt.PreviewBlackPassSplitActivateBP(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
