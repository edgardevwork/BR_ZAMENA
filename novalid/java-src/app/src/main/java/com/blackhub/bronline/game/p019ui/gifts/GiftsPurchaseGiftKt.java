package com.blackhub.bronline.game.p019ui.gifts;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.p003ui.geometry.Offset;
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
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.ColorResourceCompose;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.cases.p020ui.CasesReceivingSuperRewardUiKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsPurchaseGift.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0098\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u009c\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0007¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7105d2 = {"SIZE_OF_GIFT_IMAGE", "", "GiftsPurchaseGift", "", "modifier", "Landroidx/compose/ui/Modifier;", "isStandardGift", "", "valueOfGifts", "", "isHideBlockWithValue", "typeOfButton", FirebaseAnalytics.Param.PRICE, "valueOfBC", "isNeedOpenGift", "idStandardPrize", "idLegendaryPrize", "clickOpenGift", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isWithoutLoader", "onTurnBlockingLoadingClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;ZIZIIIZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "GiftsPurchaseGiftContent", "isNeedBlurButton", "(Landroidx/compose/ui/Modifier;ZIZZIIIZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewGiftsPurchaseGift", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGiftsPurchaseGift.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftsPurchaseGift.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsPurchaseGiftKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,250:1\n1116#2,6:251\n1116#2,6:257\n1116#2,6:416\n74#3,6:263\n80#3:297\n84#3:426\n79#4,11:269\n79#4,11:304\n79#4,11:338\n92#4:370\n79#4,11:377\n92#4:409\n92#4:414\n92#4:425\n456#5,8:280\n464#5,3:294\n456#5,8:315\n464#5,3:329\n456#5,8:349\n464#5,3:363\n467#5,3:367\n456#5,8:388\n464#5,3:402\n467#5,3:406\n467#5,3:411\n467#5,3:422\n3737#6,6:288\n3737#6,6:323\n3737#6,6:357\n3737#6,6:396\n68#7,6:298\n74#7:332\n69#7,5:333\n74#7:366\n78#7:371\n69#7,5:372\n74#7:405\n78#7:410\n78#7:415\n*S KotlinDebug\n*F\n+ 1 GiftsPurchaseGift.kt\ncom/blackhub/bronline/game/ui/gifts/GiftsPurchaseGiftKt\n*L\n120#1:251,6\n129#1:257,6\n224#1:416,6\n122#1:263,6\n122#1:297\n122#1:426\n122#1:269,11\n134#1:304,11\n147#1:338,11\n147#1:370\n166#1:377,11\n166#1:409\n134#1:414\n122#1:425\n122#1:280,8\n122#1:294,3\n134#1:315,8\n134#1:329,3\n147#1:349,8\n147#1:363,3\n147#1:367,3\n166#1:388,8\n166#1:402,3\n166#1:406,3\n134#1:411,3\n122#1:422,3\n122#1:288,6\n134#1:323,6\n147#1:357,6\n166#1:396,6\n134#1:298,6\n134#1:332\n147#1:333,5\n147#1:366\n147#1:371\n166#1:372,5\n166#1:405\n166#1:410\n134#1:415\n*E\n"})
/* loaded from: classes3.dex */
public final class GiftsPurchaseGiftKt {
    public static final float SIZE_OF_GIFT_IMAGE = 0.6f;

    /* compiled from: GiftsPurchaseGift.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGift$1 */
    /* loaded from: classes.dex */
    public static final class C56251 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<Boolean, Unit> $clickOpenGift;
        public final /* synthetic */ int $idLegendaryPrize;
        public final /* synthetic */ int $idStandardPrize;
        public final /* synthetic */ boolean $isHideBlockWithValue;
        public final /* synthetic */ boolean $isNeedOpenGift;
        public final /* synthetic */ boolean $isStandardGift;
        public final /* synthetic */ Function0<Unit> $onTurnBlockingLoadingClick;
        public final /* synthetic */ int $price;
        public final /* synthetic */ int $typeOfButton;
        public final /* synthetic */ int $valueOfBC;
        public final /* synthetic */ int $valueOfGifts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C56251(boolean z, int i, boolean z2, int i2, int i3, int i4, boolean z3, int i5, int i6, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, int i7, int i8, int i9) {
            super(2);
            z = z;
            i = i;
            z = z2;
            i = i2;
            i = i3;
            i = i4;
            z = z3;
            i = i5;
            i = i6;
            function1 = function1;
            function0 = function0;
            i = i7;
            i = i8;
            i = i9;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsPurchaseGiftKt.GiftsPurchaseGift(modifier, z, i, z, i, i, i, z, i, i, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: GiftsPurchaseGift.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$3 */
    /* loaded from: classes.dex */
    public static final class C56263 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<Boolean, Unit> $clickOpenGift;
        public final /* synthetic */ int $idLegendaryPrize;
        public final /* synthetic */ int $idStandardPrize;
        public final /* synthetic */ boolean $isHideBlockWithValue;
        public final /* synthetic */ boolean $isNeedBlurButton;
        public final /* synthetic */ boolean $isNeedOpenGift;
        public final /* synthetic */ boolean $isStandardGift;
        public final /* synthetic */ Function0<Unit> $onTurnBlockingLoadingClick;
        public final /* synthetic */ int $price;
        public final /* synthetic */ int $typeOfButton;
        public final /* synthetic */ int $valueOfBC;
        public final /* synthetic */ int $valueOfGifts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C56263(boolean z, int i, boolean z2, boolean z3, int i2, int i3, int i4, boolean z4, int i5, int i6, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, int i7, int i8, int i9) {
            super(2);
            z = z;
            i = i;
            z = z2;
            z = z3;
            i = i2;
            i = i3;
            i = i4;
            z = z4;
            i = i5;
            i = i6;
            function1 = function1;
            function0 = function0;
            i = i7;
            i = i8;
            i = i9;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsPurchaseGiftKt.GiftsPurchaseGiftContent(modifier, z, i, z, z, i, i, i, z, i, i, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* compiled from: GiftsPurchaseGift.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$PreviewGiftsPurchaseGift$3 */
    /* loaded from: classes.dex */
    public static final class C56293 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C56293(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GiftsPurchaseGiftKt.PreviewGiftsPurchaseGift(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GiftsPurchaseGift(@Nullable Modifier modifier, boolean z, int i, boolean z2, int i2, int i3, int i4, boolean z3, @DrawableRes int i5, @DrawableRes int i6, @NotNull Function1<? super Boolean, Unit> clickOpenGift, @NotNull Function0<Unit> onTurnBlockingLoadingClick, @Nullable Composer composer, int i7, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        Composer composer2;
        int i14;
        int i15;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(clickOpenGift, "clickOpenGift");
        Intrinsics.checkNotNullParameter(onTurnBlockingLoadingClick, "onTurnBlockingLoadingClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2039245937);
        int i16 = i9 & 1;
        if (i16 != 0) {
            i10 = i7 | 6;
            modifier2 = modifier;
        } else if ((i7 & 14) == 0) {
            modifier2 = modifier;
            i10 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i7;
        } else {
            modifier2 = modifier;
            i10 = i7;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i7 & 112) == 0) {
            i10 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i7 & 896) == 0) {
            i10 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else {
            if ((i7 & 7168) == 0) {
                i10 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i9 & 16) == 0) {
                i10 |= CpioConstants.C_ISBLK;
            } else if ((i7 & 57344) == 0) {
                i10 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
            }
            i11 = i9 & 32;
            if (i11 == 0) {
                i10 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i7 & 458752) == 0) {
                i10 |= composerStartRestartGroup.changed(i3) ? 131072 : 65536;
            }
            i12 = i9 & 64;
            if (i12 == 0) {
                i10 |= 1572864;
            } else if ((i7 & 3670016) == 0) {
                i10 |= composerStartRestartGroup.changed(i4) ? 1048576 : 524288;
            }
            if ((i9 & 128) == 0) {
                i10 |= 12582912;
            } else {
                if ((i7 & 29360128) == 0) {
                    i10 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i9 & 256) != 0) {
                    i10 |= 100663296;
                } else {
                    if ((i7 & 234881024) == 0) {
                        i10 |= composerStartRestartGroup.changed(i5) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i9 & 512) != 0) {
                        if ((i7 & 1879048192) == 0) {
                            i10 |= composerStartRestartGroup.changed(i6) ? 536870912 : 268435456;
                        }
                        if ((i9 & 1024) != 0) {
                            i13 = i8 | 6;
                        } else if ((i8 & 14) == 0) {
                            i13 = i8 | (composerStartRestartGroup.changedInstance(clickOpenGift) ? 4 : 2);
                        } else {
                            i13 = i8;
                        }
                        if ((i9 & 2048) != 0) {
                            i13 |= 48;
                        } else if ((i8 & 112) == 0) {
                            i13 |= composerStartRestartGroup.changedInstance(onTurnBlockingLoadingClick) ? 32 : 16;
                        }
                        if ((1533916891 & i10) != 306783378 || (i13 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i16 == 0 ? Modifier.INSTANCE : modifier2;
                            z4 = false;
                            int i17 = i11 == 0 ? 0 : i3;
                            int i18 = i12 == 0 ? -1 : i4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2039245937, i10, i13, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGift (GiftsPurchaseGift.kt:63)");
                            }
                            if (i == 0 && z) {
                                z4 = true;
                            }
                            int i19 = i10 << 3;
                            int i20 = i13 << 3;
                            composer2 = composerStartRestartGroup;
                            GiftsPurchaseGiftContent(modifier4, z, i, z2, z4, i2, i17, i18, z3, i5, i6, clickOpenGift, onTurnBlockingLoadingClick, composer2, (i10 & 8190) | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128) | (i19 & 234881024) | (i19 & 1879048192), (i20 & 896) | ((i10 >> 27) & 14) | (i20 & 112), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i14 = i17;
                            i15 = i18;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i14 = i3;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            i15 = i4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt.GiftsPurchaseGift.1
                                public final /* synthetic */ int $$changed;
                                public final /* synthetic */ int $$changed1;
                                public final /* synthetic */ int $$default;
                                public final /* synthetic */ Function1<Boolean, Unit> $clickOpenGift;
                                public final /* synthetic */ int $idLegendaryPrize;
                                public final /* synthetic */ int $idStandardPrize;
                                public final /* synthetic */ boolean $isHideBlockWithValue;
                                public final /* synthetic */ boolean $isNeedOpenGift;
                                public final /* synthetic */ boolean $isStandardGift;
                                public final /* synthetic */ Function0<Unit> $onTurnBlockingLoadingClick;
                                public final /* synthetic */ int $price;
                                public final /* synthetic */ int $typeOfButton;
                                public final /* synthetic */ int $valueOfBC;
                                public final /* synthetic */ int $valueOfGifts;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                public C56251(boolean z5, int i21, boolean z22, int i22, int i142, int i152, boolean z32, int i52, int i62, Function1<? super Boolean, Unit> clickOpenGift2, Function0<Unit> onTurnBlockingLoadingClick2, int i72, int i82, int i92) {
                                    super(2);
                                    z = z5;
                                    i = i21;
                                    z = z22;
                                    i = i22;
                                    i = i142;
                                    i = i152;
                                    z = z32;
                                    i = i52;
                                    i = i62;
                                    function1 = clickOpenGift2;
                                    function0 = onTurnBlockingLoadingClick2;
                                    i = i72;
                                    i = i82;
                                    i = i92;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    GiftsPurchaseGiftKt.GiftsPurchaseGift(modifier, z, i, z, i, i, i, z, i, i, function1, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 |= 805306368;
                    if ((i92 & 1024) != 0) {
                    }
                    if ((i92 & 2048) != 0) {
                    }
                    if ((1533916891 & i10) != 306783378) {
                        if (i16 == 0) {
                        }
                        z4 = false;
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (i21 == 0) {
                            z4 = true;
                        }
                        int i192 = i10 << 3;
                        int i202 = i13 << 3;
                        composer2 = composerStartRestartGroup;
                        GiftsPurchaseGiftContent(modifier4, z5, i21, z22, z4, i22, i17, i18, z32, i52, i62, clickOpenGift2, onTurnBlockingLoadingClick2, composer2, (i10 & 8190) | (i192 & 458752) | (i192 & 3670016) | (i192 & 29360128) | (i192 & 234881024) | (i192 & 1879048192), (i202 & 896) | ((i10 >> 27) & 14) | (i202 & 112), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i142 = i17;
                        i152 = i18;
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i92 & 512) != 0) {
                }
                if ((i92 & 1024) != 0) {
                }
                if ((i92 & 2048) != 0) {
                }
                if ((1533916891 & i10) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i92 & 256) != 0) {
            }
            if ((i92 & 512) != 0) {
            }
            if ((i92 & 1024) != 0) {
            }
            if ((i92 & 2048) != 0) {
            }
            if ((1533916891 & i10) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i92 & 16) == 0) {
        }
        i11 = i92 & 32;
        if (i11 == 0) {
        }
        i12 = i92 & 64;
        if (i12 == 0) {
        }
        if ((i92 & 128) == 0) {
        }
        if ((i92 & 256) != 0) {
        }
        if ((i92 & 512) != 0) {
        }
        if ((i92 & 1024) != 0) {
        }
        if ((i92 & 2048) != 0) {
        }
        if ((1533916891 & i10) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GiftsPurchaseGiftContent(@Nullable Modifier modifier, final boolean z, final int i, boolean z2, boolean z3, final int i2, final int i3, final int i4, boolean z4, @DrawableRes int i5, @DrawableRes int i6, @NotNull final Function1<? super Boolean, Unit> clickOpenGift, @NotNull Function0<Unit> onTurnBlockingLoadingClick, @Nullable Composer composer, int i7, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        int i12;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z5;
        Object objRememberedValue2;
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
        boolean z6;
        Object objRememberedValue3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(clickOpenGift, "clickOpenGift");
        Intrinsics.checkNotNullParameter(onTurnBlockingLoadingClick, "onTurnBlockingLoadingClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1480880576);
        int i15 = i9 & 1;
        if (i15 != 0) {
            i10 = i7 | 6;
            modifier2 = modifier;
        } else if ((i7 & 14) == 0) {
            modifier2 = modifier;
            i10 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i7;
        } else {
            modifier2 = modifier;
            i10 = i7;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i7 & 112) == 0) {
            i10 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else {
            if ((i7 & 896) == 0) {
                i10 |= composerStartRestartGroup.changed(i) ? 256 : 128;
            }
            if ((i9 & 8) == 0) {
                i10 |= 3072;
            } else {
                if ((i7 & 7168) == 0) {
                    i10 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i9 & 16) != 0) {
                    i10 |= CpioConstants.C_ISBLK;
                } else if ((i7 & 57344) == 0) {
                    i10 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                if ((i9 & 32) != 0) {
                    i10 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i7 & 458752) == 0) {
                    i10 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
                }
                if ((i9 & 64) == 0) {
                    i14 = (i7 & 3670016) == 0 ? composerStartRestartGroup.changed(i3) ? 1048576 : 524288 : 1572864;
                    if ((i9 & 128) != 0) {
                        i13 = (29360128 & i7) == 0 ? composerStartRestartGroup.changed(i4) ? 8388608 : 4194304 : 12582912;
                        if ((i9 & 256) != 0) {
                            i10 |= 100663296;
                        } else {
                            if ((234881024 & i7) == 0) {
                                i10 |= composerStartRestartGroup.changed(z4) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            if ((i9 & 512) != 0) {
                                if ((1879048192 & i7) == 0) {
                                    i10 |= composerStartRestartGroup.changed(i5) ? 536870912 : 268435456;
                                }
                                if ((i9 & 1024) != 0) {
                                    i11 = i8 | 6;
                                } else if ((i8 & 14) == 0) {
                                    i11 = i8 | (composerStartRestartGroup.changed(i6) ? 4 : 2);
                                } else {
                                    i11 = i8;
                                }
                                if ((i9 & 2048) != 0) {
                                    i11 |= 48;
                                } else if ((i8 & 112) == 0) {
                                    i11 |= composerStartRestartGroup.changedInstance(clickOpenGift) ? 32 : 16;
                                }
                                int i16 = i11;
                                if ((i9 & 4096) != 0) {
                                    i16 |= 384;
                                } else if ((i8 & 896) == 0) {
                                    i16 |= composerStartRestartGroup.changedInstance(onTurnBlockingLoadingClick) ? 256 : 128;
                                }
                                i12 = i16;
                                if ((1533916891 & i10) != 306783378 || (i12 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                                    if (i15 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1480880576, i10, i12, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftContent (GiftsPurchaseGift.kt:97)");
                                    }
                                    float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._160sdp, composerStartRestartGroup, 6);
                                    float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._184sdp, composerStartRestartGroup, 6);
                                    float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100sdp, composerStartRestartGroup, 6);
                                    float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6);
                                    float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                                    final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6);
                                    float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
                                    final float fDimensionResource8 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
                                    final float fDimensionResource9 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
                                    final float fDimensionResource10 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6);
                                    float fDimensionResource11 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
                                    StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                                    int i17 = i10 >> 15;
                                    Modifier modifier3 = modifier2;
                                    int i18 = i10;
                                    AnnotatedString annotatedStringGiftsButtonText = stringResourceCompose.giftsButtonText(i2, i3, composerStartRestartGroup, (i17 & 14) | 384 | (i17 & 112), 0);
                                    Brush brushM11297verticalGradient8A3gB4$default = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                    final long jColorResource = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1608674994);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(modifier3, fDimensionResource);
                                    composerStartRestartGroup.startReplaceableGroup(-1608674706);
                                    int i19 = i12 & 112;
                                    int i20 = i18 & 29360128;
                                    int i21 = i18 & 3670016;
                                    int i22 = i18 & 112;
                                    z5 = (i19 != 32) | (i20 != 8388608) | (i21 != 1048576) | (i22 != 32);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!z5 || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                clickOpenGift.invoke(Boolean.valueOf(i4 <= i3 && !z));
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(modifierM8177width3ABfNKs, mutableInteractionSource, null, z4, null, null, (Function0) objRememberedValue2, 24, null);
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion4, 0.0f, 0.0f, 0.0f, fDimensionResource11, 7, null), fDimensionResource2);
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), brushM11297verticalGradient8A3gB4$default, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource6), 0.0f, 4, null), composerStartRestartGroup, 0);
                                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), fDimensionResource7);
                                    ColorResourceCompose colorResourceCompose = ColorResourceCompose.INSTANCE;
                                    int i23 = ((i18 >> 3) & 14) | 48;
                                    Modifier modifierBackground$default = BackgroundKt.background$default(modifierM8158height3ABfNKs2, colorResourceCompose.getGiftsPurchaseGiftTitleBgColor(z, composerStartRestartGroup, i23), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource6), 0.0f, 4, null);
                                    Alignment center = companion2.getCenter();
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBackground$default);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    AnnotatedString annotatedStringGiftsTitleIfStandard = stringResourceCompose.giftsTitleIfStandard(z, composerStartRestartGroup, i23);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    Offset.Companion companion5 = Offset.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(annotatedStringGiftsTitleIfStandard, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, companion5.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3), composerStartRestartGroup, 0, 0, 131070);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierBackground$default2 = BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), fDimensionResource5), colorResourceCompose.getGiftsPurchaseGiftBrushColor(z, composerStartRestartGroup, i23), null, 0.0f, 6, null);
                                    Alignment center2 = companion2.getCenter();
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierBackground$default2);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(!z ? i5 : i6, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize(companion4, 0.6f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    int i24 = i18 >> 9;
                                    ComposeExtensionKt.IfFalse(Boolean.valueOf(z2), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 907418505, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$2$1$3
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
                                        public final void invoke(@Nullable Composer composer3, int i25) {
                                            if ((i25 & 11) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(907418505, i25, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftContent.<anonymous>.<anonymous>.<anonymous> (GiftsPurchaseGift.kt:182)");
                                                }
                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                float f = fDimensionResource8;
                                                long j = jColorResource;
                                                float f2 = fDimensionResource6;
                                                float f3 = fDimensionResource10;
                                                float f4 = fDimensionResource9;
                                                int i26 = i;
                                                composer3.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 6);
                                                composer3.startReplaceableGroup(-1323940314);
                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor5);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion7.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                }
                                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                composer3.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                TextKt.m10025TextIbK3jfQ(StringResourceCompose.INSTANCE.giftsValueOfPurchaseGift(i26, composer3, 48), PaddingKt.m8124paddingVpY3zN4(BackgroundKt.m7770backgroundbw27NRU(PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, f, 7, null), j, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2)), f3, f4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14854montserratSemiBold16spOr13ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer3, MatroskaExtractor.ID_CONTENT_ENCODINGS, 1), composer3, 0, 0, 131068);
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
                                    }), composerStartRestartGroup, (i24 & 14) | 48);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion4, fDimensionResource3, fDimensionResource4);
                                    long jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY = colorResourceCompose.m14394getGiftsPurchaseGiftButtonBgColorXeAY9LY(z, composerStartRestartGroup, i23);
                                    String text = annotatedStringGiftsButtonText.getText();
                                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, companion5.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3);
                                    boolean z7 = !z3;
                                    composerStartRestartGroup.startReplaceableGroup(-1022130103);
                                    z6 = (i19 != 32) | ((i18 & 458752) != 131072) | (i20 != 8388608) | (i21 != 1048576) | (i22 != 32);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!z6 || objRememberedValue3 == companion.getEmpty()) {
                                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$2$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                clickOpenGift.invoke(Boolean.valueOf((i2 == 3 || i4 > i3 || z) ? false : true));
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(function0);
                                        objRememberedValue3 = function0;
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composer2 = composerStartRestartGroup;
                                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, text, textStyleM14791montserratBold12spOr9ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, z7, z3, false, onTurnBlockingLoadingClick, (Function0) objRememberedValue3, composer2, 0, 0, (i24 & 112) | ((i12 << 3) & 7168), 5241842);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    composer2 = composerStartRestartGroup;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt.GiftsPurchaseGiftContent.3
                                        public final /* synthetic */ int $$changed;
                                        public final /* synthetic */ int $$changed1;
                                        public final /* synthetic */ int $$default;
                                        public final /* synthetic */ Function1<Boolean, Unit> $clickOpenGift;
                                        public final /* synthetic */ int $idLegendaryPrize;
                                        public final /* synthetic */ int $idStandardPrize;
                                        public final /* synthetic */ boolean $isHideBlockWithValue;
                                        public final /* synthetic */ boolean $isNeedBlurButton;
                                        public final /* synthetic */ boolean $isNeedOpenGift;
                                        public final /* synthetic */ boolean $isStandardGift;
                                        public final /* synthetic */ Function0<Unit> $onTurnBlockingLoadingClick;
                                        public final /* synthetic */ int $price;
                                        public final /* synthetic */ int $typeOfButton;
                                        public final /* synthetic */ int $valueOfBC;
                                        public final /* synthetic */ int $valueOfGifts;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        public C56263(final boolean z8, final int i25, boolean z22, boolean z32, final int i26, final int i32, final int i42, boolean z42, int i52, int i62, final Function1<? super Boolean, Unit> clickOpenGift2, Function0<Unit> onTurnBlockingLoadingClick2, int i72, int i82, int i92) {
                                            super(2);
                                            z = z8;
                                            i = i25;
                                            z = z22;
                                            z = z32;
                                            i = i26;
                                            i = i32;
                                            i = i42;
                                            z = z42;
                                            i = i52;
                                            i = i62;
                                            function1 = clickOpenGift2;
                                            function0 = onTurnBlockingLoadingClick2;
                                            i = i72;
                                            i = i82;
                                            i = i92;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable Composer composer3, int i25) {
                                            GiftsPurchaseGiftKt.GiftsPurchaseGiftContent(modifier, z, i, z, z, i, i, i, z, i, i, function1, function0, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i10 |= 805306368;
                            if ((i92 & 1024) != 0) {
                            }
                            if ((i92 & 2048) != 0) {
                            }
                            int i162 = i11;
                            if ((i92 & 4096) != 0) {
                            }
                            i12 = i162;
                            if ((1533916891 & i10) != 306783378) {
                                if (i15 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                float fDimensionResource12 = PrimitiveResources_androidKt.dimensionResource(R.dimen._160sdp, composerStartRestartGroup, 6);
                                float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._184sdp, composerStartRestartGroup, 6);
                                float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._100sdp, composerStartRestartGroup, 6);
                                float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6);
                                float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._10sdp, composerStartRestartGroup, 6);
                                final float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composerStartRestartGroup, 6);
                                float fDimensionResource72 = PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6);
                                final float fDimensionResource82 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
                                final float fDimensionResource92 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
                                final float fDimensionResource102 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6);
                                float fDimensionResource112 = PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6);
                                StringResourceCompose stringResourceCompose2 = StringResourceCompose.INSTANCE;
                                int i172 = i10 >> 15;
                                Modifier modifier32 = modifier2;
                                int i182 = i10;
                                AnnotatedString annotatedStringGiftsButtonText2 = stringResourceCompose2.giftsButtonText(i26, i32, composerStartRestartGroup, (i172 & 14) | 384 | (i172 & 112), 0);
                                Brush brushM11297verticalGradient8A3gB4$default2 = Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                final long jColorResource2 = ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceableGroup(-1608674994);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                }
                                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierM8177width3ABfNKs2 = SizeKt.m8177width3ABfNKs(modifier32, fDimensionResource12);
                                composerStartRestartGroup.startReplaceableGroup(-1608674706);
                                int i192 = i12 & 112;
                                int i202 = i182 & 29360128;
                                int i212 = i182 & 3670016;
                                int i222 = i182 & 112;
                                z5 = (i192 != 32) | (i202 != 8388608) | (i212 != 1048576) | (i222 != 32);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z5) {
                                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            clickOpenGift2.invoke(Boolean.valueOf(i42 <= i32 && !z8));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Modifier modifierM7803clickableO2vRcR0$default2 = ClickableKt.m7803clickableO2vRcR0$default(modifierM8177width3ABfNKs2, mutableInteractionSource2, null, z42, null, null, (Function0) objRememberedValue2, 24, null);
                                    Alignment.Companion companion22 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
                                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default2);
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap5, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl.getInserting()) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        Modifier.Companion companion42 = Modifier.INSTANCE;
                                        Modifier modifierM8158height3ABfNKs3 = SizeKt.m8158height3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion42, 0.0f, 0.0f, 0.0f, fDimensionResource112, 7, null), fDimensionResource22);
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs3);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy4, companion32.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl2.getInserting()) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            BoxKt.Box(BackgroundKt.background$default(SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null), brushM11297verticalGradient8A3gB4$default2, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource62), 0.0f, 4, null), composerStartRestartGroup, 0);
                                            Modifier modifierM8158height3ABfNKs22 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), fDimensionResource72);
                                            ColorResourceCompose colorResourceCompose2 = ColorResourceCompose.INSTANCE;
                                            int i232 = ((i182 >> 3) & 14) | 48;
                                            Modifier modifierBackground$default3 = BackgroundKt.background$default(modifierM8158height3ABfNKs22, colorResourceCompose2.getGiftsPurchaseGiftTitleBgColor(z8, composerStartRestartGroup, i232), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource62), 0.0f, 4, null);
                                            Alignment center3 = companion22.getCenter();
                                            composerStartRestartGroup.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierBackground$default3);
                                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                            if (!composerM10870constructorimpl3.getInserting()) {
                                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                AnnotatedString annotatedStringGiftsTitleIfStandard2 = stringResourceCompose2.giftsTitleIfStandard(z8, composerStartRestartGroup, i232);
                                                TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                                Offset.Companion companion52 = Offset.INSTANCE;
                                                TextKt.m10025TextIbK3jfQ(annotatedStringGiftsTitleIfStandard2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14792montserratBold13spOr10ssp67j0QOw(0L, 0, companion52.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3), composerStartRestartGroup, 0, 0, 131070);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                Modifier modifierBackground$default22 = BackgroundKt.background$default(PaddingKt.m8123padding3ABfNKs(SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null), fDimensionResource52), colorResourceCompose2.getGiftsPurchaseGiftBrushColor(z8, composerStartRestartGroup, i232), null, 0.0f, 6, null);
                                                Alignment center22 = companion22.getCenter();
                                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy32 = BoxKt.rememberBoxMeasurePolicy(center22, false, composerStartRestartGroup, 6);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Function0<ComposeUiNode> constructor42 = companion32.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf42 = LayoutKt.modifierMaterializerOf(modifierBackground$default22);
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy32, companion32.getSetMeasurePolicy());
                                                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap42, companion32.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash4 = companion32.getSetCompositeKeyHash();
                                                if (!composerM10870constructorimpl4.getInserting()) {
                                                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    function3ModifierMaterializerOf42.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                    ImageKt.Image(PainterResources_androidKt.painterResource(!z8 ? i52 : i62, composerStartRestartGroup, 0), (String) null, SizeKt.fillMaxSize(companion42, 0.6f), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    int i242 = i182 >> 9;
                                                    ComposeExtensionKt.IfFalse(Boolean.valueOf(z22), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 907418505, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$2$1$3
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
                                                        public final void invoke(@Nullable Composer composer3, int i25) {
                                                            if ((i25 & 11) != 2 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(907418505, i25, -1, "com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftContent.<anonymous>.<anonymous>.<anonymous> (GiftsPurchaseGift.kt:182)");
                                                                }
                                                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                                                Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
                                                                float f = fDimensionResource82;
                                                                long j = jColorResource2;
                                                                float f2 = fDimensionResource62;
                                                                float f3 = fDimensionResource102;
                                                                float f4 = fDimensionResource92;
                                                                int i26 = i25;
                                                                composer3.startReplaceableGroup(733328855);
                                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy42 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer3, 6);
                                                                composer3.startReplaceableGroup(-1323940314);
                                                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                CompositionLocalMap currentCompositionLocalMap52 = composer3.getCurrentCompositionLocalMap();
                                                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                                                Function0<ComposeUiNode> constructor52 = companion7.getConstructor();
                                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf52 = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
                                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                                    ComposablesKt.invalidApplier();
                                                                }
                                                                composer3.startReusableNode();
                                                                if (composer3.getInserting()) {
                                                                    composer3.createNode(constructor52);
                                                                } else {
                                                                    composer3.useNode();
                                                                }
                                                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy42, companion7.getSetMeasurePolicy());
                                                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap52, companion7.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                                }
                                                                function3ModifierMaterializerOf52.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                                composer3.startReplaceableGroup(2058660585);
                                                                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                                TextKt.m10025TextIbK3jfQ(StringResourceCompose.INSTANCE.giftsValueOfPurchaseGift(i26, composer3, 48), PaddingKt.m8124paddingVpY3zN4(BackgroundKt.m7770backgroundbw27NRU(PaddingKt.m8127paddingqDBjuR0$default(companion6, 0.0f, 0.0f, 0.0f, f, 7, null), j, RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f2)), f3, f4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TypographyStyle.INSTANCE.m14854montserratSemiBold16spOr13ssp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer3, MatroskaExtractor.ID_CONTENT_ENCODINGS, 1), composer3, 0, 0, 131068);
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
                                                    }), composerStartRestartGroup, (i242 & 14) | 48);
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    composerStartRestartGroup.endReplaceableGroup();
                                                    Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(companion42, fDimensionResource32, fDimensionResource42);
                                                    long jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY2 = colorResourceCompose2.m14394getGiftsPurchaseGiftButtonBgColorXeAY9LY(z8, composerStartRestartGroup, i232);
                                                    String text2 = annotatedStringGiftsButtonText2.getText();
                                                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw2 = typographyStyle2.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, companion52.m11115getZeroF1C5BW0(), 0.0f, composerStartRestartGroup, MatroskaExtractor.ID_CONTENT_ENCODINGS, 3);
                                                    boolean z72 = !z32;
                                                    composerStartRestartGroup.startReplaceableGroup(-1022130103);
                                                    z6 = (i192 != 32) | ((i182 & 458752) != 131072) | (i202 != 8388608) | (i212 != 1048576) | (i222 != 32);
                                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                    if (!z6) {
                                                        Function0<Unit> function02 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$GiftsPurchaseGiftContent$2$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                                clickOpenGift2.invoke(Boolean.valueOf((i26 == 3 || i42 > i32 || z8) ? false : true));
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(function02);
                                                        objRememberedValue3 = function02;
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composer2 = composerStartRestartGroup;
                                                        MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, text2, textStyleM14791montserratBold12spOr9ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, jM14394getGiftsPurchaseGiftButtonBgColorXeAY9LY2, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, z72, z32, false, onTurnBlockingLoadingClick2, (Function0) objRememberedValue3, composer2, 0, 0, (i242 & 112) | ((i12 << 3) & 7168), 5241842);
                                                        composer2.endReplaceableGroup();
                                                        composer2.endNode();
                                                        composer2.endReplaceableGroup();
                                                        composer2.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        modifier2 = modifier32;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i92 & 512) != 0) {
                        }
                        if ((i92 & 1024) != 0) {
                        }
                        if ((i92 & 2048) != 0) {
                        }
                        int i1622 = i11;
                        if ((i92 & 4096) != 0) {
                        }
                        i12 = i1622;
                        if ((1533916891 & i10) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 |= i13;
                    if ((i92 & 256) != 0) {
                    }
                    if ((i92 & 512) != 0) {
                    }
                    if ((i92 & 1024) != 0) {
                    }
                    if ((i92 & 2048) != 0) {
                    }
                    int i16222 = i11;
                    if ((i92 & 4096) != 0) {
                    }
                    i12 = i16222;
                    if ((1533916891 & i10) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 |= i14;
                if ((i92 & 128) != 0) {
                }
                i10 |= i13;
                if ((i92 & 256) != 0) {
                }
                if ((i92 & 512) != 0) {
                }
                if ((i92 & 1024) != 0) {
                }
                if ((i92 & 2048) != 0) {
                }
                int i162222 = i11;
                if ((i92 & 4096) != 0) {
                }
                i12 = i162222;
                if ((1533916891 & i10) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i92 & 16) != 0) {
            }
            if ((i92 & 32) != 0) {
            }
            if ((i92 & 64) == 0) {
            }
            i10 |= i14;
            if ((i92 & 128) != 0) {
            }
            i10 |= i13;
            if ((i92 & 256) != 0) {
            }
            if ((i92 & 512) != 0) {
            }
            if ((i92 & 1024) != 0) {
            }
            if ((i92 & 2048) != 0) {
            }
            int i1622222 = i11;
            if ((i92 & 4096) != 0) {
            }
            i12 = i1622222;
            if ((1533916891 & i10) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i92 & 8) == 0) {
        }
        if ((i92 & 16) != 0) {
        }
        if ((i92 & 32) != 0) {
        }
        if ((i92 & 64) == 0) {
        }
        i10 |= i14;
        if ((i92 & 128) != 0) {
        }
        i10 |= i13;
        if ((i92 & 256) != 0) {
        }
        if ((i92 & 512) != 0) {
        }
        if ((i92 & 1024) != 0) {
        }
        if ((i92 & 2048) != 0) {
        }
        int i16222222 = i11;
        if ((i92 & 4096) != 0) {
        }
        i12 = i16222222;
        if ((1533916891 & i10) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: GiftsPurchaseGift.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$PreviewGiftsPurchaseGift$1 */
    /* loaded from: classes.dex */
    public static final class C56271 extends Lambda implements Function1<Boolean, Unit> {
        public static final C56271 INSTANCE = ;

        public final void invoke(boolean z) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GiftsPurchaseGift.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt$PreviewGiftsPurchaseGift$2 */
    /* loaded from: classes.dex */
    public static final class C56282 extends Lambda implements Function0<Unit> {
        public static final C56282 INSTANCE = ;

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
    @Preview(apiLevel = 33, device = "spec:id=reference_phone,shape=Normal,width=844,height=390,unit=dp,dpi=420")
    public static final void PreviewGiftsPurchaseGift(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1375906375);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375906375, i, -1, "com.blackhub.bronline.game.ui.gifts.PreviewGiftsPurchaseGift (GiftsPurchaseGift.kt:234)");
            }
            GiftsPurchaseGiftContent(null, true, 1000, false, true, 2, CasesReceivingSuperRewardUiKt.DELAY_REWARD_FIRST_STEP, 1000, false, R.drawable.ic_legendary_gift, R.drawable.ic_legendary_gift, C56271.INSTANCE, C56282.INSTANCE, composerStartRestartGroup, 920350128, 438, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.gifts.GiftsPurchaseGiftKt.PreviewGiftsPurchaseGift.3
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C56293(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    GiftsPurchaseGiftKt.PreviewGiftsPurchaseGift(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
