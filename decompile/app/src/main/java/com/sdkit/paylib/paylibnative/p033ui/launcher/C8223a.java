package com.sdkit.paylib.paylibnative.p033ui.launcher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.api.presentation.PaylibHostRouter;
import com.sdkit.paylib.paylibnative.p033ui.activity.PaylibNativeActivity;
import com.sdkit.paylib.paylibnative.p033ui.common.EnumC8105d;
import com.sdkit.paylib.paylibnative.p033ui.config.AbstractC8130a;
import com.sdkit.paylib.paylibnative.p033ui.launcher.domain.FinishCodeReceiver;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8249c;
import com.sdkit.paylib.paylibnative.p033ui.utils.AbstractC8375j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.a */
/* loaded from: classes5.dex */
public final class C8223a implements InternalLauncher {

    /* renamed from: e */
    public static final a f2396e = new a(null);

    /* renamed from: f */
    public static final String f2397f = "Add activity to AndroidManifest.xml to use ActivityPaylibNativeApiProviderModule:\n<activity\n    android:name=\"com.sdkit.paylib.paylibnative.ui.activity.PaylibNativeActivity\"\n    android:configChanges=\"screenSize|keyboardHidden|keyboard\"\n    android:launchMode=\"singleTask\"\n    android:theme=\"@style/paylib_native_default_theme\"\n    android:windowSoftInputMode=\"adjustResize\" />";

    /* renamed from: a */
    public final Context f2398a;

    /* renamed from: b */
    public final FinishCodeReceiver f2399b;

    /* renamed from: c */
    public final AbstractC8130a f2400c;

    /* renamed from: d */
    public final PaylibLogger f2401d;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.a$a */
    /* loaded from: classes8.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.launcher.a$b */
    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: a */
        public static final b f2402a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C8223a.f2397f;
        }
    }

    public C8223a(Context appContext, FinishCodeReceiver finishCodeReceiver, AbstractC8130a displayMode, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(finishCodeReceiver, "finishCodeReceiver");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        this.f2398a = appContext;
        this.f2399b = finishCodeReceiver;
        this.f2400c = displayMode;
        this.f2401d = loggerFactory.get("InternalLauncherImpl");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.Context] */
    /* renamed from: b */
    public final void m2247b(Activity activity) {
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f2398a;
        }
        Intent intent = new Intent(activity2, (Class<?>) PaylibNativeActivity.class);
        if (!(activity2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            activity2.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            PaylibLogger.DefaultImpls.e$default(this.f2401d, null, b.f2402a, 1, null);
            this.f2399b.mo2267a(EnumC8105d.UNHANDLED_FORM_ERROR);
        }
    }

    @Override // com.sdkit.paylib.paylibnative.p033ui.launcher.InternalLauncher
    /* renamed from: a */
    public void mo2244a(Activity activity) {
        AbstractC8130a abstractC8130a = this.f2400c;
        if (Intrinsics.areEqual(abstractC8130a, AbstractC8130a.a.f1946a)) {
            m2247b(activity);
        } else {
            if (!(abstractC8130a instanceof AbstractC8130a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            m2246a(((AbstractC8130a.b) this.f2400c).m2005a());
        }
        AbstractC8375j.m3481a(Unit.INSTANCE);
    }

    /* renamed from: a */
    public final void m2246a(PaylibHostRouter paylibHostRouter) {
        paylibHostRouter.showPaylibFragment(C8249c.INSTANCE.m2408a());
    }
}
