package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.game.core.preferences.Preferences;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SettingsCache.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0016J/\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001b\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m7105d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "sessionConfigs", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "hasCacheExpired", "", "hasCacheExpired$com_google_firebase_firebase_sessions", "removeConfigs", "", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionRestartTimeout", "", "()Ljava/lang/Integer;", "sessionSamplingRate", "", "()Ljava/lang/Double;", "sessionsEnabled", "()Ljava/lang/Boolean;", "updateConfigValue", ExifInterface.GPS_DIRECTION_TRUE, "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSamplingRate", "rate", "(Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionCacheDuration", "cacheDurationInSeconds", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionCacheUpdatedTime", "cacheUpdatedTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionConfigs", Preferences.NAME, "updateSessionRestartTimeout", "timeoutInSeconds", "updateSettingsEnabled", "enabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class SettingsCache {

    @Deprecated
    @NotNull
    public static final String TAG = "SettingsCache";

    @NotNull
    private final DataStore<androidx.datastore.preferences.core.Preferences> dataStore;
    private SessionConfigs sessionConfigs;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Preferences.Key<Boolean> SESSIONS_ENABLED = PreferencesKeys.booleanKey(LocalOverrideSettings.SESSIONS_ENABLED);

    @NotNull
    private static final Preferences.Key<Double> SAMPLING_RATE = PreferencesKeys.doubleKey(LocalOverrideSettings.SAMPLING_RATE);

    @NotNull
    private static final Preferences.Key<Integer> RESTART_TIMEOUT_SECONDS = PreferencesKeys.intKey("firebase_sessions_restart_timeout");

    @NotNull
    private static final Preferences.Key<Integer> CACHE_DURATION_SECONDS = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    @NotNull
    private static final Preferences.Key<Long> CACHE_UPDATED_TIME = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* compiled from: SettingsCache.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.google.firebase.sessions.settings.SettingsCache", m7120f = "SettingsCache.kt", m7121i = {}, m7122l = {119}, m7123m = "updateConfigValue", m7124n = {}, m7125s = {})
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 */
    /* loaded from: classes7.dex */
    public static final class C77771<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C77771(Continuation<? super C77771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SettingsCache.this.updateConfigValue(null, null, this);
        }
    }

    public SettingsCache(@NotNull DataStore<androidx.datastore.preferences.core.Preferences> dataStore) throws InterruptedException {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
        BuildersKt__BuildersKt.runBlocking$default(null, new C77761(null), 1, null);
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.google.firebase.sessions.settings.SettingsCache$1", m7120f = "SettingsCache.kt", m7121i = {}, m7122l = {46}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1 */
    public static final class C77761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C77761(Continuation<? super C77761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsCache.this.new C77761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C77761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            SettingsCache settingsCache;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                Flow data = settingsCache2.dataStore.getData();
                this.L$0 = settingsCache2;
                this.label = 1;
                Object objFirst = FlowKt.first(data, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingsCache = settingsCache2;
                obj = objFirst;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            settingsCache.updateSessionConfigs(((androidx.datastore.preferences.core.Preferences) obj).toPreferences());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(androidx.datastore.preferences.core.Preferences preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.get(SESSIONS_ENABLED), (Double) preferences.get(SAMPLING_RATE), (Integer) preferences.get(RESTART_TIMEOUT_SECONDS), (Integer) preferences.get(CACHE_DURATION_SECONDS), (Long) preferences.get(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    @Nullable
    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    @Nullable
    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    @Nullable
    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    @Nullable
    public final Object updateSettingsEnabled(@Nullable Boolean bool, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, continuation);
        return objUpdateConfigValue == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSamplingRate(@Nullable Double d, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(SAMPLING_RATE, d, continuation);
        return objUpdateConfigValue == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionRestartTimeout(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, continuation);
        return objUpdateConfigValue == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionCacheDuration(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, continuation);
        return objUpdateConfigValue == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionCacheUpdatedTime(@Nullable Long l, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objUpdateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l, continuation);
        return objUpdateConfigValue == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @VisibleForTesting
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeConfigs$com_google_firebase_firebase_sessions(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        SettingsCache$removeConfigs$1 settingsCache$removeConfigs$1;
        if (continuation instanceof SettingsCache$removeConfigs$1) {
            settingsCache$removeConfigs$1 = (SettingsCache$removeConfigs$1) continuation;
            int i = settingsCache$removeConfigs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                settingsCache$removeConfigs$1.label = i - Integer.MIN_VALUE;
            } else {
                settingsCache$removeConfigs$1 = new SettingsCache$removeConfigs$1(this, continuation);
            }
        }
        Object obj = settingsCache$removeConfigs$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = settingsCache$removeConfigs$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore<androidx.datastore.preferences.core.Preferences> dataStore = this.dataStore;
                SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this, null);
                settingsCache$removeConfigs$1.label = 1;
                if (PreferencesKt.edit(dataStore, settingsCache$removeConfigs$2, settingsCache$removeConfigs$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException e) {
            Log.w(TAG, "Failed to remove config values: " + e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object updateConfigValue(Preferences.Key<T> key, T t, Continuation<? super Unit> continuation) throws Throwable {
        C77771 c77771;
        if (continuation instanceof C77771) {
            c77771 = (C77771) continuation;
            int i = c77771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c77771.label = i - Integer.MIN_VALUE;
            } else {
                c77771 = new C77771(continuation);
            }
        }
        Object obj = c77771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c77771.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore<androidx.datastore.preferences.core.Preferences> dataStore = this.dataStore;
                C77782 c77782 = new C77782(t, key, this, null);
                c77771.label = 1;
                if (PreferencesKt.edit(dataStore, c77782, c77771) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException e) {
            Log.w(TAG, "Failed to update cache config value: " + e);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m7105d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, com.blackhub.bronline.game.core.preferences.Preferences.NAME, "Landroidx/datastore/preferences/core/MutablePreferences;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", m7120f = "SettingsCache.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 */
    public static final class C77782 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SettingsCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77782(T t, Preferences.Key<T> key, SettingsCache settingsCache, Continuation<? super C77782> continuation) {
            super(2, continuation);
            this.$value = t;
            this.$key = key;
            this.this$0 = settingsCache;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C77782 c77782 = new C77782(this.$value, this.$key, this.this$0, continuation);
            c77782.L$0 = obj;
            return c77782;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable Continuation<? super Unit> continuation) {
            return ((C77782) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            T t = this.$value;
            if (t != 0) {
                mutablePreferences.set(this.$key, t);
            } else {
                mutablePreferences.remove(this.$key);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m7105d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache$Companion;", "", "()V", "CACHE_DURATION_SECONDS", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getCACHE_DURATION_SECONDS", "()Landroidx/datastore/preferences/core/Preferences$Key;", "CACHE_UPDATED_TIME", "", "getCACHE_UPDATED_TIME", "RESTART_TIMEOUT_SECONDS", "getRESTART_TIMEOUT_SECONDS", "SAMPLING_RATE", "", "getSAMPLING_RATE", "SESSIONS_ENABLED", "", "getSESSIONS_ENABLED", "TAG", "", "com.google.firebase-firebase-sessions"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Preferences.Key<Boolean> getSESSIONS_ENABLED() {
            return SettingsCache.SESSIONS_ENABLED;
        }

        @NotNull
        public final Preferences.Key<Double> getSAMPLING_RATE() {
            return SettingsCache.SAMPLING_RATE;
        }

        @NotNull
        public final Preferences.Key<Integer> getRESTART_TIMEOUT_SECONDS() {
            return SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        @NotNull
        public final Preferences.Key<Integer> getCACHE_DURATION_SECONDS() {
            return SettingsCache.CACHE_DURATION_SECONDS;
        }

        @NotNull
        public final Preferences.Key<Long> getCACHE_UPDATED_TIME() {
            return SettingsCache.CACHE_UPDATED_TIME;
        }
    }
}
