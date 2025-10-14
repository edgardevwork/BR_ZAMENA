package com.blackhub.bronline.game.p019ui.upgradeobjectevent;

import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.StrokeJoin;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import java.util.Locale;
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
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventLevelPrizesItem.kt */
@SourceDebugExtension({"SMAP\nUpgradeObjectEventLevelPrizesItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeObjectEventLevelPrizesItem.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventLevelPrizesItemKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,226:1\n74#2,6:227\n80#2:261\n73#2,7:343\n80#2:378\n84#2:383\n84#2:388\n79#3,11:233\n79#3,11:269\n79#3,11:304\n92#3:336\n92#3:341\n79#3,11:350\n92#3:382\n92#3:387\n456#4,8:244\n464#4,3:258\n456#4,8:280\n464#4,3:294\n456#4,8:315\n464#4,3:329\n467#4,3:333\n467#4,3:338\n456#4,8:361\n464#4,3:375\n467#4,3:379\n467#4,3:384\n3737#5,6:252\n3737#5,6:288\n3737#5,6:323\n3737#5,6:369\n67#6,7:262\n74#6:297\n68#6,6:298\n74#6:332\n78#6:337\n78#6:342\n*S KotlinDebug\n*F\n+ 1 UpgradeObjectEventLevelPrizesItem.kt\ncom/blackhub/bronline/game/ui/upgradeobjectevent/UpgradeObjectEventLevelPrizesItemKt\n*L\n78#1:227,6\n78#1:261\n170#1:343,7\n170#1:378\n170#1:383\n78#1:388\n78#1:233,11\n84#1:269,11\n85#1:304,11\n85#1:336\n84#1:341\n170#1:350,11\n170#1:382\n78#1:387\n78#1:244,8\n78#1:258,3\n84#1:280,8\n84#1:294,3\n85#1:315,8\n85#1:329,3\n85#1:333,3\n84#1:338,3\n170#1:361,8\n170#1:375,3\n170#1:379,3\n78#1:384,3\n78#1:252,6\n84#1:288,6\n85#1:323,6\n170#1:369,6\n84#1:262,7\n84#1:297\n85#1:298,6\n85#1:332\n85#1:337\n84#1:342\n*E\n"})
/* loaded from: classes3.dex */
public final class UpgradeObjectEventLevelPrizesItemKt {
    public static final float BUTTON_BLOCK_WIDTH = 0.8f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpgradeObjectEventLevelPrizesItem(@Nullable Modifier modifier, int i, boolean z, boolean z2, int i2, int i3, float f, @StringRes final int i4, @Nullable String str, @Nullable Composer composer, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        Modifier modifier2;
        boolean z5;
        int i15;
        int i16;
        float f2;
        int i17;
        String strEmpty;
        AnnotatedString annotatedStringChTreeValueOfEnergy;
        Shape shapeM8394RoundedCornerShapea9UjIt4$default;
        int currentCompositeKeyHash;
        int i18;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM10870constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final int i19;
        final float f3;
        final String str2;
        final boolean z6;
        final boolean z7;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        Composer composerStartRestartGroup = composer.startRestartGroup(1709095573);
        int i21 = i6 & 1;
        if (i21 != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i22 = i6 & 2;
        if (i22 != 0) {
            i7 |= 48;
        } else {
            if ((i5 & 112) == 0) {
                i8 = i;
                i7 |= composerStartRestartGroup.changed(i8) ? 32 : 16;
            }
            i9 = i6 & 4;
            if (i9 == 0) {
                i7 |= 384;
            } else {
                if ((i5 & 896) == 0) {
                    z3 = z;
                    i7 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i10 = i6 & 8;
                if (i10 != 0) {
                    i7 |= 3072;
                } else {
                    if ((i5 & 7168) == 0) {
                        z4 = z2;
                        i7 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i11 = i6 & 16;
                    if (i11 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((57344 & i5) == 0) {
                            i12 = i2;
                            i7 |= composerStartRestartGroup.changed(i12) ? 16384 : 8192;
                        }
                        i13 = i6 & 32;
                        if (i13 != 0) {
                            i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i5 & 458752) == 0) {
                            i7 |= composerStartRestartGroup.changed(i3) ? 131072 : 65536;
                        }
                        i14 = i6 & 64;
                        if (i14 != 0) {
                            i7 |= 1572864;
                        } else if ((i5 & 3670016) == 0) {
                            i7 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i6 & 128) == 0) {
                            i20 = (29360128 & i5) == 0 ? composerStartRestartGroup.changed(i4) ? 8388608 : 4194304 : 12582912;
                            if ((234881024 & i5) == 0) {
                                i7 |= ((i6 & 256) == 0 && composerStartRestartGroup.changed(str)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            if ((i7 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i5 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i21 == 0 ? Modifier.INSTANCE : modifier;
                                    if (i22 != 0) {
                                        i8 = 0;
                                    }
                                    if (i9 != 0) {
                                        z3 = false;
                                    }
                                    z5 = i10 == 0 ? false : z2;
                                    i15 = i11 == 0 ? 0 : i2;
                                    i16 = i13 == 0 ? 0 : i3;
                                    float f4 = i14 == 0 ? 0.0f : f;
                                    if ((i6 & 256) == 0) {
                                        f2 = f4;
                                        i17 = i7 & (-234881025);
                                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1709095573, i17, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesItem (UpgradeObjectEventLevelPrizesItem.kt:58)");
                                        }
                                        String strValueOf = String.valueOf(i8);
                                        StringResourceCompose stringResourceCompose = StringResourceCompose.INSTANCE;
                                        int i23 = i17 >> 9;
                                        int i24 = i8;
                                        AnnotatedString annotatedStringChTreeTitleIfDone = stringResourceCompose.chTreeTitleIfDone(z5, composerStartRestartGroup, (i23 & 14) | 48);
                                        if (!z3) {
                                            composerStartRestartGroup.startReplaceableGroup(-604251287);
                                            annotatedStringChTreeValueOfEnergy = stringResourceCompose.chTreeValueOfEnergy(i4, i16, composerStartRestartGroup, ((i17 >> 12) & 112) | ((i17 >> 21) & 14) | 384);
                                            composerStartRestartGroup.endReplaceableGroup();
                                        } else {
                                            composerStartRestartGroup.startReplaceableGroup(-604251183);
                                            annotatedStringChTreeValueOfEnergy = stringResourceCompose.chTreeValueOfEnergy(i4, i15, composerStartRestartGroup, ((i17 >> 21) & 14) | 384 | (i23 & 112));
                                            composerStartRestartGroup.endReplaceableGroup();
                                        }
                                        AnnotatedString annotatedString = annotatedStringChTreeValueOfEnergy;
                                        composerStartRestartGroup.startReplaceableGroup(-604251080);
                                        if (f2 != 1.0f) {
                                            shapeM8394RoundedCornerShapea9UjIt4$default = RectangleShapeKt.getRectangleShape();
                                        } else {
                                            shapeM8394RoundedCornerShapea9UjIt4$default = RoundedCornerShapeKt.m8394RoundedCornerShapea9UjIt4$default(0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._12sdp, composerStartRestartGroup, 6), 0.0f, 9, null);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._180sdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
                                        Alignment.Companion companion = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                        composerStartRestartGroup.startReplaceableGroup(-483455358);
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        int i25 = i15;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
                                        i18 = i16;
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
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        Alignment center = companion.getCenter();
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                                        boolean z8 = z3;
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
                                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6)), RectangleShapeKt.getRectangleShape()), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), null, 2, null);
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default);
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
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        BoxKt.Box(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(BackgroundKt.background$default(ClipKt.clip(companion3, shapeM8394RoundedCornerShapea9UjIt4$default), Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null), f2), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rainbow_star, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                        Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), 0.0f, 11, null);
                                        TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                        long jColorResource = ColorResources_androidKt.colorResource(R.color.dark_brown, composerStartRestartGroup, 6);
                                        TextAlign.Companion companion4 = TextAlign.INSTANCE;
                                        TextKt.m10024Text4IGK_g(strValueOf, modifierM8127paddingqDBjuR0$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14830montserratExtraBoldItalic25spOr19sspRHzUZ70(jColorResource, companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, new Stroke(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0), 0.0f, 0, StrokeJoin.INSTANCE.m11704getRoundLxFBmk8(), null, 22, null), composerStartRestartGroup, 232832, 0), composerStartRestartGroup, 0, 0, 65532);
                                        TextKt.m10024Text4IGK_g(strValueOf, PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14830montserratExtraBoldItalic25spOr19sspRHzUZ70(0L, companion4.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, composerStartRestartGroup, 200064, 17), composerStartRestartGroup, 0, 0, 65532);
                                        composerStartRestartGroup.startReplaceableGroup(-1522408215);
                                        if (z5) {
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_green_checkbox, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6), 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._30sdp, composerStartRestartGroup, 6), 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._20sdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        TextKt.m10025TextIbK3jfQ(annotatedStringChTreeTitleIfDone, PaddingKt.m8125paddingVpY3zN4$default(companion3, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14857montserratSemiBold20spOr15ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, 0, 0, 131068);
                                        composerStartRestartGroup.startReplaceableGroup(-604247618);
                                        if (!z5) {
                                            TextKt.m10025TextIbK3jfQ(annotatedString, PaddingKt.m8127paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14794montserratBold15spOr12ssp1PwDTvk(ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6), 0, 0L, 0L, 0.0f, null, composerStartRestartGroup, 1572864, 62), composerStartRestartGroup, 0, 0, 131068);
                                            Alignment.Horizontal centerHorizontally2 = companion.getCenterHorizontally();
                                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion3);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            }
                                            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(modifier2, 0.8f);
                                            Color.Companion companion5 = Color.INSTANCE;
                                            Modifier modifierM7771backgroundbw27NRU$default2 = BackgroundKt.m7771backgroundbw27NRU$default(modifierFillMaxWidth, companion5.m11374getRed0d7_KjU(), null, 2, null);
                                            String strStringResource = StringResources_androidKt.stringResource(R.string.common_prize, composerStartRestartGroup, 6);
                                            Locale locale = Locale.ROOT;
                                            String upperCase = strStringResource.toUpperCase(locale);
                                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                            TextKt.m10024Text4IGK_g(upperCase, modifierM7771backgroundbw27NRU$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14809montserratBold9spOr7ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
                                            Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(BackgroundKt.m7771backgroundbw27NRU$default(SizeKt.fillMaxWidth(modifier2, 0.8f), companion5.m11366getBlack0d7_KjU(), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._16sdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composerStartRestartGroup, 6));
                                            String upperCase2 = strEmpty.toUpperCase(locale);
                                            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                            TextKt.m10024Text4IGK_g(upperCase2, modifierM8124paddingVpY3zN4, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14787montserratBold10spOr8ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 13), composerStartRestartGroup, 0, 0, 65532);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        i8 = i24;
                                        i19 = i25;
                                        f3 = f2;
                                        str2 = strEmpty;
                                        z6 = z8;
                                        z7 = z5;
                                        modifier3 = modifier2;
                                    } else {
                                        f2 = f4;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i6 & 256) != 0) {
                                        i7 &= -234881025;
                                    }
                                    modifier2 = modifier;
                                    z5 = z2;
                                    i15 = i2;
                                    i16 = i3;
                                    f2 = f;
                                }
                                i17 = i7;
                                strEmpty = str;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                String strValueOf2 = String.valueOf(i8);
                                StringResourceCompose stringResourceCompose2 = StringResourceCompose.INSTANCE;
                                int i232 = i17 >> 9;
                                int i242 = i8;
                                AnnotatedString annotatedStringChTreeTitleIfDone2 = stringResourceCompose2.chTreeTitleIfDone(z5, composerStartRestartGroup, (i232 & 14) | 48);
                                if (!z3) {
                                }
                                AnnotatedString annotatedString2 = annotatedStringChTreeValueOfEnergy;
                                composerStartRestartGroup.startReplaceableGroup(-604251080);
                                if (f2 != 1.0f) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m8177width3ABfNKs(modifier2, PrimitiveResources_androidKt.dimensionResource(R.dimen._180sdp, composerStartRestartGroup, 6)), 0.0f, 1, null);
                                Alignment.Companion companion6 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally3 = companion6.getCenterHorizontally();
                                composerStartRestartGroup.startReplaceableGroup(-483455358);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                int i252 = i15;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default2);
                                i18 = i16;
                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                                if (!composerM10870constructorimpl.getInserting()) {
                                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    Alignment center2 = companion6.getCenter();
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    Modifier.Companion companion32 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(companion32);
                                    boolean z82 = z3;
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl2.getInserting()) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        Modifier modifierM7771backgroundbw27NRU$default3 = BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._24sdp, composerStartRestartGroup, 6)), RectangleShapeKt.getRectangleShape()), ColorResources_androidKt.colorResource(R.color.black, composerStartRestartGroup, 6), null, 2, null);
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion6.getTopStart(), false, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifierM7771backgroundbw27NRU$default3);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl3.getInserting()) {
                                            composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            function3ModifierMaterializerOf32.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            BoxKt.Box(SizeKt.fillMaxWidth(SizeKt.fillMaxHeight$default(BackgroundKt.background$default(ClipKt.clip(companion32, shapeM8394RoundedCornerShapea9UjIt4$default), Brush.Companion.m11297verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.light_yellow, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.orange, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), 0.0f, 1, null), f2), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_rainbow_star, composerStartRestartGroup, 6), (String) null, SizeKt.m8172size3ABfNKs(companion32, PrimitiveResources_androidKt.dimensionResource(R.dimen._70sdp, composerStartRestartGroup, 6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                            Modifier modifierM8127paddingqDBjuR0$default2 = PaddingKt.m8127paddingqDBjuR0$default(companion32, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), 0.0f, 11, null);
                                            TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.dark_brown, composerStartRestartGroup, 6);
                                            TextAlign.Companion companion42 = TextAlign.INSTANCE;
                                            TextKt.m10024Text4IGK_g(strValueOf2, modifierM8127paddingqDBjuR0$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14830montserratExtraBoldItalic25spOr19sspRHzUZ70(jColorResource2, companion42.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, new Stroke(ComposeExtensionKt.m14409dpToPx8Feqmps(PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composerStartRestartGroup, 6), composerStartRestartGroup, 0), 0.0f, 0, StrokeJoin.INSTANCE.m11704getRoundLxFBmk8(), null, 22, null), composerStartRestartGroup, 232832, 0), composerStartRestartGroup, 0, 0, 65532);
                                            TextKt.m10024Text4IGK_g(strValueOf2, PaddingKt.m8127paddingqDBjuR0$default(companion32, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._5sdp, composerStartRestartGroup, 6), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14830montserratExtraBoldItalic25spOr19sspRHzUZ70(0L, companion42.m13558getCentere0LSkKk(), OffsetKt.Offset(0.0f, 0.0f), 0.0f, null, composerStartRestartGroup, 200064, 17), composerStartRestartGroup, 0, 0, 65532);
                                            composerStartRestartGroup.startReplaceableGroup(-1522408215);
                                            if (z5) {
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            TextKt.m10025TextIbK3jfQ(annotatedStringChTreeTitleIfDone2, PaddingKt.m8125paddingVpY3zN4$default(companion32, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3sdp, composerStartRestartGroup, 6), 1, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle2.m14857montserratSemiBold20spOr15ssp67j0QOw(0L, 0, 0L, 0.0f, composerStartRestartGroup, CpioConstants.C_ISBLK, 15), composerStartRestartGroup, 0, 0, 131068);
                                            composerStartRestartGroup.startReplaceableGroup(-604247618);
                                            if (!z5) {
                                            }
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            i8 = i242;
                                            i19 = i252;
                                            f3 = f2;
                                            str2 = strEmpty;
                                            z6 = z82;
                                            z7 = z5;
                                            modifier3 = modifier2;
                                        }
                                    }
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                i18 = i3;
                                f3 = f;
                                z6 = z3;
                                z7 = z4;
                                i19 = i12;
                                str2 = str;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier4 = modifier3;
                                final int i26 = i8;
                                final int i27 = i18;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesItemKt.UpgradeObjectEventLevelPrizesItem.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i28) {
                                        UpgradeObjectEventLevelPrizesItemKt.UpgradeObjectEventLevelPrizesItem(modifier4, i26, z6, z7, i19, i27, f3, i4, str2, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i6);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i7 |= i20;
                        if ((234881024 & i5) == 0) {
                        }
                        if ((i7 & 191739611) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i5 & 1) != 0) {
                                if (i21 == 0) {
                                }
                                if (i22 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if ((i6 & 256) == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i12 = i2;
                    i13 = i6 & 32;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 64;
                    if (i14 != 0) {
                    }
                    if ((i6 & 128) == 0) {
                    }
                    i7 |= i20;
                    if ((234881024 & i5) == 0) {
                    }
                    if ((i7 & 191739611) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i11 = i6 & 16;
                if (i11 == 0) {
                }
                i12 = i2;
                i13 = i6 & 32;
                if (i13 != 0) {
                }
                i14 = i6 & 64;
                if (i14 != 0) {
                }
                if ((i6 & 128) == 0) {
                }
                i7 |= i20;
                if ((234881024 & i5) == 0) {
                }
                if ((i7 & 191739611) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z3 = z;
            i10 = i6 & 8;
            if (i10 != 0) {
            }
            z4 = z2;
            i11 = i6 & 16;
            if (i11 == 0) {
            }
            i12 = i2;
            i13 = i6 & 32;
            if (i13 != 0) {
            }
            i14 = i6 & 64;
            if (i14 != 0) {
            }
            if ((i6 & 128) == 0) {
            }
            i7 |= i20;
            if ((234881024 & i5) == 0) {
            }
            if ((i7 & 191739611) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i;
        i9 = i6 & 4;
        if (i9 == 0) {
        }
        z3 = z;
        i10 = i6 & 8;
        if (i10 != 0) {
        }
        z4 = z2;
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        i12 = i2;
        i13 = i6 & 32;
        if (i13 != 0) {
        }
        i14 = i6 & 64;
        if (i14 != 0) {
        }
        if ((i6 & 128) == 0) {
        }
        i7 |= i20;
        if ((234881024 & i5) == 0) {
        }
        if ((i7 & 191739611) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ChristmasTreeLevelPrizesItem1")
    public static final void PreviewUpgradeObjectEventLevelPrizesItem1(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(779065430);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(779065430, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.PreviewUpgradeObjectEventLevelPrizesItem1 (UpgradeObjectEventLevelPrizesItem.kt:202)");
            }
            UpgradeObjectEventLevelPrizesItem(null, 1, false, false, 100, 0, 0.16f, R.string.christmas_tree_prize_value_of_energy, "pam param pam pam", composerStartRestartGroup, 114846768, 37);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesItemKt.PreviewUpgradeObjectEventLevelPrizesItem1.1
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
                    UpgradeObjectEventLevelPrizesItemKt.PreviewUpgradeObjectEventLevelPrizesItem1(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ChristmasTreeLevelPrizesItem2")
    public static final void PreviewUpgradeObjectEventLevelPrizesItem2(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-154288907);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154288907, i, -1, "com.blackhub.bronline.game.ui.upgradeobjectevent.PreviewUpgradeObjectEventLevelPrizesItem2 (UpgradeObjectEventLevelPrizesItem.kt:215)");
            }
            UpgradeObjectEventLevelPrizesItem(null, 12, false, true, 0, 0, 0.83f, R.string.christmas_tree_prize_value_of_energy, "pam param pam pam", composerStartRestartGroup, 114846768, 37);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.upgradeobjectevent.UpgradeObjectEventLevelPrizesItemKt.PreviewUpgradeObjectEventLevelPrizesItem2.1
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
                    UpgradeObjectEventLevelPrizesItemKt.PreviewUpgradeObjectEventLevelPrizesItem2(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

