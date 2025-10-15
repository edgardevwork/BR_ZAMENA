package com.blackhub.bronline.game.p019ui.widget.utils;

import android.content.Context;
import androidx.annotation.RawRes;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageSvgLocal.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aZ\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m7105d2 = {"ImageSvgLocal", "", "model", "Lcoil/request/ImageRequest;", "modifier", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "ImageSvgLocal-Ay9G7rc", "(Lcoil/request/ImageRequest;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nImageSvgLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageSvgLocal.kt\ncom/blackhub/bronline/game/ui/widget/utils/ImageSvgLocalKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,65:1\n74#2:66\n*S KotlinDebug\n*F\n+ 1 ImageSvgLocal.kt\ncom/blackhub/bronline/game/ui/widget/utils/ImageSvgLocalKt\n*L\n30#1:66\n*E\n"})
/* loaded from: classes3.dex */
public final class ImageSvgLocalKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    @Composable
    /* renamed from: ImageSvgLocal-Ay9G7rc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15121ImageSvgLocalAy9G7rc(@RawRes final int i, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i2, @Nullable Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        Alignment center;
        int i7;
        ContentScale fit;
        int i8;
        float f2;
        int i9;
        ColorFilter colorFilter2;
        int i10;
        Modifier modifier3;
        int i11;
        int iM11891getDefaultFilterQualityfv9h1I;
        ContentScale contentScale2;
        float f3;
        final Modifier modifier4;
        final ContentScale contentScale3;
        final Alignment alignment2;
        final int i12;
        final ColorFilter colorFilter3;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(801836727);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 896) == 0) {
                    center = alignment;
                    i5 |= composerStartRestartGroup.changed(center) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 7168) == 0) {
                        fit = contentScale;
                        i5 |= composerStartRestartGroup.changed(fit) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((57344 & i3) == 0) {
                            f2 = f;
                            i5 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 == 0) {
                            if ((i3 & 458752) == 0) {
                                colorFilter2 = colorFilter;
                                i5 |= composerStartRestartGroup.changed(colorFilter2) ? 131072 : 65536;
                            }
                            if ((i3 & 3670016) != 0) {
                                i10 = i2;
                                i5 |= ((i4 & 64) == 0 && composerStartRestartGroup.changed(i10)) ? 1048576 : 524288;
                            } else {
                                i10 = i2;
                            }
                            if ((i5 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        center = Alignment.INSTANCE.getCenter();
                                    }
                                    if (i7 != 0) {
                                        fit = ContentScale.INSTANCE.getFit();
                                    }
                                    if (i8 != 0) {
                                        f2 = 1.0f;
                                    }
                                    if (i9 != 0) {
                                        colorFilter2 = null;
                                    }
                                    if ((i4 & 64) == 0) {
                                        i11 = i5 & (-3670017);
                                        iM11891getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I();
                                        contentScale2 = fit;
                                        f3 = f2;
                                        ColorFilter colorFilter4 = colorFilter2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(801836727, i11, -1, "com.blackhub.bronline.game.ui.widget.utils.ImageSvgLocal (ImageSvgLocal.kt:27)");
                                        }
                                        int i14 = ((i11 << 3) & 896) | 56;
                                        int i15 = i11 << 9;
                                        SingletonAsyncImageKt.m14279AsyncImage3HmZ8SU(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(Integer.valueOf(i)).decoderFactory(new SvgDecoder.Factory(false, 1, null)).build(), null, modifier3, null, null, center, contentScale2, f3, colorFilter4, iM11891getDefaultFilterQualityfv9h1I, composerStartRestartGroup, i14 | (458752 & i15) | (i15 & 3670016) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), 24);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier4 = modifier3;
                                        float f5 = f3;
                                        contentScale3 = contentScale2;
                                        alignment2 = center;
                                        i12 = iM11891getDefaultFilterQualityfv9h1I;
                                        colorFilter3 = colorFilter4;
                                        f4 = f5;
                                    } else {
                                        i11 = i5;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                    i11 = i5;
                                    modifier3 = modifier2;
                                }
                                contentScale2 = fit;
                                f3 = f2;
                                iM11891getDefaultFilterQualityfv9h1I = i10;
                                ColorFilter colorFilter42 = colorFilter2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i142 = ((i11 << 3) & 896) | 56;
                                int i152 = i11 << 9;
                                SingletonAsyncImageKt.m14279AsyncImage3HmZ8SU(new ImageRequest.Builder((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(Integer.valueOf(i)).decoderFactory(new SvgDecoder.Factory(false, 1, null)).build(), null, modifier3, null, null, center, contentScale2, f3, colorFilter42, iM11891getDefaultFilterQualityfv9h1I, composerStartRestartGroup, i142 | (458752 & i152) | (i152 & 3670016) | (29360128 & i152) | (234881024 & i152) | (i152 & 1879048192), 24);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                float f52 = f3;
                                contentScale3 = contentScale2;
                                alignment2 = center;
                                i12 = iM11891getDefaultFilterQualityfv9h1I;
                                colorFilter3 = colorFilter42;
                                f4 = f52;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                alignment2 = center;
                                contentScale3 = fit;
                                f4 = f2;
                                i12 = i10;
                                colorFilter3 = colorFilter2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.ImageSvgLocalKt$ImageSvgLocal$1
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
                                        ImageSvgLocalKt.m15121ImageSvgLocalAy9G7rc(i, modifier4, alignment2, contentScale3, f4, colorFilter3, i12, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        colorFilter2 = colorFilter;
                        if ((i3 & 3670016) != 0) {
                        }
                        if ((i5 & 2995931) == 599186) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                                if (i13 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i9 != 0) {
                                }
                                if ((i4 & 64) == 0) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    i9 = i4 & 32;
                    if (i9 == 0) {
                    }
                    colorFilter2 = colorFilter;
                    if ((i3 & 3670016) != 0) {
                    }
                    if ((i5 & 2995931) == 599186) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fit = contentScale;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                f2 = f;
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                colorFilter2 = colorFilter;
                if ((i3 & 3670016) != 0) {
                }
                if ((i5 & 2995931) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            center = alignment;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            fit = contentScale;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            f2 = f;
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            colorFilter2 = colorFilter;
            if ((i3 & 3670016) != 0) {
            }
            if ((i5 & 2995931) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        center = alignment;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        fit = contentScale;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        f2 = f;
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        colorFilter2 = colorFilter;
        if ((i3 & 3670016) != 0) {
        }
        if ((i5 & 2995931) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    /* renamed from: ImageSvgLocal-Ay9G7rc, reason: not valid java name */
    public static final void m15122ImageSvgLocalAy9G7rc(@NotNull final ImageRequest model, @Nullable Modifier modifier, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, final int i2, final int i3) {
        int iM11891getDefaultFilterQualityfv9h1I;
        int i4;
        Intrinsics.checkNotNullParameter(model, "model");
        Composer composerStartRestartGroup = composer.startRestartGroup(890598244);
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.INSTANCE : modifier;
        Alignment center = (i3 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 8) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i3 & 16) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 32) != 0 ? null : colorFilter;
        if ((i3 & 64) != 0) {
            i4 = i2 & (-3670017);
            iM11891getDefaultFilterQualityfv9h1I = DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I();
        } else {
            iM11891getDefaultFilterQualityfv9h1I = i;
            i4 = i2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(890598244, i4, -1, "com.blackhub.bronline.game.ui.widget.utils.ImageSvgLocal (ImageSvgLocal.kt:52)");
        }
        SingletonAsyncImageKt.m14280AsyncImageylYTKUw(model, null, modifier2, PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composerStartRestartGroup, 6), null, null, null, null, null, center, fit, f2, colorFilter2, iM11891getDefaultFilterQualityfv9h1I, composerStartRestartGroup, ((i4 << 3) & 896) | 4152 | ((i4 << 21) & 1879048192), (i4 >> 9) & 8190, 496);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final Alignment alignment2 = center;
            final ContentScale contentScale2 = fit;
            final float f3 = f2;
            final ColorFilter colorFilter3 = colorFilter2;
            final int i5 = iM11891getDefaultFilterQualityfv9h1I;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.ImageSvgLocalKt$ImageSvgLocal$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i6) {
                    ImageSvgLocalKt.m15122ImageSvgLocalAy9G7rc(model, modifier3, alignment2, contentScale2, f3, colorFilter3, i5, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }
}
