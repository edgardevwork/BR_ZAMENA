package com.sdkit.paylib.paylibnative.p033ui.activity;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStateManager;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLogger;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8242a;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.C8249c;
import com.sdkit.paylib.paylibnative.p033ui.rootcontainer.internaldi.InterfaceC8254b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0002R\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/activity/PaylibNativeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "a", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "Lcom/sdkit/paylib/payliblogging/api/logging/PaylibLogger;", "logger", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class PaylibNativeActivity extends AppCompatActivity {

    /* renamed from: a, reason: from kotlin metadata */
    public final PaylibLogger logger;

    /* renamed from: com.sdkit.paylib.paylibnative.ui.activity.PaylibNativeActivity$a */
    /* loaded from: classes6.dex */
    public static final class C8090a extends Lambda implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ Bundle f1730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8090a(Bundle bundle) {
            super(0);
            this.f1730b = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onCreate intent: " + PaylibNativeActivity.this.getIntent() + " savedInstanceState(" + this.f1730b + ')';
        }
    }

    /* renamed from: com.sdkit.paylib.paylibnative.ui.activity.PaylibNativeActivity$b */
    /* loaded from: classes6.dex */
    public static final class C8091b extends Lambda implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Intent f1731a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8091b(Intent intent) {
            super(0);
            this.f1731a = intent;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "onNewIntent intent: " + this.f1731a;
        }
    }

    public PaylibNativeActivity() {
        PaylibLoggerFactory loggerFactory;
        InterfaceC8254b interfaceC8254bM2362a = C8242a.f2529a.m2362a();
        this.logger = (interfaceC8254bM2362a == null || (loggerFactory = interfaceC8254bM2362a.getLoggerFactory()) == null) ? null : loggerFactory.get("PaylibNativeActivity");
    }

    /* renamed from: a */
    public final void m1781a() {
        getSupportFragmentManager().beginTransaction().replace(R.id.content, C8249c.INSTANCE.m2408a()).commitAllowingStateLoss();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaylibLogger paylibLogger = this.logger;
        if (paylibLogger != null) {
            PaylibLogger.DefaultImpls.d$default(paylibLogger, null, new C8090a(bundle), 1, null);
        }
        if (bundle == null) {
            m1781a();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PaylibLogger paylibLogger = this.logger;
        if (paylibLogger != null) {
            PaylibLogger.DefaultImpls.d$default(paylibLogger, null, new C8091b(intent), 1, null);
        }
        m1781a();
    }
}
