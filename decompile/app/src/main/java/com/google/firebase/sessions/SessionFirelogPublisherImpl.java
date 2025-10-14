package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0011\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m7105d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "attemptLoggingSessionEvent", "", "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "logSession", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "shouldCollectEvents", "", "shouldLogSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    @NotNull
    private static final String TAG = "SessionFirelogPublisher";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final EventGDTLoggerInterface eventGDTLogger;

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final FirebaseInstallationsApi firebaseInstallations;

    @NotNull
    private final SessionsSettings sessionSettings;
    private static final double randomValueForSampling = Math.random();

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m7120f = "SessionFirelogPublisher.kt", m7121i = {0}, m7122l = {94}, m7123m = "shouldLogSession", m7124n = {"this"}, m7125s = {"L$0"})
    /* renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 */
    /* loaded from: classes7.dex */
    public static final class C77691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C77691(Continuation<? super C77691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull SessionsSettings sessionSettings, @NotNull EventGDTLoggerInterface eventGDTLogger, @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", m7120f = "SessionFirelogPublisher.kt", m7121i = {2}, m7122l = {63, 64, 70}, m7123m = "invokeSuspend", m7124n = {"installationId"}, m7125s = {"L$0"})
    /* renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1 */
    /* loaded from: classes8.dex */
    public static final class C77681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SessionDetails $sessionDetails;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77681(SessionDetails sessionDetails, Continuation<? super C77681> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new C77681(this.$sessionDetails, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C77681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            InstallationId installationId;
            Object registeredSubscribers$com_google_firebase_firebase_sessions;
            SessionEvents sessionEvents;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            SessionsSettings sessionsSettings;
            FirebaseApp firebaseApp;
            SessionDetails sessionDetails;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = SessionFirelogPublisherImpl.this;
                this.label = 1;
                obj = sessionFirelogPublisherImpl2.shouldLogSession(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SessionsSettings sessionsSettings2 = (SessionsSettings) this.L$5;
                        SessionDetails sessionDetails2 = (SessionDetails) this.L$4;
                        FirebaseApp firebaseApp2 = (FirebaseApp) this.L$3;
                        SessionEvents sessionEvents2 = (SessionEvents) this.L$2;
                        SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = (SessionFirelogPublisherImpl) this.L$1;
                        installationId = (InstallationId) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        sessionFirelogPublisherImpl = sessionFirelogPublisherImpl3;
                        sessionsSettings = sessionsSettings2;
                        sessionEvents = sessionEvents2;
                        sessionDetails = sessionDetails2;
                        firebaseApp = firebaseApp2;
                        sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, (Map) obj, installationId.getFid(), installationId.getAuthToken()));
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    installationId = (InstallationId) obj;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl4 = SessionFirelogPublisherImpl.this;
                    SessionEvents sessionEvents3 = SessionEvents.INSTANCE;
                    FirebaseApp firebaseApp3 = sessionFirelogPublisherImpl4.firebaseApp;
                    SessionDetails sessionDetails3 = this.$sessionDetails;
                    SessionsSettings sessionsSettings3 = SessionFirelogPublisherImpl.this.sessionSettings;
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl4;
                    this.L$2 = sessionEvents3;
                    this.L$3 = firebaseApp3;
                    this.L$4 = sessionDetails3;
                    this.L$5 = sessionsSettings3;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionEvents = sessionEvents3;
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl4;
                    sessionsSettings = sessionsSettings3;
                    firebaseApp = firebaseApp3;
                    obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                    sessionDetails = sessionDetails3;
                    sessionFirelogPublisherImpl.attemptLoggingSessionEvent(sessionEvents.buildSession(firebaseApp, sessionDetails, sessionsSettings, (Map) obj, installationId.getFid(), installationId.getAuthToken()));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                InstallationId.Companion companion = InstallationId.INSTANCE;
                FirebaseInstallationsApi firebaseInstallationsApi = SessionFirelogPublisherImpl.this.firebaseInstallations;
                this.label = 2;
                obj = companion.create(firebaseInstallationsApi, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                installationId = (InstallationId) obj;
                SessionFirelogPublisherImpl sessionFirelogPublisherImpl42 = SessionFirelogPublisherImpl.this;
                SessionEvents sessionEvents32 = SessionEvents.INSTANCE;
                FirebaseApp firebaseApp32 = sessionFirelogPublisherImpl42.firebaseApp;
                SessionDetails sessionDetails32 = this.$sessionDetails;
                SessionsSettings sessionsSettings32 = SessionFirelogPublisherImpl.this.sessionSettings;
                FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.INSTANCE;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl42;
                this.L$2 = sessionEvents32;
                this.L$3 = firebaseApp32;
                this.L$4 = sessionDetails32;
                this.L$5 = sessionsSettings32;
                this.label = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutine_suspended) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new C77681(sessionDetails, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            Log.d(TAG, "Successfully logged Session Start event.");
        } catch (RuntimeException e) {
            Log.e(TAG, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldLogSession(Continuation<? super Boolean> continuation) throws Throwable {
        C77691 c77691;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        if (continuation instanceof C77691) {
            c77691 = (C77691) continuation;
            int i = c77691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c77691.label = i - Integer.MIN_VALUE;
            } else {
                c77691 = new C77691(continuation);
            }
        }
        Object obj = c77691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c77691.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d(TAG, "Data Collection is enabled for at least one Subscriber");
            SessionsSettings sessionsSettings = this.sessionSettings;
            c77691.L$0 = this;
            c77691.label = 1;
            if (sessionsSettings.updateSettings(c77691) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sessionFirelogPublisherImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionFirelogPublisherImpl = (SessionFirelogPublisherImpl) c77691.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!sessionFirelogPublisherImpl.sessionSettings.getSessionsEnabled()) {
            Log.d(TAG, "Sessions SDK disabled. Events will not be sent.");
            return Boxing.boxBoolean(false);
        }
        if (!sessionFirelogPublisherImpl.shouldCollectEvents()) {
            Log.d(TAG, "Sessions SDK has dropped this session due to sampling.");
            return Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(true);
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }
}
