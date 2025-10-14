package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InstallationId.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m7105d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "Companion", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class InstallationId {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "InstallationId";

    @NotNull
    private final String authToken;

    @NotNull
    private final String fid;

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* compiled from: InstallationId.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m7105d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(@NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull Continuation<? super InstallationId> continuation) throws Throwable {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            FirebaseInstallationsApi firebaseInstallationsApi2;
            ?? r9;
            ?? r92;
            if (continuation instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuation;
                int i = installationId$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
                }
            }
            Object objAwait = installationId$Companion$create$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = installationId$Companion$create$1.label;
            String str = "";
            try {
                try {
                } catch (Exception e) {
                    Log.w(InstallationId.TAG, "Error getting Firebase installation id .", e);
                    r92 = firebaseInstallationsApi;
                }
            } catch (Exception e2) {
                Log.w(InstallationId.TAG, "Error getting authentication token.", e2);
                firebaseInstallationsApi2 = firebaseInstallationsApi;
                r9 = "";
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                Intrinsics.checkNotNullExpressionValue(token, "firebaseInstallations.getToken(false)");
                installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                installationId$Companion$create$1.label = 1;
                objAwait = TasksKt.await(token, installationId$Companion$create$1);
                firebaseInstallationsApi = firebaseInstallationsApi;
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r93 = (String) installationId$Companion$create$1.L$0;
                    ResultKt.throwOnFailure(objAwait);
                    firebaseInstallationsApi = r93;
                    Intrinsics.checkNotNullExpressionValue(objAwait, "{\n          firebaseInst…ions.id.await()\n        }");
                    str = (String) objAwait;
                    r92 = firebaseInstallationsApi;
                    return new InstallationId(str, r92, null);
                }
                FirebaseInstallationsApi firebaseInstallationsApi3 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                ResultKt.throwOnFailure(objAwait);
                firebaseInstallationsApi = firebaseInstallationsApi3;
            }
            String token2 = ((InstallationTokenResult) objAwait).getToken();
            Intrinsics.checkNotNullExpressionValue(token2, "{\n          firebaseInst…).await().token\n        }");
            firebaseInstallationsApi2 = firebaseInstallationsApi;
            r9 = token2;
            Task<String> id = firebaseInstallationsApi2.getId();
            Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
            installationId$Companion$create$1.L$0 = r9;
            installationId$Companion$create$1.label = 2;
            objAwait = TasksKt.await(id, installationId$Companion$create$1);
            firebaseInstallationsApi = r9;
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            Intrinsics.checkNotNullExpressionValue(objAwait, "{\n          firebaseInst…ions.id.await()\n        }");
            str = (String) objAwait;
            r92 = firebaseInstallationsApi;
            return new InstallationId(str, r92, null);
        }
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }
}
