package ru.rustore.sdk.user.profile;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.ContextExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;
import ru.rustore.sdk.reactive.core.Dispatchers;
import ru.rustore.sdk.reactive.single.Single;
import ru.rustore.sdk.reactive.single.SingleEmitter;
import ru.rustore.sdk.reactive.single.SingleSubscribeOnKt;
import ru.rustore.sdk.user.profile.model.UserProfile;

/* compiled from: UserProfileProvider.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lru/rustore/sdk/user/profile/UserProfileProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getUserProfile", "Lru/rustore/sdk/reactive/single/Single;", "Lru/rustore/sdk/user/profile/model/UserProfile;", "applicationId", "", "getUserProfileInternal", "Companion", "sdk-public-user-profile_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class UserProfileProvider {

    @NotNull
    public static final String ACTION = "ru.vk.store.provider.user.RemoteUserProfileProvider";

    @NotNull
    public final Context context;

    public UserProfileProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @NotNull
    public final Single<UserProfile> getUserProfile(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return SingleSubscribeOnKt.subscribeOn(getUserProfileInternal(applicationId), Dispatchers.INSTANCE.getIo());
    }

    public final Single<UserProfile> getUserProfileInternal(final String applicationId) {
        return Single.INSTANCE.create(new Function1<SingleEmitter<UserProfile>, Unit>() { // from class: ru.rustore.sdk.user.profile.UserProfileProvider.getUserProfileInternal.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SingleEmitter<UserProfile> singleEmitter) {
                invoke2(singleEmitter);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [T, ru.rustore.sdk.user.profile.UserProfileProviderServiceConnection] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final SingleEmitter<UserProfile> emitter) {
                Object objM15699constructorimpl;
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(UserProfileProvider.this.context)) {
                    emitter.error(new RuStoreNotInstalledException());
                    return;
                }
                Intent intent = new Intent(UserProfileProvider.ACTION);
                List<ResolveInfo> listQueryIntentServices = UserProfileProvider.this.context.getPackageManager().queryIntentServices(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
                ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
                if (componentNameFindRuStoreServiceComponentName == null) {
                    emitter.error(new RuStoreOutdatedException());
                    return;
                }
                intent.setComponent(componentNameFindRuStoreServiceComponentName);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                String str = applicationId;
                final UserProfileProvider userProfileProvider = UserProfileProvider.this;
                Function1<UserProfile, Unit> function1 = new Function1<UserProfile, Unit>() { // from class: ru.rustore.sdk.user.profile.UserProfileProvider.getUserProfileInternal.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(UserProfile userProfile) {
                        invoke2(userProfile);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(UserProfile userProfile) {
                        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
                        emitter.success(userProfile);
                        ContextExtKt.unbindServiceSafely(userProfileProvider.context, objectRef.element);
                    }
                };
                final UserProfileProvider userProfileProvider2 = UserProfileProvider.this;
                objectRef.element = new UserProfileProviderServiceConnection(str, function1, new Function1<RuStoreException, Unit>() { // from class: ru.rustore.sdk.user.profile.UserProfileProvider.getUserProfileInternal.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(RuStoreException ruStoreException) {
                        invoke2(ruStoreException);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(RuStoreException error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        emitter.error(error);
                        ContextExtKt.unbindServiceSafely(userProfileProvider2.context, objectRef.element);
                    }
                });
                UserProfileProvider userProfileProvider3 = UserProfileProvider.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(Boolean.valueOf(userProfileProvider3.context.bindService(intent, (ServiceConnection) objectRef.element, 1)));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
                }
                UserProfileProvider userProfileProvider4 = UserProfileProvider.this;
                Throwable thM15702exceptionOrNullimpl = Result.m15702exceptionOrNullimpl(objM15699constructorimpl);
                if (thM15702exceptionOrNullimpl != null) {
                    ContextExtKt.unbindServiceSafely(userProfileProvider4.context, (ServiceConnection) objectRef.element);
                    emitter.error(thM15702exceptionOrNullimpl);
                }
            }
        });
    }
}
