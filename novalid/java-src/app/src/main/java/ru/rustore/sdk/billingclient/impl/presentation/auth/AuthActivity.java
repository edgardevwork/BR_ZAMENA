package ru.rustore.sdk.billingclient.impl.presentation.auth;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lru/rustore/sdk/billingclient/impl/presentation/auth/AuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", SegmentConstantPool.INITSTRING, "()V", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes8.dex */
public final class AuthActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final /* synthetic */ int f10549a = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
        if (getSupportFragmentManager().findFragmentByTag("AUTH_DIALOG_TAG") == null) {
            new C11537d().show(getSupportFragmentManager(), "AUTH_DIALOG_TAG");
        }
    }
}
