package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public abstract class CustomTabsServiceConnection implements ServiceConnection {

    @Nullable
    public Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new CustomTabsClient(ICustomTabsService.Stub.asInterface(iBinder), componentName, this.mApplicationContext) { // from class: androidx.browser.customtabs.CustomTabsServiceConnection.1
            public C02241(ICustomTabsService iCustomTabsService, ComponentName componentName2, Context context) {
                super(iCustomTabsService, componentName2, context);
            }
        });
    }

    /* renamed from: androidx.browser.customtabs.CustomTabsServiceConnection$1 */
    public class C02241 extends CustomTabsClient {
        public C02241(ICustomTabsService iCustomTabsService, ComponentName componentName2, Context context) {
            super(iCustomTabsService, componentName2, context);
        }
    }
}
