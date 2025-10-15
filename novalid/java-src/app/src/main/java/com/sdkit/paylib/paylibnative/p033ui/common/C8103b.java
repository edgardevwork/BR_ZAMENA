package com.sdkit.paylib.paylibnative.p033ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import androidx.appcompat.view.ContextThemeWrapper;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.entity.PaylibNativeTheme;
import com.sdkit.paylib.paylibnative.p033ui.config.InterfaceC8131b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnative.ui.common.b */
/* loaded from: classes8.dex */
public final class C8103b {

    /* renamed from: c */
    public static final a f1803c = new a(null);

    /* renamed from: d */
    public static final int[] f1804d;

    /* renamed from: e */
    public static final int f1805e;

    /* renamed from: a */
    public final InterfaceC8131b f1806a;

    /* renamed from: b */
    public final PaylibLogger f1807b;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.b$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1808a;

        static {
            int[] iArr = new int[PaylibNativeTheme.values().length];
            try {
                iArr[PaylibNativeTheme.DEFAULT_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaylibNativeTheme.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaylibNativeTheme.NIGHT_BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1808a = iArr;
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.common.b$c */
    /* loaded from: classes6.dex */
    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "validateOrWrapWithDefaultTheme theme(" + C8103b.this.f1806a.mo2011f() + ')';
        }
    }

    static {
        int[] PaylibNativeTheme = C11403R.styleable.PaylibNativeTheme;
        Intrinsics.checkNotNullExpressionValue(PaylibNativeTheme, "PaylibNativeTheme");
        f1804d = PaylibNativeTheme;
        f1805e = C11403R.style.paylib_native_default_theme;
    }

    public C8103b(InterfaceC8131b config, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f1806a = config;
        this.f1807b = loggerFactory.get("LayoutInflaterThemeValidator");
    }

    /* renamed from: a */
    public final LayoutInflater m1866a(LayoutInflater originalInflater) {
        int i;
        Intrinsics.checkNotNullParameter(originalInflater, "originalInflater");
        Integer numValueOf = null;
        PaylibLogger.DefaultImpls.d$default(this.f1807b, null, new c(), 1, null);
        PaylibNativeTheme paylibNativeThemeMo2011f = this.f1806a.mo2011f();
        int i2 = paylibNativeThemeMo2011f == null ? -1 : b.f1808a[paylibNativeThemeMo2011f.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                i = C11403R.style.paylib_native_default_theme;
            } else if (i2 == 2) {
                i = C11403R.style.paylib_native_light_theme;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C11403R.style.paylib_native_night_blue_theme;
            }
            numValueOf = Integer.valueOf(i);
        }
        Context context = originalInflater.getContext();
        Resources.Theme theme = context.getTheme();
        int[] iArr = f1804d;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(iArr);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…utes(supportedAttributes)");
        if (typedArrayObtainStyledAttributes.getIndexCount() >= iArr.length && numValueOf == null) {
            return originalInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = originalInflater.cloneInContext(new ContextThemeWrapper(context, numValueOf != null ? numValueOf.intValue() : f1805e));
        Intrinsics.checkNotNullExpressionValue(layoutInflaterCloneInContext, "{\n            val target…getThemeStyle))\n        }");
        return layoutInflaterCloneInContext;
    }
}
