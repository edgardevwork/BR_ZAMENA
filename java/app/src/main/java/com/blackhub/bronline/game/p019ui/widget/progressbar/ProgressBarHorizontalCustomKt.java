package com.blackhub.bronline.game.p019ui.widget.progressbar;

import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorDefaults;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ScaleKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
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
import androidx.compose.p003ui.tooling.preview.Preview;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.ComposeExtensionKt;
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
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProgressBarHorizontalCustom.kt */
@SourceDebugExtension({"SMAP\nProgressBarHorizontalCustom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressBarHorizontalCustom.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/ProgressBarHorizontalCustomKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,225:1\n154#2:226\n154#2:227\n154#2:240\n154#2:241\n1116#3,6:228\n1116#3,6:234\n81#4:242\n81#4:243\n81#4:244\n81#4:245\n*S KotlinDebug\n*F\n+ 1 ProgressBarHorizontalCustom.kt\ncom/blackhub/bronline/game/ui/widget/progressbar/ProgressBarHorizontalCustomKt\n*L\n59#1:226\n67#1:227\n200#1:240\n201#1:241\n80#1:228,6\n86#1:234,6\n80#1:242\n86#1:243\n92#1:244\n98#1:245\n*E\n"})
/* loaded from: classes3.dex */
public final class ProgressBarHorizontalCustomKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: ProgressBarHorizontalCustom-ggYRBCk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15101ProgressBarHorizontalCustomggYRBCk(@Nullable Modifier modifier, final int i, final int i2, int i3, @NotNull final Brush trackColor, @NotNull final Brush thumbColor, @NotNull final Brush thumbBgColor, float f, @Nullable C2046Dp c2046Dp, @Nullable Brush brush, float f2, float f3, boolean z, @Nullable TextStyle textStyle, boolean z2, @DrawableRes int i4, @DimenRes int i5, float f4, float f5, boolean z3, @Nullable ContentScale contentScale, boolean z4, @DrawableRes int i6, @Nullable Composer composer, final int i7, final int i8, final int i9, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Brush brushM11289horizontalGradient8A3gB4$default;
        float fDimensionResource;
        TextStyle textStyleM14811montserratBoldCustomSpIzzofJo;
        int i28;
        Modifier modifier2;
        float f6;
        C2046Dp c2046Dp2;
        TextStyle textStyle2;
        float f7;
        boolean z5;
        boolean z6;
        float f8;
        int i29;
        int i30;
        float f9;
        float f10;
        boolean z7;
        ContentScale contentScale2;
        boolean z8;
        int i31;
        final int i32;
        Brush brush2;
        boolean z9;
        Object objRememberedValue;
        final int i33;
        boolean z10;
        Object objRememberedValue2;
        BorderStroke borderStroke;
        Composer composer2;
        final float f11;
        final C2046Dp c2046Dp3;
        final float f12;
        final float f13;
        final boolean z11;
        final TextStyle textStyle3;
        final boolean z12;
        final int i34;
        final int i35;
        final float f14;
        final float f15;
        final boolean z13;
        final Brush brush3;
        final ContentScale contentScale3;
        final boolean z14;
        final int i36;
        final int i37;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i38;
        Intrinsics.checkNotNullParameter(trackColor, "trackColor");
        Intrinsics.checkNotNullParameter(thumbColor, "thumbColor");
        Intrinsics.checkNotNullParameter(thumbBgColor, "thumbBgColor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-153240300);
        int i39 = i10 & 1;
        if (i39 != 0) {
            i11 = i7 | 6;
        } else if ((i7 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i10 & 2) != 0) {
            i11 |= 48;
        } else if ((i7 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i10 & 4) != 0) {
            i11 |= 384;
        } else if ((i7 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
        }
        int i40 = i10 & 8;
        int i41 = 1024;
        if (i40 != 0) {
            i11 |= 3072;
        } else {
            if ((i7 & 7168) == 0) {
                i11 |= composerStartRestartGroup.changed(i3) ? 2048 : 1024;
            }
            if ((i10 & 16) == 0) {
                i11 |= CpioConstants.C_ISBLK;
            } else if ((i7 & 57344) == 0) {
                i11 |= composerStartRestartGroup.changed(trackColor) ? 16384 : 8192;
            }
            if ((i10 & 32) == 0) {
                i12 = ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else {
                if ((i7 & 458752) == 0) {
                    i12 = composerStartRestartGroup.changed(thumbColor) ? 131072 : 65536;
                }
                if ((i10 & 64) == 0) {
                    i38 = (i7 & 3670016) == 0 ? composerStartRestartGroup.changed(thumbBgColor) ? 1048576 : 524288 : 1572864;
                    i13 = i10 & 128;
                    if (i13 == 0) {
                        i11 |= 12582912;
                    } else if ((i7 & 29360128) == 0) {
                        i11 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                    }
                    i14 = i10 & 256;
                    if (i14 == 0) {
                        i11 |= 100663296;
                    } else if ((i7 & 234881024) == 0) {
                        i11 |= composerStartRestartGroup.changed(c2046Dp) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i7 & 1879048192) == 0) {
                        i11 |= ((i10 & 512) == 0 && composerStartRestartGroup.changed(brush)) ? 536870912 : 268435456;
                    }
                    if ((i8 & 14) != 0) {
                        i15 = i8 | (((i10 & 1024) == 0 && composerStartRestartGroup.changed(f2)) ? 4 : 2);
                    } else {
                        i15 = i8;
                    }
                    i16 = i10 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                    } else if ((i8 & 112) == 0) {
                        i15 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
                    }
                    int i42 = i15;
                    i17 = i10 & 4096;
                    if (i17 == 0) {
                        i42 |= 384;
                    } else {
                        if ((i8 & 896) == 0) {
                            i42 |= composerStartRestartGroup.changed(z) ? 256 : 128;
                        }
                        if ((i8 & 7168) == 0) {
                            if ((i10 & 8192) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                i41 = 2048;
                            }
                            i42 |= i41;
                        }
                        i18 = i10 & 16384;
                        if (i18 != 0) {
                            i42 |= CpioConstants.C_ISBLK;
                        } else if ((i8 & 57344) == 0) {
                            i42 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                        }
                        i19 = i10 & 32768;
                        if (i19 != 0) {
                            i42 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        } else if ((i8 & 458752) == 0) {
                            i42 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
                        }
                        i20 = i10 & 65536;
                        if (i20 != 0) {
                            i42 |= 1572864;
                        } else if ((i8 & 3670016) == 0) {
                            i42 |= composerStartRestartGroup.changed(i5) ? 1048576 : 524288;
                        }
                        i21 = i10 & 131072;
                        if (i21 != 0) {
                            i42 |= 12582912;
                        } else if ((i8 & 29360128) == 0) {
                            i42 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                        }
                        i22 = i10 & 262144;
                        if (i22 != 0) {
                            i42 |= 100663296;
                        } else if ((i8 & 234881024) == 0) {
                            i42 |= composerStartRestartGroup.changed(f5) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i23 = i10 & 524288;
                        if (i23 != 0) {
                            i42 |= 805306368;
                        } else if ((i8 & 1879048192) == 0) {
                            i42 |= composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                        }
                        i24 = i10 & 1048576;
                        if (i24 != 0) {
                            i25 = i9 | 6;
                        } else if ((i9 & 14) == 0) {
                            i25 = i9 | (composerStartRestartGroup.changed(contentScale) ? 4 : 2);
                        } else {
                            i25 = i9;
                        }
                        i26 = i10 & 2097152;
                        if (i26 != 0) {
                            i25 |= 48;
                        } else if ((i9 & 112) == 0) {
                            i25 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
                        }
                        int i43 = i25;
                        i27 = i10 & 4194304;
                        if (i27 == 0) {
                            if ((i9 & 896) == 0) {
                                i43 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
                            }
                            if ((i11 & 1533916891) == 306783378 || (1533916891 & i42) != 306783378 || (i43 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i7 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier3 = i39 == 0 ? Modifier.INSTANCE : modifier;
                                    int i44 = i40 == 0 ? 0 : i3;
                                    float f16 = i13 == 0 ? 0.5f : f;
                                    C2046Dp c2046DpM13664boximpl = i14 == 0 ? C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(1)) : c2046Dp;
                                    if ((i10 & 512) == 0) {
                                        brushM11289horizontalGradient8A3gB4$default = Brush.Companion.m11289horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.white, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null);
                                        i11 &= -1879048193;
                                    } else {
                                        brushM11289horizontalGradient8A3gB4$default = brush;
                                    }
                                    if ((i10 & 1024) == 0) {
                                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._2wdp, composerStartRestartGroup, 6);
                                        i42 &= -15;
                                    } else {
                                        fDimensionResource = f2;
                                    }
                                    float fM13666constructorimpl = i16 == 0 ? C2046Dp.m13666constructorimpl(0) : f3;
                                    boolean z15 = i17 == 0 ? true : z;
                                    if ((i10 & 8192) == 0) {
                                        textStyleM14811montserratBoldCustomSpIzzofJo = TypographyStyle.INSTANCE.m14811montserratBoldCustomSpIzzofJo(R.dimen._10wsp, 0L, 0, 0L, 0.0f, null, null, composerStartRestartGroup, 12582918, 126);
                                        i42 &= -7169;
                                    } else {
                                        textStyleM14811montserratBoldCustomSpIzzofJo = textStyle;
                                    }
                                    boolean z16 = i18 == 0 ? true : z2;
                                    int i45 = i19 == 0 ? R.drawable.img_logo_br_small : i4;
                                    int i46 = i20 == 0 ? R.dimen._20wdp : i5;
                                    float f17 = i21 == 0 ? 1.0f : f4;
                                    float f18 = i22 == 0 ? 1.0f : f5;
                                    boolean z17 = i23 == 0 ? false : z3;
                                    ContentScale fillHeight = i24 == 0 ? ContentScale.INSTANCE.getFillHeight() : contentScale;
                                    boolean z18 = i26 == 0 ? true : z4;
                                    if (i27 == 0) {
                                        modifier2 = modifier3;
                                        f6 = f16;
                                        c2046Dp2 = c2046DpM13664boximpl;
                                        textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                        f7 = fDimensionResource;
                                        z5 = z15;
                                        z6 = z16;
                                        f8 = fM13666constructorimpl;
                                        i29 = i45;
                                        i30 = i46;
                                        f9 = f17;
                                        f10 = f18;
                                        z7 = z17;
                                        contentScale2 = fillHeight;
                                        z8 = z18;
                                        i28 = R.drawable.bg_progress_inactive;
                                    } else {
                                        i28 = i6;
                                        modifier2 = modifier3;
                                        f6 = f16;
                                        c2046Dp2 = c2046DpM13664boximpl;
                                        textStyle2 = textStyleM14811montserratBoldCustomSpIzzofJo;
                                        f7 = fDimensionResource;
                                        z5 = z15;
                                        z6 = z16;
                                        f8 = fM13666constructorimpl;
                                        i29 = i45;
                                        i30 = i46;
                                        f9 = f17;
                                        f10 = f18;
                                        z7 = z17;
                                        contentScale2 = fillHeight;
                                        z8 = z18;
                                    }
                                    i31 = i11;
                                    i32 = i44;
                                    brush2 = brushM11289horizontalGradient8A3gB4$default;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i10 & 512) != 0) {
                                        i11 &= -1879048193;
                                    }
                                    if ((i10 & 1024) != 0) {
                                        i42 &= -15;
                                    }
                                    if ((i10 & 8192) != 0) {
                                        i42 &= -7169;
                                    }
                                    modifier2 = modifier;
                                    i32 = i3;
                                    f6 = f;
                                    c2046Dp2 = c2046Dp;
                                    brush2 = brush;
                                    f7 = f2;
                                    f8 = f3;
                                    z5 = z;
                                    textStyle2 = textStyle;
                                    z6 = z2;
                                    i29 = i4;
                                    i30 = i5;
                                    f9 = f4;
                                    f10 = f5;
                                    z7 = z3;
                                    contentScale2 = contentScale;
                                    z8 = z4;
                                    i28 = i6;
                                    i31 = i11;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-153240300, i31, i42, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom (ProgressBarHorizontalCustom.kt:78)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(-1746344980);
                                z9 = ((i31 & 112) != 32) | ((i31 & 896) != 256);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    i33 = i2;
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$currentProgress$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Float invoke() {
                                            return Float.valueOf(i / i33);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                } else {
                                    i33 = i2;
                                }
                                final State state = (State) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-1746344818);
                                z10 = (i31 & 7168) != 2048;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$previewProgress$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Float invoke() {
                                            return Float.valueOf(i32 / i33);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                float fProgressBarHorizontalCustom_ggYRBCk$lambda$1 = ProgressBarHorizontalCustom_ggYRBCk$lambda$1(state);
                                ProgressIndicatorDefaults progressIndicatorDefaults = ProgressIndicatorDefaults.INSTANCE;
                                SpringSpec<Float> progressAnimationSpec = progressIndicatorDefaults.getProgressAnimationSpec();
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(fProgressBarHorizontalCustom_ggYRBCk$lambda$1, progressAnimationSpec, 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 20);
                                final State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(ProgressBarHorizontalCustom_ggYRBCk$lambda$3((State) objRememberedValue2), progressIndicatorDefaults.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(stringCompanionObject), null, composerStartRestartGroup, 0, 20);
                                if (c2046Dp2 == null) {
                                    c2046Dp2.m13680unboximpl();
                                    borderStroke = new BorderStroke(c2046Dp2.m13680unboximpl(), brush2, null);
                                } else {
                                    borderStroke = null;
                                }
                                BorderStroke borderStroke2 = borderStroke;
                                RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f7);
                                long jColorResource = ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6);
                                final C2046Dp c2046Dp4 = c2046Dp2;
                                final boolean z19 = z8;
                                final int i47 = i32;
                                final float f19 = f6;
                                final float f20 = f8;
                                int i48 = i31;
                                final boolean z20 = z7;
                                Brush brush4 = brush2;
                                final boolean z21 = z6;
                                int i49 = i32;
                                final boolean z22 = z5;
                                final int i50 = i30;
                                final int i51 = i29;
                                final TextStyle textStyle4 = textStyle2;
                                final float f21 = f9;
                                final float f22 = f10;
                                final int i52 = i28;
                                final ContentScale contentScale4 = contentScale2;
                                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2
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
                                    public final void invoke(@Nullable Composer composer3, int i53) {
                                        if ((i53 & 11) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2130744985, i53, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous> (ProgressBarHorizontalCustom.kt:113)");
                                            }
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            C2046Dp c2046Dp5 = c2046Dp4;
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m8123padding3ABfNKs(companion, c2046Dp5 != null ? c2046Dp5.m13680unboximpl() : C2046Dp.m13666constructorimpl(0)), 0.0f, 1, null);
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            Alignment center = companion2.getCenter();
                                            final Brush brush5 = trackColor;
                                            final boolean z23 = z19;
                                            final State<Float> state2 = stateAnimateFloatAsState2;
                                            final int i54 = i47;
                                            final Brush brush6 = thumbBgColor;
                                            final float f23 = f19;
                                            final State<Float> state3 = stateAnimateFloatAsState;
                                            final State<Float> state4 = state;
                                            final Brush brush7 = thumbColor;
                                            float f24 = f20;
                                            boolean z24 = z20;
                                            boolean z25 = z21;
                                            boolean z26 = z22;
                                            final int i55 = i50;
                                            final int i56 = i51;
                                            final int i57 = i;
                                            final int i58 = i2;
                                            final TextStyle textStyle5 = textStyle4;
                                            final float f25 = f21;
                                            final float f26 = f22;
                                            final C2046Dp c2046Dp6 = c2046Dp4;
                                            final int i59 = i52;
                                            final ContentScale contentScale5 = contentScale4;
                                            composer3.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                            composer3.startReplaceableGroup(1032046788);
                                            boolean zChanged = composer3.changed(brush5) | composer3.changed(z23) | composer3.changed(state2) | composer3.changed(i54) | composer3.changed(brush6) | composer3.changed(f23) | composer3.changed(state3) | composer3.changed(state4) | composer3.changed(brush7);
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$1$1
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
                                                        float fM11168getWidthimpl;
                                                        float fM11168getWidthimpl2;
                                                        float fM11168getWidthimpl3;
                                                        float fProgressBarHorizontalCustom_ggYRBCk$lambda$12;
                                                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                                        DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, brush5, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, 0.0f, null, null, 0, 250, null);
                                                        if (z23) {
                                                            fM11168getWidthimpl = ProgressBarHorizontalCustomKt.ProgressBarHorizontalCustom_ggYRBCk$lambda$5(state2);
                                                            fM11168getWidthimpl2 = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                        } else {
                                                            fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                            fM11168getWidthimpl2 = i54;
                                                        }
                                                        DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, brush6, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(fM11168getWidthimpl * fM11168getWidthimpl2, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, f23, null, null, 0, ArjArchiveInputStream.ARJ_MAGIC_2, null);
                                                        if (z23) {
                                                            fM11168getWidthimpl3 = ProgressBarHorizontalCustomKt.ProgressBarHorizontalCustom_ggYRBCk$lambda$4(state3);
                                                            fProgressBarHorizontalCustom_ggYRBCk$lambda$12 = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                        } else {
                                                            fM11168getWidthimpl3 = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                            fProgressBarHorizontalCustom_ggYRBCk$lambda$12 = ProgressBarHorizontalCustomKt.ProgressBarHorizontalCustom_ggYRBCk$lambda$1(state4);
                                                        }
                                                        DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, brush7, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(fM11168getWidthimpl3 * fProgressBarHorizontalCustom_ggYRBCk$lambda$12, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, 0.0f, null, null, 0, 250, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer3.endReplaceableGroup();
                                            CanvasKt.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue3, composer3, 6);
                                            Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), f24, 0.0f, 2, null);
                                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                            composer3.startReplaceableGroup(693286680);
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                            composer3.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            ComposeExtensionKt.IfTrue(Boolean.valueOf(z25), ComposableLambdaKt.composableLambda(composer3, -1024493605, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i60) {
                                                    if ((i60 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1024493605, i60, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressBarHorizontalCustom.kt:158)");
                                                        }
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(i56, composer4, 0), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer4, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(i55, composer4, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 48);
                                            ComposeExtensionKt.IfTrue(Boolean.valueOf(z26), ComposableLambdaKt.composableLambda(composer3, 506541330, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$2$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i60) {
                                                    if ((i60 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(506541330, i60, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressBarHorizontalCustom.kt:168)");
                                                        }
                                                        TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_current_and_max_values_with_spaces, new Object[]{Integer.valueOf(i57), Integer.valueOf(i58)}, composer4, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer4, 0, 0, 65534);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 48);
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            ComposeExtensionKt.IfTrue(Boolean.valueOf(z24), ComposableLambdaKt.composableLambda(composer3, -2041052041, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                @Composable
                                                public final void invoke(@Nullable Composer composer4, int i60) {
                                                    if ((i60 & 11) != 2 || !composer4.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2041052041, i60, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous>.<anonymous>.<anonymous> (ProgressBarHorizontalCustom.kt:180)");
                                                        }
                                                        Modifier modifierScale = ScaleKt.scale(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), f25, f26);
                                                        C2046Dp c2046Dp7 = c2046Dp6;
                                                        ImageKt.Image(PainterResources_androidKt.painterResource(i59, composer4, 0), (String) null, PaddingKt.m8123padding3ABfNKs(modifierScale, c2046Dp7 != null ? c2046Dp7.m13680unboximpl() : C2046Dp.m13666constructorimpl(0)), (Alignment) null, contentScale5, 0.0f, (ColorFilter) null, composer4, 56, 104);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer4.skipToGroupEnd();
                                                }
                                            }), composer3, 48);
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
                                SurfaceKt.m9876SurfaceT9BRK9s(modifier2, roundedCornerShapeM8392RoundedCornerShape0680j_4, jColorResource, 0L, 0.0f, 0.0f, borderStroke2, ComposableLambdaKt.composableLambda(composer2, 2130744985, true, function2), composer2, 12582912 | (i48 & 14), 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f11 = f6;
                                c2046Dp3 = c2046Dp2;
                                f12 = f7;
                                f13 = f8;
                                z11 = z5;
                                textStyle3 = textStyle2;
                                z12 = z6;
                                i34 = i29;
                                i35 = i30;
                                f14 = f9;
                                f15 = f10;
                                z13 = z7;
                                brush3 = brush4;
                                contentScale3 = contentScale2;
                                z14 = z8;
                                i36 = i28;
                                i37 = i49;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                i37 = i3;
                                f11 = f;
                                c2046Dp3 = c2046Dp;
                                brush3 = brush;
                                f12 = f2;
                                f13 = f3;
                                z11 = z;
                                textStyle3 = textStyle;
                                z12 = z2;
                                i34 = i4;
                                i35 = i5;
                                f14 = f4;
                                f15 = f5;
                                z13 = z3;
                                contentScale3 = contentScale;
                                z14 = z4;
                                i36 = i6;
                                composer2 = composerStartRestartGroup;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier4 = modifier2;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer3, int i53) {
                                        ProgressBarHorizontalCustomKt.m15101ProgressBarHorizontalCustomggYRBCk(modifier4, i, i2, i37, trackColor, thumbColor, thumbBgColor, f11, c2046Dp3, brush3, f12, f13, z11, textStyle3, z12, i34, i35, f14, f15, z13, contentScale3, z14, i36, composer3, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), RecomposeScopeImplKt.updateChangedFlags(i8), RecomposeScopeImplKt.updateChangedFlags(i9), i10);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i43 |= 384;
                        if ((i11 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i7 & 1) != 0) {
                                if (i39 == 0) {
                                }
                                if (i40 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if ((i10 & 512) == 0) {
                                }
                                if ((i10 & 1024) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i10 & 8192) == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i19 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i21 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i23 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                i31 = i11;
                                i32 = i44;
                                brush2 = brushM11289horizontalGradient8A3gB4$default;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(-1746344980);
                                z9 = ((i31 & 112) != 32) | ((i31 & 896) != 256);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z9) {
                                    i33 = i2;
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$currentProgress$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        public final Float invoke() {
                                            return Float.valueOf(i / i33);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    final State<Float> state2 = (State) objRememberedValue;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.startReplaceableGroup(-1746344818);
                                    if ((i31 & 7168) != 2048) {
                                    }
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!z10) {
                                        objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$previewProgress$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            @NotNull
                                            public final Float invoke() {
                                                return Float.valueOf(i32 / i33);
                                            }
                                        });
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        float fProgressBarHorizontalCustom_ggYRBCk$lambda$12 = ProgressBarHorizontalCustom_ggYRBCk$lambda$1(state2);
                                        ProgressIndicatorDefaults progressIndicatorDefaults2 = ProgressIndicatorDefaults.INSTANCE;
                                        SpringSpec<Float> progressAnimationSpec2 = progressIndicatorDefaults2.getProgressAnimationSpec();
                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                        final State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(fProgressBarHorizontalCustom_ggYRBCk$lambda$12, progressAnimationSpec2, 0.0f, AnyExtensionKt.empty(stringCompanionObject2), null, composerStartRestartGroup, 0, 20);
                                        final State<Float> stateAnimateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(ProgressBarHorizontalCustom_ggYRBCk$lambda$3((State) objRememberedValue2), progressIndicatorDefaults2.getProgressAnimationSpec(), 0.0f, AnyExtensionKt.empty(stringCompanionObject2), null, composerStartRestartGroup, 0, 20);
                                        if (c2046Dp2 == null) {
                                        }
                                        BorderStroke borderStroke22 = borderStroke;
                                        RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(f7);
                                        long jColorResource2 = ColorResources_androidKt.colorResource(R.color.transparent, composerStartRestartGroup, 6);
                                        final C2046Dp c2046Dp42 = c2046Dp2;
                                        final boolean z192 = z8;
                                        final int i472 = i32;
                                        final float f192 = f6;
                                        final float f202 = f8;
                                        int i482 = i31;
                                        final boolean z202 = z7;
                                        Brush brush42 = brush2;
                                        final boolean z212 = z6;
                                        int i492 = i32;
                                        final boolean z222 = z5;
                                        final int i502 = i30;
                                        final int i512 = i29;
                                        final TextStyle textStyle42 = textStyle2;
                                        final float f212 = f9;
                                        final float f222 = f10;
                                        final int i522 = i28;
                                        final ContentScale contentScale42 = contentScale2;
                                        Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2
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
                                            public final void invoke(@Nullable Composer composer3, int i53) {
                                                if ((i53 & 11) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(2130744985, i53, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous> (ProgressBarHorizontalCustom.kt:113)");
                                                    }
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    C2046Dp c2046Dp5 = c2046Dp42;
                                                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m8123padding3ABfNKs(companion, c2046Dp5 != null ? c2046Dp5.m13680unboximpl() : C2046Dp.m13666constructorimpl(0)), 0.0f, 1, null);
                                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                                    Alignment center = companion2.getCenter();
                                                    final Brush brush5 = trackColor;
                                                    final boolean z23 = z192;
                                                    final State<Float> state22 = stateAnimateFloatAsState22;
                                                    final int i54 = i472;
                                                    final Brush brush6 = thumbBgColor;
                                                    final float f23 = f192;
                                                    final State<Float> state3 = stateAnimateFloatAsState3;
                                                    final State<Float> state4 = state2;
                                                    final Brush brush7 = thumbColor;
                                                    float f24 = f202;
                                                    boolean z24 = z202;
                                                    boolean z25 = z212;
                                                    boolean z26 = z222;
                                                    final int i55 = i502;
                                                    final int i56 = i512;
                                                    final int i57 = i;
                                                    final int i58 = i2;
                                                    final TextStyle textStyle5 = textStyle42;
                                                    final float f25 = f212;
                                                    final float f26 = f222;
                                                    final C2046Dp c2046Dp6 = c2046Dp42;
                                                    final int i59 = i522;
                                                    final ContentScale contentScale5 = contentScale42;
                                                    composer3.startReplaceableGroup(733328855);
                                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                                    composer3.startReplaceableGroup(1032046788);
                                                    boolean zChanged = composer3.changed(brush5) | composer3.changed(z23) | composer3.changed(state22) | composer3.changed(i54) | composer3.changed(brush6) | composer3.changed(f23) | composer3.changed(state3) | composer3.changed(state4) | composer3.changed(brush7);
                                                    Object objRememberedValue3 = composer3.rememberedValue();
                                                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$1$1
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
                                                                float fM11168getWidthimpl;
                                                                float fM11168getWidthimpl2;
                                                                float fM11168getWidthimpl3;
                                                                float fProgressBarHorizontalCustom_ggYRBCk$lambda$122;
                                                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                                                DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, brush5, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, 0.0f, null, null, 0, 250, null);
                                                                if (z23) {
                                                                    fM11168getWidthimpl = ProgressBarHorizontalCustomKt.ProgressBarHorizontalCustom_ggYRBCk$lambda$5(state22);
                                                                    fM11168getWidthimpl2 = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                                } else {
                                                                    fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                                    fM11168getWidthimpl2 = i54;
                                                                }
                                                                DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, brush6, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(fM11168getWidthimpl * fM11168getWidthimpl2, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, f23, null, null, 0, ArjArchiveInputStream.ARJ_MAGIC_2, null);
                                                                if (z23) {
                                                                    fM11168getWidthimpl3 = ProgressBarHorizontalCustomKt.ProgressBarHorizontalCustom_ggYRBCk$lambda$4(state3);
                                                                    fProgressBarHorizontalCustom_ggYRBCk$lambda$122 = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                                } else {
                                                                    fM11168getWidthimpl3 = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                                                                    fProgressBarHorizontalCustom_ggYRBCk$lambda$122 = ProgressBarHorizontalCustomKt.ProgressBarHorizontalCustom_ggYRBCk$lambda$1(state4);
                                                                }
                                                                DrawScope.m11885drawRoundRectZuiqVtQ$default(Canvas, brush7, 0L, androidx.compose.p003ui.geometry.SizeKt.Size(fM11168getWidthimpl3 * fProgressBarHorizontalCustom_ggYRBCk$lambda$122, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())), 0L, 0.0f, null, null, 0, 250, null);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    composer3.endReplaceableGroup();
                                                    CanvasKt.Canvas(modifierFillMaxSize$default2, (Function1) objRememberedValue3, composer3, 6);
                                                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), f24, 0.0f, 2, null);
                                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                    composer3.startReplaceableGroup(693286680);
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                                    composer3.startReplaceableGroup(-1323940314);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
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
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer3)), composer3, 0);
                                                    composer3.startReplaceableGroup(2058660585);
                                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z25), ComposableLambdaKt.composableLambda(composer3, -1024493605, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i60) {
                                                            if ((i60 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-1024493605, i60, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressBarHorizontalCustom.kt:158)");
                                                                }
                                                                ImageKt.Image(PainterResources_androidKt.painterResource(i56, composer4, 0), (String) null, SizeKt.m8172size3ABfNKs(PaddingKt.m8127paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composer4, 6), 0.0f, 11, null), PrimitiveResources_androidKt.dimensionResource(i55, composer4, 0)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 48);
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z26), ComposableLambdaKt.composableLambda(composer3, 506541330, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$2$2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i60) {
                                                            if ((i60 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(506541330, i60, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProgressBarHorizontalCustom.kt:168)");
                                                                }
                                                                TextKt.m10024Text4IGK_g(StringResources_androidKt.stringResource(R.string.common_current_and_max_values_with_spaces, new Object[]{Integer.valueOf(i57), Integer.valueOf(i58)}, composer4, 70), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle5, composer4, 0, 0, 65534);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                    composer3.endNode();
                                                    composer3.endReplaceableGroup();
                                                    composer3.endReplaceableGroup();
                                                    ComposeExtensionKt.IfTrue(Boolean.valueOf(z24), ComposableLambdaKt.composableLambda(composer3, -2041052041, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt$ProgressBarHorizontalCustom$2$1$3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                                        @Composable
                                                        public final void invoke(@Nullable Composer composer4, int i60) {
                                                            if ((i60 & 11) != 2 || !composer4.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-2041052041, i60, -1, "com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustom.<anonymous>.<anonymous>.<anonymous> (ProgressBarHorizontalCustom.kt:180)");
                                                                }
                                                                Modifier modifierScale = ScaleKt.scale(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), f25, f26);
                                                                C2046Dp c2046Dp7 = c2046Dp6;
                                                                ImageKt.Image(PainterResources_androidKt.painterResource(i59, composer4, 0), (String) null, PaddingKt.m8123padding3ABfNKs(modifierScale, c2046Dp7 != null ? c2046Dp7.m13680unboximpl() : C2046Dp.m13666constructorimpl(0)), (Alignment) null, contentScale5, 0.0f, (ColorFilter) null, composer4, 56, 104);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer4.skipToGroupEnd();
                                                        }
                                                    }), composer3, 48);
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
                                        SurfaceKt.m9876SurfaceT9BRK9s(modifier2, roundedCornerShapeM8392RoundedCornerShape0680j_42, jColorResource2, 0L, 0.0f, 0.0f, borderStroke22, ComposableLambdaKt.composableLambda(composer2, 2130744985, true, function22), composer2, 12582912 | (i482 & 14), 56);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        f11 = f6;
                                        c2046Dp3 = c2046Dp2;
                                        f12 = f7;
                                        f13 = f8;
                                        z11 = z5;
                                        textStyle3 = textStyle2;
                                        z12 = z6;
                                        i34 = i29;
                                        i35 = i30;
                                        f14 = f9;
                                        f15 = f10;
                                        z13 = z7;
                                        brush3 = brush42;
                                        contentScale3 = contentScale2;
                                        z14 = z8;
                                        i36 = i28;
                                        i37 = i492;
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i8 & 7168) == 0) {
                    }
                    i18 = i10 & 16384;
                    if (i18 != 0) {
                    }
                    i19 = i10 & 32768;
                    if (i19 != 0) {
                    }
                    i20 = i10 & 65536;
                    if (i20 != 0) {
                    }
                    i21 = i10 & 131072;
                    if (i21 != 0) {
                    }
                    i22 = i10 & 262144;
                    if (i22 != 0) {
                    }
                    i23 = i10 & 524288;
                    if (i23 != 0) {
                    }
                    i24 = i10 & 1048576;
                    if (i24 != 0) {
                    }
                    i26 = i10 & 2097152;
                    if (i26 != 0) {
                    }
                    int i432 = i25;
                    i27 = i10 & 4194304;
                    if (i27 == 0) {
                    }
                    if ((i11 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i11 |= i38;
                i13 = i10 & 128;
                if (i13 == 0) {
                }
                i14 = i10 & 256;
                if (i14 == 0) {
                }
                if ((i7 & 1879048192) == 0) {
                }
                if ((i8 & 14) != 0) {
                }
                i16 = i10 & 2048;
                if (i16 == 0) {
                }
                int i422 = i15;
                i17 = i10 & 4096;
                if (i17 == 0) {
                }
                if ((i8 & 7168) == 0) {
                }
                i18 = i10 & 16384;
                if (i18 != 0) {
                }
                i19 = i10 & 32768;
                if (i19 != 0) {
                }
                i20 = i10 & 65536;
                if (i20 != 0) {
                }
                i21 = i10 & 131072;
                if (i21 != 0) {
                }
                i22 = i10 & 262144;
                if (i22 != 0) {
                }
                i23 = i10 & 524288;
                if (i23 != 0) {
                }
                i24 = i10 & 1048576;
                if (i24 != 0) {
                }
                i26 = i10 & 2097152;
                if (i26 != 0) {
                }
                int i4322 = i25;
                i27 = i10 & 4194304;
                if (i27 == 0) {
                }
                if ((i11 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i11 |= i12;
            if ((i10 & 64) == 0) {
            }
            i11 |= i38;
            i13 = i10 & 128;
            if (i13 == 0) {
            }
            i14 = i10 & 256;
            if (i14 == 0) {
            }
            if ((i7 & 1879048192) == 0) {
            }
            if ((i8 & 14) != 0) {
            }
            i16 = i10 & 2048;
            if (i16 == 0) {
            }
            int i4222 = i15;
            i17 = i10 & 4096;
            if (i17 == 0) {
            }
            if ((i8 & 7168) == 0) {
            }
            i18 = i10 & 16384;
            if (i18 != 0) {
            }
            i19 = i10 & 32768;
            if (i19 != 0) {
            }
            i20 = i10 & 65536;
            if (i20 != 0) {
            }
            i21 = i10 & 131072;
            if (i21 != 0) {
            }
            i22 = i10 & 262144;
            if (i22 != 0) {
            }
            i23 = i10 & 524288;
            if (i23 != 0) {
            }
            i24 = i10 & 1048576;
            if (i24 != 0) {
            }
            i26 = i10 & 2097152;
            if (i26 != 0) {
            }
            int i43222 = i25;
            i27 = i10 & 4194304;
            if (i27 == 0) {
            }
            if ((i11 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i10 & 16) == 0) {
        }
        if ((i10 & 32) == 0) {
        }
        i11 |= i12;
        if ((i10 & 64) == 0) {
        }
        i11 |= i38;
        i13 = i10 & 128;
        if (i13 == 0) {
        }
        i14 = i10 & 256;
        if (i14 == 0) {
        }
        if ((i7 & 1879048192) == 0) {
        }
        if ((i8 & 14) != 0) {
        }
        i16 = i10 & 2048;
        if (i16 == 0) {
        }
        int i42222 = i15;
        i17 = i10 & 4096;
        if (i17 == 0) {
        }
        if ((i8 & 7168) == 0) {
        }
        i18 = i10 & 16384;
        if (i18 != 0) {
        }
        i19 = i10 & 32768;
        if (i19 != 0) {
        }
        i20 = i10 & 65536;
        if (i20 != 0) {
        }
        i21 = i10 & 131072;
        if (i21 != 0) {
        }
        i22 = i10 & 262144;
        if (i22 != 0) {
        }
        i23 = i10 & 524288;
        if (i23 != 0) {
        }
        i24 = i10 & 1048576;
        if (i24 != 0) {
        }
        i26 = i10 & 2097152;
        if (i26 != 0) {
        }
        int i432222 = i25;
        i27 = i10 & 4194304;
        if (i27 == 0) {
        }
        if ((i11 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "ProgressBarHorizontalCustom")
    public static final void PreviewProgressBarHorizontalCustom(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(537394882);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(537394882, i, -1, "com.blackhub.bronline.game.ui.widget.progressbar.PreviewProgressBarHorizontalCustom (ProgressBarHorizontalCustom.kt:196)");
            }
            Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(SizeKt.m8158height3ABfNKs(Modifier.INSTANCE, C2046Dp.m13666constructorimpl(30)), C2046Dp.m13666constructorimpl(200));
            Brush.Companion companion = Brush.INSTANCE;
            composer2 = composerStartRestartGroup;
            m15101ProgressBarHorizontalCustomggYRBCk(modifierM8177width3ABfNKs, 60, 100, 90, Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.gray, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m11297verticalGradient8A3gB4$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6)), Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.green, composerStartRestartGroup, 6))}), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, null, null, 0.0f, 0.0f, false, null, false, 0, 0, 0.0f, 0.0f, true, null, false, 0, composer2, 3510, 805306368, 0, 7864192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.progressbar.ProgressBarHorizontalCustomKt.PreviewProgressBarHorizontalCustom.1
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
                    ProgressBarHorizontalCustomKt.PreviewProgressBarHorizontalCustom(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final float ProgressBarHorizontalCustom_ggYRBCk$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float ProgressBarHorizontalCustom_ggYRBCk$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float ProgressBarHorizontalCustom_ggYRBCk$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float ProgressBarHorizontalCustom_ggYRBCk$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }
}

