package com.blackhub.bronline.game.p019ui.halloweenaward;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.AnnotatedStringKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.p019ui.widget.block.TwoColorVerticalBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PurchaseOfferAwardWithBPBlock.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0002\u001aM\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m7105d2 = {"PreviewPurchaseOfferAwardWithBPBlock", "", "(Landroidx/compose/runtime/Composer;I)V", "PurchaseOfferAwardWithBPBlock", "modifier", "Landroidx/compose/ui/Modifier;", "textMoney", "", "textBP", "textXP", "isHasBP", "", "onBuyClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPurchaseOfferAwardWithBPBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseOfferAwardWithBPBlock.kt\ncom/blackhub/bronline/game/ui/halloweenaward/PurchaseOfferAwardWithBPBlockKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,265:1\n68#2,6:266\n74#2:300\n78#2:305\n79#3,11:272\n92#3:304\n456#4,8:283\n464#4,3:297\n467#4,3:301\n3737#5,6:291\n*S KotlinDebug\n*F\n+ 1 PurchaseOfferAwardWithBPBlock.kt\ncom/blackhub/bronline/game/ui/halloweenaward/PurchaseOfferAwardWithBPBlockKt\n*L\n96#1:266,6\n96#1:300\n96#1:305\n96#1:272,11\n96#1:304\n96#1:283,8\n96#1:297,3\n96#1:301,3\n96#1:291,6\n*E\n"})
/* loaded from: classes3.dex */
public final class PurchaseOfferAwardWithBPBlockKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PurchaseOfferAwardWithBPBlock(@Nullable Modifier modifier, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @NotNull final Function0<Unit> onBuyClick, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        int i4;
        String strEmpty;
        String strEmpty2;
        String strEmpty3;
        Modifier modifier3;
        String str7;
        String str8;
        String str9;
        boolean z3;
        Brush brushM11289horizontalGradient8A3gB4$default;
        final Painter painterPainterResource;
        Brush brushM11293radialGradientP_VxKs$default;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier4;
        final String str10;
        final String str11;
        final String str12;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBuyClick, "onBuyClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1375499134);
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
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                str4 = str;
                int i6 = composerStartRestartGroup.changed(str4) ? 32 : 16;
                i3 |= i6;
            } else {
                str4 = str;
            }
            i3 |= i6;
        } else {
            str4 = str;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                str5 = str2;
                int i7 = composerStartRestartGroup.changed(str5) ? 256 : 128;
                i3 |= i7;
            } else {
                str5 = str2;
            }
            i3 |= i7;
        } else {
            str5 = str2;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                str6 = str3;
                int i8 = composerStartRestartGroup.changed(str6) ? 2048 : 1024;
                i3 |= i8;
            } else {
                str6 = str3;
            }
            i3 |= i8;
        } else {
            str6 = str3;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= CpioConstants.C_ISBLK;
        } else {
            if ((57344 & i) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((458752 & i) == 0) {
                    i4 = composerStartRestartGroup.changedInstance(onBuyClick) ? 131072 : 65536;
                }
                if ((374491 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) == 0) {
                            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                            i3 &= -113;
                        } else {
                            strEmpty = str4;
                        }
                        if ((i2 & 4) == 0) {
                            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                            i3 &= -897;
                        } else {
                            strEmpty2 = str5;
                        }
                        if ((i2 & 8) == 0) {
                            strEmpty3 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                            i3 &= -7169;
                        } else {
                            strEmpty3 = str6;
                        }
                        modifier3 = modifier5;
                        str7 = strEmpty;
                        str8 = strEmpty2;
                        str9 = strEmpty3;
                        z3 = i9 == 0 ? false : z2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        str7 = str4;
                        str8 = str5;
                        str9 = str6;
                        z3 = z2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1375499134, i3, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlock (PurchaseOfferAwardWithBPBlock.kt:46)");
                    }
                    float fM14409dpToPx8Feqmps = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._50sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                    if (!z3) {
                        composerStartRestartGroup.startReplaceableGroup(976373135);
                        brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(976373333);
                        brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    Brush brush = brushM11289horizontalGradient8A3gB4$default;
                    if (!z3) {
                        composerStartRestartGroup.startReplaceableGroup(976373558);
                        painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_lock_open, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(976373625);
                        painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_lock_close, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    if (!z3) {
                        composerStartRestartGroup.startReplaceableGroup(976373730);
                        brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0L, fM14409dpToPx8Feqmps, 0, 10, (Object) null);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(976373953);
                        brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.red, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0L, fM14409dpToPx8Feqmps, 0, 10, (Object) null);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    final Brush brush2 = brushM11293radialGradientP_VxKs$default;
                    if (!z3) {
                        composerStartRestartGroup.startReplaceableGroup(976374198);
                        strStringResource = StringResources_androidKt.stringResource(R.string.common_received, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(976374265);
                        strStringResource = StringResources_androidKt.stringResource(R.string.common_buy, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    final String str13 = strStringResource;
                    Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._221sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._117sdp, composerStartRestartGroup, 6));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8174sizeVpY3zN4);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Painter painterPainterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composerStartRestartGroup, 6);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ImageKt.Image(painterPainterResource2, (String) null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.1f, (ColorFilter) null, composerStartRestartGroup, 221624, 72);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455964922, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt$PurchaseOfferAwardWithBPBlock$1$1
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
                        public final void invoke(@Nullable Composer composer3, int i10) {
                            if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1455964922, i10, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlock.<anonymous>.<anonymous> (PurchaseOfferAwardWithBPBlock.kt:118)");
                                }
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Painter painter = painterPainterResource;
                                composer3.startReplaceableGroup(693286680);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_with_bp, composer3, 6), IntrinsicKt.width(companion3, IntrinsicSize.Max), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14813montserratBoldItalic14spOr11ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 48, 0, 65532);
                                ImageKt.Image(painter, (String) null, PaddingKt.m8123padding3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
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
                    });
                    final String str14 = str7;
                    final String str15 = str8;
                    final String str16 = str9;
                    final boolean z5 = z3;
                    Modifier modifier6 = modifier3;
                    composer2 = composerStartRestartGroup;
                    TwoColorVerticalBlockKt.TwoColorVerticalBlock(modifierFillMaxSize$default, brush, brushM11289horizontalGradient8A3gB4$default2, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1041551911, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt$PurchaseOfferAwardWithBPBlock$1$2
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
                        public final void invoke(@Nullable Composer composer3, int i10) {
                            Function0<Unit> function0;
                            String str17;
                            Brush brush3;
                            boolean z6;
                            String str18;
                            Modifier.Companion companion3;
                            String str19;
                            int i11;
                            int i12;
                            Composer composer4;
                            Modifier.Companion companion4;
                            Composer composer5 = composer3;
                            if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1041551911, i10, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlock.<anonymous>.<anonymous> (PurchaseOfferAwardWithBPBlock.kt:136)");
                                }
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                                String str20 = str14;
                                String str21 = str15;
                                String str22 = str16;
                                boolean z7 = z5;
                                String str23 = str13;
                                Brush brush4 = brush2;
                                Function0<Unit> function02 = onBuyClick;
                                composer5.startReplaceableGroup(693286680);
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion6.getTop(), composer5, 6);
                                composer5.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer5.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical spaceEvenly2 = arrangement.getSpaceEvenly();
                                Alignment.Horizontal start = companion6.getStart();
                                composer5.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly2, start, composer5, 54);
                                composer5.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer5.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                composer5.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer5.startReplaceableGroup(-110015621);
                                if (str20.length() > 0) {
                                    Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                    Alignment.Vertical centerVertically = companion6.getCenterVertically();
                                    composer5.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceAround, centerVertically, composer5, 54);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion5);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    function0 = function02;
                                    str17 = str23;
                                    brush3 = brush4;
                                    z6 = z7;
                                    str18 = str22;
                                    str19 = str21;
                                    TextKt.m10024Text4IGK_g(str20, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                    composer5 = composer3;
                                    i11 = 6;
                                    companion3 = companion5;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer5, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer5, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer5, 6), 0.0f, 10, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ruble, composer5, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                } else {
                                    function0 = function02;
                                    str17 = str23;
                                    brush3 = brush4;
                                    z6 = z7;
                                    str18 = str22;
                                    companion3 = companion5;
                                    str19 = str21;
                                    i11 = 6;
                                }
                                composer3.endReplaceableGroup();
                                composer5.startReplaceableGroup(-110013943);
                                if (str19.length() > 0) {
                                    Arrangement.HorizontalOrVertical spaceAround2 = arrangement.getSpaceAround();
                                    Alignment.Vertical centerVertically2 = companion6.getCenterVertically();
                                    composer5.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceAround2, centerVertically2, composer5, 54);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion3);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor5);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    TextKt.m10024Text4IGK_g(str19, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                    composer5 = composer3;
                                    i11 = 6;
                                    companion3 = companion3;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer5, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer5, 6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bp_plus, composer5, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._29sdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                }
                                composer3.endReplaceableGroup();
                                composer5.startReplaceableGroup(1690924996);
                                if (str18.length() > 0) {
                                    Arrangement.HorizontalOrVertical spaceAround3 = arrangement.getSpaceAround();
                                    Alignment.Vertical centerVertically3 = companion6.getCenterVertically();
                                    composer5.startReplaceableGroup(693286680);
                                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceAround3, centerVertically3, composer5, 54);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion3);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor6);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy4, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                        composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                        composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                    }
                                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    TextKt.m10024Text4IGK_g(str18, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                    composer4 = composer3;
                                    i12 = 6;
                                    companion4 = companion3;
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer4, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_xp, composer4, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer4, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                } else {
                                    i12 = i11;
                                    composer4 = composer5;
                                    companion4 = companion3;
                                }
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical spaceEvenly3 = arrangement.getSpaceEvenly();
                                Alignment.Horizontal centerHorizontally = companion6.getCenterHorizontally();
                                composer4.startReplaceableGroup(-483455358);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceEvenly3, centerHorizontally, composer4, 54);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor7 = companion7.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default2);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor7);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion7.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                }
                                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                AnnotatedString upperCase$default = AnnotatedStringKt.toUpperCase$default(StringResourceCompose.INSTANCE.getPurchaseOfferRewardWithBPLuck(composer4, i12), null, 1, null);
                                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                int i13 = i12;
                                Composer composer6 = composer4;
                                TextKt.m10025TextIbK3jfQ(upperCase$default, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14786montserratBlack12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 131070);
                                Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._86sdp, composer6, i13), PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer6, i13));
                                TextStyle textStyleM14809montserratBold9spOr7ssp67j0QOw = typographyStyle.m14809montserratBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15);
                                boolean z8 = !z6;
                                composer6.startReplaceableGroup(-110009942);
                                final Function0<Unit> function03 = function0;
                                boolean zChanged = composer6.changed(function03);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt$PurchaseOfferAwardWithBPBlock$1$2$1$2$1$1
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
                                            function03.invoke();
                                        }
                                    };
                                    composer6.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, str17, textStyleM14809montserratBold9spOr7ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brush3, null, null, 0.0f, 0.0f, false, false, null, z8, false, false, null, (Function0) objRememberedValue, composer3, 0, 0, 0, 15724530);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
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
                    }), composerStartRestartGroup, 27654, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier6;
                    str10 = str7;
                    str11 = str8;
                    str12 = str9;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    str10 = str4;
                    str11 = str5;
                    str12 = str6;
                    composer2 = composerStartRestartGroup;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt.PurchaseOfferAwardWithBPBlock.2
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
                            PurchaseOfferAwardWithBPBlockKt.PurchaseOfferAwardWithBPBlock(modifier4, str10, str11, str12, z4, onBuyClick, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i4 = ProfileVerifier.CompilationStatus.f342xf2722a21;
            i3 |= i4;
            if ((374491 & i3) != 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 2) == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    modifier3 = modifier5;
                    str7 = strEmpty;
                    str8 = strEmpty2;
                    str9 = strEmpty3;
                    if (i9 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    float fM14409dpToPx8Feqmps2 = ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._50sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
                    if (!z3) {
                    }
                    Brush brush3 = brushM11289horizontalGradient8A3gB4$default;
                    if (!z3) {
                    }
                    if (!z3) {
                    }
                    final Brush brush22 = brushM11293radialGradientP_VxKs$default;
                    if (!z3) {
                    }
                    final String str132 = strStringResource;
                    Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen._221sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._117sdp, composerStartRestartGroup, 6));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8174sizeVpY3zN42);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (!composerM10870constructorimpl.getInserting()) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Painter painterPainterResource22 = PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composerStartRestartGroup, 6);
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        ImageKt.Image(painterPainterResource22, (String) null, SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.1f, (ColorFilter) null, composerStartRestartGroup, 221624, 72);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                        Brush brushM11289horizontalGradient8A3gB4$default22 = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1455964922, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt$PurchaseOfferAwardWithBPBlock$1$1
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
                            public final void invoke(@Nullable Composer composer3, int i10) {
                                if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1455964922, i10, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlock.<anonymous>.<anonymous> (PurchaseOfferAwardWithBPBlock.kt:118)");
                                    }
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Painter painter = painterPainterResource;
                                    composer3.startReplaceableGroup(693286680);
                                    Modifier.Companion companion32 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                    composer3.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion32);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor22);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_with_bp, composer3, 6), IntrinsicKt.width(companion32, IntrinsicSize.Max), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14813montserratBoldItalic14spOr11ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 48, 0, 65532);
                                    ImageKt.Image(painter, (String) null, PaddingKt.m8123padding3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer3, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
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
                        });
                        final String str142 = str7;
                        final String str152 = str8;
                        final String str162 = str9;
                        final boolean z52 = z3;
                        Modifier modifier62 = modifier3;
                        composer2 = composerStartRestartGroup;
                        TwoColorVerticalBlockKt.TwoColorVerticalBlock(modifierFillMaxSize$default2, brush3, brushM11289horizontalGradient8A3gB4$default22, composableLambda2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1041551911, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt$PurchaseOfferAwardWithBPBlock$1$2
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
                            public final void invoke(@Nullable Composer composer3, int i10) {
                                Function0<Unit> function0;
                                String str17;
                                Brush brush32;
                                boolean z6;
                                String str18;
                                Modifier.Companion companion32;
                                String str19;
                                int i11;
                                int i12;
                                Composer composer4;
                                Modifier.Companion companion4;
                                Composer composer5 = composer3;
                                if ((i10 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1041551911, i10, -1, "com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlock.<anonymous>.<anonymous> (PurchaseOfferAwardWithBPBlock.kt:136)");
                                    }
                                    Modifier.Companion companion5 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                                    String str20 = str142;
                                    String str21 = str152;
                                    String str22 = str162;
                                    boolean z7 = z52;
                                    String str23 = str132;
                                    Brush brush4 = brush22;
                                    Function0<Unit> function02 = onBuyClick;
                                    composer5.startReplaceableGroup(693286680);
                                    Alignment.Companion companion6 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion6.getTop(), composer5, 6);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor22 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor22);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion5, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical spaceEvenly2 = arrangement.getSpaceEvenly();
                                    Alignment.Horizontal start = companion6.getStart();
                                    composer5.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceEvenly2, start, composer5, 54);
                                    composer5.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyColumnMeasurePolicy, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(-110015621);
                                    if (str20.length() > 0) {
                                        Arrangement.HorizontalOrVertical spaceAround = arrangement.getSpaceAround();
                                        Alignment.Vertical centerVertically = companion6.getCenterVertically();
                                        composer5.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceAround, centerVertically, composer5, 54);
                                        composer5.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion5);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer5.createNode(constructor4);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRowMeasurePolicy2, companion7.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                            composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        function0 = function02;
                                        str17 = str23;
                                        brush32 = brush4;
                                        z6 = z7;
                                        str18 = str22;
                                        str19 = str21;
                                        TextKt.m10024Text4IGK_g(str20, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                        composer5 = composer3;
                                        i11 = 6;
                                        companion32 = companion5;
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer5, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer5, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composer5, 6), 0.0f, 10, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_ruble, composer5, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    } else {
                                        function0 = function02;
                                        str17 = str23;
                                        brush32 = brush4;
                                        z6 = z7;
                                        str18 = str22;
                                        companion32 = companion5;
                                        str19 = str21;
                                        i11 = 6;
                                    }
                                    composer3.endReplaceableGroup();
                                    composer5.startReplaceableGroup(-110013943);
                                    if (str19.length() > 0) {
                                        Arrangement.HorizontalOrVertical spaceAround2 = arrangement.getSpaceAround();
                                        Alignment.Vertical centerVertically2 = companion6.getCenterVertically();
                                        composer5.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceAround2, centerVertically2, composer5, 54);
                                        composer5.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion32);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer5.createNode(constructor5);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy3, companion7.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                            composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                            composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                        }
                                        function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        TextKt.m10024Text4IGK_g(str19, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                        composer5 = composer3;
                                        i11 = 6;
                                        companion32 = companion32;
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer5, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer5, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer5, 6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bp_plus, composer5, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._29sdp, composer5, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer5, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    }
                                    composer3.endReplaceableGroup();
                                    composer5.startReplaceableGroup(1690924996);
                                    if (str18.length() > 0) {
                                        Arrangement.HorizontalOrVertical spaceAround3 = arrangement.getSpaceAround();
                                        Alignment.Vertical centerVertically3 = companion6.getCenterVertically();
                                        composer5.startReplaceableGroup(693286680);
                                        MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceAround3, centerVertically3, composer5, 54);
                                        composer5.startReplaceableGroup(-1323940314);
                                        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor6 = companion7.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion32);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer5.createNode(constructor6);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composer3);
                                        Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy4, companion7.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion7.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion7.getSetCompositeKeyHash();
                                        if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                            composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                            composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                                        }
                                        function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        TextKt.m10024Text4IGK_g(str18, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14814montserratBoldItalic18spOr14ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 65534);
                                        composer4 = composer3;
                                        i12 = 6;
                                        companion4 = companion32;
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_x_gray, composer4, 6), (String) null, PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8172size3ABfNKs(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composer4, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composer4, 6), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_xp, composer4, 6), (String) null, SizeKt.m8174sizeVpY3zN4(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composer4, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._11sdp, composer4, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 56, 120);
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                    } else {
                                        i12 = i11;
                                        composer4 = composer5;
                                        companion4 = companion32;
                                    }
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(companion4, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical spaceEvenly3 = arrangement.getSpaceEvenly();
                                    Alignment.Horizontal centerHorizontally = companion6.getCenterHorizontally();
                                    composer4.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceEvenly3, centerHorizontally, composer4, 54);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap7 = composer3.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor7 = companion7.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor7);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composer3);
                                    Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyColumnMeasurePolicy2, companion7.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion7.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion7.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                                        composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                                        composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                                    }
                                    function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    AnnotatedString upperCase$default = AnnotatedStringKt.toUpperCase$default(StringResourceCompose.INSTANCE.getPurchaseOfferRewardWithBPLuck(composer4, i12), null, 1, null);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    int i13 = i12;
                                    Composer composer6 = composer4;
                                    TextKt.m10025TextIbK3jfQ(upperCase$default, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14786montserratBlack12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15), composer3, 0, 0, 131070);
                                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(companion4, PrimitiveResources_androidKt.dimensionResource(R.dimen._86sdp, composer6, i13), PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer6, i13));
                                    TextStyle textStyleM14809montserratBold9spOr7ssp67j0QOw = typographyStyle.m14809montserratBold9spOr7ssp67j0QOw(0L, 0, 0L, 0.0f, composer3, CpioConstants.C_ISBLK, 15);
                                    boolean z8 = !z6;
                                    composer6.startReplaceableGroup(-110009942);
                                    final Function0<Unit> function03 = function0;
                                    boolean zChanged = composer6.changed(function03);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt$PurchaseOfferAwardWithBPBlock$1$2$1$2$1$1
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
                                                function03.invoke();
                                            }
                                        };
                                        composer6.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceableGroup();
                                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN4, null, str17, textStyleM14809montserratBold9spOr7ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, brush32, null, null, 0.0f, 0.0f, false, false, null, z8, false, false, null, (Function0) objRememberedValue, composer3, 0, 0, 0, 15724530);
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
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
                        }), composerStartRestartGroup, 27654, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier62;
                        str10 = str7;
                        str11 = str8;
                        str12 = str9;
                        z4 = z3;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        if ((374491 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void PreviewPurchaseOfferAwardWithBPBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(27291998);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(27291998, i, -1, "com.blackhub.bronline.game.ui.halloweenaward.PreviewPurchaseOfferAwardWithBPBlock (PurchaseOfferAwardWithBPBlock.kt:257)");
            }
            PurchaseOfferAwardWithBPBlock(null, "10 000", "100", "3", false, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt.PreviewPurchaseOfferAwardWithBPBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 200112, 17);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.halloweenaward.PurchaseOfferAwardWithBPBlockKt.PreviewPurchaseOfferAwardWithBPBlock.2
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
                    PurchaseOfferAwardWithBPBlockKt.PreviewPurchaseOfferAwardWithBPBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
