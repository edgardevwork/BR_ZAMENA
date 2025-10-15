package com.blackhub.bronline.game.p019ui.widget.block.cloud;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.RoundRect;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CloudArrowTopRightBlock.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\\\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m7105d2 = {"CORNER_COEFF_FIRST", "", "CORNER_COEFF_SECOND", "HEIGHT", "WIDTH", "WIDTH_COEFF", "WIDTH_COEFF_PATH", "CloudArrowTopRightBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "brush", "Landroidx/compose/ui/graphics/Brush;", "bottomRightCoeffFirst", "bottomRightCoeffSecond", "topLeftCoeffFirst", "topLeftCoeffSecond", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;FFFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PreviewCloudArrowTopRightBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCloudArrowTopRightBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudArrowTopRightBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/cloud/CloudArrowTopRightBlockKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n69#2,5:107\n74#2:140\n69#2,5:147\n74#2:180\n78#2:185\n78#2:190\n79#3,11:112\n79#3,11:152\n92#3:184\n92#3:189\n456#4,8:123\n464#4,3:137\n456#4,8:163\n464#4,3:177\n467#4,3:181\n467#4,3:186\n3737#5,6:131\n3737#5,6:171\n1116#6,6:141\n*S KotlinDebug\n*F\n+ 1 CloudArrowTopRightBlock.kt\ncom/blackhub/bronline/game/ui/widget/block/cloud/CloudArrowTopRightBlockKt\n*L\n47#1:107,5\n47#1:140\n87#1:147,5\n87#1:180\n87#1:185\n47#1:190\n47#1:112,11\n87#1:152,11\n87#1:184\n47#1:189\n47#1:123,8\n47#1:137,3\n87#1:163,8\n87#1:177,3\n87#1:181,3\n47#1:186,3\n47#1:131,6\n87#1:171,6\n54#1:141,6\n*E\n"})
/* loaded from: classes3.dex */
public final class CloudArrowTopRightBlockKt {
    public static final float CORNER_COEFF_FIRST = 0.05f;
    public static final float CORNER_COEFF_SECOND = 0.2f;
    public static final float HEIGHT = 0.8f;
    public static final float WIDTH = 0.98f;
    public static final float WIDTH_COEFF = 0.9f;
    public static final float WIDTH_COEFF_PATH = 0.87f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloudArrowTopRightBlock(@Nullable Modifier modifier, @Nullable Brush brush, float f, float f2, float f3, float f4, @NotNull final Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Brush brush2;
        float f5;
        int i4;
        float f6;
        int i5;
        float f7;
        int i6;
        float f8;
        Modifier modifier3;
        final Brush brushM11289horizontalGradient8A3gB4$default;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1036028999);
        int i8 = i2 & 1;
        if (i8 != 0) {
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
                brush2 = brush;
                int i9 = composerStartRestartGroup.changed(brush2) ? 32 : 16;
                i3 |= i9;
            } else {
                brush2 = brush;
            }
            i3 |= i9;
        } else {
            brush2 = brush;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                f5 = f;
                i3 |= composerStartRestartGroup.changed(f5) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    f6 = f2;
                    i3 |= composerStartRestartGroup.changed(f6) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                    f7 = f3;
                } else {
                    f7 = f3;
                    if ((i & 57344) == 0) {
                        i3 |= composerStartRestartGroup.changed(f7) ? 16384 : 8192;
                    }
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    f8 = f4;
                } else {
                    f8 = f4;
                    if ((i & 458752) == 0) {
                        i3 |= composerStartRestartGroup.changed(f8) ? 131072 : 65536;
                    }
                }
                if ((i2 & 64) == 0) {
                    i7 = (i & 3670016) == 0 ? composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) == 0) {
                                brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.INSTANCE.m11375getTransparent0d7_KjU()), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                i3 &= -113;
                            } else {
                                brushM11289horizontalGradient8A3gB4$default = brush2;
                            }
                            if (i10 != 0) {
                                f5 = 0.05f;
                            }
                            if (i4 != 0) {
                                f6 = 0.2f;
                            }
                            if (i5 != 0) {
                                f7 = 0.0f;
                            }
                            if (i6 != 0) {
                                f8 = 0.0f;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            modifier3 = modifier2;
                            brushM11289horizontalGradient8A3gB4$default = brush2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1036028999, i3, -1, "com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowTopRightBlock (CloudArrowTopRightBlock.kt:45)");
                        }
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment bottomCenter = companion.getBottomCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
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
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-1321721073);
                        z = ((i3 & 458752) != 131072) | ((i3 & 57344) != 16384) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((((i3 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default)) || (i3 & 48) == 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Brush brush3 = brushM11289horizontalGradient8A3gB4$default;
                            final float f9 = f7;
                            final float f10 = f8;
                            final float f11 = f5;
                            final float f12 = f6;
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowTopRightBlockKt$CloudArrowTopRightBlock$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope Canvas) {
                                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                    Path Path = AndroidPath_androidKt.Path();
                                    float f13 = f9;
                                    float f14 = f10;
                                    float f15 = f11;
                                    float f16 = f12;
                                    Path.moveTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.9f, 0.0f);
                                    Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.9f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f);
                                    Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.87f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f);
                                    Path.addRoundRect(new RoundRect(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * f13, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * f14), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.05f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * f15, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * f16), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.0f), null));
                                    Path.close();
                                    DrawScope.m11879drawPathGBMwjPU$default(Canvas, Path, brush3, 0.0f, null, null, 0, 60, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierFillMaxSize$default, (Function1) objRememberedValue, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion3, 0.8f), 0.98f);
                        Alignment center = companion.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth);
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
                        Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
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
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        brushM11289horizontalGradient8A3gB4$default = brush2;
                    }
                    final float f13 = f8;
                    final float f14 = f7;
                    final float f15 = f6;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final float f16 = f5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowTopRightBlockKt.CloudArrowTopRightBlock.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i11) {
                                CloudArrowTopRightBlockKt.CloudArrowTopRightBlock(modifier4, brushM11289horizontalGradient8A3gB4$default, f16, f15, f14, f13, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i7;
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i2 & 2) == 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        Alignment bottomCenter2 = companion4.getBottomCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(bottomCenter2, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceableGroup(-1321721073);
                            if (((i3 & 112) ^ 48) <= 32) {
                                z = ((i3 & 458752) != 131072) | ((i3 & 57344) != 16384) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((((i3 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default)) || (i3 & 48) == 32);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z) {
                                    final Brush brush32 = brushM11289horizontalGradient8A3gB4$default;
                                    final float f92 = f7;
                                    final float f102 = f8;
                                    final float f112 = f5;
                                    final float f122 = f6;
                                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowTopRightBlockKt$CloudArrowTopRightBlock$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                            invoke2(drawScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull DrawScope Canvas) {
                                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                            Path Path = AndroidPath_androidKt.Path();
                                            float f132 = f92;
                                            float f142 = f102;
                                            float f152 = f112;
                                            float f162 = f122;
                                            Path.moveTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.9f, 0.0f);
                                            Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.9f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f);
                                            Path.lineTo(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.87f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f);
                                            Path.addRoundRect(new RoundRect(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * f132, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * f142), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.05f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.2f), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * f152, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * f162), CornerRadiusKt.CornerRadius(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) * 0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) * 0.0f), null));
                                            Path.close();
                                            DrawScope.m11879drawPathGBMwjPU$default(Canvas, Path, brush32, 0.0f, null, null, 0, 60, null);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    CanvasKt.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue, composerStartRestartGroup, 6);
                                    Modifier modifierFillMaxWidth2 = SizeKt.fillMaxWidth(SizeKt.fillMaxHeight(companion32, 0.8f), 0.98f);
                                    Alignment center2 = companion4.getCenter();
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth2);
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                                    if (!composerM10870constructorimpl2.getInserting()) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        function3ModifierMaterializerOf22.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        content.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
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
                                        modifier2 = modifier3;
                                    }
                                }
                            } else {
                                z = ((i3 & 458752) != 131072) | ((i3 & 57344) != 16384) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((((i3 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(brushM11289horizontalGradient8A3gB4$default)) || (i3 & 48) == 32);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z) {
                                }
                            }
                        }
                    }
                }
                final float f132 = f8;
                final float f142 = f7;
                final float f152 = f6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f6 = f2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995931) == 599186) {
            }
            final float f1322 = f8;
            final float f1422 = f7;
            final float f1522 = f6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        f5 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f6 = f2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995931) == 599186) {
        }
        final float f13222 = f8;
        final float f14222 = f7;
        final float f15222 = f6;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "CloudArrowTopRightBlock")
    public static final void PreviewCloudArrowTopRightBlock(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-574560862);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-574560862, i, -1, "com.blackhub.bronline.game.ui.widget.block.cloud.PreviewCloudArrowTopRightBlock (CloudArrowTopRightBlock.kt:99)");
            }
            CloudArrowTopRightBlock(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen._47sdp, composerStartRestartGroup, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._175sdp, composerStartRestartGroup, 6)), null, 0.0f, 0.0f, 0.0f, 0.0f, ComposableSingletons$CloudArrowTopRightBlockKt.INSTANCE.m15053getLambda1$app_siteRelease(), composerStartRestartGroup, 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.block.cloud.CloudArrowTopRightBlockKt.PreviewCloudArrowTopRightBlock.1
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
                    CloudArrowTopRightBlockKt.PreviewCloudArrowTopRightBlock(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
