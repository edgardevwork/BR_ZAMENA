package ru.rustore.sdk.user.profile;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.p068vk.store.provider.user.UserProfileProvider;
import ru.p068vk.store.provider.user.UserProfileProviderCallback;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreUserUnauthorizedException;
import ru.rustore.sdk.user.profile.model.UserProfile;

/* compiled from: UserProfileProviderServiceConnection.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0002J\u001c\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Lru/rustore/sdk/user/profile/UserProfileProviderServiceConnection;", "Landroid/content/ServiceConnection;", "applicationId", "", "onSuccess", "Lkotlin/Function1;", "Lru/rustore/sdk/user/profile/model/UserProfile;", "", "onError", "Lru/rustore/sdk/core/exception/RuStoreException;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "createError", "errorCode", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "onServiceConnected", "name", "Landroid/content/ComponentName;", "service", "Landroid/os/IBinder;", "onServiceDisconnected", "Companion", "sdk-public-user-profile_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class UserProfileProviderServiceConnection implements ServiceConnection {

    @Deprecated
    public static final int USER_UNAUTHORIZED_ERROR_CODE = 1001;

    @NotNull
    public final String applicationId;

    @NotNull
    public final Function1<RuStoreException, Unit> onError;

    @NotNull
    public final Function1<UserProfile, Unit> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileProviderServiceConnection(@NotNull String applicationId, @NotNull Function1<? super UserProfile, Unit> onSuccess, @NotNull Function1<? super RuStoreException, Unit> onError) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.applicationId = applicationId;
        this.onSuccess = onSuccess;
        this.onError = onError;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
        try {
            UserProfileProvider.Stub.asInterface(service).getUserProfile(this.applicationId, new UserProfileProviderCallback.Stub() { // from class: ru.rustore.sdk.user.profile.UserProfileProviderServiceConnection$onServiceConnected$callback$1
                @Override // ru.p068vk.store.provider.user.UserProfileProviderCallback
                public void onSuccess(Bundle userData) {
                    Intrinsics.checkNotNullParameter(userData, "userData");
                    this.this$0.onSuccess.invoke(new UserProfile(userData));
                }

                @Override // ru.p068vk.store.provider.user.UserProfileProviderCallback
                public void onError(int errorCode, String errorMessage) {
                    this.this$0.onError.invoke(this.this$0.createError(errorCode, errorMessage));
                }
            });
        } catch (Exception e) {
            Function1<RuStoreException, Unit> function1 = this.onError;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(new RuStoreException(message));
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName name) {
        this.onError.invoke(new RuStoreException("onServiceDisconnected"));
    }

    public final RuStoreException createError(int errorCode, String str) {
        if (errorCode == 1001) {
            return new RuStoreUserUnauthorizedException();
        }
        if (str == null) {
            str = "";
        }
        return new RuStoreException(str);
    }
}
