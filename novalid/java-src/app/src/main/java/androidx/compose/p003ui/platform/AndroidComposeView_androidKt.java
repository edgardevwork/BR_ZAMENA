package androidx.compose.p003ui.platform;

import android.content.res.Configuration;
import androidx.compose.p003ui.graphics.Matrix;
import androidx.compose.p003ui.text.input.PlatformTextInputService;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(m7104d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\u001a2\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0011H\u0002\u001a\u001e\u0010\u0018\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a.\u0010\u001d\u001a\u00020\u0019*\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\"&\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m7105d2 = {"platformTextInputServiceInterceptor", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "getPlatformTextInputServiceInterceptor", "()Lkotlin/jvm/functions/Function1;", "setPlatformTextInputServiceInterceptor", "(Lkotlin/jvm/functions/Function1;)V", "localeLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", TtmlNode.TEXT_EMPHASIS_MARK_DOT, "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "layoutDirectionFromInt", "layoutDirection", "preTransform", "", "other", "preTransform-JiSxe2E", "([F[F)V", "preTranslate", "x", "y", "tmpMatrix", "preTranslate-cG2Xzmc", "([FFF[F)V", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2348:1\n42#2,2:2349\n42#2,2:2351\n42#2,2:2353\n42#2,2:2355\n42#2,2:2357\n42#2,2:2359\n42#2,2:2361\n42#2,2:2363\n42#2,2:2365\n42#2,2:2367\n42#2,2:2369\n42#2,2:2371\n42#2,2:2373\n42#2,2:2375\n42#2,2:2377\n42#2,2:2379\n39#2:2381\n39#2:2382\n39#2:2383\n39#2:2384\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n2124#1:2349,2\n2125#1:2351,2\n2126#1:2353,2\n2127#1:2355,2\n2128#1:2357,2\n2129#1:2359,2\n2130#1:2361,2\n2131#1:2363,2\n2132#1:2365,2\n2133#1:2367,2\n2134#1:2369,2\n2135#1:2371,2\n2136#1:2373,2\n2137#1:2375,2\n2138#1:2377,2\n2139#1:2379,2\n2153#1:2381\n2154#1:2382\n2155#1:2383\n2156#1:2384\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidComposeView_androidKt {

    @NotNull
    private static Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> platformTextInputServiceInterceptor = new Function1<PlatformTextInputService, PlatformTextInputService>() { // from class: androidx.compose.ui.platform.AndroidComposeView_androidKt$platformTextInputServiceInterceptor$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final PlatformTextInputService invoke(@NotNull PlatformTextInputService platformTextInputService) {
            return platformTextInputService;
        }
    };

    @NotNull
    public static final Function1<PlatformTextInputService, PlatformTextInputService> getPlatformTextInputServiceInterceptor() {
        return platformTextInputServiceInterceptor;
    }

    public static final void setPlatformTextInputServiceInterceptor(@NotNull Function1<? super PlatformTextInputService, ? extends PlatformTextInputService> function1) {
        platformTextInputServiceInterceptor = function1;
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i == 1) {
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m12914preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM12913dotp89u6pk = m12913dotp89u6pk(fArr2, 0, fArr, 0);
        float fM12913dotp89u6pk2 = m12913dotp89u6pk(fArr2, 0, fArr, 1);
        float fM12913dotp89u6pk3 = m12913dotp89u6pk(fArr2, 0, fArr, 2);
        float fM12913dotp89u6pk4 = m12913dotp89u6pk(fArr2, 0, fArr, 3);
        float fM12913dotp89u6pk5 = m12913dotp89u6pk(fArr2, 1, fArr, 0);
        float fM12913dotp89u6pk6 = m12913dotp89u6pk(fArr2, 1, fArr, 1);
        float fM12913dotp89u6pk7 = m12913dotp89u6pk(fArr2, 1, fArr, 2);
        float fM12913dotp89u6pk8 = m12913dotp89u6pk(fArr2, 1, fArr, 3);
        float fM12913dotp89u6pk9 = m12913dotp89u6pk(fArr2, 2, fArr, 0);
        float fM12913dotp89u6pk10 = m12913dotp89u6pk(fArr2, 2, fArr, 1);
        float fM12913dotp89u6pk11 = m12913dotp89u6pk(fArr2, 2, fArr, 2);
        float fM12913dotp89u6pk12 = m12913dotp89u6pk(fArr2, 2, fArr, 3);
        float fM12913dotp89u6pk13 = m12913dotp89u6pk(fArr2, 3, fArr, 0);
        float fM12913dotp89u6pk14 = m12913dotp89u6pk(fArr2, 3, fArr, 1);
        float fM12913dotp89u6pk15 = m12913dotp89u6pk(fArr2, 3, fArr, 2);
        float fM12913dotp89u6pk16 = m12913dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM12913dotp89u6pk;
        fArr[1] = fM12913dotp89u6pk2;
        fArr[2] = fM12913dotp89u6pk3;
        fArr[3] = fM12913dotp89u6pk4;
        fArr[4] = fM12913dotp89u6pk5;
        fArr[5] = fM12913dotp89u6pk6;
        fArr[6] = fM12913dotp89u6pk7;
        fArr[7] = fM12913dotp89u6pk8;
        fArr[8] = fM12913dotp89u6pk9;
        fArr[9] = fM12913dotp89u6pk10;
        fArr[10] = fM12913dotp89u6pk11;
        fArr[11] = fM12913dotp89u6pk12;
        fArr[12] = fM12913dotp89u6pk13;
        fArr[13] = fM12913dotp89u6pk14;
        fArr[14] = fM12913dotp89u6pk15;
        fArr[15] = fM12913dotp89u6pk16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: preTranslate-cG2Xzmc, reason: not valid java name */
    public static final void m12915preTranslatecG2Xzmc(float[] fArr, float f, float f2, float[] fArr2) {
        Matrix.m11580resetimpl(fArr2);
        Matrix.m11591translateimpl$default(fArr2, f, f2, 0.0f, 4, null);
        m12914preTransformJiSxe2E(fArr, fArr2);
    }

    /* renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m12913dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }
}
