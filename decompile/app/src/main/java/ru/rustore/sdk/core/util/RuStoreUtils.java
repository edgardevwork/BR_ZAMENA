package ru.rustore.sdk.core.util;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.widget.Toast;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.C11568R;
import ru.rustore.sdk.core.Constants;

/* compiled from: RuStoreUtils.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bJ\f\u0010\u000e\u001a\u00020\n*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"Lru/rustore/sdk/core/util/RuStoreUtils;", "", "()V", "ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", "", "isRuStoreInstalled", "", "context", "Landroid/content/Context;", "openRuStore", "", "openRuStoreAuthorization", "openRuStoreDownloadInstruction", "openRuStoreRequestIgnoreBatteryOptimizations", "showOpenAppError", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class RuStoreUtils {

    @NotNull
    public static final String ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS = "ru.vk.store.RequestIgnoreBatteryOptimizations";

    @NotNull
    public static final RuStoreUtils INSTANCE = new RuStoreUtils();

    public final boolean isRuStoreInstalled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextExtKt.isAppInstalled(context, "ru.vk.store.qa") || ContextExtKt.isAppInstalled(context, "ru.vk.store");
    }

    /* compiled from: RuStoreUtils.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.core.util.RuStoreUtils$openRuStoreDownloadInstruction$1 */
    /* loaded from: classes5.dex */
    public static final class C115751 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115751(Context context) {
            super(0);
            context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            RuStoreUtils.INSTANCE.showOpenAppError(context);
        }
    }

    public final void openRuStoreDownloadInstruction(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.openUrl(context, Constants.RU_STORE_DOWNLOAD_URL, new Function0<Unit>() { // from class: ru.rustore.sdk.core.util.RuStoreUtils.openRuStoreDownloadInstruction.1
            public final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C115751(Context context2) {
                super(0);
                context = context2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                RuStoreUtils.INSTANCE.showOpenAppError(context);
            }
        });
    }

    public final void openRuStore(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (ContextExtKt.isAppInstalled(context, "ru.vk.store.qa")) {
            ContextExtKt.openApp(context, "ru.vk.store.qa", new Function0<Unit>() { // from class: ru.rustore.sdk.core.util.RuStoreUtils$openRuStore$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RuStoreUtils.INSTANCE.showOpenAppError(context);
                }
            });
        } else {
            ContextExtKt.openApp(context, "ru.vk.store", new Function0<Unit>() { // from class: ru.rustore.sdk.core.util.RuStoreUtils$openRuStore$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    RuStoreUtils.INSTANCE.showOpenAppError(context);
                }
            });
        }
    }

    /* compiled from: RuStoreUtils.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 7, 0}, m7109xi = 48)
    /* renamed from: ru.rustore.sdk.core.util.RuStoreUtils$openRuStoreAuthorization$1 */
    /* loaded from: classes5.dex */
    public static final class C115741 extends Lambda implements Function0<Unit> {
        public final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115741(Context context) {
            super(0);
            context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            RuStoreUtils.INSTANCE.showOpenAppError(context);
        }
    }

    public final void openRuStoreAuthorization(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContextExtKt.openUrl(context, Constants.DEEPLINK_RU_STORE_AUTH + context.getPackageName(), new Function0<Unit>() { // from class: ru.rustore.sdk.core.util.RuStoreUtils.openRuStoreAuthorization.1
            public final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C115741(Context context2) {
                super(0);
                context = context2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                RuStoreUtils.INSTANCE.showOpenAppError(context);
            }
        });
    }

    public final void openRuStoreRequestIgnoreBatteryOptimizations(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        ComponentName componentNameFindRuStoreActivityComponentName = CollectionExtKt.findRuStoreActivityComponentName(listQueryIntentActivities);
        if (componentNameFindRuStoreActivityComponentName != null) {
            intent.setComponent(componentNameFindRuStoreActivityComponentName);
        } else {
            componentNameFindRuStoreActivityComponentName = null;
        }
        if (componentNameFindRuStoreActivityComponentName == null) {
            showOpenAppError(context);
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            showOpenAppError(context);
        }
    }

    public final void showOpenAppError(Context context) {
        Toast.makeText(context, context.getString(C11568R.string.default_open_error), 0).show();
    }
}
