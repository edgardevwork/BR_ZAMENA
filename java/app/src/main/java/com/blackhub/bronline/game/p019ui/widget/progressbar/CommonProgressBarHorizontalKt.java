package com.blackhub.bronline.game.p019ui.widget.progressbar;

import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonProgressBarHorizontal.kt */
@SourceDebugExtension({"SMAP\nCommonProgressBarHorizontal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonProgressBarHorizontal.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/CommonProgressBarHorizontalKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,190:1\n68#2,6:191\n74#2:225\n69#2,5:226\n74#2:259\n78#2:264\n78#2:269\n79#3,11:197\n79#3,11:231\n92#3:263\n92#3:268\n456#4,8:208\n464#4,3:222\n456#4,8:242\n464#4,3:256\n467#4,3:260\n467#4,3:265\n3737#5,6:216\n3737#5,6:250\n*S KotlinDebug\n*F\n+ 1 CommonProgressBarHorizontal.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/CommonProgressBarHorizontalKt\n*L\n71#1:191,6\n71#1:225\n126#1:226,5\n126#1:259\n126#1:264\n71#1:269\n71#1:197,11\n126#1:231,11\n126#1:263\n71#1:268\n71#1:208,8\n71#1:222,3\n126#1:242,8\n126#1:256,3\n126#1:260,3\n71#1:265,3\n71#1:216,6\n126#1:250,6\n*E\n"})
/* loaded from: classes3.dex */
public final class CommonProgressBarHorizontalKt {
    public static final float PROGRESS_BAR_STRIP_SCALE = 1.2f;
    public static final float PROGRESS_SHADOW_BLUR = 3.0f;
    public static final float PROGRESS_SHADOW_OFFSET = 2.0f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: CommonProgressBarHorizontal-6Ij7WKU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15100CommonProgressBarHorizontal6Ij7WKU(@Nullable Modifier modifier, final float f, final float f2, final int i, @NotNull final String level, float f3, float f4, float f5, final long j, final long j2, final long j3, @Nullable Bitmap bitmap, @Nullable Brush brush, @Nullable Brush brush2, int i2, final boolean z, @Nullable Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        float fDimensionResource;
        float fDimensionResource2;
        float f6;
        float fDimensionResource3;
        Bitmap bitmap2;
        Brush solidColor;
        Brush brush3;
        Brush solidColor2;
        Brush brush4;
        int i10;
        Brush brush5;
        Modifier modifier2;
        float f7;
        float f8;
        final Bitmap bitmap3;
        int i11;
        float f9;
        int i12;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM10870constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final float f10;
        final float f11;
        final Bitmap bitmap4;
        final float f12;
        final Brush brush6;
        final Brush brush7;
        final int i13;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(level, "level");
        Composer composerStartRestartGroup = composer.startRestartGroup(687969148);
        int i16 = i5 & 1;
        if (i16 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i17 = i6;
        if ((i5 & 4) != 0) {
            i17 |= 384;
        } else if ((i3 & 896) == 0) {
            i17 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        int i18 = 1024;
        if ((i5 & 8) != 0) {
            i17 |= 3072;
        } else {
            if ((i3 & 7168) == 0) {
                i17 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
            }
            if ((i5 & 16) == 0) {
                i17 |= CpioConstants.C_ISBLK;
            } else if ((i3 & 57344) == 0) {
                i17 |= composerStartRestartGroup.changed(level) ? 16384 : 8192;
            }
            if ((i3 & 458752) == 0) {
                i17 |= ((i5 & 32) == 0 && composerStartRestartGroup.changed(f3)) ? 131072 : 65536;
            }
            if ((i3 & 3670016) == 0) {
                i17 |= ((i5 & 64) == 0 && composerStartRestartGroup.changed(f4)) ? 1048576 : 524288;
            }
            if ((i3 & 29360128) == 0) {
                i17 |= ((i5 & 128) == 0 && composerStartRestartGroup.changed(f5)) ? 8388608 : 4194304;
            }
            if ((i5 & 256) != 0) {
                i15 = (234881024 & i3) == 0 ? composerStartRestartGroup.changed(j) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION : 100663296;
                if ((i5 & 512) == 0) {
                    i14 = (1879048192 & i3) == 0 ? composerStartRestartGroup.changed(j2) ? 536870912 : 268435456 : 805306368;
                    if ((i5 & 1024) == 0) {
                        i7 = i4 | 6;
                    } else if ((i4 & 14) == 0) {
                        i7 = i4 | (composerStartRestartGroup.changed(j3) ? 4 : 2);
                    } else {
                        i7 = i4;
                    }
                    i8 = i5 & 2048;
                    if (i8 != 0) {
                        i7 |= 16;
                    }
                    if ((i4 & 896) == 0) {
                        i7 |= ((i5 & 4096) == 0 && composerStartRestartGroup.changed(brush)) ? 256 : 128;
                    }
                    if ((i4 & 7168) == 0) {
                        if ((i5 & 8192) == 0 && composerStartRestartGroup.changed(brush2)) {
                            i18 = 2048;
                        }
                        i7 |= i18;
                    }
                    i9 = i5 & 16384;
                    if (i9 == 0) {
                        i7 |= CpioConstants.C_ISBLK;
                    } else if ((i4 & 57344) == 0) {
                        i7 |= composerStartRestartGroup.changed(i2) ? 16384 : 8192;
                    }
                    if ((32768 & i5) != 0) {
                        if ((i4 & 458752) == 0) {
                            i7 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                        }
                        if (i8 != 2048 || (1533916891 & i17) != 306783378 || (374491 & i7) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i16 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i5 & 32) == 0) {
                                    fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6);
                                    i17 &= -458753;
                                } else {
                                    fDimensionResource = f3;
                                }
                                if ((i5 & 64) == 0) {
                                    fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._185wdp, composerStartRestartGroup, 6);
                                    i17 &= -3670017;
                                } else {
                                    fDimensionResource2 = f4;
                                }
                                if ((i5 & 128) == 0) {
                                    f6 = fDimensionResource2;
                                    fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._21wdp, composerStartRestartGroup, 6);
                                    i17 = (-29360129) & i17;
                                } else {
                                    f6 = fDimensionResource2;
                                    fDimensionResource3 = f5;
                                }
                                Bitmap bitmap5 = i8 == 0 ? null : bitmap;
                                if ((i5 & 4096) == 0) {
                                    bitmap2 = bitmap5;
                                    solidColor = new SolidColor(j, null);
                                    i7 &= -897;
                                } else {
                                    bitmap2 = bitmap5;
                                    solidColor = brush;
                                }
                                if ((i5 & 8192) == 0) {
                                    brush3 = solidColor;
                                    solidColor2 = new SolidColor(j, null);
                                    i7 &= -7169;
                                } else {
                                    brush3 = solidColor;
                                    solidColor2 = brush2;
                                }
                                if (i9 == 0) {
                                    brush4 = brush3;
                                    i10 = 1500;
                                } else {
                                    brush4 = brush3;
                                    i10 = i2;
                                }
                                brush5 = solidColor2;
                                modifier2 = modifier4;
                                f7 = fDimensionResource3;
                                f8 = f6;
                                bitmap3 = bitmap2;
                                int i19 = i17;
                                i11 = i7;
                                f9 = fDimensionResource;
                                i12 = i19;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 32) != 0) {
                                    i17 &= -458753;
                                }
                                if ((i5 & 64) != 0) {
                                    i17 &= -3670017;
                                }
                                if ((i5 & 128) != 0) {
                                    i17 &= -29360129;
                                }
                                if ((i5 & 4096) != 0) {
                                    i7 &= -897;
                                }
                                if ((i5 & 8192) != 0) {
                                    i7 &= -7169;
                                }
                                modifier2 = modifier;
                                f8 = f4;
                                f7 = f5;
                                bitmap3 = bitmap;
                                brush4 = brush;
                                brush5 = brush2;
                                i10 = i2;
                                i12 = i17;
                                i11 = i7;
                                f9 = f3;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(687969148, i12, i11, "com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontal (CommonProgressBarHorizontal.kt:60)");
                            }
                            Brush.Companion companion = Brush.INSTANCE;
                            Brush brushM11293radialGradientP_VxKs$default = Brush.Companion.m11293radialGradientP_VxKs$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6))}), 0L, 0.0f, 0, 14, (Object) null);
                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, f), f2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifier5 = modifier2;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
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
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierAlign = boxScopeInstance.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion4, f7), f8), companion2.getCenter());
                            Brush brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
                            Brush brushM11289horizontalGradient8A3gB4$default2 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                            int i20 = i11 << 9;
                            ProgressBarHorizontalCustomKt.m15101ProgressBarHorizontalCustomggYRBCk(modifierAlign, i, i10, 0, brushM11289horizontalGradient8A3gB4$default, brush4, brush5, 0.0f, C2046Dp.m13664boximpl(f9), brushM11289horizontalGradient8A3gB4$default2, fDimensionResource4, 0.0f, false, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, OffsetKt.Offset(2.0f, 2.0f), 3.0f, null, null, composerStartRestartGroup, 12610566, 102), false, 0, 0, 0.0f, 1.2f, true, ContentScale.INSTANCE.getFillHeight(), false, 0, composerStartRestartGroup, ((i12 >> 6) & 112) | 3072 | ((i11 >> 6) & 896) | (i20 & 458752) | (i20 & 3670016) | ((i12 << 9) & 234881024), 905994240, 6, 6527104);
                            ComposeExtensionKt.IfFalse(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1418274467, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontalKt$CommonProgressBarHorizontal$1$1
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
                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1418274467, i21, -1, "com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontal.<anonymous>.<anonymous> (CommonProgressBarHorizontal.kt:113)");
                                        }
                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                        float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6);
                                        ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.fillMaxHeight$default(ComposeExtensionKt.m14410shadowo6VuwKU(companion5, (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : fDimensionResource5, (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), 0.0f, 1, null), null, null, 0.0f, null, 0, composer3, 8, 124);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composerStartRestartGroup, ((i11 >> 15) & 14) | 48);
                            Modifier modifierM7782borderxT4_qwU = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(boxScopeInstance.align(companion4, companion2.getCenterEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j2, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), RoundedCornerShapeKt.getCircleShape()), brushM11293radialGradientP_VxKs$default, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), j2, RoundedCornerShapeKt.getCircleShape());
                            Alignment center = companion2.getCenter();
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU);
                            float f13 = f9;
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
                            composer2 = composerStartRestartGroup;
                            Bitmap bitmap6 = bitmap3;
                            float f14 = f7;
                            TextKt.m10024Text4IGK_g(level, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14811montserratBoldCustomSpIzzofJo(R.dimen._18wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composer2, (i12 >> 12) & 14, 0, 65534);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f10 = f13;
                            f11 = f14;
                            bitmap4 = bitmap6;
                            f12 = f8;
                            brush6 = brush4;
                            brush7 = brush5;
                            i13 = i10;
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            f12 = f4;
                            f11 = f5;
                            bitmap4 = bitmap;
                            brush6 = brush;
                            brush7 = brush2;
                            i13 = i2;
                            composer2 = composerStartRestartGroup;
                            f10 = f3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontalKt$CommonProgressBarHorizontal$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i21) {
                                    CommonProgressBarHorizontalKt.m15100CommonProgressBarHorizontal6Ij7WKU(modifier3, f, f2, i, level, f10, f12, f11, j, j2, j3, bitmap4, brush6, brush7, i13, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    if (i8 != 2048) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i16 == 0) {
                            }
                            if ((i5 & 32) == 0) {
                            }
                            if ((i5 & 64) == 0) {
                            }
                            if ((i5 & 128) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if ((i5 & 4096) == 0) {
                            }
                            if ((i5 & 8192) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            brush5 = solidColor2;
                            modifier2 = modifier4;
                            f7 = fDimensionResource3;
                            f8 = f6;
                            bitmap3 = bitmap2;
                            int i192 = i17;
                            i11 = i7;
                            f9 = fDimensionResource;
                            i12 = i192;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Brush.Companion companion5 = Brush.INSTANCE;
                            Brush brushM11293radialGradientP_VxKs$default2 = Brush.Companion.m11293radialGradientP_VxKs$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.blue_black, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.black_gray_blue, composerStartRestartGroup, 6))}), 0L, 0.0f, 0, 14, (Object) null);
                            Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(modifier2, f), f2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            Modifier modifier52 = modifier2;
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs2);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting()) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                Modifier modifierAlign2 = boxScopeInstance2.align(SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(companion42, f7), f8), companion22.getCenter());
                                Brush brushM11289horizontalGradient8A3gB4$default3 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.total_black_70, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6);
                                Brush brushM11289horizontalGradient8A3gB4$default22 = Brush.Companion.m11289horizontalGradient8A3gB4$default(companion5, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                                int i202 = i11 << 9;
                                ProgressBarHorizontalCustomKt.m15101ProgressBarHorizontalCustomggYRBCk(modifierAlign2, i, i10, 0, brushM11289horizontalGradient8A3gB4$default3, brush4, brush5, 0.0f, C2046Dp.m13664boximpl(f9), brushM11289horizontalGradient8A3gB4$default22, fDimensionResource42, 0.0f, false, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._12wsp, 0L, 0, OffsetKt.Offset(2.0f, 2.0f), 3.0f, null, null, composerStartRestartGroup, 12610566, 102), false, 0, 0, 0.0f, 1.2f, true, ContentScale.INSTANCE.getFillHeight(), false, 0, composerStartRestartGroup, ((i12 >> 6) & 112) | 3072 | ((i11 >> 6) & 896) | (i202 & 458752) | (i202 & 3670016) | ((i12 << 9) & 234881024), 905994240, 6, 6527104);
                                ComposeExtensionKt.IfFalse(Boolean.valueOf(z), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1418274467, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontalKt$CommonProgressBarHorizontal$1$1
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
                                    public final void invoke(@Nullable Composer composer3, int i21) {
                                        if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1418274467, i21, -1, "com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontal.<anonymous>.<anonymous> (CommonProgressBarHorizontal.kt:113)");
                                            }
                                            Modifier.Companion companion52 = Modifier.INSTANCE;
                                            float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._12wdp, composer3, 6);
                                            ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap3, SizeKt.fillMaxHeight$default(ComposeExtensionKt.m14410shadowo6VuwKU(companion52, (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j3, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composer3, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : fDimensionResource5, (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), 0.0f, 1, null), null, null, 0.0f, null, 0, composer3, 8, 124);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, ((i11 >> 15) & 14) | 48);
                                Modifier modifierM7782borderxT4_qwU2 = BorderKt.m7782borderxT4_qwU(BackgroundKt.background$default(ClipKt.clip(ComposeExtensionKt.m14410shadowo6VuwKU(SizeKt.m8172size3ABfNKs(boxScopeInstance2.align(companion42, companion22.getCenterEnd()), PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6)), (242 & 1) != 0 ? Color.INSTANCE.m11366getBlack0d7_KjU() : j2, (242 & 2) != 0 ? 1.0f : 0.0f, (242 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._50wdp, composerStartRestartGroup, 6), (242 & 8) != 0 ? C2046Dp.m13666constructorimpl(0) : PrimitiveResources_androidKt.dimensionResource(R.dimen._7wdp, composerStartRestartGroup, 6), (242 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 32) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 64) != 0 ? C2046Dp.m13666constructorimpl(0) : 0.0f, (242 & 128) != 0 ? Modifier.INSTANCE : null), RoundedCornerShapeKt.getCircleShape()), brushM11293radialGradientP_VxKs$default2, null, 0.0f, 6, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._1wdp, composerStartRestartGroup, 6), j2, RoundedCornerShapeKt.getCircleShape());
                                Alignment center2 = companion22.getCenter();
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifierM7782borderxT4_qwU2);
                                float f132 = f9;
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
                                    composer2 = composerStartRestartGroup;
                                    Bitmap bitmap62 = bitmap3;
                                    float f142 = f7;
                                    TextKt.m10024Text4IGK_g(level, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle2.m14811montserratBoldCustomSpIzzofJo(R.dimen._18wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126), composer2, (i12 >> 12) & 14, 0, 65534);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f10 = f132;
                                    f11 = f142;
                                    bitmap4 = bitmap62;
                                    f12 = f8;
                                    brush6 = brush4;
                                    brush7 = brush5;
                                    i13 = i10;
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i17 |= i14;
                if ((i5 & 1024) == 0) {
                }
                i8 = i5 & 2048;
                if (i8 != 0) {
                }
                if ((i4 & 896) == 0) {
                }
                if ((i4 & 7168) == 0) {
                }
                i9 = i5 & 16384;
                if (i9 == 0) {
                }
                if ((32768 & i5) != 0) {
                }
                if (i8 != 2048) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i17 |= i15;
            if ((i5 & 512) == 0) {
            }
            i17 |= i14;
            if ((i5 & 1024) == 0) {
            }
            i8 = i5 & 2048;
            if (i8 != 0) {
            }
            if ((i4 & 896) == 0) {
            }
            if ((i4 & 7168) == 0) {
            }
            i9 = i5 & 16384;
            if (i9 == 0) {
            }
            if ((32768 & i5) != 0) {
            }
            if (i8 != 2048) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i5 & 16) == 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i5 & 256) != 0) {
        }
        i17 |= i15;
        if ((i5 & 512) == 0) {
        }
        i17 |= i14;
        if ((i5 & 1024) == 0) {
        }
        i8 = i5 & 2048;
        if (i8 != 0) {
        }
        if ((i4 & 896) == 0) {
        }
        if ((i4 & 7168) == 0) {
        }
        i9 = i5 & 16384;
        if (i9 == 0) {
        }
        if ((32768 & i5) != 0) {
        }
        if (i8 != 2048) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void CommonProgressBarHorizontalPreview(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-425756472);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-425756472, i, -1, "com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontalPreview (CommonProgressBarHorizontal.kt:154)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._214wdp, composerStartRestartGroup, 6);
            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._36wdp, composerStartRestartGroup, 6);
            float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6);
            float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._172wdp, composerStartRestartGroup, 6);
            float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._20wdp, composerStartRestartGroup, 6);
            long jColorResource = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
            long jColorResource2 = ColorResources_androidKt.colorResource(R.color.yellow, composerStartRestartGroup, 6);
            long jColorResource3 = ColorResources_androidKt.colorResource(R.color.purpur, composerStartRestartGroup, 6);
            Brush.Companion companion = Brush.INSTANCE;
            composer2 = composerStartRestartGroup;
            m15100CommonProgressBarHorizontal6Ij7WKU(null, fDimensionResource, fDimensionResource2, 322, "69", fDimensionResource3, fDimensionResource4, fDimensionResource5, jColorResource, jColorResource2, jColorResource3, null, Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.purpur, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11289horizontalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.purpur, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.purple, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), 1000, false, composer2, 27648, 221232, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.CommonProgressBarHorizontalKt.CommonProgressBarHorizontalPreview.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    CommonProgressBarHorizontalKt.CommonProgressBarHorizontalPreview(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

